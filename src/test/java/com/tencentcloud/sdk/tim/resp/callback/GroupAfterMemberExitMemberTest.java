package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterMemberExitMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterMemberExitMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterMemberExitMember instance = new GroupAfterMemberExitMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupAfterMemberExitMember instance = new GroupAfterMemberExitMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterMemberExitMember instance = new GroupAfterMemberExitMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterMemberExitMember a = new GroupAfterMemberExitMember();
        GroupAfterMemberExitMember b = new GroupAfterMemberExitMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterMemberExitMember a = new GroupAfterMemberExitMember();
        GroupAfterMemberExitMember b = new GroupAfterMemberExitMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}