package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupSendMsgBody.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupSendMsgBodyTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupSendMsgBody instance = new GroupSendMsgBody();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMsgType() {
        GroupSendMsgBody instance = new GroupSendMsgBody();
        instance.setMsgType("testValue");
        assertEquals("testValue", instance.getMsgType());
    }


    @Test
    void shouldGenerateToString() {
        GroupSendMsgBody instance = new GroupSendMsgBody();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupSendMsgBody a = new GroupSendMsgBody();
        GroupSendMsgBody b = new GroupSendMsgBody();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupSendMsgBody a = new GroupSendMsgBody();
        GroupSendMsgBody b = new GroupSendMsgBody();
        b.setMsgType("testValue");
        assertNotEquals(a, b);
    }

}