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
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtFieldC = request.getParameter("textFieldC");
		response.setContentType("text/html");
		Cookie cookieC = new Cookie("txtFieldC", txtFieldC);
		response.addCookie(cookieC);
		
		PrintWriter out = response.getWriter();
		out.print("<form action=\"FinalServlet\">\r\n"
				+ "		Enter D: <input type=\"text\" name=\"textFieldD\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>");
		
	}



}
