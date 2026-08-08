package com.tencentcloud.sdk.tim.req.common;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MapKV.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MapKVTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MapKV instance = new MapKV();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetKey() {
        MapKV instance = new MapKV();
        instance.setKey("testValue");
        assertEquals("testValue", instance.getKey());
    }

    @Test
    void shouldSetAndGetValue() {
        MapKV instance = new MapKV();
        instance.setValue("testValue");
        assertEquals("testValue", instance.getValue());
    }

    @Test
    void shouldGenerateToString() {
        MapKV instance = new MapKV();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MapKV a = new MapKV();
        MapKV b = new MapKV();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MapKV a = new MapKV();
        MapKV b = new MapKV();
        b.setKey("testValue");
        assertNotEquals(a, b);
    }

}