package org.nl.service.impl;

import org.nl.dao.CriticismDao;
import org.nl.model.Criticism;
import org.nl.service.CriticismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 批复消息业务接口实现
 * @author Rabbits
 * @version  1.0 	2015.04.03	17:19
 */
@Service
public class CriticismServiceImpl implements CriticismService{

	@Autowired
	private CriticismDao criticismDao;
	
	@Override
	public void add(Criticism criticism) {
		// TODO Auto-generated method stub
		criticismDao.add(criticism);
	}

}
