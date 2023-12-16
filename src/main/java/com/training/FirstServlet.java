package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
		String res ="""
				<form action="SecondServlet">
				Enter C: <input type="text" name="textFieldC" id="textFieldC" /></br>
				<input type="button"  onclick="secondServlet()" value="submit" />
				</form>
				<script>
            function secondServlet(){
                c = document.getElementById("textFieldC").value;
                location.href = "SecondServlet?textFieldA=%s&textFieldB=%s&textFieldC="+c;
            }
        </script>
				""";
		out.print(res.formatted(txtFieldA,txtFieldB));
		
	}

}
