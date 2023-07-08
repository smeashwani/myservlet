package com.training;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServletFilter2 implements Filter {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filter)
			throws IOException, ServletException {
	String parameter = req.getParameter("textFieldB");
	HttpServletResponse resp = (HttpServletResponse)res;
	if(parameter.length() == 0) {
		System.out.println("Not allow -  textFieldB");
		resp.sendRedirect("index.html");
	}else {
		filter.doFilter(req, res);
		System.out.println("response from Filter 2");
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
