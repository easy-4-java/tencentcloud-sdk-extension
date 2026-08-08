package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterCreate.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterCreateTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterCreate instance = new GroupAfterCreate();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetOperator() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setOperator("testValue");
        assertEquals("testValue", instance.getOperator());
    }

    @Test
    void shouldSetAndGetOwner() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setOwner("testValue");
        assertEquals("testValue", instance.getOwner());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetName() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setName("testValue");
        assertEquals("testValue", instance.getName());
    }

    @Test
    void shouldSetAndGetCreatedGroupNum() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setCreatedGroupNum(42);
        assertEquals(42, instance.getCreatedGroupNum());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldSetAndGetUserDefinedDataList() {
        GroupAfterCreate instance = new GroupAfterCreate();
        instance.setUserDefinedDataList(new java.util.ArrayList<>());
        assertNotNull(instance.getUserDefinedDataList());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterCreate instance = new GroupAfterCreate();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterCreate a = new GroupAfterCreate();
        GroupAfterCreate b = new GroupAfterCreate();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterCreate a = new GroupAfterCreate();
        GroupAfterCreate b = new GroupAfterCreate();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}