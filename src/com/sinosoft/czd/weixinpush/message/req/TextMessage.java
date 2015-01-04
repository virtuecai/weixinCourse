package com.sinosoft.czd.weixinpush.message.req;

/**
 * 文本消息
 * 
 * @author virtuecai
 * @date 2015-01-04
 */
public class TextMessage extends BaseMessage {
	// 消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}