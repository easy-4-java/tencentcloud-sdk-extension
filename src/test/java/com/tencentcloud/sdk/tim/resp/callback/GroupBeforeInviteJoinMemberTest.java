package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeInviteJoinMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeInviteJoinMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeInviteJoinMember instance = new GroupBeforeInviteJoinMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupBeforeInviteJoinMember instance = new GroupBeforeInviteJoinMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeInviteJoinMember instance = new GroupBeforeInviteJoinMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeInviteJoinMember a = new GroupBeforeInviteJoinMember();
        GroupBeforeInviteJoinMember b = new GroupBeforeInviteJoinMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeInviteJoinMember a = new GroupBeforeInviteJoinMember();
        GroupBeforeInviteJoinMember b = new GroupBeforeInviteJoinMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}