package com.zaid.check;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ZaidServletController")
public class ZaidServletController extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getParameter("user");
		Long user=Long.valueOf(request.getParameter("id"));
		PrintWriter writer = response.getWriter();
		writer.print("<h3>login succesfull</h3>");
		
	}

}
