package com.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Instant;

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
		response.setIntHeader("refresh", 5);
		PrintWriter out = response.getWriter();
		out.print("A=" + txtFieldA);
		out.print("B=" + txtFieldB);
		out.print("<a href='/SecondServlet' >SecondServlet </a>");
		out.print(Instant.now());
	}

}
