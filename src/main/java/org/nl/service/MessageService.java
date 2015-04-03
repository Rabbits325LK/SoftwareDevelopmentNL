package org.nl.service;

import org.nl.model.Message;

/**
 * 消息信息表的业务接口
 * @author Rabbits
 * @version 1.0 	2015.04.03	14:54
 *
 */
public interface MessageService {
	
	void add(Message message);
}
