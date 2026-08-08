package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsBlackListAdd.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsBlackListAddTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsBlackListAdd instance = new SnsBlackListAdd();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsBlackListAdd instance = new SnsBlackListAdd();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetPairList() {
        SnsBlackListAdd instance = new SnsBlackListAdd();
        instance.setPairList(new java.util.ArrayList<>());
        assertNotNull(instance.getPairList());
    }

    @Test
    void shouldGenerateToString() {
        SnsBlackListAdd instance = new SnsBlackListAdd();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsBlackListAdd a = new SnsBlackListAdd();
        SnsBlackListAdd b = new SnsBlackListAdd();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsBlackListAdd a = new SnsBlackListAdd();
        SnsBlackListAdd b = new SnsBlackListAdd();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}