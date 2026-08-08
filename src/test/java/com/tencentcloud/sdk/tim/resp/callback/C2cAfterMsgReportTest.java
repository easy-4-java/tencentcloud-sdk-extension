package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cAfterMsgReport.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cAfterMsgReportTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetReport() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        instance.setReport("testValue");
        assertEquals("testValue", instance.getReport());
    }

    @Test
    void shouldSetAndGetPeer() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        instance.setPeer("testValue");
        assertEquals("testValue", instance.getPeer());
    }

    @Test
    void shouldSetAndGetLastReadTime() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        instance.setLastReadTime(42);
        assertEquals(42, instance.getLastReadTime());
    }

    @Test
    void shouldSetAndGetUnreadMsgNum() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        instance.setUnreadMsgNum(42);
        assertEquals(42, instance.getUnreadMsgNum());
    }

    @Test
    void shouldGenerateToString() {
        C2cAfterMsgReport instance = new C2cAfterMsgReport();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cAfterMsgReport a = new C2cAfterMsgReport();
        C2cAfterMsgReport b = new C2cAfterMsgReport();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cAfterMsgReport a = new C2cAfterMsgReport();
        C2cAfterMsgReport b = new C2cAfterMsgReport();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}