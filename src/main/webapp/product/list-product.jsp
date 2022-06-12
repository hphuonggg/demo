<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 6/12/2022
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>helloo</h1>
<c:forEach var="p" items="${products}">
    <h1>${p.name}, ${p.price}</h1>
</c:forEach>

<h2>tui khong phai la phuong ne</h2>
</body>
</html>
