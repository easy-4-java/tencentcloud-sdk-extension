package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupSendMsgBodyContent.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupSendMsgBodyContentTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupSendMsgBodyContent instance = new GroupSendMsgBodyContent();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetText() {
        GroupSendMsgBodyContent instance = new GroupSendMsgBodyContent();
        instance.setText("testValue");
        assertEquals("testValue", instance.getText());
    }

    @Test
    void shouldSetAndGetDesc() {
        GroupSendMsgBodyContent instance = new GroupSendMsgBodyContent();
        instance.setDesc("testValue");
        assertEquals("testValue", instance.getDesc());
    }

    @Test
    void shouldSetAndGetData() {
        GroupSendMsgBodyContent instance = new GroupSendMsgBodyContent();
        instance.setData("testValue");
        assertEquals("testValue", instance.getData());
    }

    @Test
    void shouldGenerateToString() {
        GroupSendMsgBodyContent instance = new GroupSendMsgBodyContent();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupSendMsgBodyContent a = new GroupSendMsgBodyContent();
        GroupSendMsgBodyContent b = new GroupSendMsgBodyContent();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupSendMsgBodyContent a = new GroupSendMsgBodyContent();
        GroupSendMsgBodyContent b = new GroupSendMsgBodyContent();
        b.setText("testValue");
        assertNotEquals(a, b);
    }

}