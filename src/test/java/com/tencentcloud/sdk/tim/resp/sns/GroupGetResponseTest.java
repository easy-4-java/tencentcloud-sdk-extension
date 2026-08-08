package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupGetResponse instance = new GroupGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetBlackListItem() {
        GroupGetResponse instance = new GroupGetResponse();
        instance.setBlackListItem(new java.util.ArrayList<>());
        assertNotNull(instance.getBlackListItem());
    }

    @Test
    void shouldSetAndGetCurruentSequence() {
        GroupGetResponse instance = new GroupGetResponse();
        instance.setCurruentSequence(42);
        assertEquals(42, instance.getCurruentSequence());
    }

    @Test
    void shouldSetAndGetStartIndex() {
        GroupGetResponse instance = new GroupGetResponse();
        instance.setStartIndex(42);
        assertEquals(42, instance.getStartIndex());
    }

    @Test
    void shouldGenerateToString() {
        GroupGetResponse instance = new GroupGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupGetResponse a = new GroupGetResponse();
        GroupGetResponse b = new GroupGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }


}