package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupMsgRecallResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMsgRecallResponse instance = new GroupMsgRecallResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupMsgRecallResponse instance = new GroupMsgRecallResponse();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMsgRecallResponse a = new GroupMsgRecallResponse();
        GroupMsgRecallResponse b = new GroupMsgRecallResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
