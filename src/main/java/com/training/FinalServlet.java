package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FinalServlet")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String a = "";
		String b = "";
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("txtFieldA")) {
				a= cookie.getValue();
			}
			if(cookie.getName().equals("txtFieldB")) {
				b= cookie.getValue();
			}
		}
		
		out.print("A: " + a + "</br>");
		out.print("B: " + b + "</br>");
		out.print("C: " + request.getParameter("textFieldC") + "</br>");
		
	}



}
