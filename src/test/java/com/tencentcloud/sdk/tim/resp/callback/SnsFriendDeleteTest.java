package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsFriendDelete.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsFriendDeleteTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsFriendDelete instance = new SnsFriendDelete();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsFriendDelete instance = new SnsFriendDelete();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetPairList() {
        SnsFriendDelete instance = new SnsFriendDelete();
        instance.setPairList(new java.util.ArrayList<>());
        assertNotNull(instance.getPairList());
    }

    @Test
    void shouldGenerateToString() {
        SnsFriendDelete instance = new SnsFriendDelete();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsFriendDelete a = new SnsFriendDelete();
        SnsFriendDelete b = new SnsFriendDelete();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsFriendDelete a = new SnsFriendDelete();
        SnsFriendDelete b = new SnsFriendDelete();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}