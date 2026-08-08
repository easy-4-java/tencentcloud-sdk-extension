package com.tencentcloud.sdk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TencentTimConstantsTest {

    @Test
    void shouldHaveActionLogin() {
        assertNotNull(TencentTimConstants.Action.LOGIN);
        assertEquals("Login", TencentTimConstants.Action.LOGIN);
    }

    @Test
    void shouldHaveActionLogout() {
        assertNotNull(TencentTimConstants.Action.LOGOUT);
        assertEquals("Logout", TencentTimConstants.Action.LOGOUT);
    }

    @Test
    void shouldHaveActionDisconnect() {
        assertNotNull(TencentTimConstants.Action.DISCONNECT);
        assertEquals("Disconnect", TencentTimConstants.Action.DISCONNECT);
    }

    @Test
    void shouldHaveStateOnline() {
        assertNotNull(TencentTimConstants.State.ONLINE);
        assertEquals("Online", TencentTimConstants.State.ONLINE);
    }

    @Test
    void shouldHaveStatePushOnline() {
        assertNotNull(TencentTimConstants.State.PUSHONLINE);
        assertEquals("PushOnline", TencentTimConstants.State.PUSHONLINE);
    }

    @Test
    void shouldHaveStateOffline() {
        assertNotNull(TencentTimConstants.State.OFFLINE);
        assertEquals("Offline", TencentTimConstants.State.OFFLINE);
    }

    @Test
    void shouldHaveCallBackStateChange() {
        assertNotNull(TencentTimConstants.CallBack.STATE_CHANGE);
        assertEquals("State.StateChange", TencentTimConstants.CallBack.STATE_CHANGE);
    }

    @Test
    void shouldHaveCallBackSnsFriendAdd() {
        assertNotNull(TencentTimConstants.CallBack.SNS_FRIEND_ADD);
    }

    @Test
    void shouldHaveCallBackSnsFriendDelete() {
        assertNotNull(TencentTimConstants.CallBack.SNS_FRIEND_DELETE);
    }

    @Test
    void shouldHaveCallBackSnsBlacklistAdd() {
        assertNotNull(TencentTimConstants.CallBack.SNS_BLACKLIST_ADD);
    }

    @Test
    void shouldHaveCallBackSnsBlacklistDelete() {
        assertNotNull(TencentTimConstants.CallBack.SNS_BLACKLIST_DELETE);
    }

    @Test
    void shouldHaveCallBackC2cBeforeSendMsg() {
        assertNotNull(TencentTimConstants.CallBack.C2C_BEFORE_SEND_MSG);
    }

    @Test
    void shouldHaveCallBackC2cAfterSendMsg() {
        assertNotNull(TencentTimConstants.CallBack.C2C_AFTER_SEND_MSG);
    }

    @Test
    void shouldHaveCallBackGroupBeforeCreate() {
        assertNotNull(TencentTimConstants.CallBack.GROUP_BEFORE_CREATE);
    }

    @Test
    void shouldHaveCallBackGroupAfterCreate() {
        assertNotNull(TencentTimConstants.CallBack.GROUP_AFTER_CREATE);
    }

    @Test
    void shouldHaveReasonLinkClose() {
        assertNotNull(TencentTimConstants.Reason.LINK_CLOSE);
        assertEquals("LinkClose", TencentTimConstants.Reason.LINK_CLOSE);
    }

    @Test
    void shouldHaveReasonTimeOut() {
        assertNotNull(TencentTimConstants.Reason.TIME_OUT);
        assertEquals("TimeOut", TencentTimConstants.Reason.TIME_OUT);
    }
}
