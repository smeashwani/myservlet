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
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("textFieldA", txtFieldA);
		String resContent = """
				<form action="SecondServlet">
				Enter B: <input type="text" name="textFieldB" /></br>
				<input type="submit">
				</form>
				""";
		out.print(resContent);
		
	}

}
