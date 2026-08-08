package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StateChangeInfo.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StateChangeInfoTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StateChangeInfo instance = new StateChangeInfo();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetAction() {
        StateChangeInfo instance = new StateChangeInfo();
        instance.setAction("testValue");
        assertEquals("testValue", instance.getAction());
    }

    @Test
    void shouldSetAndGetAccount() {
        StateChangeInfo instance = new StateChangeInfo();
        instance.setAccount("testValue");
        assertEquals("testValue", instance.getAccount());
    }

    @Test
    void shouldSetAndGetReason() {
        StateChangeInfo instance = new StateChangeInfo();
        instance.setReason("testValue");
        assertEquals("testValue", instance.getReason());
    }

    @Test
    void shouldSetAndGetTimestamp() {
        StateChangeInfo instance = new StateChangeInfo();
        instance.setTimestamp(100L);
        assertEquals(100L, instance.getTimestamp());
    }

    @Test
    void shouldGenerateToString() {
        StateChangeInfo instance = new StateChangeInfo();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StateChangeInfo a = new StateChangeInfo();
        StateChangeInfo b = new StateChangeInfo();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StateChangeInfo a = new StateChangeInfo();
        StateChangeInfo b = new StateChangeInfo();
        b.setAction("testValue");
        assertNotEquals(a, b);
    }

}