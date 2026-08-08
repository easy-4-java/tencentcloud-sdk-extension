package com.tencentcloud.sdk.tim.resp.push;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencentcloud.sdk.tim.resp.TimActionResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * User Attrs API response for the Tencent Cloud IM API.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = false)
public class UserAttrsResponse extends TimActionResponse {

	/**
	 * 用户标签内容列表
	 */
	@JsonProperty("UserAttrs")
	private List<UserAttrs> userAttrs;
}
