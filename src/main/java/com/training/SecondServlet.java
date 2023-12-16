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
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String txtFieldA = request.getParameter("textFieldA");
		String txtFieldB = request.getParameter("textFieldB");
		String txtFieldC = request.getParameter("textFieldC");
		response.setContentType("text/html");
		String res  = """
				<form action="FinalServlet">
				Enter D: <input type="text" name="textFieldD" id="textFieldD" /></br>
				<input type="button"  onclick="FinalServlet()" value="submit" />
				</form>
				<script>
            function FinalServlet(){
                d = document.getElementById("textFieldD").value;
                location.href = "FinalServlet?textFieldA=%s&textFieldB=%s&textFieldC=%s&textFieldD="+d;
            }
        </script>
				""";
		PrintWriter out = response.getWriter();
		out.print(res.formatted(txtFieldA,txtFieldB,txtFieldC));
		
	}



}
