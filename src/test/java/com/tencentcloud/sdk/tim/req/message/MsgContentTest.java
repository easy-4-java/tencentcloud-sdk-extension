package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for MsgContent.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class MsgContentTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        MsgContent instance = new MsgContent();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetText() {
        MsgContent instance = new MsgContent();
        instance.setText("testValue");
        assertEquals("testValue", instance.getText());
    }

    @Test
    void shouldSetAndGetDesc() {
        MsgContent instance = new MsgContent();
        instance.setDesc("testValue");
        assertEquals("testValue", instance.getDesc());
    }




    @Test
    void shouldSetAndGetData() {
        MsgContent instance = new MsgContent();
        instance.setData("testValue");
        assertEquals("testValue", instance.getData());
    }

    @Test
    void shouldGenerateToString() {
        MsgContent instance = new MsgContent();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        MsgContent a = new MsgContent();
        MsgContent b = new MsgContent();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        MsgContent a = new MsgContent();
        MsgContent b = new MsgContent();
        b.setText("testValue");
        assertNotEquals(a, b);
    }

}