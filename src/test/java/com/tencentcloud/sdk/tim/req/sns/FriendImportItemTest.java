package com.tencentcloud.sdk.tim.req.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FriendImportItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendImportItem instance = new FriendImportItem();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        FriendImportItem instance = new FriendImportItem();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendImportItem a = new FriendImportItem();
        FriendImportItem b = new FriendImportItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
