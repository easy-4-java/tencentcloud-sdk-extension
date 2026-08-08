package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserAttrs.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserAttrsTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserAttrs instance = new UserAttrs();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetToAccount() {
        UserAttrs instance = new UserAttrs();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetAttrs() {
        UserAttrs instance = new UserAttrs();
        instance.setAttrs(new java.util.HashMap<>());
        assertNotNull(instance.getAttrs());
    }

    @Test
    void shouldGenerateToString() {
        UserAttrs instance = new UserAttrs();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserAttrs a = new UserAttrs();
        UserAttrs b = new UserAttrs();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserAttrs a = new UserAttrs();
        UserAttrs b = new UserAttrs();
        b.setToAccount("testValue");
        assertNotEquals(a, b);
    }

}