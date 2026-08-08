package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MessageTypeTest {

    @Test
    void shouldHaveEnumValues() {
        MessageType[] values = MessageType.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        MessageType val = MessageType.TIM_TEXT_ELEM;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        MessageType val = MessageType.valueOf("TIM_TEXT_ELEM");
        assertEquals(MessageType.TIM_TEXT_ELEM, val);
    }

    @Test
    void shouldGetValue() {
        for (MessageType val : MessageType.values()) {
            assertNotNull(val.getValue());
        }
    }

    @Test
    void shouldGetDesc() {
        for (MessageType val : MessageType.values()) {
            assertNotNull(val.getDesc());
        }
    }

}