package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		String txtFieldC = request.getParameter("textFieldC");
		String txtFieldD = request.getParameter("textFieldD");
		
		PrintWriter out = response.getWriter();
		String res =""" 
				<form action="FinalServlet">
				<input type="hidden" name="textFieldA" value="%s"/>
				<input type="hidden" name="textFieldB" value="%s"/>
				<input type="hidden" name="textFieldC" value="%s"/>
				<input type="hidden" name="textFieldD" value="%s"/>
				Enter E: <input type="text" name="textFieldE" /> </br>
				Enter F: <input type="text" name="textFieldF" /> </br>
				<input type="submit">
				</form>
				""";
		
		out.print(String.format(res,txtFieldA, txtFieldB,txtFieldC, txtFieldD));
		
	}



}
