package com.tencentcloud.sdk.live.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StreamSnapshotMsg.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StreamSnapshotMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSign() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setSign("testValue");
        assertEquals("testValue", instance.getSign());
    }

    @Test
    void shouldSetAndGetT() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setT(100L);
        assertEquals(100L, instance.getT());
    }

    @Test
    void shouldSetAndGetEvent_type() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setEvent_type("testValue");
        assertEquals("testValue", instance.getEvent_type());
    }

    @Test
    void shouldSetAndGetStream_id() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setStream_id("testValue");
        assertEquals("testValue", instance.getStream_id());
    }

    @Test
    void shouldSetAndGetChannel_id() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setChannel_id("testValue");
        assertEquals("testValue", instance.getChannel_id());
    }

    @Test
    void shouldSetAndGetCreate_time() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setCreate_time(100L);
        assertEquals(100L, instance.getCreate_time());
    }

    @Test
    void shouldSetAndGetFile_size() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setFile_size(100L);
        assertEquals(100L, instance.getFile_size());
    }

    @Test
    void shouldSetAndGetWidth() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setWidth(42);
        assertEquals(42, instance.getWidth());
    }

    @Test
    void shouldSetAndGetHeight() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setHeight(42);
        assertEquals(42, instance.getHeight());
    }

    @Test
    void shouldSetAndGetPic_url() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setPic_url("testValue");
        assertEquals("testValue", instance.getPic_url());
    }

    @Test
    void shouldSetAndGetPic_full_url() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        instance.setPic_full_url("testValue");
        assertEquals("testValue", instance.getPic_full_url());
    }

    @Test
    void shouldGenerateToString() {
        StreamSnapshotMsg instance = new StreamSnapshotMsg();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StreamSnapshotMsg a = new StreamSnapshotMsg();
        StreamSnapshotMsg b = new StreamSnapshotMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StreamSnapshotMsg a = new StreamSnapshotMsg();
        StreamSnapshotMsg b = new StreamSnapshotMsg();
        b.setSign("testValue");
        assertNotEquals(a, b);
    }

}