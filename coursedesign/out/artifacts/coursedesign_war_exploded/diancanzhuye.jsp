<%@ page import="Dao.Caidan" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/4
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
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
    <h1>食堂订餐系统</h1>
</div>

<div id="nav">

    <img src="image/big.jpg" width="344" height="275"  alt=""/><br>
</div>

<div id="section">
    <ul><br>
        <li><a href="/CaiList">今日菜品</a>
        <li><a href="/menu.jsp">我的菜单(选择了菜之后才可访问)</a>
        <li><a href="/History"> 历史菜单</a>
        <li><a href="private.jsp" >我的个人首页</a>
    </ul>


</div>
<div id="footer">食堂点餐系统
</div>

<a href="https://jingyan.baidu.com/article/fb48e8be1450486e622e14bd.html">了解我们</a>
</body>
</html>
