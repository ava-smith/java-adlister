<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Here are all the ads!</h1>
<ul>
    <c:forEach var="ad" items="${ads}">
        <li>${ad.title}: ${ad.description}</li>
    </c:forEach>
</ul>
</body>
</html>
