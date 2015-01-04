package com.sinosoft.czd.weixinpush.message.resp;

/**
 * 文本消息
 * 
 * @author VirtueCai
 * @date 2015-01-04
 */
public class TextMessage extends BaseMessage {
	// 回复的消息内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}