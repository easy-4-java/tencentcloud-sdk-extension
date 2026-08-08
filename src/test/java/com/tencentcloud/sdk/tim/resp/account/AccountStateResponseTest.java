package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountStateResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountStateResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountStateResponse instance = new AccountStateResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetQueryResult() {
        AccountStateResponse instance = new AccountStateResponse();
        instance.setQueryResult(new java.util.ArrayList<>());
        assertNotNull(instance.getQueryResult());
    }

    @Test
    void shouldSetAndGetErrorList() {
        AccountStateResponse instance = new AccountStateResponse();
        instance.setErrorList(new java.util.ArrayList<>());
        assertNotNull(instance.getErrorList());
    }

    @Test
    void shouldGenerateToString() {
        AccountStateResponse instance = new AccountStateResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountStateResponse a = new AccountStateResponse();
        AccountStateResponse b = new AccountStateResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountStateResponse a = new AccountStateResponse();
        AccountStateResponse b = new AccountStateResponse();
        b.setQueryResult(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}