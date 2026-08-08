package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MsgBody.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MsgBodyTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MsgBody instance = new MsgBody();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMsgType() {
        MsgBody instance = new MsgBody();
        instance.setMsgType("testValue");
        assertEquals("testValue", instance.getMsgType());
    }


    @Test
    void shouldGenerateToString() {
        MsgBody instance = new MsgBody();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MsgBody a = new MsgBody();
        MsgBody b = new MsgBody();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MsgBody a = new MsgBody();
        MsgBody b = new MsgBody();
        b.setMsgType("testValue");
        assertNotEquals(a, b);
    }

}