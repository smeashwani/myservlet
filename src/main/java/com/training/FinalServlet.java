package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		String c = "";
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("txtFieldA")) {
				a= cookie.getValue();
			}
			if(cookie.getName().equals("txtFieldB")) {
				b= cookie.getValue();
			}
			if(cookie.getName().equals("txtFieldC")) {
				c= cookie.getValue();
			}
		}
		
		out.print("A: " + a + "</br>");
		out.print("B: " + b + "</br>");
		out.print("C: " + c + "</br>");
		out.print("D: " + request.getParameter("textFieldD") + "</br>");
		
	}



}
