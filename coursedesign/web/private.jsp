<%@ page import="Dao.User" %>
<%@ page import="Dao.SqlDao" %><%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/8
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        User user;
        user=new SqlDao().getprivate((String) request.getSession().getAttribute("no"));
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
    <h1>我的个人首页</h1>
</div>

<div id="nav">
    <p><img src="image/big.jpg" width="310" height="271"  alt=""/><br>
    </p>
</div>

<div id="section">
    <h1>个人信息</h1><br><br>
    姓名：<%=user.getName()%><br><br>
    账号：<%=user.getUno()%><br>
    专业：<%=user.getMajar()%>
</div>
<div id="footer">个人首页
</div>


</body>
</html>