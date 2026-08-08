package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserTagsResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserTagsResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserTagsResponse instance = new UserTagsResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserTags() {
        UserTagsResponse instance = new UserTagsResponse();
        instance.setUserTags(new java.util.ArrayList<>());
        assertNotNull(instance.getUserTags());
    }

    @Test
    void shouldGenerateToString() {
        UserTagsResponse instance = new UserTagsResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserTagsResponse a = new UserTagsResponse();
        UserTagsResponse b = new UserTagsResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserTagsResponse a = new UserTagsResponse();
        UserTagsResponse b = new UserTagsResponse();
        b.setUserTags(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}