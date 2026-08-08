package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendAddResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendAddResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendAddResponse instance = new FriendAddResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        FriendAddResponse instance = new FriendAddResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        FriendAddResponse instance = new FriendAddResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendAddResponse a = new FriendAddResponse();
        FriendAddResponse b = new FriendAddResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendAddResponse a = new FriendAddResponse();
        FriendAddResponse b = new FriendAddResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}