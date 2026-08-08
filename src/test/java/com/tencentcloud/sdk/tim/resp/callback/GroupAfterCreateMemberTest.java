package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterCreateMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterCreateMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterCreateMember instance = new GroupAfterCreateMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupAfterCreateMember instance = new GroupAfterCreateMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterCreateMember instance = new GroupAfterCreateMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterCreateMember a = new GroupAfterCreateMember();
        GroupAfterCreateMember b = new GroupAfterCreateMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterCreateMember a = new GroupAfterCreateMember();
        GroupAfterCreateMember b = new GroupAfterCreateMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}