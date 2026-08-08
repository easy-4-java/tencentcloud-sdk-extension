package com.tencentcloud.sdk.live.resp;

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
        instance.setStreamName(null);
        assertNull(instance.getStreamName());
    }

    @Test
    void shouldSetAndGetRtmpUrl() {
        StreamResult instance = StreamResult.builder().build();
        instance.setRtmpUrl(null);
        assertNull(instance.getRtmpUrl());
    }

    @Test
    void shouldSetAndGetWebrtcUrl() {
        StreamResult instance = StreamResult.builder().build();
        instance.setWebrtcUrl(null);
        assertNull(instance.getWebrtcUrl());
    }

    @Test
    void shouldSetAndGetFlvUrl() {
        StreamResult instance = StreamResult.builder().build();
        instance.setFlvUrl(null);
        assertNull(instance.getFlvUrl());
    }

    @Test
    void shouldSetAndGetHlsUrl() {
        StreamResult instance = StreamResult.builder().build();
        instance.setHlsUrl(null);
        assertNull(instance.getHlsUrl());
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