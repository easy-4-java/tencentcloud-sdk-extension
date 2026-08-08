package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for BlacklistGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class BlacklistGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        BlacklistGetResponse instance = new BlacklistGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetBlackListItem() {
        BlacklistGetResponse instance = new BlacklistGetResponse();
        instance.setBlackListItem(new java.util.ArrayList<>());
        assertNotNull(instance.getBlackListItem());
    }

    @Test
    void shouldSetAndGetCurruentSequence() {
        BlacklistGetResponse instance = new BlacklistGetResponse();
        instance.setCurruentSequence(42);
        assertEquals(42, instance.getCurruentSequence());
    }

    @Test
    void shouldSetAndGetStartIndex() {
        BlacklistGetResponse instance = new BlacklistGetResponse();
        instance.setStartIndex(42);
        assertEquals(42, instance.getStartIndex());
    }

    @Test
    void shouldGenerateToString() {
        BlacklistGetResponse instance = new BlacklistGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BlacklistGetResponse a = new BlacklistGetResponse();
        BlacklistGetResponse b = new BlacklistGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }


}