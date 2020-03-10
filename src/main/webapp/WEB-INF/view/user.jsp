<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Adress</th>
               
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    
                    <td><c:out value="${user.name}" /></td>
                    <td><c:out value="${user.age}" /></td>
                    <td><c:out value="${user.adress}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>