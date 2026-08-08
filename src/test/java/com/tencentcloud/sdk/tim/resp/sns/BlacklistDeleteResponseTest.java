package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlacklistDeleteResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlacklistDeleteResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlacklistDeleteResponse instance = new BlacklistDeleteResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        BlacklistDeleteResponse instance = new BlacklistDeleteResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldSetAndGetFailAccount() {
        BlacklistDeleteResponse instance = new BlacklistDeleteResponse();
        instance.setFailAccount(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccount());
    }

    @Test
    void shouldGenerateToString() {
        BlacklistDeleteResponse instance = new BlacklistDeleteResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlacklistDeleteResponse a = new BlacklistDeleteResponse();
        BlacklistDeleteResponse b = new BlacklistDeleteResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        BlacklistDeleteResponse a = new BlacklistDeleteResponse();
        BlacklistDeleteResponse b = new BlacklistDeleteResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}