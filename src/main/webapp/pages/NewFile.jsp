<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="util.StringUtils"%>    
    
 <%
String contextPath = request.getContextPath();
%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" type="text/css"
href="${pageContext.request.contextPath}/stylesheets/header.css" />
<link rel= "stylesheet" type="text/css"
href="${pageContext.request.contextPath}/stylesheets/footer.css" />

</head>
<body>
 <header>
        <a href="#" class="logo"><img src="Images/logo.png" alt=""></a>

        <ul class="navoption">
            <li><a href="#">Home</a></li>
            <li><a href="#">Shop</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">About us</a></li>
            <li><a href="#">Docs</a></li>
        </ul>

        <div class="navIcon">
            <a href="#"><i class="bx bx-search"></i></a>
            <a href="#"><i class="bx bx-user"></i></a>
            <a href="#"><i class="bx bx-cart"></i></a>
            <a href="#"><i class="bx bx-menu" id="menu-icon"></i></a>
        </div>
    </header>
    
<h2>Welcome to our Home Page!</h2>
	<a href="<%=contextPath + StringUtils.PAGE_URL_REGISTER%>">Register</a> OR
	<a href="<%=contextPath + StringUtils.CUSTOMER_LOGIN_PAGE%>">CustomerLogin</a> /
	<a href="<%=contextPath + StringUtils.ADMIN_LOGIN_PAGE%>">AdminLogin</a> 
<jsp:include page= "footer.jsp" />
</body>
</html>