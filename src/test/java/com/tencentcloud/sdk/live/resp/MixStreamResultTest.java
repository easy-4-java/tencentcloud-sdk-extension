package com.tencentcloud.sdk.live.resp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MixStreamResultTest {

    @Test
    void shouldCreateViaBuilder() {
        MixStreamResult instance = MixStreamResult.builder().build();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSessionId() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setSessionId(null);
        assertNull(instance.getSessionId());
    }

    @Test
    void shouldSetAndGetStreamName() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setStreamName(null);
        assertNull(instance.getStreamName());
    }

    @Test
    void shouldSetAndGetRtmpUrl() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setRtmpUrl(null);
        assertNull(instance.getRtmpUrl());
    }

    @Test
    void shouldSetAndGetWebrtcUrl() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setWebrtcUrl(null);
        assertNull(instance.getWebrtcUrl());
    }

    @Test
    void shouldSetAndGetHlsUrl() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setHlsUrl(null);
        assertNull(instance.getHlsUrl());
    }

    @Test
    void shouldSetAndGetFlvUrl() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setFlvUrl(null);
        assertNull(instance.getFlvUrl());
    }

    @Test
    void shouldGenerateToString() {
        MixStreamResult instance = MixStreamResult.builder().build();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MixStreamResult a = MixStreamResult.builder().build();
        MixStreamResult b = MixStreamResult.builder().build();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

}