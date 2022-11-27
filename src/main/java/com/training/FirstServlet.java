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
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		HttpSession session = request.getSession();
		ServletContext application = getServletContext();
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
