package com.tencentcloud.sdk.tim.resp.group;

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
    void shouldSetAndGetAppId() {
        GroupInfo instance = new GroupInfo();
        instance.setAppId("testValue");
        assertEquals("testValue", instance.getAppId());
    }

    @Test
    void shouldSetAndGetGroupId() {
        GroupInfo instance = new GroupInfo();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetErrorCode() {
        GroupInfo instance = new GroupInfo();
        instance.setErrorCode("testValue");
        assertEquals("testValue", instance.getErrorCode());
    }

    @Test
    void shouldSetAndGetErrorInfo() {
        GroupInfo instance = new GroupInfo();
        instance.setErrorInfo("testValue");
        assertEquals("testValue", instance.getErrorInfo());
    }

    @Test
    void shouldSetAndGetType() {
        GroupInfo instance = new GroupInfo();
        instance.setType("testValue");
        assertEquals("testValue", instance.getType());
    }

    @Test
    void shouldSetAndGetGroupName() {
        GroupInfo instance = new GroupInfo();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
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
    void shouldSetAndGetOwnerAccount() {
        GroupInfo instance = new GroupInfo();
        instance.setOwnerAccount("testValue");
        assertEquals("testValue", instance.getOwnerAccount());
    }

    @Test
    void shouldSetAndGetCreateTime() {
        GroupInfo instance = new GroupInfo();
        instance.setCreateTime(100L);
        assertEquals(100L, instance.getCreateTime());
    }

    @Test
    void shouldSetAndGetLastInfoTime() {
        GroupInfo instance = new GroupInfo();
        instance.setLastInfoTime(100L);
        assertEquals(100L, instance.getLastInfoTime());
    }

    @Test
    void shouldSetAndGetLastMsgTime() {
        GroupInfo instance = new GroupInfo();
        instance.setLastMsgTime(100L);
        assertEquals(100L, instance.getLastMsgTime());
    }

    @Test
    void shouldSetAndGetNextMsgSeq() {
        GroupInfo instance = new GroupInfo();
        instance.setNextMsgSeq(100L);
        assertEquals(100L, instance.getNextMsgSeq());
    }

    @Test
    void shouldSetAndGetMemberNum() {
        GroupInfo instance = new GroupInfo();
        instance.setMemberNum(100L);
        assertEquals(100L, instance.getMemberNum());
    }

    @Test
    void shouldSetAndGetMaxMemberNum() {
        GroupInfo instance = new GroupInfo();
        instance.setMaxMemberNum(100L);
        assertEquals(100L, instance.getMaxMemberNum());
    }

    @Test
    void shouldSetAndGetApplyJoinOption() {
        GroupInfo instance = new GroupInfo();
        instance.setApplyJoinOption("testValue");
        assertEquals("testValue", instance.getApplyJoinOption());
    }

    @Test
    void shouldSetAndGetShutUpAllMember() {
        GroupInfo instance = new GroupInfo();
        instance.setShutUpAllMember("testValue");
        assertEquals("testValue", instance.getShutUpAllMember());
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
        b.setAppId("testValue");
        assertNotEquals(a, b);
    }

}