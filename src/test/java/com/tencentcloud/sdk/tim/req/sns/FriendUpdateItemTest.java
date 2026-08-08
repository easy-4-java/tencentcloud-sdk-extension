package com.tencentcloud.sdk.tim.req.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FriendUpdateItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendUpdateItem instance = new FriendUpdateItem();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        FriendUpdateItem instance = new FriendUpdateItem();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendUpdateItem a = new FriendUpdateItem();
        FriendUpdateItem b = new FriendUpdateItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
