package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMemberImportResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberImportResponse instance = new GroupMemberImportResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberImportResponse instance = new GroupMemberImportResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberImportResponse a = new GroupMemberImportResponse();
        GroupMemberImportResponse b = new GroupMemberImportResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
