package org.nl.dao;

import java.util.List;

import org.nl.model.Message;
import org.nl.model.page.MessagePage;

/**
 * 消息信息表的Dao层
 * @author Rabbits
 * @version 1.0		2015.04.03	14:30
 */
public interface MessageDao {
	
	/**
	 * 添加一条消息
	 * @param message
	 */
	void add(Message message);
	
	/**
	 * 根据ID删除一条消息
	 * @param messageId
	 */
	void deleteById(int messageId);
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<Message> findByPage(MessagePage page);
	
	/**
	 * 根据发布者分页查询
	 * @param empName
	 * @param begin
	 * @return
	 */
	List<Message> findByName(String empName, int begin);
	
	/**
	 * 根据标题查询
	 * @param messageTitle
	 * @return
	 */
	Message findByTitle(String messageTitle);
	
	/**
	 * 查询总条数
	 * @return
	 */
	int findRows();
}
