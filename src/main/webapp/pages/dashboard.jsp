<%@page import="util.StringUtils" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <!-- Include your CSS file -->
    <link rel="stylesheet" href="../stylesheets/dashboard.css">
</head>
<body>
 
   
   <%-- Display error message if it exists --%>
	<%
	String message = (String) request.getAttribute(StringUtils.MESSAGE);
	
	if (message != null && !message.isEmpty()) {
		
	%>
	<p class="message"><%=message%></p>
	<%
	}
	%>
        <h1>Add Product</h1>
        <form id="productForm" action="../AddProductServlet" method="POST">
        
           <label for="product_id">Product Id:</label>
            <input type="text" id="product_id" name="product_Id" required>
           
            <label for="product_name">Product Name:</label>
            <input type="text" id="product_name" name="product_name" required>

            <label for="product_desc">Description:</label>
            <textarea id="product_desc" name="product_desc" rows="4" cols="50" required></textarea>

            <label for="price">Price:</label>
            <input type="number" id="price" name="price" step="0.01" required>

            <label for="quantity">Quantity:</label>
            <input type="number" id="quantity" name="quantity" required>

            <input type="submit" value="Add Product">
        </form>
   
</body>
</html>