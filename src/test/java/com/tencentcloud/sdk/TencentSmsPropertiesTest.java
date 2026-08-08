package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TencentSmsProperties.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TencentSmsPropertiesTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TencentSmsProperties instance = new TencentSmsProperties();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetEnabled() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setEnabled(true);
        assertEquals(true, instance.isEnabled());
    }

    @Test
    void shouldSetAndGetSecretId() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSecretId("testValue");
        assertEquals("testValue", instance.getSecretId());
    }

    @Test
    void shouldSetAndGetSecretKey() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSecretKey("testValue");
        assertEquals("testValue", instance.getSecretKey());
    }

    @Test
    void shouldSetAndGetSdkappid() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSdkappid("testValue");
        assertEquals("testValue", instance.getSdkappid());
    }

    @Test
    void shouldSetAndGetSign() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSign("testValue");
        assertEquals("testValue", instance.getSign());
    }

    @Test
    void shouldSetAndGetSenderId() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSenderId("testValue");
        assertEquals("testValue", instance.getSenderId());
    }

    @Test
    void shouldSetAndGetEncode() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setEncode("testValue");
        assertEquals("testValue", instance.getEncode());
    }

    @Test
    void shouldSetAndGetSession() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSession("testValue");
        assertEquals("testValue", instance.getSession());
    }

    @Test
    void shouldSetAndGetRegion() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setRegion("testValue");
        assertEquals("testValue", instance.getRegion());
    }


    @Test
    void shouldSetAndGetSignMethod() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setSignMethod("testValue");
        assertEquals("testValue", instance.getSignMethod());
    }

    @Test
    void shouldSetAndGetUnsignedPayload() {
        TencentSmsProperties instance = new TencentSmsProperties();
        instance.setUnsignedPayload(true);
        assertEquals(true, instance.isUnsignedPayload());
    }


    @Test
    void shouldGenerateToString() {
        TencentSmsProperties instance = new TencentSmsProperties();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }


    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TencentSmsProperties a = new TencentSmsProperties();
        TencentSmsProperties b = new TencentSmsProperties();
        b.setEnabled(true);
        assertNotEquals(a, b);
    }

}