package controller.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.DatabaseController;
import model.UserModel;

import util.StringUtils;

/**
 * Servlet implementation class myFirstServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = {StringUtils.REGISTER_SERVLET})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DatabaseController dbController = new DatabaseController();


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName= request.getParameter(StringUtils.USER_NAME);
		String firstName = request.getParameter(StringUtils.FIRST_NAME);
		String lastName = request.getParameter(StringUtils.LAST_NAME);
		String dobString = request.getParameter(StringUtils.BIRTHDAY);
		LocalDate dob = LocalDate.parse(dobString);
		String gender = request.getParameter(StringUtils.GENDER);
		String email = request.getParameter(StringUtils.EMAIL);
		String phoneNumber = request.getParameter(StringUtils.PHONE_NUMBER);
		String role = request.getParameter(StringUtils.ROLE);
		String password = request.getParameter(StringUtils.PASSWORD);
		String retypePassword = request.getParameter(StringUtils.RETYPE_PASSWORD);

		UserModel userModel = new UserModel(firstName, lastName, dob, gender, email, phoneNumber, role, userName, password);

		int result = dbController.addUser(userModel);

		if (password.equals(retypePassword)) {
			switch (result) {
			case 1 -> {
			request.setAttribute(StringUtils.SUCCESS_MEASSAGE, StringUtils.SUCCESS_REGISTER_MESSAGE);
            // Determine the redirect URL based on the role
            String redirectURL = null;
            if (role.equalsIgnoreCase("admin")) {
                redirectURL = StringUtils.ADMIN_LOGIN_PAGE;
            } else if (role.equalsIgnoreCase("user")) {
                    redirectURL = StringUtils.CUSTOMER_LOGIN_PAGE;
                }
           response.sendRedirect(request.getContextPath() + redirectURL);
                break;	
			//request.setAttribute(StringUtils.SUCCESS_MEASSAGE, StringUtils.SUCCESS_REGISTER_MESSAGE);
			//response.sendRedirect(request.getContextPath() + StringUtils.LOGIN_PAGE);
			}
		
			case 0 -> {
			//String errorMessage = "please correct the form data.";
			//request.getRequestDispatcher(request.getContextPath() + "/pages/register.jsp").forward(request, response);
			request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.REGISTER_ERROR_MESSAGE);
			request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
			}

			case -1 -> {
			//String errorMessage = "An unexpected server error occured.";
			//request.setAttribute("errorMessage", errorMessage);
			//request.getRequestDispatcher(request.getContextPath() + "/pages/register.jsp").forward(request, response);
			request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.SERVER_ERROR_MESSAGE);
			request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
			
			}
			
			case -2 -> {
			request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.USERNAME_ERROR_MESSAGE);
			request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
				
			}
			
			case -3 -> {
				request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.EMAIL_ERROR_MESSAGE);
				request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
				
			}
			case -4  -> {
				request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.PHONE_NUMBER_ERROR_MESSSAGE);
				request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
			}
			default -> {
				request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.SERVER_ERROR_MESSAGE);
				request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
				
				
			}



	} }else {
		request.setAttribute(StringUtils.ERROR_MESSAGE, StringUtils.SERVER_ERROR_MESSAGE);
		request.getRequestDispatcher(StringUtils.REGISTER_PAGE).forward(request, response);
		
		
		
	} }
	}
		

