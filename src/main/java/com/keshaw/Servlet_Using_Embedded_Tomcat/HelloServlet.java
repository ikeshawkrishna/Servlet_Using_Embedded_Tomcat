package com.keshaw.Servlet_Using_Embedded_Tomcat;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("In service");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>Hello world.....</h2>");
	}

}
