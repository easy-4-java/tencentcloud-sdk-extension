package com.tencentcloud.sdk.trtc.resp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MixStreamResultTest {

    @Test
    void shouldCreateViaBuilder() {
        MixStreamResult instance = MixStreamResult.builder().build();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetStreamName() {
        MixStreamResult instance = MixStreamResult.builder().build();
        instance.setStreamName("testStream");
        assertEquals("testStream", instance.getStreamName());
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
