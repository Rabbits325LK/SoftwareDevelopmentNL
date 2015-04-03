package org.nl.model;

import java.sql.Timestamp;

/**
 * 消息回复表模型类
 * @author Rabbits
 *
 */
public class Reply {
	/**
	replyId：消息回复编号
	replyContext：消息回复内容
	replyAdmin：回复人
	replyTime：回复时间
	messageId：消息编号
	*/
	private Integer replyId;
	private String replyContext;
	private String replyAdmin;
	private Timestamp replyTime;
	private Integer messageId;
	public Integer getReplyId() {
		return replyId;
	}
	public void setReplyId(Integer replyId) {
		this.replyId = replyId;
	}
	public String getReplyContext() {
		return replyContext;
	}
	public void setReplyContext(String replyContext) {
		this.replyContext = replyContext;
	}
	public String getReplyAdmin() {
		return replyAdmin;
	}
	public void setReplyAdmin(String replyAdmin) {
		this.replyAdmin = replyAdmin;
	}
	public Timestamp getReplyTime() {
		return replyTime;
	}
	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	@Override
	public String toString() {
		return "Reply [replyId=" + replyId + ", replyContext=" + replyContext
				+ ", replyAdmin=" + replyAdmin + ", replyTime=" + replyTime
				+ ", messageId=" + messageId + "]";
	}
	
	
}
