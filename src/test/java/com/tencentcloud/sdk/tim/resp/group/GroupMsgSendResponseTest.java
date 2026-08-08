package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMsgSendResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMsgSendResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMsgSendResponse instance = new GroupMsgSendResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMsgTime() {
        GroupMsgSendResponse instance = new GroupMsgSendResponse();
        instance.setMsgTime(100L);
        assertEquals(100L, instance.getMsgTime());
    }

    @Test
    void shouldSetAndGetMsgSeq() {
        GroupMsgSendResponse instance = new GroupMsgSendResponse();
        instance.setMsgSeq(100L);
        assertEquals(100L, instance.getMsgSeq());
    }

    @Test
    void shouldGenerateToString() {
        GroupMsgSendResponse instance = new GroupMsgSendResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMsgSendResponse a = new GroupMsgSendResponse();
        GroupMsgSendResponse b = new GroupMsgSendResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMsgSendResponse a = new GroupMsgSendResponse();
        GroupMsgSendResponse b = new GroupMsgSendResponse();
        b.setMsgTime(100L);
        assertNotEquals(a, b);
    }

}