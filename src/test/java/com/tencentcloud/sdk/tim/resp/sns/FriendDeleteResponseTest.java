package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendDeleteResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendDeleteResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendDeleteResponse instance = new FriendDeleteResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        FriendDeleteResponse instance = new FriendDeleteResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        FriendDeleteResponse instance = new FriendDeleteResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendDeleteResponse a = new FriendDeleteResponse();
        FriendDeleteResponse b = new FriendDeleteResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendDeleteResponse a = new FriendDeleteResponse();
        FriendDeleteResponse b = new FriendDeleteResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}