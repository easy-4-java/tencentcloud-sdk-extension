package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupAfterInfoChanged.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupAfterInfoChangedTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetType() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetOperator() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setOperator("testValue");
        assertEquals("testValue", instance.getOperator());
    }

    @Test
    void shouldSetAndGetGroupName() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
    }

    @Test
    void shouldSetAndGetIntroduction() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setIntroduction("testValue");
        assertEquals("testValue", instance.getIntroduction());
    }

    @Test
    void shouldSetAndGetNotification() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setNotification("testValue");
        assertEquals("testValue", instance.getNotification());
    }

    @Test
    void shouldSetAndGetFaceUrl() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        instance.setFaceUrl("testValue");
        assertEquals("testValue", instance.getFaceUrl());
    }

    @Test
    void shouldGenerateToString() {
        GroupAfterInfoChanged instance = new GroupAfterInfoChanged();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupAfterInfoChanged a = new GroupAfterInfoChanged();
        GroupAfterInfoChanged b = new GroupAfterInfoChanged();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupAfterInfoChanged a = new GroupAfterInfoChanged();
        GroupAfterInfoChanged b = new GroupAfterInfoChanged();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}