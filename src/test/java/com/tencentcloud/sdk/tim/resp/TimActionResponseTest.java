package com.tencentcloud.sdk.tim.resp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TimActionResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TimActionResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TimActionResponse instance = new TimActionResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetActionStatus() {
        TimActionResponse instance = new TimActionResponse();
        instance.setActionStatus("testValue");
        assertEquals("testValue", instance.getActionStatus());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        TimActionResponse instance = new TimActionResponse();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        TimActionResponse instance = new TimActionResponse();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetErrorDisplay() {
        TimActionResponse instance = new TimActionResponse();
        instance.setErrorDisplay("testValue");
        assertEquals("testValue", instance.getErrorDisplay());
    }

    @Test
    void shouldGenerateToString() {
        TimActionResponse instance = new TimActionResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        TimActionResponse a = new TimActionResponse();
        TimActionResponse b = new TimActionResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TimActionResponse a = new TimActionResponse();
        TimActionResponse b = new TimActionResponse();
        b.setActionStatus("testValue");
        assertNotEquals(a, b);
    }

}