package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendImportResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendImportResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendImportResponse instance = new FriendImportResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        FriendImportResponse instance = new FriendImportResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldGenerateToString() {
        FriendImportResponse instance = new FriendImportResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendImportResponse a = new FriendImportResponse();
        FriendImportResponse b = new FriendImportResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendImportResponse a = new FriendImportResponse();
        FriendImportResponse b = new FriendImportResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}