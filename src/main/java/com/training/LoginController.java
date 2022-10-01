package com.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LoginController")
@WebServlet(
		   name="LoginController",
		   description="Servlet with Annotation",
		   urlPatterns={"/LoginController","/LoginController1"},
		   initParams={@WebInitParam(name="param1",value="value1"),
			       @WebInitParam(name="param2",value="value2")}
		)
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		if(name.equals(password)) {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.print("Welcome to ducat"+"</br>");
			out.print("name" + name + "</br>");
			out.print("password" + password + "</br>");
			out.print("count" + count + "</br>");
			
			extractConfigInfo(out);
			extractContextInfo(out);

		}else {
			
			  RequestDispatcher rd = request.getRequestDispatcher("index.html");
			  rd.include(request, response);
			 
			//response.sendRedirect("index.html");
		}
	}

	private void extractConfigInfo(PrintWriter out) {
		ServletConfig config=getServletConfig(); 
		Enumeration<String> e=config.getInitParameterNames(); 
		  
		String str=""; 
		while(e.hasMoreElements()){ 
		str=e.nextElement(); 
		out.print("<br>Name: "+str); 
		out.print(" value: "+config.getInitParameter(str)); 
		}
	}
	
	private void extractContextInfo(PrintWriter out) {
		ServletContext context=getServletContext();
		String driverName=context.getInitParameter("dname");
		out.println("<br>driver name is="+driverName);
	}
}
