package com.nse.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nse.model.UserDetails;

/**
 * Servlet implementation class UserHomeServlet
 */
@WebServlet("/UserHomeServlet")
public class UserHomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		UserDetails userDetails = (UserDetails) session.getAttribute("userdetails");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>  Hello "+ userDetails.getName()  + "</h1>");
		out.println("<form action=LogoutServlet>");
		out.println("<input type=submit value=logout />");
		out.println("<form>");
		
		
	}

}
