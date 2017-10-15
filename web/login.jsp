<%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 9/12/2017
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Log In</title>
</head>
<body style="background-color: #2E2E2E; position: fixed; top: 40%; left: 50%; transform: translate(-50%, -50%);">
<h1>Log In</h1>
<form action="/login" method="post">
    login-name:&nbsp;<input type="text" name="loginname" width="38"/>
    <br><br>
    &nbsp;&nbsp;&nbsp;password:&nbsp;<input type="text" name="password" width="10"/>
    <br><br>
    <input type="image" value="Submit" src="http://www.pngmart.com/files/3/Submit-Button-Transparent-PNG.png"
        	style="width: 200px; padding-bottom: 50px;"/>
</form>

<p style="color: red">${errorMessage}</p>
</body>
</html>
