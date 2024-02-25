package com.zaid.ecommerce;
	import java.io.IOException;
	import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	public class ElectronicsClass extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			ServletContext sc = getServletContext();
			String ip = sc.getInitParameter("offer");
			ServletConfig scc = getServletConfig();
			String discount = scc.getInitParameter("discount");
			writer.print(ip);
			writer.print("<br>discount on electronics"+discount);
			//its electronics product class
			
		}

	}

