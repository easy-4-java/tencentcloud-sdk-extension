/*
 * Copyright (c) 2018, Loong Wan (https://github.com/loong10k).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.tencentcloud.sdk.tim;

import java.util.Map;
import java.util.function.Consumer;

import com.tencentcloud.sdk.tim.resp.TimActionResponse;
import com.tencentcloud.sdk.utils.CommonHelper;

import lombok.extern.slf4j.Slf4j;

/**
 * Tim 接口集成
 * https://cloud.tencent.com/document/product/269/42440
 */
@Slf4j
public abstract class TencentTimOperations {

	public static final String PREFIX = "https://console.tim.qq.com";
	public static final String APPLICATION_JSON_VALUE = "application/json";
	public static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";

	protected TencentTimTemplate timTemplate;

	public TencentTimOperations(TencentTimTemplate timTemplate) {
		this.timTemplate = timTemplate;
	}
	
	protected String genUserSig(String identifier) {
		return timTemplate.genUserSig(identifier);
	}

	protected String genUserSig(String identifier, long expire) {
		return timTemplate.genUserSig(identifier, expire);
	}

	/**
	 * 根据im用户id获取用户id
	 * 
	 * @param imUser IM 用户ID
	 * @return IM 用户ID对应的用户ID
	 */
	protected String getUserIdByImUser(String imUser) {
		return timTemplate.getUserIdByImUser(imUser);
	}

	/**
	 * 根据用户id获取im用户id
	 * 
	 * @param userId 用户ID
	 * @return 用户ID对应的用户ID
	 */
	protected String getImUserByUserId(String userId) {
		return timTemplate.getImUserByUserId(userId);
	}
	
	/**
	 * 返回默认的参数
	 * @return 默认参数
	 */
	protected Map<String, String> getDefaultParams() {
		return getTimTemplate().getDefaultParams();
	}
	
	protected <T extends TimActionResponse> T request(TimApiAddress address, Object params, Class<T> cls) {
		String url = CommonHelper.getRequestUrl(address, getDefaultParams());
		T res =  getTimTemplate().requestInvoke(url, params, cls);
		if (res.isSuccess()) {
			log.info("Tim {} >> Success, url : {}, params : {}, ActionStatus : {}", address.getOpt(), url, params, res.getActionStatus());
		} else {
			log.error("Tim {} >> Failure, url : {}, params : {}, ActionStatus : {}, ErrorCode : {}, ErrorInfo : {}", address.getOpt(), url, params, res.getActionStatus(), res.getErrorCode(), res.getErrorInfo());
		}
		return res;
	}
	
	protected <T extends TimActionResponse> void asyncRequest(TimApiAddress address, Object params, Class<T> cls, Consumer<T> consumer) {
		String url = CommonHelper.getRequestUrl(address, getDefaultParams());
		getTimTemplate().requestAsyncInvoke(url, params, (response) -> {
			if (response.isSuccessful()) {
				try {
					String body = response.body().string();
					T res = getTimTemplate().readValue(body, cls);
					if (res.isSuccess()) {
						log.info("Tim {} >> Success, url : {}, params : {}, ActionStatus : {}, Body : {}", address.getOpt(), url, params, res.getActionStatus(), body);
					} else {
						log.error("Tim {} >> Failure, url : {}, params : {}, ActionStatus : {}, ErrorCode : {}, ErrorInfo : {}", url, params, res.getActionStatus(), res.getErrorCode(), res.getErrorInfo());
					}
					consumer.accept(res);
				} catch (Exception e) {
					log.error("Response Parse Error : {}", e.getMessage());
					T res = safeInstantiate(cls);
					if (res != null) {
						consumer.accept(res);
					}
				}
            } else {
            	T res = safeInstantiate(cls);
            	if (res != null) {
            		consumer.accept(res);
            	}
            }
		});
	}
	
	/**
	 * 安全地实例化指定类，异常时返回 null
	 *
	 * @param cls 目标类
	 * @param <T> 类型
	 * @return 实例或 null
	 */
	protected <T> T safeInstantiate(Class<T> cls) {
		try {
			return cls.newInstance();
		} catch (Exception e) {
			log.error("Instantiation Error : {}", e.getMessage());
			return null;
		}
	}

	public TencentTimTemplate getTimTemplate() {
		return timTemplate;
	}
	
}
