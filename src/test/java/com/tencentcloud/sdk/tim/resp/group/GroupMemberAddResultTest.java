package com.tencentcloud.sdk.tim.resp.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberAddResult.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberAddResultTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberAddResult instance = new GroupMemberAddResult();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMemberAddResult instance = new GroupMemberAddResult();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetResult() {
        GroupMemberAddResult instance = new GroupMemberAddResult();
        instance.setResult(42);
        assertEquals(42, instance.getResult());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberAddResult instance = new GroupMemberAddResult();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberAddResult a = new GroupMemberAddResult();
        GroupMemberAddResult b = new GroupMemberAddResult();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberAddResult a = new GroupMemberAddResult();
        GroupMemberAddResult b = new GroupMemberAddResult();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}