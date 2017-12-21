<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<HTML>
<HEAD>
    <META http-equiv=Content-Type CONTENT="text/html; charset=gbk" />
	<TITLE>四联OA</TITLE>
	<LINK HREF="${pageContext.request.contextPath}/css/blue/login.css" type=text/css rel=stylesheet />
</HEAD>

<BODY LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 CLASS=PageBody >
<s:form action="yijianAction_add.action">
	<font ><h1>请填写你对本系统的意见</h1></font> <br>
	<s:textarea name="yijian" style="width:300px;height:300px"></s:textarea>
    <s:submit value="提交"></s:submit>
</s:form>
</BODY>

</HTML>
