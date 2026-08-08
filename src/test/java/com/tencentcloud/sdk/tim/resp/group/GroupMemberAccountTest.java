package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberAccount.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberAccountTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberAccount instance = new GroupMemberAccount();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMemberAccount instance = new GroupMemberAccount();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberAccount instance = new GroupMemberAccount();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberAccount a = new GroupMemberAccount();
        GroupMemberAccount b = new GroupMemberAccount();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberAccount a = new GroupMemberAccount();
        GroupMemberAccount b = new GroupMemberAccount();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}