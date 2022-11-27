package com.training;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class HelloServletFilter implements Filter {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
	String parameter = req.getParameter("textFieldA");
	HttpServletResponse resp = (HttpServletResponse)res;
	if(parameter.length() == 0) {
		System.out.println("Not allow textFieldA");
		resp.sendRedirect("index.html");
	}else {
		filter.doFilter(req, res);
		System.out.println("response from Filter 1");
	}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
