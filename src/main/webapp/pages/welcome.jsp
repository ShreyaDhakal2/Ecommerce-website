<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="util.StringUtils" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/LaptopGalaxy/stylesheets/welcome.css" />
</head>
<body>
<%
String userSession = (String) session.getAttribute(StringUtils.USER_NAME);
String cookieUsername = null;
String cookieSessionID = null;
Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie cookie: cookies){
		if(cookie.getName().equals(StringUtils.USER)) cookieUsername = cookie.getValue();
		if(cookie.getName().equals(StringUtils.JSESSIONID)) cookieSessionID = cookie.getValue();
	}
}
%>
<div class="welcome-container">
<h1>Hello <%=cookieUsername %>. welcome to our page!</h1>
<h3>Cookie session Id is <%=cookieSessionID %></h3>
<p>Session username: <%=userSession %></p>
<a href= "${pageContext.request.contextPath}/index.jsp">
<button class="home-button">Continue to Home Page</button>
</a>
</div>
</body>
</html>