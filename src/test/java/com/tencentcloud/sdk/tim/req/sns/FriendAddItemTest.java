package com.tencentcloud.sdk.tim.req.sns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for FriendAddItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class FriendAddItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        FriendAddItem instance = new FriendAddItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        FriendAddItem instance = new FriendAddItem();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRemark() {
        FriendAddItem instance = new FriendAddItem();
        instance.setRemark("testValue");
        assertEquals("testValue", instance.getRemark());
    }

    @Test
    void shouldSetAndGetGroupName() {
        FriendAddItem instance = new FriendAddItem();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
    }

    @Test
    void shouldSetAndGetSource() {
        FriendAddItem instance = new FriendAddItem();
        instance.setSource("testValue");
        assertEquals("testValue", instance.getSource());
    }

    @Test
    void shouldSetAndGetWording() {
        FriendAddItem instance = new FriendAddItem();
        instance.setWording("testValue");
        assertEquals("testValue", instance.getWording());
    }

    @Test
    void shouldGenerateToString() {
        FriendAddItem instance = new FriendAddItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        FriendAddItem a = new FriendAddItem();
        FriendAddItem b = new FriendAddItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        FriendAddItem a = new FriendAddItem();
        FriendAddItem b = new FriendAddItem();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}