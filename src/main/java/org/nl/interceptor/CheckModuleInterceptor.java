package org.nl.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nl.model.DepartmentNum;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckModuleInterceptor implements HandlerInterceptor {

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
		Integer departmentNum = (Integer)request.getSession().getAttribute("departmentNum");
		List<DepartmentNum> departmentNums = (List<DepartmentNum>)
				request.getSession().getAttribute("departmentNums");
		for(DepartmentNum d : departmentNums){
			if(d.getDepartmentNum() == departmentNum){
				return true;
			}
		}
		response.sendRedirect(request.getContextPath()+"/login/nopower.do");
		return false;
	}

}
