package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupId.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupIdTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupId instance = new GroupId();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupId instance = new GroupId();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldGenerateToString() {
        GroupId instance = new GroupId();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupId a = new GroupId();
        GroupId b = new GroupId();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupId a = new GroupId();
        GroupId b = new GroupId();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}