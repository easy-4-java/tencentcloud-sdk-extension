package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FriendGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendGetResponse instance = new FriendGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        FriendGetResponse instance = new FriendGetResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendGetResponse a = new FriendGetResponse();
        FriendGetResponse b = new FriendGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
