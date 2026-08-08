package com.tencentcloud.sdk.live.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StreamRecordingMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StreamRecordingMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSign() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setSign("testValue");
        assertEquals("testValue", instance.getSign());
    }

    @Test
    void shouldSetAndGetT() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setT(100L);
        assertEquals(100L, instance.getT());
    }

    @Test
    void shouldSetAndGetEvent_type() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setEvent_type("testValue");
        assertEquals("testValue", instance.getEvent_type());
    }

    @Test
    void shouldSetAndGetAppid() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setAppid("testValue");
        assertEquals("testValue", instance.getAppid());
    }

    @Test
    void shouldSetAndGetStream_id() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setStream_id("testValue");
        assertEquals("testValue", instance.getStream_id());
    }

    @Test
    void shouldSetAndGetFile_id() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setFile_id("testValue");
        assertEquals("testValue", instance.getFile_id());
    }

    @Test
    void shouldSetAndGetFile_format() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setFile_format("testValue");
        assertEquals("testValue", instance.getFile_format());
    }

    @Test
    void shouldSetAndGetFile_size() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setFile_size(100L);
        assertEquals(100L, instance.getFile_size());
    }

    @Test
    void shouldSetAndGetStart_time() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setStart_time(100L);
        assertEquals(100L, instance.getStart_time());
    }

    @Test
    void shouldSetAndGetEnd_time() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setEnd_time(100L);
        assertEquals(100L, instance.getEnd_time());
    }

    @Test
    void shouldSetAndGetDuration() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setDuration(100L);
        assertEquals(100L, instance.getDuration());
    }

    @Test
    void shouldSetAndGetStream_param() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setStream_param("testValue");
        assertEquals("testValue", instance.getStream_param());
    }

    @Test
    void shouldSetAndGetVideo_url() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        instance.setVideo_url("testValue");
        assertEquals("testValue", instance.getVideo_url());
    }

    @Test
    void shouldGenerateToString() {
        StreamRecordingMsg instance = new StreamRecordingMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StreamRecordingMsg a = new StreamRecordingMsg();
        StreamRecordingMsg b = new StreamRecordingMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StreamRecordingMsg a = new StreamRecordingMsg();
        StreamRecordingMsg b = new StreamRecordingMsg();
        b.setSign("testValue");
        assertNotEquals(a, b);
    }

}