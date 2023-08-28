<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Please Login</h1>
<form method="POST" action="login.jsp">
    <input type="text" name="username" placeholder="Enter your username">
    <input type="text" name="password" placeholder="Enter your password">
    <button type="submit">Submit</button>
</form>

<c:if test="${param.username == 'admin' and param.password == 'password'}">
    <jsp:forward page="index.jsp" />
</c:if>

</body>
</html>
