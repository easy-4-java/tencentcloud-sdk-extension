package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InfoItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        InfoItem instance = new InfoItem();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        InfoItem instance = new InfoItem();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        InfoItem a = new InfoItem();
        InfoItem b = new InfoItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
