package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMemberRoleGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberRoleGetResponse instance = new GroupMemberRoleGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberRoleGetResponse instance = new GroupMemberRoleGetResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberRoleGetResponse a = new GroupMemberRoleGetResponse();
        GroupMemberRoleGetResponse b = new GroupMemberRoleGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
