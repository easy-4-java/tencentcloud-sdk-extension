package com.tencentcloud.sdk.tim.resp.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountStateTest {

    @Test
    void shouldHaveEnumValues() {
        AccountState[] values = AccountState.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        AccountState val = AccountState.ONLINE;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        AccountState val = AccountState.valueOf("ONLINE");
        assertEquals(AccountState.ONLINE, val);
    }

    @Test
    void shouldGetState() {
        for (AccountState val : AccountState.values()) {
            assertNotNull(val.getState());
        }
    }

}