package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsFriendAddPair.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsFriendAddPairTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsFriendAddPair instance = new SnsFriendAddPair();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFrom() {
        SnsFriendAddPair instance = new SnsFriendAddPair();
        instance.setFrom("testValue");
        assertEquals("testValue", instance.getFrom());
    }

    @Test
    void shouldSetAndGetTo() {
        SnsFriendAddPair instance = new SnsFriendAddPair();
        instance.setTo("testValue");
        assertEquals("testValue", instance.getTo());
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsFriendAddPair instance = new SnsFriendAddPair();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldGenerateToString() {
        SnsFriendAddPair instance = new SnsFriendAddPair();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsFriendAddPair a = new SnsFriendAddPair();
        SnsFriendAddPair b = new SnsFriendAddPair();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsFriendAddPair a = new SnsFriendAddPair();
        SnsFriendAddPair b = new SnsFriendAddPair();
        b.setFrom("testValue");
        assertNotEquals(a, b);
    }

}