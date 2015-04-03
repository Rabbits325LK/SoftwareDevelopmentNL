package org.nl.test;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.Message;
import org.nl.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageTest {
	
	private MessageService messageService;
	
	//@Before
	public void Before(){
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		messageService = (MessageService) ctx.getBean("messageServiceImpl");
	}
	
	//@Test
	public void add(){
		Message ms = new Message();
		ms.setEmpLevel(0);
		ms.setMessageContext("这是一条测试消息");
		ms.setMessageTitle("测试");
		ms.setMessagePublisher("Rabbits");
		messageService.add(ms);
		System.out.println("ok");
	}
}
