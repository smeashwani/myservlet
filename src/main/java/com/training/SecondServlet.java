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
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		String txtFieldC = request.getParameter("textFieldC");
		String txtFieldD = request.getParameter("textFieldD");
		
		PrintWriter out = response.getWriter();
		String res = "<form action=\"FinalServlet\">\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldA\" value=\"%s\"/></br>\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldB\" value=\"%s\"/></br>\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldC\" value=\"%s\"/></br>\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldD\" value=\"%s\"/></br>\r\n"
				+ "		Enter E: <input type=\"text\" name=\"textFieldE\" /></br>\r\n"
				+ "		Enter F: <input type=\"text\" name=\"textFieldF\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>";
		
		out.print(String.format(res,txtFieldA, txtFieldB,txtFieldC, txtFieldD));
		
	}



}
