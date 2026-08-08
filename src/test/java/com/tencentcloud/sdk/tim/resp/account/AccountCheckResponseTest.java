package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountCheckResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountCheckResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountCheckResponse instance = new AccountCheckResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        AccountCheckResponse instance = new AccountCheckResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        AccountCheckResponse instance = new AccountCheckResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountCheckResponse a = new AccountCheckResponse();
        AccountCheckResponse b = new AccountCheckResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountCheckResponse a = new AccountCheckResponse();
        AccountCheckResponse b = new AccountCheckResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}