package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupCreateResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupCreateResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupCreateResponse instance = new GroupCreateResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupCreateResponse instance = new GroupCreateResponse();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldGenerateToString() {
        GroupCreateResponse instance = new GroupCreateResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupCreateResponse a = new GroupCreateResponse();
        GroupCreateResponse b = new GroupCreateResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupCreateResponse a = new GroupCreateResponse();
        GroupCreateResponse b = new GroupCreateResponse();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}