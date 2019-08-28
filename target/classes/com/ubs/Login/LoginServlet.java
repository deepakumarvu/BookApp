package com.ubs.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		PrintWriter printWriter=response.getWriter();
		if(uname.equals("deepak") && pass.equals("123456")) {
			printWriter.println("<font color=\"green\"><h2>Login Successful</h2></font>");
		    RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		    rd.forward(request,response);
		}
		else {
		    printWriter.println("<font color=\"red\"><h3>Login Un-successful</h3></font>");
		    RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		    rd.include(request,response);
		}
	}

}
