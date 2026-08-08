package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GroupJoinedQueryTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupJoinedQuery instance = new GroupJoinedQuery();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        GroupJoinedQuery instance = new GroupJoinedQuery();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupJoinedQuery a = new GroupJoinedQuery();
        GroupJoinedQuery b = new GroupJoinedQuery();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
