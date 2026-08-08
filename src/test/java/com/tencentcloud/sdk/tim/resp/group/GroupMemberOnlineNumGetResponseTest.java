package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberOnlineNumGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberOnlineNumGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberOnlineNumGetResponse instance = new GroupMemberOnlineNumGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupMemberOnlineNumGetResponse instance = new GroupMemberOnlineNumGetResponse();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetOnlineMemberNum() {
        GroupMemberOnlineNumGetResponse instance = new GroupMemberOnlineNumGetResponse();
        instance.setOnlineMemberNum(42);
        assertEquals(42, instance.getOnlineMemberNum());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberOnlineNumGetResponse instance = new GroupMemberOnlineNumGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberOnlineNumGetResponse a = new GroupMemberOnlineNumGetResponse();
        GroupMemberOnlineNumGetResponse b = new GroupMemberOnlineNumGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberOnlineNumGetResponse a = new GroupMemberOnlineNumGetResponse();
        GroupMemberOnlineNumGetResponse b = new GroupMemberOnlineNumGetResponse();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}