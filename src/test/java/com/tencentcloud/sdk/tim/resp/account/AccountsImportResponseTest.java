package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AccountsImportResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AccountsImportResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AccountsImportResponse instance = new AccountsImportResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetFailAccounts() {
        AccountsImportResponse instance = new AccountsImportResponse();
        instance.setFailAccounts(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccounts());
    }

    @Test
    void shouldGenerateToString() {
        AccountsImportResponse instance = new AccountsImportResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AccountsImportResponse a = new AccountsImportResponse();
        AccountsImportResponse b = new AccountsImportResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AccountsImportResponse a = new AccountsImportResponse();
        AccountsImportResponse b = new AccountsImportResponse();
        b.setFailAccounts(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}