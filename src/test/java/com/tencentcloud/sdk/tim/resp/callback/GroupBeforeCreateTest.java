package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeCreate.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeCreateTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetOperator() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setOperator("testValue");
        assertEquals("testValue", instance.getOperator());
    }

    @Test
    void shouldSetAndGetOwner() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setOwner("testValue");
        assertEquals("testValue", instance.getOwner());
    }

    @Test
    void shouldSetAndGetType() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetName() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setName("testValue");
        assertEquals("testValue", instance.getName());
    }

    @Test
    void shouldSetAndGetCreatedGroupNum() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setCreatedGroupNum(42);
        assertEquals(42, instance.getCreatedGroupNum());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeCreate instance = new GroupBeforeCreate();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeCreate a = new GroupBeforeCreate();
        GroupBeforeCreate b = new GroupBeforeCreate();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeCreate a = new GroupBeforeCreate();
        GroupBeforeCreate b = new GroupBeforeCreate();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}