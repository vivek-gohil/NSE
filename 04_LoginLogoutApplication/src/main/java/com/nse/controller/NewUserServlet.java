package com.nse.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nse.model.UserDetails;

@WebServlet("/NewUserServlet")
public class NewUserServlet extends HttpServlet {

	private String userId;
	private String userName;
	private String password;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		userId = request.getParameter("newtxtlogin");
		password = request.getParameter("newtxtpass");
		userName = request.getParameter("newtxtuser");

		UserDetails userDetails = new UserDetails(userId, userName, password);

		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("userdetails", userDetails);

		response.sendRedirect("usersuccess.html");
	}

}
