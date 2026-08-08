package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AppGroupGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AppGroupGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AppGroupGetResponse instance = new AppGroupGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupIdList() {
        AppGroupGetResponse instance = new AppGroupGetResponse();
        instance.setGroupIdList(new java.util.ArrayList<>());
        assertNotNull(instance.getGroupIdList());
    }

    @Test
    void shouldSetAndGetTotalCount() {
        AppGroupGetResponse instance = new AppGroupGetResponse();
        instance.setTotalCount(42);
        assertEquals(42, instance.getTotalCount());
    }

    @Test
    void shouldSetAndGetNext() {
        AppGroupGetResponse instance = new AppGroupGetResponse();
        instance.setNext(42);
        assertEquals(42, instance.getNext());
    }

    @Test
    void shouldGenerateToString() {
        AppGroupGetResponse instance = new AppGroupGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AppGroupGetResponse a = new AppGroupGetResponse();
        AppGroupGetResponse b = new AppGroupGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AppGroupGetResponse a = new AppGroupGetResponse();
        AppGroupGetResponse b = new AppGroupGetResponse();
        b.setGroupIdList(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}