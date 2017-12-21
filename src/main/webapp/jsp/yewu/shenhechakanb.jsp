<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<script language="javascript" type="text/javascript"
			src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns:v="urn:schemas-microsoft-com:vml" xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40">
 <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="ProgId" content="Excel.Sheet"/>
  <meta name="Generator" content="WPS Office ET"/>
  <link id="Main-File" rel="Main-File" href="../工程部项目查勘表.htm"/>
  <link rel="File-List" href="filelist.xml"/>
  <link rel="Stylesheet" href="stylesheet.css"/>
  <style>
<!-- @page
	{margin:0.75in 0.71in 0.75in 0.71in;
	mso-header-margin:0.32in;
	mso-footer-margin:0.32in;}
 -->  </style>
 
 
 </head>
 <body link="blue" vlink="purple">
 <s:form action="chakanAction_add.action" enctype="multipart/form-data" method="post">
  <table width="825" border="0" cellpadding="0" cellspacing="0" style='width:618.75pt;border-collapse:collapse;table-layout:fixed;'>
   <col width="158" style='mso-width-source:userset;mso-width-alt:5056;'/>
   <col width="667" style='mso-width-source:userset;mso-width-alt:21344;'/>
   <col width="72" span="16" style='width:54.00pt;'/>
   <col width="119" style='mso-width-source:userset;mso-width-alt:3808;'/>
   <tr height="30" style='height:22.50pt;'>
    <td class="xl66" height="30" width="825" colspan="2" style='height:22.50pt;width:618.75pt;border-right:none;border-bottom:none;' x:str><h1>江西四联电力工程部项目查勘表</h1></td>
   </tr>
   <tr height="51" class="xl65" style='height:38.25pt;mso-height-source:userset;mso-height-alt:765;'>
    <td class="xl67" height="51" style='height:38.25pt;' x:str>填报人</td>
    <td class="xl68"><s:textarea name="tbr" style="width:200;height:70s"></s:textarea></td>
   </tr>
   <tr height="51" class="xl65" style='height:38.25pt;mso-height-source:userset;mso-height-alt:765;'>
    <td class="xl69" height="51" style='height:38.25pt;' x:str>查勘项目名称</td>
    <td class="xl68"><s:textarea name="ckxmmc" style="width:200;heigth:70"></s:textarea></td>
   </tr>
   <tr height="51" class="xl65" style='height:38.25pt;mso-height-source:userset;mso-height-alt:765;'>
    <td class="xl69" height="51" style='height:38.25pt;' x:str>查勘项目地点</td>
    <td class="xl68"><s:textarea name="ckxmdd" style="width:200;heigth:70"></s:textarea></td>
   </tr>
   <tr height="51" class="xl65" style='height:38.25pt;mso-height-source:userset;mso-height-alt:765;'>
    <td class="xl69" height="51" style='height:38.25pt;' x:str>查勘日期</td>
    <td class="xl68"><s:textarea name="ckrq" style="width:200;heigth:70"></s:textarea></td>
   </tr>
   <tr height="51" class="xl65" style='height:38.25pt;mso-height-source:userset;mso-height-alt:765;'>
    <td class="xl69" height="51" style='height:38.25pt;' x:str>查勘人员</td>
    <td class="xl68"><s:textarea name="ckry" style="width:200;height:40"></s:textarea></td>
   </tr>
   <tr height="61" class="xl65" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
    <td class="xl69" height="61" style='height:45.75pt;' x:str>查勘线路名称</td>
    <td class="xl68"><s:textarea name="ckxlmc" style="width:200;height:40"></s:textarea></td>
   
   <tr height="108" class="xl65" style='height:81.00pt;mso-height-source:userset;mso-height-alt:1620;'>
    <td class="xl69" height="108" style='height:81.00pt;' x:str>意见</td>
    <td class="xl68"><s:textarea name="yj" style="width:700;height:110"></s:textarea></td>
   </tr>
   <tr height="107" class="xl65" style='height:80.25pt;mso-height-source:userset;mso-height-alt:1605;'>
    <td class="xl69" height="107" style='height:80.25pt;' x:str>备注</td>
    <td class="xl68"><s:textarea name="bz" style="width:700;height:110"></s:textarea></td>
   </tr>
   <tr height="19" class="xl65" style='height:14.25pt;'>
    <td class="xl65" height="19" colspan="2" style='height:14.25pt;mso-ignore:colspan;'></td>
   </tr>
   <tr height="19" class="xl65" style='height:14.25pt;'>
    <td class="xl65" height="19" colspan="2" style='height:14.25pt;mso-ignore:colspan;'></td>
   </tr>
   </tr>
  
  </table>
  <input type="submit" value="提交"/>
  
   <img  src="${pageContext.request.contextPath }/<s:property value="gdfatPath"/>"  style="width:300; height:300px"  >
   <img  src="${pageContext.request.contextPath }/<s:property value="dhdfatPath"/>"  style="width:300; height:300px"  >
 </s:form>
 </body>
</html>