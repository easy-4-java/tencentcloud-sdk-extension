package com.tencentcloud.sdk.tim.req.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdminForbidTypeTest {

    @Test
    void shouldHaveEnumValues() {
        AdminForbidType[] values = AdminForbidType.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        AdminForbidType val = AdminForbidType.AdminForbid_Type_None;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        AdminForbidType val = AdminForbidType.valueOf("AdminForbid_Type_None");
        assertEquals(AdminForbidType.AdminForbid_Type_None, val);
    }

    @Test
    void shouldGetValue() {
        for (AdminForbidType val : AdminForbidType.values()) {
            assertNotNull(val.getValue());
        }
    }

    @Test
    void shouldGetDesc() {
        for (AdminForbidType val : AdminForbidType.values()) {
            assertNotNull(val.getDesc());
        }
    }

}