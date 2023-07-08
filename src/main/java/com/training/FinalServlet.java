package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
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
		HttpSession session = request.getSession(); // session object
		ServletContext application = getServletContext(); // applicatoin object
		String sessionValue  = (String)session.getAttribute("txtFieldA");
		session.invalidate();
		out.print("request :" + request.getAttribute("txtFieldA"));
		out.print("</br>session :" + sessionValue);
		out.print("</br> application :" + application.getAttribute("txtFieldA"));
		out.print("</br> Refresh the page for see the updated session values");
	}
}
