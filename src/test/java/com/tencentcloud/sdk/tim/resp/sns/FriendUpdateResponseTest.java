package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendUpdateResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendUpdateResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendUpdateResponse instance = new FriendUpdateResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        FriendUpdateResponse instance = new FriendUpdateResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        FriendUpdateResponse instance = new FriendUpdateResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendUpdateResponse a = new FriendUpdateResponse();
        FriendUpdateResponse b = new FriendUpdateResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendUpdateResponse a = new FriendUpdateResponse();
        FriendUpdateResponse b = new FriendUpdateResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}