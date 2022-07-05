<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if</title>
</head>
<body>
<%--
    c:if标签
        1.属性:
            test必须属性,接受boolean表达式
                如果表达式为true,则显示if标签体内容,如果为false,则不显示标签体内容
        2.注意:c:if标签没有else情况,想要else情况,则可以在定义一个c:if标签
--%>
<c:if test="true">
    我是真...
</c:if>
<br>
<%
    //判断一个request域中的一个list集合是否为空,如果不为null则显示遍历集合
    List list = new ArrayList();
    list.add("李四");
    request.setAttribute("list", list);
    request.setAttribute("number", 4);
%>
<c:if test="${not empty list}">
    遍历集合
</c:if>
<br>
<c:if test="${number%2!=0}">
    ${number}为奇数
</c:if>
<c:if test="${number%2==0}">
    ${number}为偶数
</c:if>
</body>
</html>
