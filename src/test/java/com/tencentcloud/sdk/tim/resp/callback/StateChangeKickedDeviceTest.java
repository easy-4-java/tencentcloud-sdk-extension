package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StateChangeKickedDevice.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StateChangeKickedDeviceTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StateChangeKickedDevice instance = new StateChangeKickedDevice();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetPlatform() {
        StateChangeKickedDevice instance = new StateChangeKickedDevice();
        instance.setPlatform("testValue");
        assertEquals("testValue", instance.getPlatform());
    }

    @Test
    void shouldGenerateToString() {
        StateChangeKickedDevice instance = new StateChangeKickedDevice();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StateChangeKickedDevice a = new StateChangeKickedDevice();
        StateChangeKickedDevice b = new StateChangeKickedDevice();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StateChangeKickedDevice a = new StateChangeKickedDevice();
        StateChangeKickedDevice b = new StateChangeKickedDevice();
        b.setPlatform("testValue");
        assertNotEquals(a, b);
    }

}