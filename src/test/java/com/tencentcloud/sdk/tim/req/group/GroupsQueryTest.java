package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupsQuery.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupsQueryTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupsQuery instance = new GroupsQuery();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetLimit() {
        GroupsQuery instance = new GroupsQuery();
        instance.setLimit(42);
        assertEquals(42, instance.getLimit());
    }

    @Test
    void shouldSetAndGetNext() {
        GroupsQuery instance = new GroupsQuery();
        instance.setNext(42);
        assertEquals(42, instance.getNext());
    }

    @Test
    void shouldSetAndGetGroupType() {
        GroupsQuery instance = new GroupsQuery();
        instance.setGroupType("testValue");
        assertEquals("testValue", instance.getGroupType());
    }

    @Test
    void shouldGenerateToString() {
        GroupsQuery instance = new GroupsQuery();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupsQuery a = new GroupsQuery();
        GroupsQuery b = new GroupsQuery();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupsQuery a = new GroupsQuery();
        GroupsQuery b = new GroupsQuery();
        b.setLimit(42);
        assertNotEquals(a, b);
    }

}