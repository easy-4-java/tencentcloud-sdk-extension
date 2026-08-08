package com.tencentcloud.sdk.tim.resp.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserProfileItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserProfileItem instance = new UserProfileItem();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        UserProfileItem instance = new UserProfileItem();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserProfileItem a = new UserProfileItem();
        UserProfileItem b = new UserProfileItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
