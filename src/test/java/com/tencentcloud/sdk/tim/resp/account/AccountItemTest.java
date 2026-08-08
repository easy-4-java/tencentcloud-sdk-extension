package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountItem instance = new AccountItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserId() {
        AccountItem instance = new AccountItem();
        instance.setUserId("testValue");
        assertEquals("testValue", instance.getUserId());
    }

    @Test
    void shouldSetAndGetResultCode() {
        AccountItem instance = new AccountItem();
        instance.setResultCode("testValue");
        assertEquals("testValue", instance.getResultCode());
    }

    @Test
    void shouldSetAndGetResultInfo() {
        AccountItem instance = new AccountItem();
        instance.setResultInfo("testValue");
        assertEquals("testValue", instance.getResultInfo());
    }

    @Test
    void shouldSetAndGetAccountStatus() {
        AccountItem instance = new AccountItem();
        instance.setAccountStatus("testValue");
        assertEquals("testValue", instance.getAccountStatus());
    }

    @Test
    void shouldGenerateToString() {
        AccountItem instance = new AccountItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountItem a = new AccountItem();
        AccountItem b = new AccountItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountItem a = new AccountItem();
        AccountItem b = new AccountItem();
        b.setUserId("testValue");
        assertNotEquals(a, b);
    }

}