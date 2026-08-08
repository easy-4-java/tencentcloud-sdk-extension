package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterDestroyedMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterDestroyedMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterDestroyedMember instance = new GroupAfterDestroyedMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupAfterDestroyedMember instance = new GroupAfterDestroyedMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterDestroyedMember instance = new GroupAfterDestroyedMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterDestroyedMember a = new GroupAfterDestroyedMember();
        GroupAfterDestroyedMember b = new GroupAfterDestroyedMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterDestroyedMember a = new GroupAfterDestroyedMember();
        GroupAfterDestroyedMember b = new GroupAfterDestroyedMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}