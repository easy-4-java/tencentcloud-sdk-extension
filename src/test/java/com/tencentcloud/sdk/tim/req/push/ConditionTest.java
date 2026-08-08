package com.tencentcloud.sdk.tim.req.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for Condition.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class ConditionTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        Condition instance = new Condition();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAttrsOr() {
        Condition instance = new Condition();
        instance.setAttrsOr(new java.util.HashMap<>());
        assertNotNull(instance.getAttrsOr());
    }

    @Test
    void shouldSetAndGetAttrsAnd() {
        Condition instance = new Condition();
        instance.setAttrsAnd(new java.util.HashMap<>());
        assertNotNull(instance.getAttrsAnd());
    }



    @Test
    void shouldGenerateToString() {
        Condition instance = new Condition();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        Condition a = new Condition();
        Condition b = new Condition();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        Condition a = new Condition();
        Condition b = new Condition();
        b.setAttrsOr(new java.util.HashMap<>());
        assertNotEquals(a, b);
    }

}