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
package com.tencentcloud.sdk.sms;

// PropertyMapper replaced with direct setter calls

import com.tencentcloud.sdk.TencentSmsProperties;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.sms.v20190711.SmsClient;
import com.tencentcloudapi.sms.v20190711.models.SendSmsRequest;
import com.tencentcloudapi.sms.v20190711.models.SendSmsResponse;

/**
 * Template class for sending SMS messages via the Tencent Cloud SMS API.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
public class TencentSmsTemplate {

	private SmsClient smsClient;
	private TencentSmsProperties smsProperties;
	
	public TencentSmsTemplate(SmsClient smsClient, TencentSmsProperties smsProperties) {
		this.smsClient = smsClient;
		this.smsProperties = smsProperties;
	}

	public SendSmsResponse send(String phoneNumber, String templateID, String... templateParams) throws TencentCloudSDKException {
		return this.send(new String[] {phoneNumber}, templateID, templateParams);
	}
	
	public SendSmsResponse send(String[] phoneNumbers, String templateID, String... templateParams) throws TencentCloudSDKException {
		
		/*
		 * 实例化一个请求对象，根据调用的接口和实际情况，可以进一步设置请求参数 您可以直接查询 SDK 源码确定接口有哪些属性可以设置
		 * 属性可能是基本类型，也可能引用了另一个数据结构 推荐使用 IDE 进行开发，可以方便地跳转查阅各个接口和数据结构的文档说明
		 */
		SendSmsRequest req = new SendSmsRequest();

		/* 模板 ID: 必须填写已审核通过的模板 ID，可登录 [短信控制台] 查看模板 ID */
		req.setTemplateID(templateID);

		/*
		 * 下发手机号码，采用 e.164 标准，+[国家或地区码][手机号] 例如+8613711112222， 其中前面有一个+号
		 * ，86为国家码，13711112222为手机号，最多不要超过200个手机号
		 */
		req.setPhoneNumberSet(phoneNumbers);

		/* 模板参数: 若无模板参数，则设置为空 */
		req.setTemplateParamSet(templateParams);

		return this.send(req);
	}
	
	/*
	 * 填充请求参数，这里 request 对象的成员变量即对应接口的入参 您可以通过官网接口文档或跳转到 request 对象的定义处查看请求参数的定义
	 * 基本类型的设置: 帮助链接： 短信控制台：https://console.cloud.tencent.com/smsv2 sms
	 * helper：https://cloud.tencent.com/document/product/382/3773
	 */
	public SendSmsResponse send(SendSmsRequest req) throws TencentCloudSDKException {
		
		/* 1、短信应用 ID: 在 [短信控制台] 添加应用后生成的实际 SDKAppID，例如1400006666 */
		if (smsProperties.getSdkappid() != null) {
			req.setSmsSdkAppid(smsProperties.getSdkappid());
		}
		/* 2、短信签名内容: 使用 UTF-8 编码，必须填写已审核通过的签名，可登录 [短信控制台] 查看签名信息 */
		if (smsProperties.getSign() != null) {
			req.setSign(smsProperties.getSign());
		}
		/* 3、国际/港澳台短信 senderid: 国内短信填空，默认未开通，如需开通请联系 [sms helper] */
		if (smsProperties.getSenderId() != null) {
			req.setSenderId(smsProperties.getSenderId());
		}
		/* 4、用户的 session 内容: 可以携带用户侧 ID 等上下文信息，server 会原样返回 */
		if (smsProperties.getSession() != null) {
			req.setSessionContext(smsProperties.getSession());
		}
		/* 5、短信码号扩展号: 默认未开通，如需开通请联系 [sms helper] */
		if (smsProperties.getEncode() != null) {
			req.setExtendCode(smsProperties.getEncode());
		}
		
		/*
		 * 通过 client 对象调用 SendSms 方法发起请求。注意请求方法名与请求对象是对应的 返回的 res 是一个 SendSmsResponse
		 * 类的实例，与请求对象对应
		 */
		return smsClient.SendSms(req);
	}
	
	/**
	 * TODO
	 * @author <a href="https://github.com/loong10k">Loong Wan</a>
	 * @return		: the smsClient
	 */
	public SmsClient getSmsClient() {
		return smsClient;
	}
	
	/**
	 * TODO
	 * @author <a href="https://github.com/loong10k">Loong Wan</a>
	 * @return		: the smsProperties
	 */
	public TencentSmsProperties getSmsProperties() {
		return smsProperties;
	}

}
