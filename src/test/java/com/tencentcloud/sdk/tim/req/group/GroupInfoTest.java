package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupInfo.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupInfoTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupInfo instance = new GroupInfo();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetOwnerAccount() {
        GroupInfo instance = new GroupInfo();
        instance.setOwnerAccount("testValue");
        assertEquals("testValue", instance.getOwnerAccount());
    }

    @Test
    void shouldSetAndGetType() {
        GroupInfo instance = new GroupInfo();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupInfo instance = new GroupInfo();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetName() {
        GroupInfo instance = new GroupInfo();
        instance.setName("testValue");
        assertEquals("testValue", instance.getName());
    }

    @Test
    void shouldSetAndGetIntroduction() {
        GroupInfo instance = new GroupInfo();
        instance.setIntroduction("testValue");
        assertEquals("testValue", instance.getIntroduction());
    }

    @Test
    void shouldSetAndGetNotification() {
        GroupInfo instance = new GroupInfo();
        instance.setNotification("testValue");
        assertEquals("testValue", instance.getNotification());
    }

    @Test
    void shouldSetAndGetFaceUrl() {
        GroupInfo instance = new GroupInfo();
        instance.setFaceUrl("testValue");
        assertEquals("testValue", instance.getFaceUrl());
    }

    @Test
    void shouldSetAndGetMaxMemberCount() {
        GroupInfo instance = new GroupInfo();
        instance.setMaxMemberCount(42);
        assertEquals(42, instance.getMaxMemberCount());
    }

    @Test
    void shouldSetAndGetApplyJoinOption() {
        GroupInfo instance = new GroupInfo();
        instance.setApplyJoinOption("testValue");
        assertEquals("testValue", instance.getApplyJoinOption());
    }

    @Test
    void shouldSetAndGetAppDefinedData() {
        GroupInfo instance = new GroupInfo();
        instance.setAppDefinedData(new java.util.ArrayList<>());
        assertNotNull(instance.getAppDefinedData());
    }

    @Test
    void shouldSetAndGetMemberList() {
        GroupInfo instance = new GroupInfo();
        instance.setMemberList(new java.util.ArrayList<>());
        assertNotNull(instance.getMemberList());
    }

    @Test
    void shouldGenerateToString() {
        GroupInfo instance = new GroupInfo();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupInfo a = new GroupInfo();
        GroupInfo b = new GroupInfo();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupInfo a = new GroupInfo();
        GroupInfo b = new GroupInfo();
        b.setOwnerAccount("testValue");
        assertNotEquals(a, b);
    }

}