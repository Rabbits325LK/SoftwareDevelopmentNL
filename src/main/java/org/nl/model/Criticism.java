package org.nl.model;

import java.sql.Timestamp;

/**
 * 批复消息模型
 * @author Rabbits
 * @version 1.0 	2015.04.03	 15:51
 */
public class Criticism {
	
	private Integer criticismId;
	private String criticismContext;
	private String criticismAdmin;
	private Timestamp criticismTime;
	private Integer messageId;
	public Integer getCriticismId() {
		return criticismId;
	}
	public void setCriticismId(Integer criticismId) {
		this.criticismId = criticismId;
	}
	public String getCriticismContext() {
		return criticismContext;
	}
	public void setCriticismContext(String criticismContext) {
		this.criticismContext = criticismContext;
	}
	public String getCriticismAdmin() {
		return criticismAdmin;
	}
	public void setCriticismAdmin(String criticismAdmin) {
		this.criticismAdmin = criticismAdmin;
	}
	public Timestamp getCriticismTime() {
		return criticismTime;
	}
	public void setCriticismTime(Timestamp criticismTime) {
		this.criticismTime = criticismTime;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	@Override
	public String toString() {
		return "Criticism [criticismId=" + criticismId + ", criticismContext="
				+ criticismContext + ", criticismAdmin=" + criticismAdmin
				+ ", criticismTime=" + criticismTime + ", messageId="
				+ messageId + "]";
	}
	
	
}
