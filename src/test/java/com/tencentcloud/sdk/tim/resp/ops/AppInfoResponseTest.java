package com.tencentcloud.sdk.tim.resp.ops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AppInfoResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AppInfoResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AppInfoResponse instance = new AppInfoResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResult() {
        AppInfoResponse instance = new AppInfoResponse();
        instance.setResult(new java.util.ArrayList<>());
        assertNotNull(instance.getResult());
    }

    @Test
    void shouldGenerateToString() {
        AppInfoResponse instance = new AppInfoResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AppInfoResponse a = new AppInfoResponse();
        AppInfoResponse b = new AppInfoResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AppInfoResponse a = new AppInfoResponse();
        AppInfoResponse b = new AppInfoResponse();
        b.setResult(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}