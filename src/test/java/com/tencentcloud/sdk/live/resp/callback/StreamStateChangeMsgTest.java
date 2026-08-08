package com.tencentcloud.sdk.live.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StreamStateChangeMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StreamStateChangeMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSign() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setSign("testValue");
        assertEquals("testValue", instance.getSign());
    }

    @Test
    void shouldSetAndGetT() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setT(100L);
        assertEquals(100L, instance.getT());
    }

    @Test
    void shouldSetAndGetEvent_type() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setEvent_type("testValue");
        assertEquals("testValue", instance.getEvent_type());
    }

    @Test
    void shouldSetAndGetEvent_time() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setEvent_time(100L);
        assertEquals(100L, instance.getEvent_time());
    }

    @Test
    void shouldSetAndGetAppid() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setAppid("testValue");
        assertEquals("testValue", instance.getAppid());
    }

    @Test
    void shouldSetAndGetApp() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setApp("testValue");
        assertEquals("testValue", instance.getApp());
    }

    @Test
    void shouldSetAndGetAppname() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setAppname("testValue");
        assertEquals("testValue", instance.getAppname());
    }

    @Test
    void shouldSetAndGetStream_id() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setStream_id("testValue");
        assertEquals("testValue", instance.getStream_id());
    }

    @Test
    void shouldSetAndGetChannel_id() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setChannel_id("testValue");
        assertEquals("testValue", instance.getChannel_id());
    }

    @Test
    void shouldSetAndGetSequence() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setSequence("testValue");
        assertEquals("testValue", instance.getSequence());
    }

    @Test
    void shouldSetAndGetNode() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setNode("testValue");
        assertEquals("testValue", instance.getNode());
    }

    @Test
    void shouldSetAndGetUser_ip() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setUser_ip("testValue");
        assertEquals("testValue", instance.getUser_ip());
    }

    @Test
    void shouldSetAndGetStream_param() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setStream_param("testValue");
        assertEquals("testValue", instance.getStream_param());
    }

    @Test
    void shouldSetAndGetPush_duration() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setPush_duration("testValue");
        assertEquals("testValue", instance.getPush_duration());
    }

    @Test
    void shouldSetAndGetErrcode() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setErrcode("testValue");
        assertEquals("testValue", instance.getErrcode());
    }

    @Test
    void shouldSetAndGetErrmsg() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setErrmsg("testValue");
        assertEquals("testValue", instance.getErrmsg());
    }

    @Test
    void shouldSetAndGetSet_id() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        instance.setSet_id("testValue");
        assertEquals("testValue", instance.getSet_id());
    }

    @Test
    void shouldGenerateToString() {
        StreamStateChangeMsg instance = new StreamStateChangeMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StreamStateChangeMsg a = new StreamStateChangeMsg();
        StreamStateChangeMsg b = new StreamStateChangeMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StreamStateChangeMsg a = new StreamStateChangeMsg();
        StreamStateChangeMsg b = new StreamStateChangeMsg();
        b.setSign("testValue");
        assertNotEquals(a, b);
    }

}