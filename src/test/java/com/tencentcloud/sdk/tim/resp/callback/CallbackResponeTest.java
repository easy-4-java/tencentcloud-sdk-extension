package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for CallbackRespone.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class CallbackResponeTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        CallbackRespone instance = new CallbackRespone();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetActionStatus() {
        CallbackRespone instance = new CallbackRespone();
        instance.setActionStatus("testValue");
        assertEquals("testValue", instance.getActionStatus());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        CallbackRespone instance = new CallbackRespone();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        CallbackRespone instance = new CallbackRespone();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldGenerateToString() {
        CallbackRespone instance = new CallbackRespone();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        CallbackRespone a = new CallbackRespone();
        CallbackRespone b = new CallbackRespone();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        CallbackRespone a = new CallbackRespone();
        CallbackRespone b = new CallbackRespone();
        b.setActionStatus("testValue");
        assertNotEquals(a, b);
    }

}