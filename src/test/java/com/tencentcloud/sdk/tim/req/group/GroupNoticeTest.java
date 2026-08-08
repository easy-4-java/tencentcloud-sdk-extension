package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupNotice.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupNoticeTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupNotice instance = new GroupNotice();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupNotice instance = new GroupNotice();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetData() {
        GroupNotice instance = new GroupNotice();
        instance.setData("testValue");
        assertEquals("testValue", instance.getData());
    }

    @Test
    void shouldGenerateToString() {
        GroupNotice instance = new GroupNotice();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupNotice a = new GroupNotice();
        GroupNotice b = new GroupNotice();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupNotice a = new GroupNotice();
        GroupNotice b = new GroupNotice();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}