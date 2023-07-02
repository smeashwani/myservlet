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
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtFieldC = request.getParameter("textFieldC");
		response.setContentType("text/html");
		Cookie cookieC = new Cookie("txtFieldC", txtFieldC);
		response.addCookie(cookieC);
		String res  = """
				<form action="FinalServlet">
				Enter D: <input type="text" name="textFieldD" /></br>
				<input type="submit">
				</form>
				""";
		PrintWriter out = response.getWriter();
		out.print(res);
		
	}



}
