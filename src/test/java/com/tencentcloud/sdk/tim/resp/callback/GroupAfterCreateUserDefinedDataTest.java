package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterCreateUserDefinedData.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterCreateUserDefinedDataTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterCreateUserDefinedData instance = new GroupAfterCreateUserDefinedData();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetKey() {
        GroupAfterCreateUserDefinedData instance = new GroupAfterCreateUserDefinedData();
        instance.setKey("testValue");
        assertEquals("testValue", instance.getKey());
    }

    @Test
    void shouldSetAndGetValue() {
        GroupAfterCreateUserDefinedData instance = new GroupAfterCreateUserDefinedData();
        instance.setValue("testValue");
        assertEquals("testValue", instance.getValue());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterCreateUserDefinedData instance = new GroupAfterCreateUserDefinedData();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterCreateUserDefinedData a = new GroupAfterCreateUserDefinedData();
        GroupAfterCreateUserDefinedData b = new GroupAfterCreateUserDefinedData();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterCreateUserDefinedData a = new GroupAfterCreateUserDefinedData();
        GroupAfterCreateUserDefinedData b = new GroupAfterCreateUserDefinedData();
        b.setKey("testValue");
        assertNotEquals(a, b);
    }

}