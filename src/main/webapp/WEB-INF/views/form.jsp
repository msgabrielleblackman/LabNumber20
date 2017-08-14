
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}
<form action="formhandler" method="post">
    <fieldset>
        <legend>Personal information:</legend>

    First Name:<br>
    <input type="text" name="firstname"><br>

    Last Name:<br>
    <input type="text" name="lastname"><br>

    Email:<br>
    <input type="text" name="email"><br>

    Phone Number:<br>
    <input type="text" name="phonenumber"><br>

    Password:<br>
    <input type="text" name="password"><br><br>

    <input type="submit" name="Register" value="Register">

    </fieldset>


</form>
</body>
</html>
