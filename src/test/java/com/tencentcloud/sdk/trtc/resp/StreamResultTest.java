package com.tencentcloud.sdk.trtc.resp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamResultTest {

    @Test
    void shouldCreateViaBuilder() {
        StreamResult instance = StreamResult.builder().build();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetStreamName() {
        StreamResult instance = StreamResult.builder().build();
        instance.setStreamName("testStream");
        assertEquals("testStream", instance.getStreamName());
    }

    @Test
    void shouldGenerateToString() {
        StreamResult instance = StreamResult.builder().build();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StreamResult a = StreamResult.builder().build();
        StreamResult b = StreamResult.builder().build();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
