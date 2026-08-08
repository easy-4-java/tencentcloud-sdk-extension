package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMsgImportResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMsgImportResponse instance = new GroupMsgImportResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMsgImportResponse instance = new GroupMsgImportResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMsgImportResponse a = new GroupMsgImportResponse();
        GroupMsgImportResponse b = new GroupMsgImportResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
