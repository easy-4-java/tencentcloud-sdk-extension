package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlacklistCheckResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlacklistCheckResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlacklistCheckResponse instance = new BlacklistCheckResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetBlackListCheckItem() {
        BlacklistCheckResponse instance = new BlacklistCheckResponse();
        instance.setBlackListCheckItem(new java.util.ArrayList<>());
        assertNotNull(instance.getBlackListCheckItem());
    }

    @Test
    void shouldSetAndGetFailAccount() {
        BlacklistCheckResponse instance = new BlacklistCheckResponse();
        instance.setFailAccount(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccount());
    }

    @Test
    void shouldGenerateToString() {
        BlacklistCheckResponse instance = new BlacklistCheckResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlacklistCheckResponse a = new BlacklistCheckResponse();
        BlacklistCheckResponse b = new BlacklistCheckResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        BlacklistCheckResponse a = new BlacklistCheckResponse();
        BlacklistCheckResponse b = new BlacklistCheckResponse();
        b.setBlackListCheckItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}