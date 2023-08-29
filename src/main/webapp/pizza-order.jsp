<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<div class="container">
    <h1>Order Here:</h1>

    <form method="POST" action="order">
        <div class="select-field">
            <label for="crust">Choose your crust:</label>
            <select name="crust" id="crust">
                <option value="flatbread">Flatbread</option>
                <option value="regular">Regular</option>
                <option value="deep-dish">Deep Dish</option>
            </select>
        </div>

        <div class="select-field">
            <label for="sauce">Choose your sauce:</label>
            <select name="sauce" id="sauce">
                <option value="red-sauce">Red Sauce</option>
                <option value="white-sauce">White Sauce</option>
                <option value="no-sauce">No Sauce</option>
            </select>
        </div>

        <div class="select-field">
            <label for="size">Choose your size:</label>
            <select name="size" id="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
            </select>
        </div>

        <h2>Choose your toppings:</h2>
        <div class="toppings-checkboxes">
            <label for="cheese">Cheese</label>
            <input type="checkbox" id="cheese" name="toppings">
            <label for="pepperoni">Pepperoni</label>
            <input type="checkbox" id="pepperoni" name="toppings">
            <label for="sausage">Sausage</label>
            <input type="checkbox" id="sausage" name="toppings">
            <label for="jalapenos">Jalapeños</label>
            <input type="checkbox" id="jalapenos" name="toppings">
            <label for="mushrooms">Mushrooms</label>
            <input type="checkbox" id="mushrooms" name="toppings">
        </div>

        <div class="delivery-address-field">
            <label for="delivery-address">Please enter your address:</label>
            <input type="text" id="delivery-address" name="delivery-address">
        </div>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
