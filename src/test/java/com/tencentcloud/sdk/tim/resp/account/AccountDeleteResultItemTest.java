package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountDeleteResultItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountDeleteResultItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountDeleteResultItem instance = new AccountDeleteResultItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserId() {
        AccountDeleteResultItem instance = new AccountDeleteResultItem();
        instance.setUserId("testValue");
        assertEquals("testValue", instance.getUserId());
    }

    @Test
    void shouldSetAndGetResultCode() {
        AccountDeleteResultItem instance = new AccountDeleteResultItem();
        instance.setResultCode(42);
        assertEquals(42, instance.getResultCode());
    }

    @Test
    void shouldSetAndGetResultInfo() {
        AccountDeleteResultItem instance = new AccountDeleteResultItem();
        instance.setResultInfo("testValue");
        assertEquals("testValue", instance.getResultInfo());
    }

    @Test
    void shouldGenerateToString() {
        AccountDeleteResultItem instance = new AccountDeleteResultItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountDeleteResultItem a = new AccountDeleteResultItem();
        AccountDeleteResultItem b = new AccountDeleteResultItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountDeleteResultItem a = new AccountDeleteResultItem();
        AccountDeleteResultItem b = new AccountDeleteResultItem();
        b.setUserId("testValue");
        assertNotEquals(a, b);
    }

}