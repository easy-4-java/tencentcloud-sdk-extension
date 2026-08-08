package com.tencentcloud.sdk.tim.resp.push;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserTags.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserTagsTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserTags instance = new UserTags();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetToAccount() {
        UserTags instance = new UserTags();
        instance.setToAccount("testValue");
        assertEquals("testValue", instance.getToAccount());
    }

    @Test
    void shouldSetAndGetTags() {
        UserTags instance = new UserTags();
        instance.setTags(new java.util.ArrayList<>());
        assertNotNull(instance.getTags());
    }

    @Test
    void shouldGenerateToString() {
        UserTags instance = new UserTags();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserTags a = new UserTags();
        UserTags b = new UserTags();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserTags a = new UserTags();
        UserTags b = new UserTags();
        b.setToAccount("testValue");
        assertNotEquals(a, b);
    }

}