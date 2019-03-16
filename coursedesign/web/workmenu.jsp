<%@ page import="java.util.List" %>
<%@ page import="Dao.order" %>
<%@ page import="Dao.SqlDao" %><%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/10
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<order> all=new SqlDao().getallorder();
%>
<%for(order t:all){%>
<pre>订单号     价格
    <%=t.getNo()%>     <%=t.getMoney()%>
</pre>
<%}%>
</body>
</html>
