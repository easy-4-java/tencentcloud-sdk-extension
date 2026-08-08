package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterDestroyed.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterDestroyedTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetGroupName() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetOwner() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setOwner("testValue");
        assertEquals("testValue", instance.getOwner());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterDestroyed instance = new GroupAfterDestroyed();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterDestroyed a = new GroupAfterDestroyed();
        GroupAfterDestroyed b = new GroupAfterDestroyed();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterDestroyed a = new GroupAfterDestroyed();
        GroupAfterDestroyed b = new GroupAfterDestroyed();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}