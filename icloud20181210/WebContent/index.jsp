<%@  page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>ロジスティックスcloud系統</title>
	<meta http-equiv="pragma" content="no-cache">  
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="scripts/softkeyboard.js"></script>

  </head>
  <body>
    <a href="lmm101Controller/init">組織一覧照会(LMM101)</a><br>
    <a href="lmm117Controller/initPage">組織一覧照会(LMM117)</a><br>
    <a href="http://localhost:8080/icloud20181210/lmm117Controller/findAll">組織一覧照会(LMM117)</a><br>
  </body>
</html>
