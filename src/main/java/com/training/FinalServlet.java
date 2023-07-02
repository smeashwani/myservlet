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
@WebServlet("/FinalServlet")
public class FinalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(30); // wait to 30 sec to see the expired values
		//session.invalidate();
		String a =(String)session.getAttribute("textFieldA");
		String b =(String)session.getAttribute("textFieldB");
		out.print("A: " + a + "</br>");
		out.print("B: " + b + "</br>");
		out.print("C: " + request.getParameter("textFieldC") + "</br>");
	}
}
