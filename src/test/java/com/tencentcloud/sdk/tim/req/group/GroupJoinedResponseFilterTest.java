package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupJoinedResponseFilter.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupJoinedResponseFilterTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupJoinedResponseFilter instance = new GroupJoinedResponseFilter();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetBaseInfoFilter() {
        GroupJoinedResponseFilter instance = new GroupJoinedResponseFilter();
        instance.setBaseInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getBaseInfoFilter());
    }

    @Test
    void shouldSetAndGetSelfInfoFilter() {
        GroupJoinedResponseFilter instance = new GroupJoinedResponseFilter();
        instance.setSelfInfoFilter(new java.util.ArrayList<>());
        assertNotNull(instance.getSelfInfoFilter());
    }

    @Test
    void shouldGenerateToString() {
        GroupJoinedResponseFilter instance = new GroupJoinedResponseFilter();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupJoinedResponseFilter a = new GroupJoinedResponseFilter();
        GroupJoinedResponseFilter b = new GroupJoinedResponseFilter();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupJoinedResponseFilter a = new GroupJoinedResponseFilter();
        GroupJoinedResponseFilter b = new GroupJoinedResponseFilter();
        b.setBaseInfoFilter(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}