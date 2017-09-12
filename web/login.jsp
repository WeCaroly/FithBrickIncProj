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
    <title>Log in</title>
</head>
<body>
<h1>Please Log in</h1>
<form action="/login" method="post">
    login- name: <input type="text" name="loginname" width="38"/>
    password: <input type="text" name="password" width="10"/>
    <input type="submit" value="Login"/>
</form>

<p style="color: red">${errorMessage}</p>
</body>
</html>
