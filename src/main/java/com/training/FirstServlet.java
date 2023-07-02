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
		String txtFieldB = request.getParameter("textFieldB");
		PrintWriter out = response.getWriter();
		
		String res  = """
				<form action="SecondServlet">
				<input type="hidden" name="textFieldA" value="%s" />
				<input type="hidden" name="textFieldB" value="%s"/>
				Enter c: <input type="text" name="textFieldC" /></br>
				Enter d: <input type="text" name="textFieldD" /></br>
				<input type="submit">
				</form>""";
		
		out.print(String.format(res,txtFieldA, txtFieldB));
		
	}

}
