<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<html>
<head>
    <title>Top</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/blue/top.css" />
</head>

<body class="PageBody" style="margin:0">
 
	<div id="Head1">
		<div id="Logo">
			<a id="msgLink" href="javascript:void(0)"></a>
			<img  src="${pageContext.request.contextPath}/image/logo.jpg" style="width:20px;height:20px">
            <font color="#0000CC" style="color:#F1F9FE; font-size:28px; font-family:Arial Black, Arial">江西四联 OA</font> 
			<!--<img border="0" src="${pageContext.request.contextPath}/css/blue/images/logo.png" />-->
        </div>
		
		<div id="Head1Right">
			<div id="Head1Right_UserName">
                <img border="0" width="13" height="14" src="${pageContext.request.contextPath}/css/images/top/user.gif" />您好: <font color="yellow">${ sessionScope.user.username}</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<div id="Head1Right_UserDept"></div>
			<%--
			<div id="Head1Right_UserSetup">
            	 <a href="javascript:void(0)">
					<img border="0" width="13" height="14" src="${pageContext.request.contextPath}/css/images/top/user_setup.gif" /> 个人设置
				</a> 
			</div>
			<div id="Head1Right_Time"></div>
			--%>
		</div>
		
        <div id="Head1Right_SystemButton">
            <a target="_parent" href="userAction_loginOut.action">
				<img width="78" height="20" alt="退出系统" src="${pageContext.request.contextPath}/css/blue/images/top/logout.gif" />
			</a>
        </div>
		<!-- 
        <div id="Head1Right_Button">
            <a target="desktop" href="/desktop?method=show">
				<img width="65" height="20" alt="显示桌面" src="${pageContext.request.contextPath}/css/blue/images/top/desktop.gif" />
			</a>
        </div>
         -->
	</div>
    
    <div id="Head2">
        <div id="Head2_Awoke">
            <ul id="AwokeNum">
                <li><a target="desktop" href="javascript:void(0)">
                		
						<img border="0" width="11" height="13" src="${pageContext.request.contextPath}/css/images/top/msg.gif" /> 
						<a href="${pageContext.request.contextPath}/yijian.jsp" target="right">意见箱</a>
						<span id="msg"></span>
					</a>
				</li>
            <!-- 
                <li><a target="desktop" href="javascript:void(0)">
						<img border="0" width="11" height="13" src="${pageContext.request.contextPath}/css/images/top/msg.gif" /> 消息
						<span id="msg"></span>
					</a>
				</li>
                <li class="Line"></li>
                <li><a target="desktop" href="javascript:void(0)">
						<img border="0" width="16" height="11" src="${pageContext.request.contextPath}/css/images/top/mail.gif" /> 邮件
						<span id="mail"></span>
					</a>
				</li>
                <li class="Line"></li>
                -->
				  <!-- 是否有待审批文档的提示1，数量 -->
                <!--
                <li>
                	<a href="chuchaiAction_shenpi.action" target="right" onload="">
                		<img border="0" width="12" height="14" src="${pageContext.request.contextPath}/css/images/top/wait.gif" /> 
                		待办事项（<span id="wait" class="taskListSize"></span>）
                	</a> 
                </li>
                 -->
				  
                <!-- 是否有待审批文档的提示2，提示审批 -->
              <!--
                <li id="messageArea"></li>
            </ul>
        </div>
        
		 <div id="Head2_FunctionList">
			<marquee style="WIDTH: 100%;" onMouseOver="this.stop()" onMouseOut="this.start()" 
				scrollamount=1 scrolldelay=30 direction=left>
				<b>这是滚动的消息</b>
			</marquee>
		</div>
		-->
		
	</div>

</body>
</html>
