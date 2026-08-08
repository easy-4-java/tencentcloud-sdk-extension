package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMessage.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMessageTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMessage instance = new GroupMessage();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupMessage instance = new GroupMessage();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMessage instance = new GroupMessage();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRandom() {
        GroupMessage instance = new GroupMessage();
        instance.setRandom(42);
        assertEquals(42, instance.getRandom());
    }

    @Test
    void shouldSetAndGetPriority() {
        GroupMessage instance = new GroupMessage();
        instance.setPriority("testValue");
        assertEquals("testValue", instance.getPriority());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        GroupMessage instance = new GroupMessage();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldSetAndGetOnlineOnlyFlag() {
        GroupMessage instance = new GroupMessage();
        instance.setOnlineOnlyFlag(42);
        assertEquals(42, instance.getOnlineOnlyFlag());
    }

    @Test
    void shouldSetAndGetForbidCallbackControl() {
        GroupMessage instance = new GroupMessage();
        instance.setForbidCallbackControl(new java.util.ArrayList<>());
        assertNotNull(instance.getForbidCallbackControl());
    }


    @Test
    void shouldGenerateToString() {
        GroupMessage instance = new GroupMessage();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMessage a = new GroupMessage();
        GroupMessage b = new GroupMessage();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMessage a = new GroupMessage();
        GroupMessage b = new GroupMessage();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}