package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtFieldB = request.getParameter("textFieldB");
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		session.setAttribute("textFieldB", txtFieldB);
		String resContent =  """
				<form action="FinalServlet">
				Enter C: <input type="text" name="textFieldC" /></br>
				<input type="submit">
				</form>
				""";
		PrintWriter out = response.getWriter();
		out.print(resContent);
		
	}



}
