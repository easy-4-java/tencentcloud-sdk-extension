package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupDeleteResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupDeleteResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupDeleteResponse instance = new GroupDeleteResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCurrentSequence() {
        GroupDeleteResponse instance = new GroupDeleteResponse();
        instance.setCurrentSequence(42);
        assertEquals(42, instance.getCurrentSequence());
    }

    @Test
    void shouldGenerateToString() {
        GroupDeleteResponse instance = new GroupDeleteResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupDeleteResponse a = new GroupDeleteResponse();
        GroupDeleteResponse b = new GroupDeleteResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupDeleteResponse a = new GroupDeleteResponse();
        GroupDeleteResponse b = new GroupDeleteResponse();
        b.setCurrentSequence(42);
        assertNotEquals(a, b);
    }

}