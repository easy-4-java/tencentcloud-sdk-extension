package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsPrevFriendResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsPrevFriendResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetEventTime() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        instance.setEventTime(42);
        assertEquals(42, instance.getEventTime());
    }

    @Test
    void shouldSetAndGetRequester() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        instance.setRequester("testValue");
        assertEquals("testValue", instance.getRequester());
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetResponses() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        instance.setResponses(new java.util.ArrayList<>());
        assertNotNull(instance.getResponses());
    }

    @Test
    void shouldGenerateToString() {
        SnsPrevFriendResponse instance = new SnsPrevFriendResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsPrevFriendResponse a = new SnsPrevFriendResponse();
        SnsPrevFriendResponse b = new SnsPrevFriendResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsPrevFriendResponse a = new SnsPrevFriendResponse();
        SnsPrevFriendResponse b = new SnsPrevFriendResponse();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}