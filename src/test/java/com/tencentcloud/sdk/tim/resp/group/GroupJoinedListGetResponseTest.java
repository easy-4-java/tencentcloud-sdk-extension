package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupJoinedListGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupJoinedListGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupJoinedListGetResponse instance = new GroupJoinedListGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetMemberNum() {
        GroupJoinedListGetResponse instance = new GroupJoinedListGetResponse();
        instance.setMemberNum(42);
        assertEquals(42, instance.getMemberNum());
    }

    @Test
    void shouldSetAndGetMembers() {
        GroupJoinedListGetResponse instance = new GroupJoinedListGetResponse();
        instance.setMembers(new java.util.ArrayList<>());
        assertNotNull(instance.getMembers());
    }

    @Test
    void shouldGenerateToString() {
        GroupJoinedListGetResponse instance = new GroupJoinedListGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupJoinedListGetResponse a = new GroupJoinedListGetResponse();
        GroupJoinedListGetResponse b = new GroupJoinedListGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupJoinedListGetResponse a = new GroupJoinedListGetResponse();
        GroupJoinedListGetResponse b = new GroupJoinedListGetResponse();
        b.setMemberNum(42);
        assertNotEquals(a, b);
    }

}