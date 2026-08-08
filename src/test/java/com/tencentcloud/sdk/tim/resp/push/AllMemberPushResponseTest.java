package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AllMemberPushResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AllMemberPushResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AllMemberPushResponse instance = new AllMemberPushResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetTaskId() {
        AllMemberPushResponse instance = new AllMemberPushResponse();
        instance.setTaskId("testValue");
        assertEquals("testValue", instance.getTaskId());
    }

    @Test
    void shouldGenerateToString() {
        AllMemberPushResponse instance = new AllMemberPushResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AllMemberPushResponse a = new AllMemberPushResponse();
        AllMemberPushResponse b = new AllMemberPushResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AllMemberPushResponse a = new AllMemberPushResponse();
        AllMemberPushResponse b = new AllMemberPushResponse();
        b.setTaskId("testValue");
        assertNotEquals(a, b);
    }

}