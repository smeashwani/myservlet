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
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		HttpSession session = request.getSession();
		session.setAttribute("textFieldA", txtFieldA);
		session.setAttribute("textFieldB", txtFieldB);
		PrintWriter out = response.getWriter();
		out.print("A=" + txtFieldA);
		out.print("B=" + txtFieldB);
		out.print("<a href='SecondServlet'>SecondServlet </a>");
	}

}
