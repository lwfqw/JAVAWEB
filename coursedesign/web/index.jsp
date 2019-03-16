<%--
  Created by IntelliJ IDEA.
  User: 51915
  Date: 2019/1/4
  Time: 0:08
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
  <img src="image/3.jpg" width="344" height="275"  alt=""/><br>
  <br>
  <br>
</div>

<div id="section">
  <p>
  <p> <form method="post" action="/Login" >
  账号：<input type="text" name="no"><br>
  密码：<input type="password" name="password"><br>
  记住密码<input type="checkbox">
  <input type="submit" value="submit">
</form>
  </p>
</div>
<div id="footer">食堂点餐系统
</div>


</body>
</html>
