package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMessageImport.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMessageImportTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMessageImport instance = new GroupMessageImport();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMessageImport instance = new GroupMessageImport();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetRole() {
        GroupMessageImport instance = new GroupMessageImport();
        instance.setRole("testValue");
        assertEquals("testValue", instance.getRole());
    }

    @Test
    void shouldSetAndGetJoinTime() {
        GroupMessageImport instance = new GroupMessageImport();
        instance.setJoinTime(42);
        assertEquals(42, instance.getJoinTime());
    }

    @Test
    void shouldSetAndGetUnreadMsgNum() {
        GroupMessageImport instance = new GroupMessageImport();
        instance.setUnreadMsgNum(42);
        assertEquals(42, instance.getUnreadMsgNum());
    }

    @Test
    void shouldGenerateToString() {
        GroupMessageImport instance = new GroupMessageImport();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMessageImport a = new GroupMessageImport();
        GroupMessageImport b = new GroupMessageImport();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMessageImport a = new GroupMessageImport();
        GroupMessageImport b = new GroupMessageImport();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}