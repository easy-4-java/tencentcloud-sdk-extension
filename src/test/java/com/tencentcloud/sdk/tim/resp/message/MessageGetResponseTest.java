package com.tencentcloud.sdk.tim.resp.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MessageGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MessageGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MessageGetResponse instance = new MessageGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetComplete() {
        MessageGetResponse instance = new MessageGetResponse();
        instance.setComplete(42);
        assertEquals(42, instance.getComplete());
    }

    @Test
    void shouldSetAndGetMsgCnt() {
        MessageGetResponse instance = new MessageGetResponse();
        instance.setMsgCnt(42);
        assertEquals(42, instance.getMsgCnt());
    }

    @Test
    void shouldSetAndGetLastMsgTime() {
        MessageGetResponse instance = new MessageGetResponse();
        instance.setLastMsgTime(42);
        assertEquals(42, instance.getLastMsgTime());
    }

    @Test
    void shouldSetAndGetLastMsgKey() {
        MessageGetResponse instance = new MessageGetResponse();
        instance.setLastMsgKey("testValue");
        assertEquals("testValue", instance.getLastMsgKey());
    }

    @Test
    void shouldSetAndGetMsgList() {
        MessageGetResponse instance = new MessageGetResponse();
        instance.setMsgList(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgList());
    }

    @Test
    void shouldGenerateToString() {
        MessageGetResponse instance = new MessageGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MessageGetResponse a = new MessageGetResponse();
        MessageGetResponse b = new MessageGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MessageGetResponse a = new MessageGetResponse();
        MessageGetResponse b = new MessageGetResponse();
        b.setComplete(42);
        assertNotEquals(a, b);
    }

}