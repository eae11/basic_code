<%@ page import="domain.User" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = new User();
    user.setName("张三");
    user.setAge(12);
    user.setBirthday(new Date());
    request.setAttribute("user", user);
    List list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");
    list.add(user);
    request.setAttribute("list", list);
    Map map = new HashMap();
    map.put("sname", "李四");
    map.put("gender", "男");
    map.put("user", user);
    request.setAttribute("map", map);
%>
<h1></h1>
${requestScope.user}
<%--
通过的是对象的属性来获取
setter或getter方法,去掉set或get,在将剩余部分,首字母变为小写
setName-->Name-->name
--%>
<h3>el获取对象中的值</h3>
${requestScope.user.name}<br>
${requestScope.user.age}<br>
${requestScope.user.birthday}<br>
${requestScope.user.birthday.month}<br>
${requestScope.user.birthday.year}<br>
${requestScope.user.birStr}<br>
<h3>el获取List值</h3>
${list}<br>
${list[0]}<br>
${list[1]}<br>
${list[10]}<br>
${list[2].name}<br>
${map.gender}<br>
${map["gender"]}<br>
${map.user.name}<br>

</body>
</html>
