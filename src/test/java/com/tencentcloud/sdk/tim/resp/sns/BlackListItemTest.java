package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlackListItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlackListItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlackListItem instance = new BlackListItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetToAccount() {
        BlackListItem instance = new BlackListItem();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetAddBlackTimeStamp() {
        BlackListItem instance = new BlackListItem();
        instance.setAddBlackTimeStamp(100L);
        assertEquals(100L, instance.getAddBlackTimeStamp());
    }

    @Test
    void shouldGenerateToString() {
        BlackListItem instance = new BlackListItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlackListItem a = new BlackListItem();
        BlackListItem b = new BlackListItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        BlackListItem a = new BlackListItem();
        BlackListItem b = new BlackListItem();
        b.setToAccount("testValue");
        assertNotEquals(a, b);
    }

}