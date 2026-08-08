package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterGroupFull.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterGroupFullTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterGroupFull instance = new GroupAfterGroupFull();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterGroupFull instance = new GroupAfterGroupFull();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterGroupFull instance = new GroupAfterGroupFull();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterGroupFull instance = new GroupAfterGroupFull();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterGroupFull a = new GroupAfterGroupFull();
        GroupAfterGroupFull b = new GroupAfterGroupFull();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterGroupFull a = new GroupAfterGroupFull();
        GroupAfterGroupFull b = new GroupAfterGroupFull();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}