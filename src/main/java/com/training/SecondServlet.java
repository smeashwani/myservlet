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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String txtFieldA = (String)session.getAttribute("textFieldA");
		String txtFieldB = (String)session.getAttribute("textFieldB");
		PrintWriter out = response.getWriter();
		out.print("A=" + txtFieldA);
		out.print("B=" + txtFieldB);
		session.setAttribute("textFieldA",txtFieldA+"Replace");
		session.removeAttribute("textFieldB");
	}

}
