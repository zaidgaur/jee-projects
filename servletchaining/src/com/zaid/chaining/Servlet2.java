package com.zaid.chaining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("request recieved in servlet2 comes from servlet1");
		PrintWriter writer = response.getWriter();
		writer.print("<h1> actual response comes from servlet2 using send redirect method </h1><br>");
		System.out.println("servlet 2 send back the response to servlet 1 ");
		
		
		
	}

}
