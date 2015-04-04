package org.nl.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.Reply;
import org.nl.service.ReplyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplyTest {
	
	private ReplyService replyService;
	
	@Before
	public void Before(){
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		replyService = (ReplyService) ctx.getBean("replyServiceImpl");
	}
	
	//@Test
	public void add(){
		Reply r = new Reply();
		r.setReplyAdmin("Rabbits325");
		r.setMessageId(2);
		r.setReplyContext("测试回复");
		replyService.add(r);
		System.out.println("Ok");
	}
	
	@Test
	public void findByMessageIdPage(){
		int messageId = 2;
		int begin = 1;
		List<Reply> rs = replyService.findByMessageIdPage(messageId, begin);
		for(Reply r : rs){
			System.out.println(r.getReplyAdmin());
			System.out.println(r.getReplyContext());
			System.out.println(r.getReplyId());
			System.out.println(r.getMessageId());
			System.out.println(r.getReplyTime());
		}
	}
}
