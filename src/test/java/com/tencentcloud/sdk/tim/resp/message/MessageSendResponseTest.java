package com.tencentcloud.sdk.tim.resp.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MessageSendResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MessageSendResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MessageSendResponse instance = new MessageSendResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMsgTime() {
        MessageSendResponse instance = new MessageSendResponse();
        instance.setMsgTime(42);
        assertEquals(42, instance.getMsgTime());
    }

    @Test
    void shouldSetAndGetMsgKey() {
        MessageSendResponse instance = new MessageSendResponse();
        instance.setMsgKey("testValue");
        assertEquals("testValue", instance.getMsgKey());
    }

    @Test
    void shouldSetAndGetErrorList() {
        MessageSendResponse instance = new MessageSendResponse();
        instance.setErrorList(new java.util.ArrayList<>());
        assertNotNull(instance.getErrorList());
    }

    @Test
    void shouldGenerateToString() {
        MessageSendResponse instance = new MessageSendResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MessageSendResponse a = new MessageSendResponse();
        MessageSendResponse b = new MessageSendResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MessageSendResponse a = new MessageSendResponse();
        MessageSendResponse b = new MessageSendResponse();
        b.setMsgTime(42);
        assertNotEquals(a, b);
    }

}