package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for Message.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MessageTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        Message instance = new Message();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSyncOtherMachine() {
        Message instance = new Message();
        instance.setSyncOtherMachine(42);
        assertEquals(42, instance.getSyncOtherMachine());
    }

    @Test
    void shouldSetAndGetFromAccount() {
        Message instance = new Message();
        instance.setFromAccount("testValue");
        assertEquals("testValue", instance.getFromAccount());
    }

    @Test
    void shouldSetAndGetToAccount() {
        Message instance = new Message();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetMsgLifeTime() {
        Message instance = new Message();
        instance.setMsgLifeTime(42);
        assertEquals(42, instance.getMsgLifeTime());
    }



    @Test
    void shouldSetAndGetMsgBody() {
        Message instance = new Message();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }


    @Test
    void shouldGenerateToString() {
        Message instance = new Message();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        Message a = new Message();
        Message b = new Message();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        Message a = new Message();
        Message b = new Message();
        b.setSyncOtherMachine(42);
        assertNotEquals(a, b);
    }

}