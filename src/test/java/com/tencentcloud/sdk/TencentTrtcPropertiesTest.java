package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TencentTrtcProperties.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TencentTrtcPropertiesTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetEnabled() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setEnabled(true);
        assertEquals(true, instance.isEnabled());
    }

    @Test
    void shouldSetAndGetSdkappid() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setSdkappid(100L);
        assertEquals(100L, instance.getSdkappid());
    }

    @Test
    void shouldSetAndGetSecretId() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setSecretId("testValue");
        assertEquals("testValue", instance.getSecretId());
    }

    @Test
    void shouldSetAndGetSecretKey() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setSecretKey("testValue");
        assertEquals("testValue", instance.getSecretKey());
    }

    @Test
    void shouldSetAndGetRegion() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setRegion("testValue");
        assertEquals("testValue", instance.getRegion());
    }


    @Test
    void shouldSetAndGetSignMethod() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setSignMethod("testValue");
        assertEquals("testValue", instance.getSignMethod());
    }

    @Test
    void shouldSetAndGetUnsignedPayload() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setUnsignedPayload(true);
        assertEquals(true, instance.isUnsignedPayload());
    }


    @Test
    void shouldSetAndGetPushDomain() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setPushDomain("testValue");
        assertEquals("testValue", instance.getPushDomain());
    }

    @Test
    void shouldSetAndGetPlayDomain() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setPlayDomain("testValue");
        assertEquals("testValue", instance.getPlayDomain());
    }

    @Test
    void shouldSetAndGetAppName() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setAppName("testValue");
        assertEquals("testValue", instance.getAppName());
    }

    @Test
    void shouldSetAndGetRetryTimes() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        instance.setRetryTimes(42);
        assertEquals(42, instance.getRetryTimes());
    }

    @Test
    void shouldGenerateToString() {
        TencentTrtcProperties instance = new TencentTrtcProperties();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }


    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TencentTrtcProperties a = new TencentTrtcProperties();
        TencentTrtcProperties b = new TencentTrtcProperties();
        b.setEnabled(true);
        assertNotEquals(a, b);
    }

}