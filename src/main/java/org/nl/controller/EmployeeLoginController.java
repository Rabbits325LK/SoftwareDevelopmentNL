package org.nl.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.nl.model.DepartmentNum;
import org.nl.model.EmpLevel;
import org.nl.model.Employee;
import org.nl.service.DepartmentNumService;
import org.nl.service.EmpLevelService;
import org.nl.service.EmployeeService;
import org.nl.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class EmployeeLoginController {
	
	public final static int SUCCESS = 0; //成功
	public final static int EMPCODE_ERROR = 1; //帐号错误
	public final static int PASSWORD_ERROR = 2; //密码错误
	public final static int IMAGE_CODE_ERROR = 3; //验证码错误
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmpLevelService empLevelService;
	@Autowired
	private DepartmentNumService departmentNumService;
	
	/**
	 * 进入主页
	 * @return
	 */
	@RequestMapping("/index.do")
	public String toIndex(){
		return "main/index";
	}
	
	/**
	 * 进入注册页面
	 * @return
	 */
	@RequestMapping("/toSign.do")
	public String toSign(Model model){
		List<EmpLevel> empLevels = empLevelService.findByAll();
		List<DepartmentNum> departmentNums = departmentNumService.findByAll();
		model.addAttribute("empLevels", empLevels);
		model.addAttribute("departmentNum", departmentNums);
		return "main/sign";
	}
	
	/**
	 * 进入登录页面
	 * @return
	 */
	@RequestMapping("/toLogin.do")
	public String toLogin(){
		return "main/login";
	}
	
	@RequestMapping("/checkLogin.do")
	@ResponseBody
	public int checkLogin(String empCode, String empPwd, String code, HttpSession session){
		String imageCode = 
				(String) session.getAttribute("imageCode");
		if(!code.equalsIgnoreCase(imageCode)) {
			return IMAGE_CODE_ERROR;
		}
		
		Employee emp = employeeService.findByCode(empCode);
		if(emp == null) {
			return EMPCODE_ERROR;
		} else if (!emp.getEmpPwd().equals(empPwd)){
			return PASSWORD_ERROR;
		} else {
			session.setAttribute("emp", emp);
			session.setAttribute("departmentNum", emp.getDepartmentNum());
			return SUCCESS;
		}
	}
	
	/**
	 * 提交注册表单
	 * @param emp
	 * @param birthDate
	 * @return
	 */
	@RequestMapping("/sign.do")
	public String toSign(Employee emp, String birthDate) {
		Employee Emp = employeeService.findByCode(emp.getEmpCode());
		if(Emp == null){
			employeeService.save(emp, birthDate);
			return "main/home";
		} else {
			return "main/signerror";
		}
	}
	
	/**
	 * 生成验证码图片
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	@RequestMapping("/createImage.do")
	public void createImage(HttpServletResponse response,HttpSession session)
		throws IOException{
		Map<String, BufferedImage> map = ImageUtil.createImage();
		String code = map.keySet().iterator().next();
		session.setAttribute("iamgeCode", code);
		BufferedImage image = map.get(code);
		response.setContentType("image/jpeg");
		OutputStream os = response.getOutputStream();
		ImageIO.write(image, "jpeg", os);
		os.close();
	}
	
	/**
	 * 无权限页面
	 * @return
	 */
	@RequestMapping("/nopower.do")
	public String nopower(){
		return "main/nopower2";
	}
}
