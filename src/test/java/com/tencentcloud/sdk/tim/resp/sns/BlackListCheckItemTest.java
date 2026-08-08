package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlackListCheckItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlackListCheckItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlackListCheckItem instance = new BlackListCheckItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        BlackListCheckItem instance = new BlackListCheckItem();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRelation() {
        BlackListCheckItem instance = new BlackListCheckItem();
        instance.setRelation("testValue");
        assertEquals("testValue", instance.getRelation());
    }

    @Test
    void shouldSetAndGetResultCode() {
        BlackListCheckItem instance = new BlackListCheckItem();
        instance.setResultCode(42);
        assertEquals(42, instance.getResultCode());
    }

    @Test
    void shouldSetAndGetResultInfo() {
        BlackListCheckItem instance = new BlackListCheckItem();
        instance.setResultInfo("testValue");
        assertEquals("testValue", instance.getResultInfo());
    }

    @Test
    void shouldGenerateToString() {
        BlackListCheckItem instance = new BlackListCheckItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlackListCheckItem a = new BlackListCheckItem();
        BlackListCheckItem b = new BlackListCheckItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        BlackListCheckItem a = new BlackListCheckItem();
        BlackListCheckItem b = new BlackListCheckItem();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}