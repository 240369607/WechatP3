package com.zjj.wechat3.domain.shortvideo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zjj.wechat3.domain.InMessage;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "xml")
public class ShortVideoInMessage  extends InMessage{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaId;	//视频消息媒体id，可以调用获取临时素材接口拉取数据
	
	@XmlElement(name = "ThumbMediaId")
	@JsonProperty("ThumbMediaId")
	private String thumbMediaId;	//视频消息缩略图的媒体id，可以调用获取临时素材接口拉取数据
	
	public ShortVideoInMessage() {
		super.setMsgType("shortvideo");
	}
	public String getMediaId() {
		return mediaId;
	}
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	public String getThumbMediaId() {
		return thumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
	@Override
	public String toString() {
		return "ShortVideoInMessage [mediaId=" + mediaId + ", thumbMediaId=" + thumbMediaId + ", getToUserName()="
				+ getToUserName() + ", getFromUserName()=" + getFromUserName() + ", getCreateTime()=" + getCreateTime()
				+ ", getMsgType()=" + getMsgType() + ", getMsgId()=" + getMsgId() + "]";
	}	
}
