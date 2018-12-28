package com.two.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.two.bean.UserBean;

public class UserFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
//	判定用户是否登录 利用过滤器0.0
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) arg0;
        HttpServletResponse response=(HttpServletResponse) arg1;
        UserBean ub = (UserBean) request.getSession().getAttribute("user");
        if(ub==null || ub.equals(null)) {
        	response.sendRedirect("login.jsp");
        }else {
        	arg2.doFilter(request,response);
        }
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
