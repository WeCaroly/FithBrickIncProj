<%--
  Created by IntelliJ IDEA.
  User: carol_8wybosj
  Date: 9/12/2017
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Todo</h1>
<p>Hello! ${username}</p>
<form action="/todo" method="post">
    <input type="text" value="todo"/>
    <input type="submit"/>
</form>

</body>
</html>
