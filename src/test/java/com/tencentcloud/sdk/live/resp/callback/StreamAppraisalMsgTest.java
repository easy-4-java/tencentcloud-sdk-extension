package com.tencentcloud.sdk.live.resp.callback;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreamAppraisalMsgTest {

    @Test
    void shouldCreateInstanceWithDefaults() {
        StreamAppraisalMsg instance = new StreamAppraisalMsg();
        assertNotNull(instance);
    }

    @Test
    void shouldGenerateToString() {
        StreamAppraisalMsg instance = new StreamAppraisalMsg();
        assertNotNull(instance.toString());
    }

    @Test
    void shouldBeEqualWhenSameValues() {
        StreamAppraisalMsg a = new StreamAppraisalMsg();
        StreamAppraisalMsg b = new StreamAppraisalMsg();
        assertEquals(a, b);
        assertEquals(a.hashCode(), b.hashCode());
    }
}
