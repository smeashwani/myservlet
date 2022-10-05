package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<form action=\"FinalServlet\">\r\n"
				+ "		<input type=\"hidden\" name=\"textFieldA\" value=" +txtFieldA +">"
				+ "		<input type=\"hidden\" name=\"textFieldB\" value=" +txtFieldB +">"
				+ "		Enter C: <input type=\"text\" name=\"textFieldC\" /></br>\r\n"
				+ "		<input type=\"submit\">\r\n"
				+ "	</form>");
		
	}



}
