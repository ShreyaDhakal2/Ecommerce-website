<%@page import="util.StringUtils" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../stylesheets/registerForm.css" />
</head>
<body>
<div class="container">
	
	<%-- Display error message if it exists --%>
	<%
	String errorMessage = (String) request.getAttribute(StringUtils.ERROR_MESSAGE);
	
	if (errorMessage != null && !errorMessage.isEmpty()) {
		
	%>
	<p class="error-message"><%=errorMessage%></p>
	<%
	}
	%>
	
		<h1>Registration Form</h1>
		<form action="/LaptopGalaxy/RegisterServlet" method="post">
			<div class="row">
				<div class="col">
					<label for="firstName">First Name:</label> <input type="text"
						id="firstName" name="firstName" required>
				</div>
				<div class="col">
					<label for="lastName">Last Name:</label> <input type="text"
						id="lastName" name="lastName" required>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="username">userName:</label> <input type="text"
						id="username" name="username" required>
				</div>
				<div class="col">
					<label for="birthday">Birthday:</label> <input type="date"
						id="birthday" name="birthday" required>
				</div>

			</div>
			<div class="row">
				<div class="col">
					<label for="gender">Gender:</label> <select id="gender"
						name="gender" required>
						<option value="male">Male</option>
						<option value="female">Female</option>
					</select>
				</div>
				<div class="col">
					<label for="email">Email:</label> <input type="email" id="email"
						name="email" required>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="phoneNumber">Phone Number:</label> <input type="tel"
						id="phoneNumber" name="phoneNumber" required>
				</div>
				<div class="col">
					<label for="role">Role:</label> <select id="subject"
						name="role" required>
						<option value="admin">Admin</option>
						<option value="user">User</option>
						
					</select>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="password">Password:</label> <input type="password"
						id="password" name="password" required>
				</div>
				<div class="col">
					<label for="retypePassword">Retype Password:</label> <input
						type="password" id="retypePassword" name="retypePassword" required>
				</div>
			</div>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</body>
</html>