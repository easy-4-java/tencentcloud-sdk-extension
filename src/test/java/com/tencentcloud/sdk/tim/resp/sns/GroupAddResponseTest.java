package com.tencentcloud.sdk.tim.resp.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAddResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAddResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAddResponse instance = new GroupAddResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetResultItem() {
        GroupAddResponse instance = new GroupAddResponse();
        instance.setResultItem(new java.util.ArrayList<>());
        assertNotNull(instance.getResultItem());
    }

    @Test
    void shouldSetAndGetFailAccount() {
        GroupAddResponse instance = new GroupAddResponse();
        instance.setFailAccount(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccount());
    }

    @Test
    void shouldGenerateToString() {
        GroupAddResponse instance = new GroupAddResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAddResponse a = new GroupAddResponse();
        GroupAddResponse b = new GroupAddResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAddResponse a = new GroupAddResponse();
        GroupAddResponse b = new GroupAddResponse();
        b.setResultItem(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}