package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeSendMsgRespone.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeSendMsgResponeTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetActionStatus() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        instance.setActionStatus("testValue");
        assertEquals("testValue", instance.getActionStatus());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeSendMsgRespone instance = new GroupBeforeSendMsgRespone();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeSendMsgRespone a = new GroupBeforeSendMsgRespone();
        GroupBeforeSendMsgRespone b = new GroupBeforeSendMsgRespone();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeSendMsgRespone a = new GroupBeforeSendMsgRespone();
        GroupBeforeSendMsgRespone b = new GroupBeforeSendMsgRespone();
        b.setActionStatus("testValue");
        assertNotEquals(a, b);
    }

}