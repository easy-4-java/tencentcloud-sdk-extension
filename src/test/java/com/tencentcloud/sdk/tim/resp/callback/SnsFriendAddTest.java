package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsFriendAdd.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsFriendAddTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsFriendAdd instance = new SnsFriendAdd();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsFriendAdd instance = new SnsFriendAdd();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetPairList() {
        SnsFriendAdd instance = new SnsFriendAdd();
        instance.setPairList(new java.util.ArrayList<>());
        assertNotNull(instance.getPairList());
    }

    @Test
    void shouldSetAndGetClientCmd() {
        SnsFriendAdd instance = new SnsFriendAdd();
        instance.setClientCmd("testValue");
        assertEquals("testValue", instance.getClientCmd());
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsFriendAdd instance = new SnsFriendAdd();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetForceFlag() {
        SnsFriendAdd instance = new SnsFriendAdd();
        instance.setForceFlag(42);
        assertEquals(42, instance.getForceFlag());
    }

    @Test
    void shouldGenerateToString() {
        SnsFriendAdd instance = new SnsFriendAdd();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsFriendAdd a = new SnsFriendAdd();
        SnsFriendAdd b = new SnsFriendAdd();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsFriendAdd a = new SnsFriendAdd();
        SnsFriendAdd b = new SnsFriendAdd();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}