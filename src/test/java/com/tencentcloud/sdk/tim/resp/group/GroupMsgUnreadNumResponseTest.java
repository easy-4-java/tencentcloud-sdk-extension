package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMsgUnreadNumResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMsgUnreadNumResponse instance = new GroupMsgUnreadNumResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMsgUnreadNumResponse instance = new GroupMsgUnreadNumResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMsgUnreadNumResponse a = new GroupMsgUnreadNumResponse();
        GroupMsgUnreadNumResponse b = new GroupMsgUnreadNumResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
