package org.nl.service.impl;

import org.nl.dao.MessageDao;
import org.nl.model.Message;
import org.nl.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息信息表业务接口实现类
 * @author Rabbits
 * @version 1.0		2015.04.02 	14:55
 */
@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageDao messageDao;
	
	@Override
	public void add(Message message) {
		// TODO Auto-generated method stub
		messageDao.add(message);
	}
	
}
