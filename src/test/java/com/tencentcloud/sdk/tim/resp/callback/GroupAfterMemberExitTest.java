package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterMemberExit.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterMemberExitTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetExitType() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setExitType("testValue");
        assertEquals("testValue", instance.getExitType());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterMemberExit instance = new GroupAfterMemberExit();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterMemberExit a = new GroupAfterMemberExit();
        GroupAfterMemberExit b = new GroupAfterMemberExit();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterMemberExit a = new GroupAfterMemberExit();
        GroupAfterMemberExit b = new GroupAfterMemberExit();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}