package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountDeleteResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountDeleteResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountDeleteResponse instance = new AccountDeleteResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        AccountDeleteResponse instance = new AccountDeleteResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        AccountDeleteResponse instance = new AccountDeleteResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountDeleteResponse a = new AccountDeleteResponse();
        AccountDeleteResponse b = new AccountDeleteResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountDeleteResponse a = new AccountDeleteResponse();
        AccountDeleteResponse b = new AccountDeleteResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}