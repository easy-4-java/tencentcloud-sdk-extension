package com.tencentcloud.sdk.tim;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TimUserIdProviderTest {

    @Test
    void shouldCallGetUserIdByImUser() {
        TimUserIdProvider instance = new TimUserIdProvider() {};
        String result = instance.getUserIdByImUser(100L, "testValue");
        assertNotNull(result);
    }

    @Test
    void shouldCallGetImUserByUserId() {
        TimUserIdProvider instance = new TimUserIdProvider() {};
        String result = instance.getImUserByUserId(100L, "testValue");
        assertNotNull(result);
    }

    @Test
    void shouldBeInstantiable() {
        TimUserIdProvider instance = new TimUserIdProvider() {};
        assertNotNull(instance);
    }

}