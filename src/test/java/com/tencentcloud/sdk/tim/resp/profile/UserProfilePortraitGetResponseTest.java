package com.tencentcloud.sdk.tim.resp.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for UserProfilePortraitGetResponse.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class UserProfilePortraitGetResponseTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        UserProfilePortraitGetResponse instance = new UserProfilePortraitGetResponse();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetProfiles() {
        UserProfilePortraitGetResponse instance = new UserProfilePortraitGetResponse();
        instance.setProfiles(new java.util.ArrayList<>());
        assertNotNull(instance.getProfiles());
    }

    @Test
    void shouldSetAndGetFailAccounts() {
        UserProfilePortraitGetResponse instance = new UserProfilePortraitGetResponse();
        instance.setFailAccounts(new java.util.ArrayList<>());
        assertNotNull(instance.getFailAccounts());
    }

    @Test
    void shouldSetAndGetCurrentStandardSequence() {
        UserProfilePortraitGetResponse instance = new UserProfilePortraitGetResponse();
        instance.setCurrentStandardSequence(42);
        assertEquals(42, instance.getCurrentStandardSequence());
    }

    @Test
    void shouldGenerateToString() {
        UserProfilePortraitGetResponse instance = new UserProfilePortraitGetResponse();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        UserProfilePortraitGetResponse a = new UserProfilePortraitGetResponse();
        UserProfilePortraitGetResponse b = new UserProfilePortraitGetResponse();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        UserProfilePortraitGetResponse a = new UserProfilePortraitGetResponse();
        UserProfilePortraitGetResponse b = new UserProfilePortraitGetResponse();
        b.setProfiles(new java.util.ArrayList<>());
        assertNotEquals(a, b);
    }

}