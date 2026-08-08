package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for StateChange.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class StateChangeTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StateChange instance = new StateChange();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        StateChange instance = new StateChange();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetEventTime() {
        StateChange instance = new StateChange();
        instance.setEventTime(42);
        assertEquals(42, instance.getEventTime());
    }


    @Test
    void shouldSetAndGetKickedDevices() {
        StateChange instance = new StateChange();
        instance.setKickedDevices(new java.util.ArrayList<>());
        assertNotNull(instance.getKickedDevices());
    }

    @Test
    void shouldGenerateToString() {
        StateChange instance = new StateChange();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StateChange a = new StateChange();
        StateChange b = new StateChange();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        StateChange a = new StateChange();
        StateChange b = new StateChange();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}