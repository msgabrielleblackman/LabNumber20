<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/15/2017
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>name</th>
        <th>description</th>
        <th>quantity</th>
        <th>price</th>

    </tr>
    <c:forEach items="${cList}" var="items">
        <tr>
            <td>
                    ${items.name}
            </td>
            <td>
                    ${items.description}
            </td>
            <td>
                    ${items.quantity}
            </td>
            <td>
                    ${items.price}
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
