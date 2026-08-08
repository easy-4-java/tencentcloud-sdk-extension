package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupBeforeCreateMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupBeforeCreateMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupBeforeCreateMember instance = new GroupBeforeCreateMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupBeforeCreateMember instance = new GroupBeforeCreateMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupBeforeCreateMember instance = new GroupBeforeCreateMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupBeforeCreateMember a = new GroupBeforeCreateMember();
        GroupBeforeCreateMember b = new GroupBeforeCreateMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupBeforeCreateMember a = new GroupBeforeCreateMember();
        GroupBeforeCreateMember b = new GroupBeforeCreateMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}