package org.nl.model;

import java.sql.Timestamp;

/**
 * 消息信息表模型类
 * @author Rabbits
 * @version 1.0 	2015.04.03	14:15
 */
public class Message {

	/**
	 * messageId：消息编号 
	 * messageTitle：消息标题 
	 * messageContext：消息内容
	 * messagePublisher：消息发布人
	 * messageCreateTime：消息发布时间 
	 * empLevel：员工等级
	 */
	private Integer messageId;
	private String messageTitle;
	private String messageContext;
	private String messagePublisher;
	private Timestamp messageCreateTime;
	private Integer empLevel;

	public Integer getMessageId() {
		return messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	public String getMessageTitle() {
		return messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageContext() {
		return messageContext;
	}

	public void setMessageContext(String messageContext) {
		this.messageContext = messageContext;
	}

	public String getMessagePublisher() {
		return messagePublisher;
	}

	public void setMessagePublisher(String messagePublisher) {
		this.messagePublisher = messagePublisher;
	}

	public Timestamp getMessageCreateTime() {
		return messageCreateTime;
	}

	public void setMessageCreateTime(Timestamp messageCreateTime) {
		this.messageCreateTime = messageCreateTime;
	}

	

	public Integer getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(Integer empLevel) {
		this.empLevel = empLevel;
	}

	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", messageTitle="
				+ messageTitle + ", messageContext=" + messageContext
				+ ", messagePublisher=" + messagePublisher
				+ ", messageCreateTime=" + messageCreateTime + ", empId="
				+ empLevel+ "]";
	}

}
