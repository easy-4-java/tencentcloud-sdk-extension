package com.tencentcloud.sdk.tim.req.message;

/**
 * Enumeration of TIM message content types (text, image, sound, video, location, face, file, etc.).
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
public enum MessageType {
	
    TIM_TEXT_ELEM("TIMTextElem","文本消息"),
    TIM_FACE_ELEM("TIMFaceElem","表情消息"),
    TIM_LOCATION_ELEM("TIMLocationElem","位置消息"),
    TIM_CUSTOM_ELEM("TIMCustomElem","自定义消息"),

    ;
    private String value;
    private String desc;

    MessageType(String value,String desc){
        this.value = value;
        this.desc = desc;
    }

    public String getValue(){
        return this.value;
    }
    
	public String getDesc() {
		return desc;
	}
	
}
