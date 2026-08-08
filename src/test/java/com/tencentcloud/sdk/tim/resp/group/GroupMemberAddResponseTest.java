package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberAddResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberAddResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberAddResponse instance = new GroupMemberAddResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMembers() {
        GroupMemberAddResponse instance = new GroupMemberAddResponse();
        instance.setMembers(new java.util.ArrayList<>());
        assertNotNull(instance.getMembers());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberAddResponse instance = new GroupMemberAddResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberAddResponse a = new GroupMemberAddResponse();
        GroupMemberAddResponse b = new GroupMemberAddResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberAddResponse a = new GroupMemberAddResponse();
        GroupMemberAddResponse b = new GroupMemberAddResponse();
        b.setMembers(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}