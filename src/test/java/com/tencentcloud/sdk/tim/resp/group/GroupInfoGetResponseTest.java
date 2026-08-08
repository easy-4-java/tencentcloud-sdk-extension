package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupInfoGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupInfoGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupInfoGetResponse instance = new GroupInfoGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetInfos() {
        GroupInfoGetResponse instance = new GroupInfoGetResponse();
        instance.setInfos(new java.util.ArrayList<>());
        assertNotNull(instance.getInfos());
    }

    @Test
    void shouldGenerateToString() {
        GroupInfoGetResponse instance = new GroupInfoGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupInfoGetResponse a = new GroupInfoGetResponse();
        GroupInfoGetResponse b = new GroupInfoGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupInfoGetResponse a = new GroupInfoGetResponse();
        GroupInfoGetResponse b = new GroupInfoGetResponse();
        b.setInfos(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}