package com.tencentcloud.sdk.tim.req.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenderTypeTest {

    @Test
    void shouldHaveEnumValues() {
        GenderType[] values = GenderType.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        GenderType val = GenderType.GENDER_TYPE_UNKNOWN;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        GenderType val = GenderType.valueOf("GENDER_TYPE_UNKNOWN");
        assertEquals(GenderType.GENDER_TYPE_UNKNOWN, val);
    }

    @Test
    void shouldGetValue() {
        for (GenderType val : GenderType.values()) {
            assertNotNull(val.getValue());
        }
    }

    @Test
    void shouldGetDesc() {
        for (GenderType val : GenderType.values()) {
            assertNotNull(val.getDesc());
        }
    }

}