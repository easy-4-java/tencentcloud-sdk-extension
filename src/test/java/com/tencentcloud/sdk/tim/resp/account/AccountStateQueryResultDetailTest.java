package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountStateQueryResultDetail.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountStateQueryResultDetailTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountStateQueryResultDetail instance = new AccountStateQueryResultDetail();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetPlatform() {
        AccountStateQueryResultDetail instance = new AccountStateQueryResultDetail();
        instance.setPlatform("testValue");
        assertEquals("testValue", instance.getPlatform());
    }

    @Test
    void shouldSetAndGetStatus() {
        AccountStateQueryResultDetail instance = new AccountStateQueryResultDetail();
        instance.setStatus("testValue");
        assertEquals("testValue", instance.getStatus());
    }

    @Test
    void shouldGenerateToString() {
        AccountStateQueryResultDetail instance = new AccountStateQueryResultDetail();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountStateQueryResultDetail a = new AccountStateQueryResultDetail();
        AccountStateQueryResultDetail b = new AccountStateQueryResultDetail();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountStateQueryResultDetail a = new AccountStateQueryResultDetail();
        AccountStateQueryResultDetail b = new AccountStateQueryResultDetail();
        b.setPlatform("testValue");
        assertNotEquals(a, b);
    }

}