<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shenqing.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <a href="${pageContext.request.contextPath }/jsp/yewu/chuchaib2.jsp">出差业务汇报表</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath}/jsp/yewu/kehuziyuan.jsp">周拜访计划</a><br><br>
    <a href="${pageContext.request.contextPath}/jsp/yewu/chakanb.jsp">现场查勘表</a>
    
  </body>
</html>
