package com.zjj.wechat3.domain.voice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zjj.wechat3.domain.InMessage;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class VoiceInMessage extends InMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaId; 	//语音消息媒体id，可以调用获取临时素材接口拉取数据
	
	@XmlElement(name = "Format")
	@JsonProperty("Format")
	private String format;	//语音格式，如amr，speex等
	
	@XmlElement(name = "Recognition")
	@JsonProperty("Recognition")
	private String recognition; //语音识别结果，UTF8编码
	public VoiceInMessage() {
		super.setMsgType("voice");
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getRecognition() {
		return recognition;
	}
	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}
	@Override
	public String toString() {
		return "VoiceInMessage [mediaId=" + mediaId + ", format=" + format + ", recognition=" + recognition
				+ ", getToUserName()=" + getToUserName() + ", getFromUserName()=" + getFromUserName()
				+ ", getCreateTime()=" + getCreateTime() + ", getMsgType()=" + getMsgType() + ", getMsgId()="
				+ getMsgId() + "]";
	}	
}
