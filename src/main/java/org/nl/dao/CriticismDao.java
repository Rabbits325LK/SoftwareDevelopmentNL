package org.nl.dao;

import java.util.List;

import org.nl.model.Criticism;
import org.nl.model.page.CriticismPage;

/**
 * 批复消息Dao层
 * @author Rabbits
 * @version 1.0 	2015.04.03	15:54
 */
public interface CriticismDao {
	/**
	 * 添加一条消息
	 * @param criticism
	 */
	void add(Criticism criticism);
	
	/**
	 * 根据Id删除一条消息
	 * @param criticismId
	 */
	void deleteById(int criticismId);
	
	/**
	 * 根据MessageId分页查询
	 * @param messageId
	 * @param begin
	 * @return
	 */
	List<Criticism> findByMessageIdPage(int messageId, int begin);
	
	/**
	 * 分页查询
	 * @param page
	 * @return
	 */
	List<Criticism> findByPage(CriticismPage page);
	
	/**
	 * 查询总条数
	 * @return
	 */
	int findRows();
	
	/**
	 * 根据MessageId查询总条数
	 * @param messageId
	 * @return
	 */
	int findByMessageIdRows(int messageId);
}
