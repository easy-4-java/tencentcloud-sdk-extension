package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountStateQueryError.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountStateQueryErrorTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountStateQueryError instance = new AccountStateQueryError();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserId() {
        AccountStateQueryError instance = new AccountStateQueryError();
        instance.setUserId("testValue");
        assertEquals("testValue", instance.getUserId());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        AccountStateQueryError instance = new AccountStateQueryError();
        instance.setErrorCode("testValue");
        assertEquals("testValue", instance.getErrorCode());
    }

    @Test
    void shouldGenerateToString() {
        AccountStateQueryError instance = new AccountStateQueryError();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountStateQueryError a = new AccountStateQueryError();
        AccountStateQueryError b = new AccountStateQueryError();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountStateQueryError a = new AccountStateQueryError();
        AccountStateQueryError b = new AccountStateQueryError();
        b.setUserId("testValue");
        assertNotEquals(a, b);
    }

}