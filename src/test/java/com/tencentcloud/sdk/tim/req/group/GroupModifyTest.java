package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupModify.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupModifyTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupModify instance = new GroupModify();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupModify instance = new GroupModify();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetGroupName() {
        GroupModify instance = new GroupModify();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
    }

    @Test
    void shouldSetAndGetIntroduction() {
        GroupModify instance = new GroupModify();
        instance.setIntroduction("testValue");
        assertEquals("testValue", instance.getIntroduction());
    }

    @Test
    void shouldSetAndGetNotification() {
        GroupModify instance = new GroupModify();
        instance.setNotification("testValue");
        assertEquals("testValue", instance.getNotification());
    }

    @Test
    void shouldSetAndGetFaceUrl() {
        GroupModify instance = new GroupModify();
        instance.setFaceUrl("testValue");
        assertEquals("testValue", instance.getFaceUrl());
    }

    @Test
    void shouldSetAndGetMaxMemberCount() {
        GroupModify instance = new GroupModify();
        instance.setMaxMemberCount(42);
        assertEquals(42, instance.getMaxMemberCount());
    }

    @Test
    void shouldSetAndGetApplyJoinOption() {
        GroupModify instance = new GroupModify();
        instance.setApplyJoinOption("testValue");
        assertEquals("testValue", instance.getApplyJoinOption());
    }

    @Test
    void shouldSetAndGetShutUpAllMember() {
        GroupModify instance = new GroupModify();
        instance.setShutUpAllMember("testValue");
        assertEquals("testValue", instance.getShutUpAllMember());
    }

    @Test
    void shouldSetAndGetAppDefinedData() {
        GroupModify instance = new GroupModify();
        instance.setAppDefinedData(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedData());
    }

    @Test
    void shouldGenerateToString() {
        GroupModify instance = new GroupModify();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupModify a = new GroupModify();
        GroupModify b = new GroupModify();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupModify a = new GroupModify();
        GroupModify b = new GroupModify();
        b.setGroupId("testValue");
        assertNotEquals(a, b);
    }

}