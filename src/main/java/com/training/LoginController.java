package com.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LoginController")
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
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("Welcome to ducat"+"</br>");
		out.print("name" + name + "</br>");
		out.print("password" + password + "</br>");
		out.print("count" + count + "</br>");
	}

}
