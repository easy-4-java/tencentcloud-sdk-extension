package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AppAttrNameResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AppAttrNameResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AppAttrNameResponse instance = new AppAttrNameResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAttrNames() {
        AppAttrNameResponse instance = new AppAttrNameResponse();
        instance.setAttrNames(new java.util.HashMap<>());
        assertNotNull(instance.getAttrNames());
    }

    @Test
    void shouldGenerateToString() {
        AppAttrNameResponse instance = new AppAttrNameResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AppAttrNameResponse a = new AppAttrNameResponse();
        AppAttrNameResponse b = new AppAttrNameResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AppAttrNameResponse a = new AppAttrNameResponse();
        AppAttrNameResponse b = new AppAttrNameResponse();
        b.setAttrNames(new java.util.HashMap<>());
        assertNotEquals(a, b);
    }

}