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
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		PrintWriter out = response.getWriter();
		Cookie cookieA = new Cookie("txtFieldA", txtFieldA);
		cookieA.setMaxAge(60*60*24*5);
		Cookie cookieB = new Cookie("txtFieldB", txtFieldB);
		response.addCookie(cookieA);
		response.addCookie(cookieB);
		String res ="""
				<form action="SecondServlet">
				Enter C: <input type="text" name="textFieldC" /></br>
				<input type="submit">
				</form>
				""";
		out.print(res);
		
	}

}
