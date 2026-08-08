package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupResponseFilter.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupResponseFilterTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupResponseFilter instance = new GroupResponseFilter();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetBaseInfoFilter() {
        GroupResponseFilter instance = new GroupResponseFilter();
        instance.setBaseInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getBaseInfoFilter());
    }

    @Test
    void shouldSetAndGetMemberInfoFilter() {
        GroupResponseFilter instance = new GroupResponseFilter();
        instance.setMemberInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberInfoFilter());
    }

    @Test
    void shouldSetAndGetAppDefinedDataGroupFilter() {
        GroupResponseFilter instance = new GroupResponseFilter();
        instance.setAppDefinedDataGroupFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedDataGroupFilter());
    }

    @Test
    void shouldSetAndGetAppDefinedDataGroupMemberFilter() {
        GroupResponseFilter instance = new GroupResponseFilter();
        instance.setAppDefinedDataGroupMemberFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedDataGroupMemberFilter());
    }

    @Test
    void shouldGenerateToString() {
        GroupResponseFilter instance = new GroupResponseFilter();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupResponseFilter a = new GroupResponseFilter();
        GroupResponseFilter b = new GroupResponseFilter();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupResponseFilter a = new GroupResponseFilter();
        GroupResponseFilter b = new GroupResponseFilter();
        b.setBaseInfoFilter(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}