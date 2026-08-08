package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupTypeTest {

    @Test
    void shouldHaveEnumValues() {
        GroupType[] values = GroupType.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        GroupType val = GroupType.PRIVATE;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        GroupType val = GroupType.valueOf("PRIVATE");
        assertEquals(GroupType.PRIVATE, val);
    }

    @Test
    void shouldGetValue() {
        for (GroupType val : GroupType.values()) {
            assertNotNull(val.getValue());
        }
    }

}