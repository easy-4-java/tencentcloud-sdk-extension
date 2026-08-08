package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlacklistAddResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlacklistAddResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlacklistAddResponse instance = new BlacklistAddResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        BlacklistAddResponse instance = new BlacklistAddResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldSetAndGetFailAccount() {
        BlacklistAddResponse instance = new BlacklistAddResponse();
        instance.setFailAccount(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccount());
    }

    @Test
    void shouldGenerateToString() {
        BlacklistAddResponse instance = new BlacklistAddResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlacklistAddResponse a = new BlacklistAddResponse();
        BlacklistAddResponse b = new BlacklistAddResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        BlacklistAddResponse a = new BlacklistAddResponse();
        BlacklistAddResponse b = new BlacklistAddResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}