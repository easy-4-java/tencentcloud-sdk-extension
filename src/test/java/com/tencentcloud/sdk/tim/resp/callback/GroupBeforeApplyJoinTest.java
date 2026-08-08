package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeApplyJoin.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeApplyJoinTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeApplyJoin instance = new GroupBeforeApplyJoin();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeApplyJoin a = new GroupBeforeApplyJoin();
        GroupBeforeApplyJoin b = new GroupBeforeApplyJoin();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeApplyJoin a = new GroupBeforeApplyJoin();
        GroupBeforeApplyJoin b = new GroupBeforeApplyJoin();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}