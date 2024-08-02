package controller.servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.DatabaseController;

import util.StringUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	DatabaseController dbController = new DatabaseController();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String password = request.getParameter("password");

		int loginResult = dbController.getUserLoginInfo(userName, password);
		System.out.println("loginResult=" + loginResult);

		String roleDb = dbController.getUserRole(userName);
		String redirectURL;

		if (loginResult == 1) {
		    HttpSession userSession = request.getSession();
		    userSession.setAttribute("username", userName);
		    userSession.setMaxInactiveInterval(30 * 30);

		    Cookie userCookie = new Cookie("user", userName);
		    userCookie.setMaxAge(30 * 60);
		    response.addCookie(userCookie);

		    if (roleDb != null && !roleDb.isEmpty()) {
		        if (roleDb.equalsIgnoreCase("admin")) {
		            redirectURL = "/pages/dashboard.jsp"; // Path to admin dashboard JSP
		            
		            
		        } else if (roleDb.equalsIgnoreCase("user")) {
		            redirectURL = "/pages/welcome.jsp"; // Path to user welcome JSP
		        } else {
		            redirectURL = "/pages/registerForm.jsp"; // Default redirect if role is neither admin nor user
		        }
		    
		request.setAttribute(StringUtils.MESSAGE_SUCCESS, StringUtils.MESSAGE_SUCCESS_LOGIN);
		response.sendRedirect(request.getContextPath() + redirectURL);}}}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Extract username and password from the request parameters
		doGet(request, response);
	}

	

}

