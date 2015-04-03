package org.nl.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.nl.model.Attendance;
import org.nl.service.AttendanceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AttendanceTest {

	private AttendanceService attendanceService;
	
	//@Before
	public void BeFore(){
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext
				(new String[]{"classpath:conf/spring.xml","classpath:conf/spring-mybatis.xml"});
		attendanceService = (AttendanceService) ctx.getBean("attendanceServiceImpl");
	}
	
	//@Test
	public void addStart(){
		Attendance ad = new Attendance();
		ad.setEmpId(1);
		ad.setEmpName("Rabbits");
		ad.setEmpLevel(0);
		ad.setDepartmentNum(0);
		//ad.setStartTime(new Date());
		attendanceService.addStart(ad);
		System.out.println("OK");
	}
	
	//@Test
	public void addStop(){
		String empName = "Rabbits325";
		attendanceService.addStopForName(empName);
		System.out.println("ok");
	}
	
	//@Test
	public void findByPage(){
		String empName = "Rabbits";
		int begin = 1;
		List<Attendance> ads = attendanceService.findByNamePage(empName, begin);
		for(Attendance sd : ads){
			System.out.println(sd.getAttendanceId());
			System.out.println(sd.getEmpName());
			System.out.println(sd.getStartTime());
			System.out.println(sd.getStopTime());
		}
		
	}
}
