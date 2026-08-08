package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountCheckResultItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountCheckResultItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserId() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        instance.setUserId("testValue");
        assertEquals("testValue", instance.getUserId());
    }

    @Test
    void shouldSetAndGetAccountStatus() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        instance.setAccountStatus("testValue");
        assertEquals("testValue", instance.getAccountStatus());
    }

    @Test
    void shouldSetAndGetResultCode() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        instance.setResultCode(42);
        assertEquals(42, instance.getResultCode());
    }

    @Test
    void shouldSetAndGetResultInfo() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        instance.setResultInfo("testValue");
        assertEquals("testValue", instance.getResultInfo());
    }

    @Test
    void shouldGenerateToString() {
        AccountCheckResultItem instance = new AccountCheckResultItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountCheckResultItem a = new AccountCheckResultItem();
        AccountCheckResultItem b = new AccountCheckResultItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountCheckResultItem a = new AccountCheckResultItem();
        AccountCheckResultItem b = new AccountCheckResultItem();
        b.setUserId("testValue");
        assertNotEquals(a, b);
    }

}