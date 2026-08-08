package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterSendMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterSendMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetFrom() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetOperator() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setOperator("testValue");
        assertEquals("testValue", instance.getOperator());
    }

    @Test
    void shouldSetAndGetRandom() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setRandom(42);
        assertEquals(42, instance.getRandom());
    }

    @Test
    void shouldSetAndGetMsgSeq() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setMsgSeq(42);
        assertEquals(42, instance.getMsgSeq());
    }

    @Test
    void shouldSetAndGetMsgTime() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setMsgTime(42);
        assertEquals(42, instance.getMsgTime());
    }

    @Test
    void shouldSetAndGetOnlineOnlyFlag() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setOnlineOnlyFlag(42);
        assertEquals(42, instance.getOnlineOnlyFlag());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterSendMsg instance = new GroupAfterSendMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterSendMsg a = new GroupAfterSendMsg();
        GroupAfterSendMsg b = new GroupAfterSendMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterSendMsg a = new GroupAfterSendMsg();
        GroupAfterSendMsg b = new GroupAfterSendMsg();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}