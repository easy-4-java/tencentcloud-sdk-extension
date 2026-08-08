package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsBlackListDeletePair.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsBlackListDeletePairTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsBlackListDeletePair instance = new SnsBlackListDeletePair();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFrom() {
        SnsBlackListDeletePair instance = new SnsBlackListDeletePair();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        SnsBlackListDeletePair instance = new SnsBlackListDeletePair();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldGenerateToString() {
        SnsBlackListDeletePair instance = new SnsBlackListDeletePair();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsBlackListDeletePair a = new SnsBlackListDeletePair();
        SnsBlackListDeletePair b = new SnsBlackListDeletePair();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsBlackListDeletePair a = new SnsBlackListDeletePair();
        SnsBlackListDeletePair b = new SnsBlackListDeletePair();
        b.setFrom("testValue");
        assertNotEquals(a, b);
    }

}