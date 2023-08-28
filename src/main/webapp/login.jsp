<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<c:if test="${param.username.equals('admin') and param.password.equals('password')}">--%>
<%--    <jsp:forward page="profile.jsp" />--%>
<%--</c:if>--%>
<% if(request.getMethod().equalsIgnoreCase("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("admin") && password.equals("password"))
        response.sendRedirect("/profile.jsp");
    }
%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%@ include file="partials/navabr.jsp"%>
<h2>Please Login</h2>
<form method="POST" action="login.jsp">
    <label for="username-field">Username</label>
    <input id="username-field" type="text" name="username" placeholder="Enter your username">
    <label for="password-field">Password</label>
    <input id="password-field" type="password" name="password" placeholder="Enter your password">
    <button type="submit">Submit</button>
</form>

</body>
</html>
