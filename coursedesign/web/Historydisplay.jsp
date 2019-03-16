<%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/9
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="Dao.order" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>历史订单</title>
    <%
        List<order>  history= (List<order>) request.getAttribute("history");
    %>
</head>
<body>
<h1>历史订单</h1>
<pre>订单编号   订单价格      订单状态    </pre>
<%for(order or:history){
%>
<%=or.getNo()%>  <%=or.getMoney()%> <%=or.getZhuangtai()%>
<br>
<%
    }%>
</body>
</html>
