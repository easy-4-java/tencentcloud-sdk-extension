package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OfflinePushInfoTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        OfflinePushInfo instance = new OfflinePushInfo();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        OfflinePushInfo instance = new OfflinePushInfo();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        OfflinePushInfo a = new OfflinePushInfo();
        OfflinePushInfo b = new OfflinePushInfo();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
