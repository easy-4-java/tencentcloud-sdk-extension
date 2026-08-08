package com.tencentcloud.sdk.tim.req.profile;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TagProfileTest {

    @Test
    void shouldHaveEnumValues() {
        TagProfile[] values = TagProfile.values();
        assertNotNull(values);
        assertTrue(values.length > 0);
    }

    @Test
    void shouldGetValueByEnum() {
        TagProfile val = TagProfile.Tag_Profile_IM_Nick;
        assertNotNull(val);
    }

    @Test
    void shouldGetValueOfFromString() {
        TagProfile val = TagProfile.valueOf("Tag_Profile_IM_Nick");
        assertEquals(TagProfile.Tag_Profile_IM_Nick, val);
    }

    @Test
    void shouldGetValue() {
        for (TagProfile val : TagProfile.values()) {
            assertNotNull(val.getValue());
        }
    }

    @Test
    void shouldGetDesc() {
        for (TagProfile val : TagProfile.values()) {
            assertNotNull(val.getDesc());
        }
    }

    @Test
    void shouldGetRamark() {
        for (TagProfile val : TagProfile.values()) {
            assertNotNull(val.getRamark());
        }
    }

}