package com.zaid.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("request recieved in servlet 1");
		String parameter = request.getParameter("search");
		response.sendRedirect("https://www.google.com/search?q="+parameter);
		System.out.println("request send from servlet 1 to srrvlet2");
		PrintWriter writer = response.getWriter();
		writer.print("<h1>response comes from servlet1</h1>");
		//  
		
		
	}

}
	