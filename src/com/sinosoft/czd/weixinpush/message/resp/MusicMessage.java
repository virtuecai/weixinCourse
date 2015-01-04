package com.sinosoft.czd.weixinpush.message.resp;

/**
 * 音乐消息
 * 
 * @author VirtueCai
 * @date 2015-01-04
 */
public class MusicMessage extends BaseMessage {
	// 音乐
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}