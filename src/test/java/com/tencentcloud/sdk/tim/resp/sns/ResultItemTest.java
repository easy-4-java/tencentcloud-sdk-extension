package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for ResultItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class ResultItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        ResultItem instance = new ResultItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        ResultItem instance = new ResultItem();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetResultCode() {
        ResultItem instance = new ResultItem();
        instance.setResultCode(42);
        assertEquals(42, instance.getResultCode());
    }

    @Test
    void shouldSetAndGetResultInfo() {
        ResultItem instance = new ResultItem();
        instance.setResultInfo("testValue");
        assertEquals("testValue", instance.getResultInfo());
    }

    @Test
    void shouldGenerateToString() {
        ResultItem instance = new ResultItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        ResultItem a = new ResultItem();
        ResultItem b = new ResultItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        ResultItem a = new ResultItem();
        ResultItem b = new ResultItem();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}