package com.bogdan.assign2.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bogdan.assign2.model.User;
import com.bogdan.assign2.service.LoginService;

public class LoginServlet extends HttpServlet {

	private LoginService userService = new LoginService();

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			User user = new User();
			user.setUsername(request.getParameter("username"));
			user.setPassword(request.getParameter("userpass"));

			user = userService.login(user);

			if (user != null) {

				HttpSession session = request.getSession(true);
				session.setAttribute("currentSessionUser", user);

				if (user.getUserRole().name().equals("CLIENT")) {
					response.sendRedirect("home.jsp");
				} // logged-in page
				else if (user.getUserRole().name().equals("ADMIN")) {
					response.sendRedirect("admin.jsp");
				} else {
					response.sendRedirect("403.jsp");
				}
			} else {
				response.sendRedirect("403.jsp"); // error page
			}
		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}
}
