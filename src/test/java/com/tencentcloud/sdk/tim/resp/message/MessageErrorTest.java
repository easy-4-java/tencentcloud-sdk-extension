package com.tencentcloud.sdk.tim.resp.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MessageError.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MessageErrorTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MessageError instance = new MessageError();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetToAccount() {
        MessageError instance = new MessageError();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        MessageError instance = new MessageError();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldGenerateToString() {
        MessageError instance = new MessageError();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MessageError a = new MessageError();
        MessageError b = new MessageError();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MessageError a = new MessageError();
        MessageError b = new MessageError();
        b.setToAccount("testValue");
        assertNotEquals(a, b);
    }

}