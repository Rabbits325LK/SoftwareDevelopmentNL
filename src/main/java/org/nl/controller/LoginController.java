package org.nl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class LoginController {

	@RequestMapping("home")
	public String toIndex(){
		return "index";
	}
}
