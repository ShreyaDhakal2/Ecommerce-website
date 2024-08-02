package util;

import model.ProductModel;

public class StringUtils{
	public static final String INSERT_USER = "INSERT INTO user_info "
			+ "(user_name, first_name, last_name, dob, gender, email, phone_number, role, password) "
			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";	
	public static final String INSERT_PRODUCT = "INSERT INTO products_table (product_id, product_name, product_desc, price, quantity) VALUES (?, ?, ?, ?, ?)";
		
	
	public static final String GET_LOGIN_USER_INFO = "SELECT * FROM user_info WHERE user_name = ? ";
	public static final String GET_ALL_USER_INFO = " SELECT * FROM user_info WHERE user_name = ? AND password = ?";
	public static final String GET_USERNAME = "SELECT COUNT(*) FROM user_info WHERE user_name =?";
	public static final String GET_PHONE = "SELECT COUNT(*) FROM user_info WHERE phone_number = ?";
	public static final String GET_EMAIL = "SELECT COUNT(*) FROM user_info WHERE email = ?";
	

    public static final String USER_NAME ="username";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String BIRTHDAY = "birthday";
	public static final String GENDER = "gender";
	public static final String EMAIL = "email";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String ROLE = "role";
	public static final String PASSWORD= "password";
	public static final String RETYPE_PASSWORD = "retypePassword";
	
	
	//Start Servlet Route
		public static final String REGISTER_SERVLET = "/RegisterServlet";
		//END Servlet Route
		
		//Start messages
		public static final String SUCCESS_REGISTER_MESSAGE = "Successfully Registered!";
		public static final String REGISTER_ERROR_MESSAGE = "Please correct the form data.";
		public static final String SERVER_ERROR_MESSAGE = "An unexpected server error occured.";
		public static final String USERNAME_ERROR_MESSAGE= "Username is already registered.";
		public static final String EMAIL_ERROR_MESSAGE = "Email is already registerd.";
		public static final String PHONE_NUMBER_ERROR_MESSSAGE = "Phone number is already registerd.";
		public static final String PASSWORD_UNMATCHED_ERROR_MESSAGE ="Password is not matched.";
		public static final String ERROR_MESSAGE = "errorMesssage";
		public static final String SUCCESS_MEASSAGE ="successful message";
		public static final String MESSAGE= "message";
		public static final String PRODUCT_ADDED_MESSAGE= "product added successfully!";
		public static final String PRODUCT_FAILED_MESSAGE= "Failed to add product. Please try again.";
		
		
		// end message
		
		public static final String MESSAGE_SUCCESS_LOGIN = "Successfully LoggedIn!";
		public static final String MESSAGE_ERROR_LOGIN = "Either username or password is not correct!";
		public static final String MESSAGE_ERROR_CREATE_ACCOUNT = "Account for this username is not registered! Please create a new account.";
        
		public static final String MESSAGE_SUCCESS = "successMessage";
		public static final String MESSAGE_ERROR = "errorMessage";
		
		
		public static final String USER = "user";
		public static final String JSESSIONID = "JSESSIONID";
		
		
		
		//Start JSP Route
		public static final String ADMIN_LOGIN_PAGE = "/pages/AdminLogin.jsp";
		public static final String CUSTOMER_LOGIN_PAGE = "/pages/CustomerLogin.jsp";
		
		// Start: JSP Route
		public static final String PAGE_URL_LOGIN = "/pages/Login.jsp";
		public static final String PAGE_URL_REGISTER = "/pages/registerForm.jsp";
		public static final String PAGE_URL_WELCOME = "/pages/welcome.jsp";
		public static final String PAGE_URL_FOOTER = "pages/footer.jsp";
		public static final String PAGE_URL_HEADER = "pages/header.jsp";
		public static final String URL_LOGIN = "/login.jsp";
		public static final String URL_INDEX = "/index.jsp";
		// End: JSP Route	

		
		public static final String ADMIN_DASHBOARD = "/pages/dashboard.jsp";
		
		public static final String REGISTER_PAGE = "/pages/registerForm.jsp";
		public static final String DASHBOARD_PAGE = "/pages/dashboard.jsp";
		
		// End JSP Route

		
		
		
		
		
		
}
	