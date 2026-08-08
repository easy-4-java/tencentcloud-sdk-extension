package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeInviteJoinResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeInviteJoinResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetActionStatus() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        instance.setActionStatus("testValue");
        assertEquals("testValue", instance.getActionStatus());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        instance.setErrorCode(42);
        assertEquals(42, instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetRefusedMembers_Account() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        instance.setRefusedMembers_Account(new java.util.ArrayList<>());
        assertNotNull(instance.getRefusedMembers_Account());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeInviteJoinResponse instance = new GroupBeforeInviteJoinResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeInviteJoinResponse a = new GroupBeforeInviteJoinResponse();
        GroupBeforeInviteJoinResponse b = new GroupBeforeInviteJoinResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeInviteJoinResponse a = new GroupBeforeInviteJoinResponse();
        GroupBeforeInviteJoinResponse b = new GroupBeforeInviteJoinResponse();
        b.setActionStatus("testValue");
        assertNotEquals(a, b);
    }

}