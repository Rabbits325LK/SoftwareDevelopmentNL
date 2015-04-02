package org.nl.controller;



import org.nl.model.Employee;
import org.nl.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class EmployeeController {

	@Autowired
	private EmployeeService employService;
	
	
	
	@RequestMapping("sign")
	public String sgin(){
		return "main/sign";
	}
	
	@RequestMapping("toSign")
	public String toSgin(Employee emp, String birthDate, Model model){
		employService.save(emp,birthDate);
		model.addAttribute("emp", emp);
		return "main/signHome";
	}
}
