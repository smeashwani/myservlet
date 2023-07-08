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
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		HttpSession session = request.getSession(); // session object
		ServletContext application = getServletContext(); // application object
		// set in request scope
		request.setAttribute("txtFieldA", (String) txtFieldA);
		// set in session scope
		session.setAttribute("txtFieldA",(String)  txtFieldA);
		// set in application scope
		application.setAttribute("txtFieldA",(String)  txtFieldA);
		
		PrintWriter out = response.getWriter();
		String str = "All Values has been set in attibute </br><a href='%s'> Second Servlet </a>";
		out.print(str.format(str, "SecondServlet"));
		
	}

}
