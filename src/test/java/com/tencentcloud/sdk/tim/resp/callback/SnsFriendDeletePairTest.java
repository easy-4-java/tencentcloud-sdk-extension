package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsFriendDeletePair.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsFriendDeletePairTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsFriendDeletePair instance = new SnsFriendDeletePair();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFrom() {
        SnsFriendDeletePair instance = new SnsFriendDeletePair();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        SnsFriendDeletePair instance = new SnsFriendDeletePair();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldGenerateToString() {
        SnsFriendDeletePair instance = new SnsFriendDeletePair();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsFriendDeletePair a = new SnsFriendDeletePair();
        SnsFriendDeletePair b = new SnsFriendDeletePair();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsFriendDeletePair a = new SnsFriendDeletePair();
        SnsFriendDeletePair b = new SnsFriendDeletePair();
        b.setFrom("testValue");
        assertNotEquals(a, b);
    }

}