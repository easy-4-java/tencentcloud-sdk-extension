package com.tencentcloud.sdk.tim.req.profile;

/**
 * Enumeration of gender values for user profiles.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
public enum GenderType {

	GENDER_TYPE_UNKNOWN("Gender_Type_Unknown","没设置性别"),
	GENDER_TYPE_FEMALE("Gender_Type_Female","女性"),
	GENDER_TYPE_MALE("Gender_Type_Male","男性");
	
    private String value;
    private String desc;

    GenderType(String value,String desc){
        this.value = value;
        this.desc = desc;
    }

    public String getValue(){
        return this.value;
    }
    
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return this.getValue();
	}
	
}
