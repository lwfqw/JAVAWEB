<%@ page import="java.util.List" %>
<%@ page import="Dao.Caidan" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/8
  Time: 14:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>点餐</title>

</head>
<body>
<%
    List<Caidan> table= (List<Caidan>) request.getAttribute("table");
%>
<form action="/order" method="post">
<%for(Caidan c:table){
    %>
    <pre>
<%=c.getNo()%><%=c.getName()%><%=c.getKiwi()%><%=c.getPrice()%><%=c.getMade()%>
<input type="checkbox" name="boxes" value="<%=c.getNo()%>"><br>
   </pre>
<%
}
%>
    <input type="submit" value="提交菜单">
</form>
<p>提交后将自动校园卡付款</p>
</body>
</html>
