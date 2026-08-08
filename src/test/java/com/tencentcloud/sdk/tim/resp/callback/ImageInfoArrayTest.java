package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for ImageInfoArray.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class ImageInfoArrayTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        ImageInfoArray instance = new ImageInfoArray();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetType() {
        ImageInfoArray instance = new ImageInfoArray();
        instance.setType(100L);
        assertEquals(100L, instance.getType());
    }

    @Test
    void shouldSetAndGetSize() {
        ImageInfoArray instance = new ImageInfoArray();
        instance.setSize(100L);
        assertEquals(100L, instance.getSize());
    }

    @Test
    void shouldSetAndGetWidth() {
        ImageInfoArray instance = new ImageInfoArray();
        instance.setWidth(42);
        assertEquals(42, instance.getWidth());
    }

    @Test
    void shouldSetAndGetHeight() {
        ImageInfoArray instance = new ImageInfoArray();
        instance.setHeight(42);
        assertEquals(42, instance.getHeight());
    }

    @Test
    void shouldSetAndGetUrl() {
        ImageInfoArray instance = new ImageInfoArray();
        instance.setUrl("testValue");
        assertEquals("testValue", instance.getUrl());
    }

    @Test
    void shouldGenerateToString() {
        ImageInfoArray instance = new ImageInfoArray();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        ImageInfoArray a = new ImageInfoArray();
        ImageInfoArray b = new ImageInfoArray();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        ImageInfoArray a = new ImageInfoArray();
        ImageInfoArray b = new ImageInfoArray();
        b.setType(100L);
        assertNotEquals(a, b);
    }

}