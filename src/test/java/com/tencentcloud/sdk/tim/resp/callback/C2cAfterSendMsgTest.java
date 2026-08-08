package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cAfterSendMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cAfterSendMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetFrom() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldSetAndGetMsgSeq() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgSeq("testValue");
        assertEquals("testValue", instance.getMsgSeq());
    }

    @Test
    void shouldSetAndGetMsgRandom() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgRandom("testValue");
        assertEquals("testValue", instance.getMsgRandom());
    }

    @Test
    void shouldSetAndGetMsgTime() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgTime("testValue");
        assertEquals("testValue", instance.getMsgTime());
    }

    @Test
    void shouldSetAndGetMsgKey() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgKey("testValue");
        assertEquals("testValue", instance.getMsgKey());
    }

    @Test
    void shouldSetAndGetOnlineFlag() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setOnlineFlag(42);
        assertEquals(42, instance.getOnlineFlag());
    }

    @Test
    void shouldSetAndGetMsgResult() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgResult("testValue");
        assertEquals("testValue", instance.getMsgResult());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetUnreadMsgNum() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setUnreadMsgNum(42);
        assertEquals(42, instance.getUnreadMsgNum());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldSetAndGetCloudCustomData() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        instance.setCloudCustomData("testValue");
        assertEquals("testValue", instance.getCloudCustomData());
    }

    @Test
    void shouldGenerateToString() {
        C2cAfterSendMsg instance = new C2cAfterSendMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cAfterSendMsg a = new C2cAfterSendMsg();
        C2cAfterSendMsg b = new C2cAfterSendMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cAfterSendMsg a = new C2cAfterSendMsg();
        C2cAfterSendMsg b = new C2cAfterSendMsg();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}