package com.tencentcloud.sdk.tim.resp.ops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for AppInfoResult.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class AppInfoResultTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        AppInfoResult instance = new AppInfoResult();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAppId() {
        AppInfoResult instance = new AppInfoResult();
        instance.setAppId("testValue");
        assertEquals("testValue", instance.getAppId());
    }

    @Test
    void shouldSetAndGetAppName() {
        AppInfoResult instance = new AppInfoResult();
        instance.setAppName("testValue");
        assertEquals("testValue", instance.getAppName());
    }

    @Test
    void shouldSetAndGetCompany() {
        AppInfoResult instance = new AppInfoResult();
        instance.setCompany("testValue");
        assertEquals("testValue", instance.getCompany());
    }

    @Test
    void shouldSetAndGetActiveUserNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setActiveUserNum(42);
        assertEquals(42, instance.getActiveUserNum());
    }

    @Test
    void shouldSetAndGetRegistUserNumOneDay() {
        AppInfoResult instance = new AppInfoResult();
        instance.setRegistUserNumOneDay(42);
        assertEquals(42, instance.getRegistUserNumOneDay());
    }

    @Test
    void shouldSetAndGetRegistUserNumTotal() {
        AppInfoResult instance = new AppInfoResult();
        instance.setRegistUserNumTotal(42);
        assertEquals(42, instance.getRegistUserNumTotal());
    }

    @Test
    void shouldSetAndGetLoginTimes() {
        AppInfoResult instance = new AppInfoResult();
        instance.setLoginTimes(42);
        assertEquals(42, instance.getLoginTimes());
    }

    @Test
    void shouldSetAndGetLoginUserNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setLoginUserNum(42);
        assertEquals(42, instance.getLoginUserNum());
    }

    @Test
    void shouldSetAndGetUpMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setUpMsgNum(42);
        assertEquals(42, instance.getUpMsgNum());
    }

    @Test
    void shouldSetAndGetSendMsgUserNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setSendMsgUserNum(42);
        assertEquals(42, instance.getSendMsgUserNum());
    }

    @Test
    void shouldSetAndGetApnSMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setApnSMsgNum(42);
        assertEquals(42, instance.getApnSMsgNum());
    }

    @Test
    void shouldSetAndGetC2CUpMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setC2CUpMsgNum(42);
        assertEquals(42, instance.getC2CUpMsgNum());
    }

    @Test
    void shouldSetAndGetC2CSendMsgUserNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setC2CSendMsgUserNum(42);
        assertEquals(42, instance.getC2CSendMsgUserNum());
    }

    @Test
    void shouldSetAndGetC2CAPNSMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setC2CAPNSMsgNum(42);
        assertEquals(42, instance.getC2CAPNSMsgNum());
    }

    @Test
    void shouldSetAndGetMaxOnlineNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setMaxOnlineNum(42);
        assertEquals(42, instance.getMaxOnlineNum());
    }

    @Test
    void shouldSetAndGetChainIncrease() {
        AppInfoResult instance = new AppInfoResult();
        instance.setChainIncrease(42);
        assertEquals(42, instance.getChainIncrease());
    }

    @Test
    void shouldSetAndGetChainDecrease() {
        AppInfoResult instance = new AppInfoResult();
        instance.setChainDecrease(42);
        assertEquals(42, instance.getChainDecrease());
    }

    @Test
    void shouldSetAndGetGroupUpMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupUpMsgNum(42);
        assertEquals(42, instance.getGroupUpMsgNum());
    }

    @Test
    void shouldSetAndGetGroupSendMsgUserNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupSendMsgUserNum(42);
        assertEquals(42, instance.getGroupSendMsgUserNum());
    }

    @Test
    void shouldSetAndGetGroupAPNSMsgNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupAPNSMsgNum(42);
        assertEquals(42, instance.getGroupAPNSMsgNum());
    }

    @Test
    void shouldSetAndGetGroupSendMsgGroupNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupSendMsgGroupNum(42);
        assertEquals(42, instance.getGroupSendMsgGroupNum());
    }

    @Test
    void shouldSetAndGetGroupJoinGroupTimes() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupJoinGroupTimes(42);
        assertEquals(42, instance.getGroupJoinGroupTimes());
    }

    @Test
    void shouldSetAndGetGroupQuitGroupTimes() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupQuitGroupTimes(42);
        assertEquals(42, instance.getGroupQuitGroupTimes());
    }

    @Test
    void shouldSetAndGetGroupNewGroupNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupNewGroupNum(42);
        assertEquals(42, instance.getGroupNewGroupNum());
    }

    @Test
    void shouldSetAndGetGroupAllGroupNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupAllGroupNum(42);
        assertEquals(42, instance.getGroupAllGroupNum());
    }

    @Test
    void shouldSetAndGetGroupDestroyGroupNum() {
        AppInfoResult instance = new AppInfoResult();
        instance.setGroupDestroyGroupNum(42);
        assertEquals(42, instance.getGroupDestroyGroupNum());
    }

    @Test
    void shouldSetAndGetCallBackReq() {
        AppInfoResult instance = new AppInfoResult();
        instance.setCallBackReq(42);
        assertEquals(42, instance.getCallBackReq());
    }

    @Test
    void shouldSetAndGetCallBackRsp() {
        AppInfoResult instance = new AppInfoResult();
        instance.setCallBackRsp(42);
        assertEquals(42, instance.getCallBackRsp());
    }

    @Test
    void shouldSetAndGetDate() {
        AppInfoResult instance = new AppInfoResult();
        instance.setDate("testValue");
        assertEquals("testValue", instance.getDate());
    }

    @Test
    void shouldGenerateToString() {
        AppInfoResult instance = new AppInfoResult();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        AppInfoResult a = new AppInfoResult();
        AppInfoResult b = new AppInfoResult();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        AppInfoResult a = new AppInfoResult();
        AppInfoResult b = new AppInfoResult();
        b.setAppId("testValue");
        assertNotEquals(a, b);
    }

}