package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserAttrsResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserAttrsResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserAttrsResponse instance = new UserAttrsResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserAttrs() {
        UserAttrsResponse instance = new UserAttrsResponse();
        instance.setUserAttrs(new java.util.ArrayList<>());
        assertNotNull(instance.getUserAttrs());
    }

    @Test
    void shouldGenerateToString() {
        UserAttrsResponse instance = new UserAttrsResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserAttrsResponse a = new UserAttrsResponse();
        UserAttrsResponse b = new UserAttrsResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserAttrsResponse a = new UserAttrsResponse();
        UserAttrsResponse b = new UserAttrsResponse();
        b.setUserAttrs(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}