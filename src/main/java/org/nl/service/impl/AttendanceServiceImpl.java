package org.nl.service.impl;

import java.util.List;

import org.nl.dao.AttendanceDao;
import org.nl.model.Attendance;
import org.nl.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	private AttendanceDao attendanceDao;

	@Override
	public void addStart(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanceDao.addStart(attendance);
	}

	@Override
	public void addStopForName(String empName) {
		// TODO Auto-generated method stub
		int id = attendanceDao.findByEmpName(empName);
		attendanceDao.addStopForName(id);
	}

	@Override
	public List<Attendance> findByNamePage(String empName, int begin) {
		// TODO Auto-generated method stub
		return attendanceDao.findByNamePage(empName, begin);
	}
}
