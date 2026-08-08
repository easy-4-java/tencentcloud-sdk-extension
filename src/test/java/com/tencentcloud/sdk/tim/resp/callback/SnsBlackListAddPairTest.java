package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsBlackListAddPair.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsBlackListAddPairTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsBlackListAddPair instance = new SnsBlackListAddPair();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFrom() {
        SnsBlackListAddPair instance = new SnsBlackListAddPair();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        SnsBlackListAddPair instance = new SnsBlackListAddPair();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldGenerateToString() {
        SnsBlackListAddPair instance = new SnsBlackListAddPair();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsBlackListAddPair a = new SnsBlackListAddPair();
        SnsBlackListAddPair b = new SnsBlackListAddPair();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsBlackListAddPair a = new SnsBlackListAddPair();
        SnsBlackListAddPair b = new SnsBlackListAddPair();
        b.setFrom("testValue");
        assertNotEquals(a, b);
    }

}