package org.nl.dao;

import java.util.List;

import org.nl.model.Reply;

/**
 * 消息回复Dao层
 * @author Rabbits
 * @version 1.0 	2015.04.03  15:33
 *
 */
public interface ReplyDao {
	
	/**
	 * 添加一条数据
	 * @param reply
	 */
	void add(Reply reply);
	
	/**
	 * 根据Id删除一条数据
	 * @param replyId
	 */
	void deleteById(int replyId);
	
	
	/**
	 * 根据MessageId 分页查看数据
	 * @param messageId
	 * @param begin
	 * @return
	 */
	List<Reply> findByMessageIdPage(int messageId, int begin);
	
	/**
	 * 数据总条数
	 * @return
	 */
	int findRows();
	
	/**
	 * 根据messageId查询总条数
	 * @param messageId
	 * @return
	 */
	int findByMessageIdRows(int messageId);
}
