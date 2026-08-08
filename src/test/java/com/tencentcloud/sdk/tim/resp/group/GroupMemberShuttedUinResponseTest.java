package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMemberShuttedUinResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberShuttedUinResponse instance = new GroupMemberShuttedUinResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberShuttedUinResponse instance = new GroupMemberShuttedUinResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberShuttedUinResponse a = new GroupMemberShuttedUinResponse();
        GroupMemberShuttedUinResponse b = new GroupMemberShuttedUinResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
