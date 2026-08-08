package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendGetListResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendGetListResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendGetListResponse instance = new FriendGetListResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetInfoItems() {
        FriendGetListResponse instance = new FriendGetListResponse();
        instance.setInfoItems(new java.util.ArrayList<>());
        assertNotNull(instance.getInfoItems());
    }

    @Test
    void shouldSetAndGetFailAccounts() {
        FriendGetListResponse instance = new FriendGetListResponse();
        instance.setFailAccounts(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccounts());
    }

    @Test
    void shouldGenerateToString() {
        FriendGetListResponse instance = new FriendGetListResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendGetListResponse a = new FriendGetListResponse();
        FriendGetListResponse b = new FriendGetListResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendGetListResponse a = new FriendGetListResponse();
        FriendGetListResponse b = new FriendGetListResponse();
        b.setInfoItems(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}