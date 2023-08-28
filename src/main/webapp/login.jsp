<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <input id="password-field" type="text" name="password" placeholder="Enter your password">
    <button type="submit">Submit</button>
</form>

<c:if test="${param.username == 'admin' and param.password == 'password'}">
    <jsp:forward page="index.jsp" />
</c:if>

</body>
</html>
