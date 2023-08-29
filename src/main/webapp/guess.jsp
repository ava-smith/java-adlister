<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<div class="container">
    <form method="POST" action="guess">
        <label for="guessed-number">Guess the number between 1 and 3</label>
        <input type="text" id="guessed-number" name="guessed-number">
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
