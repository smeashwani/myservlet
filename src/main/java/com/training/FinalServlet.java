package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		String sessionValue  = (String)session.getAttribute("txtFieldA");
		session.invalidate();
		ServletContext application = getServletContext();
		out.print("request :" + request.getAttribute("txtFieldA"));
		out.print("</br>session :" + sessionValue);
		out.print("</br> application :" + application.getAttribute("txtFieldA"));
		out.print("</br> Refresh the page for see the updated session values");
	}
}
