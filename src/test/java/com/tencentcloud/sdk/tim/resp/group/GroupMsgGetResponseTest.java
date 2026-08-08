package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMsgGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMsgGetResponse instance = new GroupMsgGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMsgGetResponse instance = new GroupMsgGetResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMsgGetResponse a = new GroupMsgGetResponse();
        GroupMsgGetResponse b = new GroupMsgGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
