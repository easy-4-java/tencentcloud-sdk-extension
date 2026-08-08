package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserAttrsRemoveResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserAttrsRemoveResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserAttrsRemoveResponse instance = new UserAttrsRemoveResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetToAccount() {
        UserAttrsRemoveResponse instance = new UserAttrsRemoveResponse();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetAttrs() {
        UserAttrsRemoveResponse instance = new UserAttrsRemoveResponse();
        instance.setAttrs(new java.util.ArrayList<>());
        assertNotNull(instance.getAttrs());
    }

    @Test
    void shouldGenerateToString() {
        UserAttrsRemoveResponse instance = new UserAttrsRemoveResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserAttrsRemoveResponse a = new UserAttrsRemoveResponse();
        UserAttrsRemoveResponse b = new UserAttrsRemoveResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserAttrsRemoveResponse a = new UserAttrsRemoveResponse();
        UserAttrsRemoveResponse b = new UserAttrsRemoveResponse();
        b.setToAccount("testValue");
        assertNotEquals(a, b);
    }

}