package com.tencentcloud.sdk.tim.resp.nospeaking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for NoSpeakingResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class NoSpeakingResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        NoSpeakingResponse instance = new NoSpeakingResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetC2CmsgNospeakingTime() {
        NoSpeakingResponse instance = new NoSpeakingResponse();
        instance.setC2CmsgNospeakingTime(42);
        assertEquals(42, instance.getC2CmsgNospeakingTime());
    }

    @Test
    void shouldSetAndGetGroupmsgNospeakingTime() {
        NoSpeakingResponse instance = new NoSpeakingResponse();
        instance.setGroupmsgNospeakingTime(42);
        assertEquals(42, instance.getGroupmsgNospeakingTime());
    }

    @Test
    void shouldGenerateToString() {
        NoSpeakingResponse instance = new NoSpeakingResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        NoSpeakingResponse a = new NoSpeakingResponse();
        NoSpeakingResponse b = new NoSpeakingResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        NoSpeakingResponse a = new NoSpeakingResponse();
        NoSpeakingResponse b = new NoSpeakingResponse();
        b.setC2CmsgNospeakingTime(42);
        assertNotEquals(a, b);
    }

}