<%@ page import="Dao.SqlDao" %>
<%@ page import="Dao.order" %>
<%@ page import="Dao.Caidan" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/8
  Time: 16:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        String no= (String) request.getSession().getAttribute("no");
        String[]arr= (String[]) request.getSession().getAttribute("my");
        SqlDao sqlDao=new SqlDao();
        List<Caidan> detail=new ArrayList<>(sqlDao.getMyCaidan(arr));
        double num=0;
        for(Caidan caid:detail){
            num = num + caid.getPrice();
        }
    %>
    <style>
        #header {
            background-color:black;
            color:white;
            text-align:center;
            padding:5px;
        }
        #nav {
            line-height:30px;
            height:300px;
            width:650px;
            float:left;
            padding:5px;
        }
        #section {
            width:350px;
            float:left;
            padding:10px;
        }
        #footer {
            background-color:black;
            color:white;
            clear:both;
            text-align:center;
            padding:5px;
        }
    </style>
</head>

<body>

<div id="header">
    <h1>我的菜单</h1>
</div>

<div id="nav">
    <p><img src="image/big.jpg" width="310" height="271"  alt=""/><br>
    </p>
</div>

<div id="section">
    <h1>本次订单</h1><br><br>
    日期：<%=sqlDao.getSqlTime()%>
    单号（学号）：<%=no%><br><br>
    价格：<%=num%><br>
    <form method="post" action="/change">
    状态：未收到<input type="submit" value="我已收到">
    </form>
    <h3>详情</h3>
    <pre>订单号    价格</pre>
    <%for(Caidan c:detail){%>
    <%=c.getNo()%>  <%=c.getPrice()%><br>
    <%}%>

</div>
<div id="footer"><a href="diancanzhuye.jsp">首页</a>
</div>


</body>
</html>