package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session = request.getSession();
		session.setAttribute("textFieldA", txtFieldA);
		
		String res  = "<form action=\"SecondServlet\">\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldA\" value=\"%s\" /></br>\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldB\" value=\"%s\"/></br>\r\n"
				+ "		Enter c: <input type=\"text\" name=\"textFieldC\" /></br>\r\n"
				+ "		Enter d: <input type=\"text\" name=\"textFieldD\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>";
		
		out.print(String.format(res,txtFieldA, txtFieldB));
		
	}

}
