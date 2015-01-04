package com.sinosoft.czd.weixinpush.message.req;

/**
 * 图片消息
 * 
 * @author virtuecai
 * @date 2015-01-04
 */
public class ImageMessage extends BaseMessage {
	// 图片链接
	private String PicUrl;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
