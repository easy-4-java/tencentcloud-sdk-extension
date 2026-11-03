package com.tencentcloud.sdk.tim;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tencentcloud.sdk.TencentTimProperties;
import com.tencentcloud.sdk.tim.resp.TimActionResponse;
import com.tencentyun.TLSSigAPIv2;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class TencentTimTemplateTest {
    private final TencentTimProperties properties = new TencentTimProperties();
    private final AtomicInteger signatures = new AtomicInteger();

    private TencentTimTemplate template(Interceptor interceptor) {
        properties.setSdkappid(123L);
        properties.setIdentifier("admin");
        TLSSigAPIv2 signer = new TLSSigAPIv2(123L, "test-key") {
            @Override
            public String genUserSig(String identifier, long expire) {
                return "signature-" + signatures.incrementAndGet();
            }
        };
        return new TencentTimTemplate(properties, signer,
                new OkHttpClient.Builder().addInterceptor(interceptor).build(), null);
    }

    private static Response response(Interceptor.Chain chain, int code, String body) {
        return new Response.Builder().request(chain.request()).protocol(okhttp3.Protocol.HTTP_1_1)
                .code(code).message(code == 200 ? "OK" : "Failure")
                .body(ResponseBody.create(MediaType.parse("application/json"), body)).build();
    }

    @Test
    void serializesRequestAndParsesSuccessResponse() throws Exception {
        AtomicReference<String> sent = new AtomicReference<>();
        TencentTimTemplate template = template(chain -> {
            Buffer buffer = new Buffer();
            chain.request().body().writeTo(buffer);
            sent.set(buffer.readUtf8());
            assertEquals("POST", chain.request().method());
            assertEquals("application", chain.request().body().contentType().type());
            return response(chain, 200, "{\"ActionStatus\":\"OK\",\"ErrorCode\":0,\"Extra\":1}");
        });
        assertTrue(template.readValue("{\"ActionStatus\":\"OK\",\"ErrorCode\":0,\"Extra\":1}", TimActionResponse.class).isSuccess());
        Map<String, Object> request = new HashMap<>();
        request.put("UserID", "alice");
        TimActionResponse result = template.requestInvoke("https://example.invalid/v4/im", request, TimActionResponse.class);
        assertNotNull(sent.get(), "interceptor was not invoked");
        assertTrue(result.isSuccess(), result.toString());
        assertEquals("alice", new ObjectMapper().readTree(sent.get()).get("UserID").asText());
    }

    @Test
    void returnsFailureResponseForHttpAndIoErrors() {
        TencentTimTemplate http = template(chain -> response(chain, 503, "unavailable"));
        assertFalse(http.requestInvoke("https://example.invalid/v4/im", "{}", TimActionResponse.class).isSuccess());
        TencentTimTemplate io = template(chain -> { throw new IOException("offline"); });
        assertFalse(io.requestInvoke("https://example.invalid/v4/im", "{}", TimActionResponse.class).isSuccess());
    }

    @Test
    void malformedJsonReturnsFailureResponse() {
        TencentTimTemplate template = template(chain -> response(chain, 200, "{not-json"));
        assertFalse(template.requestInvoke("https://example.invalid/v4/im", "{}", TimActionResponse.class).isSuccess());
    }

    @Test
    void cachesSignatureButCreatesFreshRequestNonce() {
        TencentTimTemplate template = template(chain -> response(chain, 200, "{}"));
        Map<String, String> first = template.getDefaultParams();
        Map<String, String> second = template.getDefaultParams();
        assertEquals("signature-1", first.get("usersig"));
        assertEquals(first.get("usersig"), second.get("usersig"));
        assertEquals(1, signatures.get());
        assertEquals("123", first.get("sdkappid"));
        assertEquals("admin", first.get("identifier"));
        assertEquals("json", first.get("contenttype"));
        assertNotEquals(first.get("random"), second.get("random"));
    }
}
