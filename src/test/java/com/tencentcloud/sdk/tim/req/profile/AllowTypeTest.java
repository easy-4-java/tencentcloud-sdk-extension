package com.tencentcloud.sdk.tim.req.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AllowTypeTest {

    @Test
    void shouldHaveEnumValues() {
        AllowType[] values = AllowType.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        AllowType val = AllowType.ALLOWTYPE_TYPE_NEEDCONFIRM;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        AllowType val = AllowType.valueOf("ALLOWTYPE_TYPE_NEEDCONFIRM");
        assertEquals(AllowType.ALLOWTYPE_TYPE_NEEDCONFIRM, val);
    }

    @Test
    void shouldGetValue() {
        for (AllowType val : AllowType.values()) {
            assertNotNull(val.getValue());
        }
    }

    @Test
    void shouldGetDesc() {
        for (AllowType val : AllowType.values()) {
            assertNotNull(val.getDesc());
        }
    }

}