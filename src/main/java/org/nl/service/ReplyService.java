package org.nl.service;

import java.util.List;

import org.nl.model.Reply;

/**
 * 消息回复业务接口
 * @author Rabbits
 * @version 1.0 	2015.04.03 	17:03
 */
public interface ReplyService {
	
	void add(Reply reply);
	
	List<Reply> findByMessageIdPage(int messageId, int begin);
}
