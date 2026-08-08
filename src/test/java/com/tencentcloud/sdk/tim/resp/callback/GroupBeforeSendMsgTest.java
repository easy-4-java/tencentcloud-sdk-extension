package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeSendMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeSendMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetFrom() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetOperator() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setOperator("testValue");
        assertEquals("testValue", instance.getOperator());
    }

    @Test
    void shouldSetAndGetRandom() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setRandom(42);
        assertEquals(42, instance.getRandom());
    }

    @Test
    void shouldSetAndGetOnlineOnlyFlag() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setOnlineOnlyFlag(42);
        assertEquals(42, instance.getOnlineOnlyFlag());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeSendMsg instance = new GroupBeforeSendMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeSendMsg a = new GroupBeforeSendMsg();
        GroupBeforeSendMsg b = new GroupBeforeSendMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeSendMsg a = new GroupBeforeSendMsg();
        GroupBeforeSendMsg b = new GroupBeforeSendMsg();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}