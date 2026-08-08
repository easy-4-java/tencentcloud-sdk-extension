package com.tencentcloud.sdk.tim;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimApiAddressTest {

    @Test
    void shouldHaveEnumValues() {
        TimApiAddress[] values = TimApiAddress.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        TimApiAddress val = TimApiAddress.ACCOUNT_IMPORT;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        TimApiAddress val = TimApiAddress.valueOf("ACCOUNT_IMPORT");
        assertEquals(TimApiAddress.ACCOUNT_IMPORT, val);
    }

    @Test
    void shouldGetOptAndUrl() {
        for (TimApiAddress addr : TimApiAddress.values()) {
            assertNotNull(addr.getOpt());
            assertNotNull(addr.getUrl());
            assertFalse(addr.getOpt().isEmpty());
            assertFalse(addr.getUrl().isEmpty());
        }
    }

}