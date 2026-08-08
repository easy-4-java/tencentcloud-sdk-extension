package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cSendMsgBody.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cSendMsgBodyTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cSendMsgBody instance = new C2cSendMsgBody();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMsgType() {
        C2cSendMsgBody instance = new C2cSendMsgBody();
        instance.setMsgType("testValue");
        assertEquals("testValue", instance.getMsgType());
    }


    @Test
    void shouldGenerateToString() {
        C2cSendMsgBody instance = new C2cSendMsgBody();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cSendMsgBody a = new C2cSendMsgBody();
        C2cSendMsgBody b = new C2cSendMsgBody();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cSendMsgBody a = new C2cSendMsgBody();
        C2cSendMsgBody b = new C2cSendMsgBody();
        b.setMsgType("testValue");
        assertNotEquals(a, b);
    }

}