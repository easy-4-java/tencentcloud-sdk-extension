package com.tencentcloud.sdk.live.resp;

import lombok.Builder;
import lombok.Data;

/**
 * Result object containing mix-stream session ID, output stream name, and playback URLs.
 *
 * @author <a href="https://github.com/loong10k">Loong Wan</a>
 * @since 3.0.0
 */
@Data
@Builder
public class MixStreamResult {

	private String sessionId;
	private String streamName;

	/**
	 * 格式rtmp://domain/AppName/StreamName?txSecret=
	 */
	private StringBuilder rtmpUrl;
	/**
	 * 格式webrtc://domain/AppName/StreamName?txSecret=
	 */
	private StringBuilder webrtcUrl;
	/**
	 * 格式http://domain/AppName/StreamName.flv?txSecret=
	 */
	private StringBuilder flvUrl;
	/**
	 * 格式http://domain/AppName/StreamName.m3u8
	 */
	private StringBuilder hlsUrl;
}
