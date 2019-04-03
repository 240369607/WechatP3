package com.zjj.wechat3.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.zjj.wechat3.domain.InMessage;
import com.zjj.wechat3.domain.image.ImageInMessage;
import com.zjj.wechat3.domain.link.LinkInMessage;
import com.zjj.wechat3.domain.location.LocationInMessage;
import com.zjj.wechat3.domain.shortvideo.ShortVideoInMessage;
import com.zjj.wechat3.domain.text.TextInMessage;
import com.zjj.wechat3.domain.video.VideoInMessage;
import com.zjj.wechat3.domain.voice.VoiceInMessage;

public class MessageTypeMapper {

	private static Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();

	// 通过一个Map记录了消息类型和类的关系
	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", ImageInMessage.class);
		typeMap.put("voice", VoiceInMessage.class);
		typeMap.put("video", VideoInMessage.class);
		typeMap.put("location", LocationInMessage.class);
		typeMap.put("shortvideo", ShortVideoInMessage.class);
		typeMap.put("link", LinkInMessage.class);
		//typeMap.put("event", TextInMessage.class);
	}

	// 通过消息类型获取对应的类
	@SuppressWarnings("unchecked")
	public static <T extends InMessage> Class<T> getClass(String type) {
		return (Class<T>) typeMap.get(type);
	}
}