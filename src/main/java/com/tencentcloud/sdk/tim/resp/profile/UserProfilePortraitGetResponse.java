package com.tencentcloud.sdk.tim.resp.profile;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencentcloud.sdk.tim.resp.TimActionResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * User Profile Portrait Get API response for the Tencent Cloud IM API.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
@Data
@EqualsAndHashCode(callSuper=false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = false)
public class UserProfilePortraitGetResponse extends TimActionResponse  {

	/**
	 * 返回的用户资料结构化信息
	 */
	@JsonProperty("UserProfileItem")
	private List<UserProfileItem> profiles;
 
	/**
	 * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
	 */
	@JsonProperty("Fail_Account")
	private List<String> failAccounts;

	/**
	 * 返回处理失败的用户列表，仅当存在失败用户时才返回该字段
	 */
	@JsonProperty("CurrentStandardSequence")
	private Integer currentStandardSequence;
	
}
