package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TencentCloudProperties.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TencentCloudPropertiesTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TencentCloudProperties instance = new TencentCloudProperties();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSecretId() {
        TencentCloudProperties instance = new TencentCloudProperties();
        instance.setSecretId("testValue");
        assertEquals("testValue", instance.getSecretId());
    }

    @Test
    void shouldSetAndGetSecretKey() {
        TencentCloudProperties instance = new TencentCloudProperties();
        instance.setSecretKey("testValue");
        assertEquals("testValue", instance.getSecretKey());
    }

    @Test
    void shouldSetAndGetDebug() {
        TencentCloudProperties instance = new TencentCloudProperties();
        instance.setDebug(true);
        assertEquals(true, instance.isDebug());
    }

    @Test
    void shouldGenerateToString() {
        TencentCloudProperties instance = new TencentCloudProperties();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        TencentCloudProperties a = new TencentCloudProperties();
        TencentCloudProperties b = new TencentCloudProperties();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TencentCloudProperties a = new TencentCloudProperties();
        TencentCloudProperties b = new TencentCloudProperties();
        b.setSecretId("testValue");
        assertNotEquals(a, b);
    }

}