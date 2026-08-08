package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupInfoResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupInfoResponse instance = new GroupInfoResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupInfoResponse instance = new GroupInfoResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupInfoResponse a = new GroupInfoResponse();
        GroupInfoResponse b = new GroupInfoResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
