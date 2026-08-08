package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMember instance = new GroupMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMemberAccount() {
        GroupMember instance = new GroupMember();
        instance.setMemberAccount("testValue");
        assertEquals("testValue", instance.getMemberAccount());
    }

    @Test
    void shouldSetAndGetRole() {
        GroupMember instance = new GroupMember();
        instance.setRole("testValue");
        assertEquals("testValue", instance.getRole());
    }

    @Test
    void shouldSetAndGetJoinTime() {
        GroupMember instance = new GroupMember();
        instance.setJoinTime(100L);
        assertEquals(100L, instance.getJoinTime());
    }

    @Test
    void shouldSetAndGetMsgSeq() {
        GroupMember instance = new GroupMember();
        instance.setMsgSeq(100L);
        assertEquals(100L, instance.getMsgSeq());
    }

    @Test
    void shouldSetAndGetMsgFlag() {
        GroupMember instance = new GroupMember();
        instance.setMsgFlag("testValue");
        assertEquals("testValue", instance.getMsgFlag());
    }

    @Test
    void shouldSetAndGetLastSendMsgTime() {
        GroupMember instance = new GroupMember();
        instance.setLastSendMsgTime(100L);
        assertEquals(100L, instance.getLastSendMsgTime());
    }

    @Test
    void shouldSetAndGetShutUpUntil() {
        GroupMember instance = new GroupMember();
        instance.setShutUpUntil(100L);
        assertEquals(100L, instance.getShutUpUntil());
    }

    @Test
    void shouldSetAndGetAppMemberDefinedData() {
        GroupMember instance = new GroupMember();
        instance.setAppMemberDefinedData(new java.util.ArrayList<>());
        assertNotNull(instance.getAppMemberDefinedData());
    }

    @Test
    void shouldGenerateToString() {
        GroupMember instance = new GroupMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMember a = new GroupMember();
        GroupMember b = new GroupMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMember a = new GroupMember();
        GroupMember b = new GroupMember();
        b.setMemberAccount("testValue");
        assertNotEquals(a, b);
    }

}