package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberModify.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberModifyTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberModify instance = new GroupMemberModify();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRole() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setRole("testValue");
        assertEquals("testValue", instance.getRole());
    }

    @Test
    void shouldSetAndGetMsgFlag() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setMsgFlag("testValue");
        assertEquals("testValue", instance.getMsgFlag());
    }

    @Test
    void shouldSetAndGetNameCard() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setNameCard("testValue");
        assertEquals("testValue", instance.getNameCard());
    }

    @Test
    void shouldSetAndGetShutUpTime() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setShutUpTime(100L);
        assertEquals(100L, instance.getShutUpTime());
    }

    @Test
    void shouldSetAndGetAppMemberDefinedData() {
        GroupMemberModify instance = new GroupMemberModify();
        instance.setAppMemberDefinedData(new java.util.ArrayList<>());
        assertNotNull(instance.getAppMemberDefinedData());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberModify instance = new GroupMemberModify();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberModify a = new GroupMemberModify();
        GroupMemberModify b = new GroupMemberModify();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberModify a = new GroupMemberModify();
        GroupMemberModify b = new GroupMemberModify();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}