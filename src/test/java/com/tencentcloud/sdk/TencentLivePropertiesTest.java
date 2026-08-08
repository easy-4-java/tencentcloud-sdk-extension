package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TencentLiveProperties.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TencentLivePropertiesTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TencentLiveProperties instance = new TencentLiveProperties();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetEnabled() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setEnabled(true);
        assertEquals(true, instance.isEnabled());
    }

    @Test
    void shouldSetAndGetSecretId() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setSecretId("testValue");
        assertEquals("testValue", instance.getSecretId());
    }

    @Test
    void shouldSetAndGetSecretKey() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setSecretKey("testValue");
        assertEquals("testValue", instance.getSecretKey());
    }

    @Test
    void shouldSetAndGetRegion() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setRegion("testValue");
        assertEquals("testValue", instance.getRegion());
    }


    @Test
    void shouldSetAndGetSignMethod() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setSignMethod("testValue");
        assertEquals("testValue", instance.getSignMethod());
    }

    @Test
    void shouldSetAndGetUnsignedPayload() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setUnsignedPayload(true);
        assertEquals(true, instance.isUnsignedPayload());
    }


    @Test
    void shouldSetAndGetPushDomain() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setPushDomain("testValue");
        assertEquals("testValue", instance.getPushDomain());
    }

    @Test
    void shouldSetAndGetPlayDomain() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setPlayDomain("testValue");
        assertEquals("testValue", instance.getPlayDomain());
    }

    @Test
    void shouldSetAndGetAppName() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setAppName("testValue");
        assertEquals("testValue", instance.getAppName());
    }

    @Test
    void shouldSetAndGetStreamUrlKey() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setStreamUrlKey("testValue");
        assertEquals("testValue", instance.getStreamUrlKey());
    }

    @Test
    void shouldSetAndGetRetryTimes() {
        TencentLiveProperties instance = new TencentLiveProperties();
        instance.setRetryTimes(42);
        assertEquals(42, instance.getRetryTimes());
    }

    @Test
    void shouldGenerateToString() {
        TencentLiveProperties instance = new TencentLiveProperties();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }


    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TencentLiveProperties a = new TencentLiveProperties();
        TencentLiveProperties b = new TencentLiveProperties();
        b.setEnabled(true);
        assertNotEquals(a, b);
    }

}