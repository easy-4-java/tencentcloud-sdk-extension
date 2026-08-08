package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cBeforeSendMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cBeforeSendMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetFrom() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldSetAndGetMsgSeq() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setMsgSeq("testValue");
        assertEquals("testValue", instance.getMsgSeq());
    }

    @Test
    void shouldSetAndGetMsgRandom() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setMsgRandom("testValue");
        assertEquals("testValue", instance.getMsgRandom());
    }

    @Test
    void shouldSetAndGetMsgTime() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setMsgTime("testValue");
        assertEquals("testValue", instance.getMsgTime());
    }

    @Test
    void shouldSetAndGetMsgKey() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setMsgKey("testValue");
        assertEquals("testValue", instance.getMsgKey());
    }

    @Test
    void shouldSetAndGetOnlineFlag() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setOnlineFlag(42);
        assertEquals(42, instance.getOnlineFlag());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldSetAndGetCloudCustomData() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        instance.setCloudCustomData("testValue");
        assertEquals("testValue", instance.getCloudCustomData());
    }

    @Test
    void shouldGenerateToString() {
        C2cBeforeSendMsg instance = new C2cBeforeSendMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cBeforeSendMsg a = new C2cBeforeSendMsg();
        C2cBeforeSendMsg b = new C2cBeforeSendMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cBeforeSendMsg a = new C2cBeforeSendMsg();
        C2cBeforeSendMsg b = new C2cBeforeSendMsg();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}