package org.nl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CurrentModuleInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object obj) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI().toString();
		int departmentNum = 0;
		if(url.contains("root")){
			departmentNum = 99;
		} else if (url.contains("dsj")) {
			departmentNum = 1; 
		} else if (url.contains("zjb")) {
			departmentNum = 2;
		} else if (url.contains("cw")) {
			departmentNum = 7;
		} else if (url.contains("xz")) {
			departmentNum = 8;
		}
		
		request.getSession().setAttribute("departmentNum",departmentNum);
		return true;
	}

}
