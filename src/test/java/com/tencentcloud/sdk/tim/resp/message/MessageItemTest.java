package com.tencentcloud.sdk.tim.resp.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MessageItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MessageItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MessageItem instance = new MessageItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFromAccount() {
        MessageItem instance = new MessageItem();
        instance.setFromAccount("testValue");
        assertEquals("testValue", instance.getFromAccount());
    }

    @Test
    void shouldSetAndGetToAccount() {
        MessageItem instance = new MessageItem();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }




    @Test
    void shouldSetAndGetMsgFlagBits() {
        MessageItem instance = new MessageItem();
        instance.setMsgFlagBits(42);
        assertEquals(42, instance.getMsgFlagBits());
    }

    @Test
    void shouldSetAndGetMsgKey() {
        MessageItem instance = new MessageItem();
        instance.setMsgKey("testValue");
        assertEquals("testValue", instance.getMsgKey());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        MessageItem instance = new MessageItem();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        MessageItem instance = new MessageItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MessageItem a = new MessageItem();
        MessageItem b = new MessageItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MessageItem a = new MessageItem();
        MessageItem b = new MessageItem();
        b.setFromAccount("testValue");
        assertNotEquals(a, b);
    }

}