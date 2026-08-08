package com.tencentcloud.sdk.tim.req.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BatchMessageTest {

    @Test
    void shouldCreateViaBuilder() {
        BatchMessage instance = BatchMessage.builder().build();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetSyncOtherMachine() {
        BatchMessage instance = BatchMessage.builder().build();
        instance.setSyncOtherMachine(42);
        assertEquals(42, instance.getSyncOtherMachine());
    }

    @Test
    void shouldSetAndGetFromAccount() {
        BatchMessage instance = BatchMessage.builder().build();
        instance.setFromAccount("testValue");
        assertEquals("testValue", instance.getFromAccount());
    }


    @Test
    void shouldSetAndGetGroupId() {
        BatchMessage instance = BatchMessage.builder().build();
        instance.setGroupId("testValue");
        assertEquals("testValue", instance.getGroupId());
    }

    @Test
    void shouldSetAndGetMsgLifeTime() {
        BatchMessage instance = BatchMessage.builder().build();
        instance.setMsgLifeTime(42);
        assertEquals(42, instance.getMsgLifeTime());
    }



    @Test
    void shouldSetAndGetMsgBody() {
        BatchMessage instance = BatchMessage.builder().build();
        instance.setMsgBody(new java.util.ArrayList<>());
        assertNotNull(instance.getMsgBody());
    }


    @Test
    void shouldGenerateToString() {
        BatchMessage instance = BatchMessage.builder().build();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        BatchMessage a = BatchMessage.builder().build();
        BatchMessage b = BatchMessage.builder().build();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

}