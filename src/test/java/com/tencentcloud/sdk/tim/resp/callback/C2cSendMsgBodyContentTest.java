package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for C2cSendMsgBodyContent.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class C2cSendMsgBodyContentTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetUuid() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setUuid("testValue");
        assertEquals("testValue", instance.getUuid());
    }

    @Test
    void shouldSetAndGetIndex() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setIndex(42);
        assertEquals(42, instance.getIndex());
    }

    @Test
    void shouldSetAndGetText() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setText("testValue");
        assertEquals("testValue", instance.getText());
    }

    @Test
    void shouldSetAndGetDesc() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setDesc("testValue");
        assertEquals("testValue", instance.getDesc());
    }

    @Test
    void shouldSetAndGetData() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setData("testValue");
        assertEquals("testValue", instance.getData());
    }

    @Test
    void shouldSetAndGetExt() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setExt("testValue");
        assertEquals("testValue", instance.getExt());
    }

    @Test
    void shouldSetAndGetLongitude() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setLongitude(2.5d);
        assertEquals(2.5d, instance.getLongitude());
    }

    @Test
    void shouldSetAndGetLatitude() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setLatitude(2.5d);
        assertEquals(2.5d, instance.getLatitude());
    }

    @Test
    void shouldSetAndGetSound() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setSound("testValue");
        assertEquals("testValue", instance.getSound());
    }

    @Test
    void shouldSetAndGetUrl() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setUrl("testValue");
        assertEquals("testValue", instance.getUrl());
    }

    @Test
    void shouldSetAndGetSecond() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setSecond(100L);
        assertEquals(100L, instance.getSecond());
    }

    @Test
    void shouldSetAndGetImageFormat() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setImageFormat(42);
        assertEquals(42, instance.getImageFormat());
    }

    @Test
    void shouldSetAndGetImageInfoArray() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        instance.setImageInfoArray(new java.util.ArrayList<>());
        assertNotNull(instance.getImageInfoArray());
    }

    @Test
    void shouldGenerateToString() {
        C2cSendMsgBodyContent instance = new C2cSendMsgBodyContent();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        C2cSendMsgBodyContent a = new C2cSendMsgBodyContent();
        C2cSendMsgBodyContent b = new C2cSendMsgBodyContent();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        C2cSendMsgBodyContent a = new C2cSendMsgBodyContent();
        C2cSendMsgBodyContent b = new C2cSendMsgBodyContent();
        b.setUuid("testValue");
        assertNotEquals(a, b);
    }

}