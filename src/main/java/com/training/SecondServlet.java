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
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();  // session obj
		ServletContext application = getServletContext(); // application obj
		out.print("request :" + (String) request.getAttribute("txtFieldA"));
		out.print("</br>session :" + (String) session.getAttribute("txtFieldA"));
		out.print("</br> application :" + (String) application.getAttribute("txtFieldA"));
		String str = "<a href='%s'> Final Servlet </a>";
		out.print(str.format(str, "FinalServlet"));
	}



}
