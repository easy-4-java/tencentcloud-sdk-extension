package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for TencentTimProperties.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class TencentTimPropertiesTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        TencentTimProperties instance = new TencentTimProperties();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetEnabled() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setEnabled(true);
        assertEquals(true, instance.isEnabled());
    }

    @Test
    void shouldSetAndGetDomain() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setDomain("testValue");
        assertEquals("testValue", instance.getDomain());
    }

    @Test
    void shouldSetAndGetIdentifier() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setIdentifier("testValue");
        assertEquals("testValue", instance.getIdentifier());
    }

    @Test
    void shouldSetAndGetSdkappid() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setSdkappid(100L);
        assertEquals(100L, instance.getSdkappid());
    }

    @Test
    void shouldSetAndGetPrivateKey() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setPrivateKey("testValue");
        assertEquals("testValue", instance.getPrivateKey());
    }

    @Test
    void shouldSetAndGetExpire() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setExpire(100L);
        assertEquals(100L, instance.getExpire());
    }

    @Test
    void shouldSetAndGetMsgLifeTime() {
        TencentTimProperties instance = new TencentTimProperties();
        instance.setMsgLifeTime(100L);
        assertEquals(100L, instance.getMsgLifeTime());
    }

    @Test
    void shouldGenerateToString() {
        TencentTimProperties instance = new TencentTimProperties();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        TencentTimProperties a = new TencentTimProperties();
        TencentTimProperties b = new TencentTimProperties();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        TencentTimProperties a = new TencentTimProperties();
        TencentTimProperties b = new TencentTimProperties();
        b.setEnabled(true);
        assertNotEquals(a, b);
    }

}