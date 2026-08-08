package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cBeforeSendMsgRespone.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cBeforeSendMsgResponeTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetActionStatus() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        instance.setActionStatus("testValue");
        assertEquals("testValue", instance.getActionStatus());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        C2cBeforeSendMsgRespone instance = new C2cBeforeSendMsgRespone();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cBeforeSendMsgRespone a = new C2cBeforeSendMsgRespone();
        C2cBeforeSendMsgRespone b = new C2cBeforeSendMsgRespone();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cBeforeSendMsgRespone a = new C2cBeforeSendMsgRespone();
        C2cBeforeSendMsgRespone b = new C2cBeforeSendMsgRespone();
        b.setActionStatus("testValue");
        assertNotEquals(a, b);
    }

}