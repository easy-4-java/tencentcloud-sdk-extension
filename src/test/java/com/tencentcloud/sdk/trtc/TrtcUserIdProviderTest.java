package com.tencentcloud.sdk.trtc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrtcUserIdProviderTest {

    @Test
    void shouldCallGetUserIdByTrtcUser() {
        TrtcUserIdProvider instance = new TrtcUserIdProvider() {};
        String result = instance.getUserIdByTrtcUser(100L, "testValue");
        assertNotNull(result);
    }

    @Test
    void shouldCallGetTrtcUserByUserId() {
        TrtcUserIdProvider instance = new TrtcUserIdProvider() {};
        String result = instance.getTrtcUserByUserId(100L, "testValue");
        assertNotNull(result);
    }

    @Test
    void shouldBeInstantiable() {
        TrtcUserIdProvider instance = new TrtcUserIdProvider() {};
        assertNotNull(instance);
    }

}