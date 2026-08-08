package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberGetResponse instance = new GroupMemberGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMemberNum() {
        GroupMemberGetResponse instance = new GroupMemberGetResponse();
        instance.setMemberNum(42);
        assertEquals(42, instance.getMemberNum());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupMemberGetResponse instance = new GroupMemberGetResponse();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberGetResponse instance = new GroupMemberGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberGetResponse a = new GroupMemberGetResponse();
        GroupMemberGetResponse b = new GroupMemberGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberGetResponse a = new GroupMemberGetResponse();
        GroupMemberGetResponse b = new GroupMemberGetResponse();
        b.setMemberNum(42);
        assertNotEquals(a, b);
    }

}