package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cAfterMsgWithDraw.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cAfterMsgWithDrawTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetFrom() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldSetAndGetMsgKey() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        instance.setMsgKey("testValue");
        assertEquals("testValue", instance.getMsgKey());
    }

    @Test
    void shouldSetAndGetUnreadMsgNum() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        instance.setUnreadMsgNum(42);
        assertEquals(42, instance.getUnreadMsgNum());
    }

    @Test
    void shouldGenerateToString() {
        C2cAfterMsgWithDraw instance = new C2cAfterMsgWithDraw();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cAfterMsgWithDraw a = new C2cAfterMsgWithDraw();
        C2cAfterMsgWithDraw b = new C2cAfterMsgWithDraw();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cAfterMsgWithDraw a = new C2cAfterMsgWithDraw();
        C2cAfterMsgWithDraw b = new C2cAfterMsgWithDraw();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}