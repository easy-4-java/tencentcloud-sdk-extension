package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterNewMemberJoin.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterNewMemberJoinTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetJoinType() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setJoinType("testValue");
        assertEquals("testValue", instance.getJoinType());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterNewMemberJoin instance = new GroupAfterNewMemberJoin();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterNewMemberJoin a = new GroupAfterNewMemberJoin();
        GroupAfterNewMemberJoin b = new GroupAfterNewMemberJoin();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterNewMemberJoin a = new GroupAfterNewMemberJoin();
        GroupAfterNewMemberJoin b = new GroupAfterNewMemberJoin();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}