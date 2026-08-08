package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsFriendItem.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsFriendItemTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsFriendItem instance = new SnsFriendItem();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        SnsFriendItem instance = new SnsFriendItem();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRemark() {
        SnsFriendItem instance = new SnsFriendItem();
        instance.setRemark("testValue");
        assertEquals("testValue", instance.getRemark());
    }

    @Test
    void shouldSetAndGetGroupName() {
        SnsFriendItem instance = new SnsFriendItem();
        instance.setGroupName("testValue");
        assertEquals("testValue", instance.getGroupName());
    }

    @Test
    void shouldSetAndGetAddSource() {
        SnsFriendItem instance = new SnsFriendItem();
        instance.setAddSource("testValue");
        assertEquals("testValue", instance.getAddSource());
    }

    @Test
    void shouldSetAndGetAddWording() {
        SnsFriendItem instance = new SnsFriendItem();
        instance.setAddWording("testValue");
        assertEquals("testValue", instance.getAddWording());
    }

    @Test
    void shouldGenerateToString() {
        SnsFriendItem instance = new SnsFriendItem();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsFriendItem a = new SnsFriendItem();
        SnsFriendItem b = new SnsFriendItem();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsFriendItem a = new SnsFriendItem();
        SnsFriendItem b = new SnsFriendItem();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}