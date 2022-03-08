package com.nse.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nse.model.UserDetails;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private String userId;
	private String password;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("userdetails") != null) {
			UserDetails userDetails = (UserDetails) session.getAttribute("userdetails");

			userId = request.getParameter("txtlogin");
			password = request.getParameter("txtpass");

			if (userDetails.getUserId().equals(userId) && userDetails.getPassword().equals(password)) {
				response.sendRedirect("UserHomeServlet");
			}
		} else {
			response.sendRedirect("invaliduser.html");
		}
	}

}
