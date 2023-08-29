<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
            response.sendRedirect("/viewcolor.jsp");
    }
%>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<div class="container">
    <form method="POST" action="pick-color">
        <label for="color-input">Please enter your favorite color:</label>
        <input type="text" id="color-input" name="fav-color">
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
