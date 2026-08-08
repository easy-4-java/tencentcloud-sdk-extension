package com.tencentcloud.sdk.tim.req.group;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for GroupMemberImport.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class GroupMemberImportTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        GroupMemberImport instance = new GroupMemberImport();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAccount() {
        GroupMemberImport instance = new GroupMemberImport();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetSendTime() {
        GroupMemberImport instance = new GroupMemberImport();
        instance.setSendTime(42);
        assertEquals(42, instance.getSendTime());
    }

    @Test
    void shouldSetAndGetRandom() {
        GroupMemberImport instance = new GroupMemberImport();
        instance.setRandom(42);
        assertEquals(42, instance.getRandom());
    }

    @Test
    void shouldSetAndGetMsgBody() {
        GroupMemberImport instance = new GroupMemberImport();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }

    @Test
    void shouldGenerateToString() {
        GroupMemberImport instance = new GroupMemberImport();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        GroupMemberImport a = new GroupMemberImport();
        GroupMemberImport b = new GroupMemberImport();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        GroupMemberImport a = new GroupMemberImport();
        GroupMemberImport b = new GroupMemberImport();
        b.setAccount("testValue");
        assertNotEquals(a, b);
    }

}