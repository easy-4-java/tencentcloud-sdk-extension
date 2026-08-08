package com.tencentcloud.sdk.tim.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    /**
     * Unit tests for SnsBlackListDelete.
     * @author <a href="https://github.com/loong10k">Loong Wan</a>
     * @since 3.0.0
     */
class SnsBlackListDeleteTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        SnsBlackListDelete instance = new SnsBlackListDelete();
        assertNotNull(instance);
    }

    @Test
    void shouldSetAndGetCommand() {
        SnsBlackListDelete instance = new SnsBlackListDelete();
        instance.setCommand("testValue");
        assertEquals("testValue", instance.getCommand());
    }

    @Test
    void shouldSetAndGetPairList() {
        SnsBlackListDelete instance = new SnsBlackListDelete();
        instance.setPairList(new java.util.ArrayList<>());
        assertNotNull(instance.getPairList());
    }

    @Test
    void shouldGenerateToString() {
        SnsBlackListDelete instance = new SnsBlackListDelete();
        String result = instance.toString();
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        SnsBlackListDelete a = new SnsBlackListDelete();
        SnsBlackListDelete b = new SnsBlackListDelete();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }

    @Test
    void shouldNotBeEqualWhenDifferentValues() {
        SnsBlackListDelete a = new SnsBlackListDelete();
        SnsBlackListDelete b = new SnsBlackListDelete();
        b.setCommand("testValue");
        assertNotEquals(a, b);
    }

}