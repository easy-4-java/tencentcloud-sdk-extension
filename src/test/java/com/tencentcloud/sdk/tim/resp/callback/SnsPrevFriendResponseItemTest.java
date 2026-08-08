package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsPrevFriendResponseItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsPrevFriendResponseItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRemark() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        instance.setRemark("testValue");
        assertEquals("testValue", instance.getRemark());
    }

    @Test
    void shouldSetAndGetTagName() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        instance.setTagName("testValue");
        assertEquals("testValue", instance.getTagName());
    }

    @Test
    void shouldSetAndGetAction() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        instance.setAction("testValue");
        assertEquals("testValue", instance.getAction());
    }

    @Test
    void shouldGenerateToString() {
        SnsPrevFriendResponseItem instance = new SnsPrevFriendResponseItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsPrevFriendResponseItem a = new SnsPrevFriendResponseItem();
        SnsPrevFriendResponseItem b = new SnsPrevFriendResponseItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsPrevFriendResponseItem a = new SnsPrevFriendResponseItem();
        SnsPrevFriendResponseItem b = new SnsPrevFriendResponseItem();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}