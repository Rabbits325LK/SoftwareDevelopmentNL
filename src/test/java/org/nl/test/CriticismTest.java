package org.nl.test;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.Criticism;
import org.nl.service.CriticismService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CriticismTest {
	
	private CriticismService criticismService;
	
	//@Before
	public void Before(){
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		criticismService = (CriticismService) ctx.getBean("criticismServiceImpl"); 
	}
	
	//@Test
	public void add(){
		Criticism c = new Criticism();
		c.setCriticismAdmin("Rabbits");
		c.setCriticismContext("测试批复");
		c.setMessageId(2);
		criticismService.add(c);
		System.out.println("ok");
	}
}
