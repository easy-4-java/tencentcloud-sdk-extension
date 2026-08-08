package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FriendCheckResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendCheckResponse instance = new FriendCheckResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        FriendCheckResponse instance = new FriendCheckResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendCheckResponse a = new FriendCheckResponse();
        FriendCheckResponse b = new FriendCheckResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
