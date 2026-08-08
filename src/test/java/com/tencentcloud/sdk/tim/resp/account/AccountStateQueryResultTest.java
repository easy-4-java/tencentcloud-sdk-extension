package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountStateQueryResult.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountStateQueryResultTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUserId() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        instance.setUserId("testValue");
        assertEquals("testValue", instance.getUserId());
    }

    @Test
    void shouldSetAndGetState() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        instance.setState("testValue");
        assertEquals("testValue", instance.getState());
    }

    @Test
    void shouldSetAndGetStatus() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        instance.setStatus("testValue");
        assertEquals("testValue", instance.getStatus());
    }

    @Test
    void shouldSetAndGetDetails() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        instance.setDetails(new java.util.ArrayList<>());
        assertNotNull(instance.getDetails());
    }

    @Test
    void shouldGenerateToString() {
        AccountStateQueryResult instance = new AccountStateQueryResult();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountStateQueryResult a = new AccountStateQueryResult();
        AccountStateQueryResult b = new AccountStateQueryResult();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountStateQueryResult a = new AccountStateQueryResult();
        AccountStateQueryResult b = new AccountStateQueryResult();
        b.setUserId("testValue");
        assertNotEquals(a, b);
    }

}