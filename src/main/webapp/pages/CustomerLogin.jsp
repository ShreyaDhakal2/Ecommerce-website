<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/LaptopGalaxy/stylesheets/login.css" />
</head>
<body>
	<div class="login-box">
		<h2>Customer Login Page</h2>
		<form action="../LoginServlet">
			<div class="row">
				<div class="col">
					<label for="username">userName:</label> 
					<input type="text" id="username" name="username" required>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<label for="password">Password:</label> 
					<input type="password" id="password" name="password" required>
				</div>
			</div>
			<button type="submit" class="login-button">Login</button>
		</form>
	</div>
</body>
</html>