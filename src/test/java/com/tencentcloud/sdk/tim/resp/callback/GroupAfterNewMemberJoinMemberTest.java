package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterNewMemberJoinMember.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterNewMemberJoinMemberTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterNewMemberJoinMember instance = new GroupAfterNewMemberJoinMember();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMember() {
        GroupAfterNewMemberJoinMember instance = new GroupAfterNewMemberJoinMember();
        instance.setMember("testValue");
        assertEquals("testValue", instance.getMember());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterNewMemberJoinMember instance = new GroupAfterNewMemberJoinMember();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterNewMemberJoinMember a = new GroupAfterNewMemberJoinMember();
        GroupAfterNewMemberJoinMember b = new GroupAfterNewMemberJoinMember();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterNewMemberJoinMember a = new GroupAfterNewMemberJoinMember();
        GroupAfterNewMemberJoinMember b = new GroupAfterNewMemberJoinMember();
        b.setMember("testValue");
        assertNotEquals(a, b);
    }

}