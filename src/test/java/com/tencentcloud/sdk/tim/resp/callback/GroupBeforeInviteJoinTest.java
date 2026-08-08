package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeInviteJoin.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeInviteJoinTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetType() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeInviteJoin instance = new GroupBeforeInviteJoin();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeInviteJoin a = new GroupBeforeInviteJoin();
        GroupBeforeInviteJoin b = new GroupBeforeInviteJoin();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeInviteJoin a = new GroupBeforeInviteJoin();
        GroupBeforeInviteJoin b = new GroupBeforeInviteJoin();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}