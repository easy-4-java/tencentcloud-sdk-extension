package com.tencentcloud.sdk.tim.resp.ops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AppIpResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AppIpResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AppIpResponse instance = new AppIpResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetIpList() {
        AppIpResponse instance = new AppIpResponse();
        instance.setIpList(new java.util.ArrayList<>());
        assertNotNull(instance.getIpList());
    }

    @Test
    void shouldGenerateToString() {
        AppIpResponse instance = new AppIpResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AppIpResponse a = new AppIpResponse();
        AppIpResponse b = new AppIpResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AppIpResponse a = new AppIpResponse();
        AppIpResponse b = new AppIpResponse();
        b.setIpList(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}