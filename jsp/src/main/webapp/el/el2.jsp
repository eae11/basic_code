<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name", "李四");
    request.setAttribute("name", "zhangsan");
    session.setAttribute("age", "23");
%>
<h3>el获取值</h3>
${requestScope.name}<br>
${sessionScope.age}<br>
${name}<br>
</body>
</html>
