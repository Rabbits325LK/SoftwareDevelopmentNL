package org.nl.service.impl;

import java.util.List;

import org.nl.dao.ReplyDao;
import org.nl.model.Reply;
import org.nl.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 消息回复业务接口实现类
 * @author Rabbis
 * @version 1.0 	2015.04.03 	17:07
 */
@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDao replyDao;
	
	@Override
	public void add(Reply reply) {
		// TODO Auto-generated method stub
		replyDao.add(reply);
	}

	@Override
	public List<Reply> findByMessageIdPage(int messageId, int begin) {
		// TODO Auto-generated method stub
		return replyDao.findByMessageIdPage(messageId, begin);
	}

}
