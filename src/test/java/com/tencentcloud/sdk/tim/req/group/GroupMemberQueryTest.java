package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberQuery.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberQueryTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberQuery instance = new GroupMemberQuery();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetLimit() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setLimit(42);
        assertEquals(42, instance.getLimit());
    }

    @Test
    void shouldSetAndGetOffset() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setOffset(42);
        assertEquals(42, instance.getOffset());
    }

    @Test
    void shouldSetAndGetBaseInfoFilter() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setBaseInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getBaseInfoFilter());
    }

    @Test
    void shouldSetAndGetMemberInfoFilter() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setMemberInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberInfoFilter());
    }

    @Test
    void shouldSetAndGetAppDefinedDataGroupFilter() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setAppDefinedDataGroupFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedDataGroupFilter());
    }

    @Test
    void shouldSetAndGetAppDefinedDataGroupMemberFilter() {
        GroupMemberQuery instance = new GroupMemberQuery();
        instance.setAppDefinedDataGroupMemberFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedDataGroupMemberFilter());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberQuery instance = new GroupMemberQuery();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberQuery a = new GroupMemberQuery();
        GroupMemberQuery b = new GroupMemberQuery();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberQuery a = new GroupMemberQuery();
        GroupMemberQuery b = new GroupMemberQuery();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}