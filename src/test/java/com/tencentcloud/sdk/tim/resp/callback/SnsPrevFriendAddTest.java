package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsPrevFriendAdd.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsPrevFriendAddTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetEventTime() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setEventTime(42);
        assertEquals(42, instance.getEventTime());
    }

    @Test
    void shouldSetAndGetRequester() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setRequester("testValue");
        assertEquals("testValue", instance.getRequester());
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetFriends() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setFriends(new java.util.ArrayList<>());
        assertNotNull(instance.getFriends());
    }

    @Test
    void shouldSetAndGetAddType() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setAddType("testValue");
        assertEquals("testValue", instance.getAddType());
    }

    @Test
    void shouldSetAndGetForceAddFlags() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        instance.setForceAddFlags(42);
        assertEquals(42, instance.getForceAddFlags());
    }

    @Test
    void shouldGenerateToString() {
        SnsPrevFriendAdd instance = new SnsPrevFriendAdd();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsPrevFriendAdd a = new SnsPrevFriendAdd();
        SnsPrevFriendAdd b = new SnsPrevFriendAdd();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsPrevFriendAdd a = new SnsPrevFriendAdd();
        SnsPrevFriendAdd b = new SnsPrevFriendAdd();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}