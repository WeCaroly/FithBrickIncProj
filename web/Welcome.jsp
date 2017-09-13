<%@ page import="webapp.todo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="appLayer.User" %><%--
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
<p>Add items to the List!</p>
<form action="/todo" method="post">
    <input type="text" name="todoBox"/>
    <input type="submit" value="Submit" onclick=""/>
</form>
<%
    User user = new User();
    ArrayList<todo> List = user.getTodoUser();
   int i = 0;
   int max = List.size();
    request.setAttribute("eList",List);
%>
<%while(i<max) {%>
<%= i+1%>. <%=  List.get(i).getTodo()%>
<br/>
<% i++;} %>


</body>
</html>
