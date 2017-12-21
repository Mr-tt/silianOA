<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns:v="urn:schemas-microsoft-com:vml"
xmlns:o="urn:schemas-microsoft-com:office:office"
xmlns:x="urn:schemas-microsoft-com:office:excel"
xmlns="http://www.w3.org/TR/REC-html40">

<head>
<meta http-equiv=Content-Type content="text/html; charset=x-mac-chinesesimp">
<meta name=ProgId content=Excel.Sheet>
<meta name=Generator content="Microsoft Excel 15">
<link rel=File-List href="下周客户拜访信息.fld/filelist.xml">
<style>
<!--table
	{mso-displayed-decimal-separator:"\.";
	mso-displayed-thousand-separator:"\,";}
@page
	{margin:.75in .7in .75in .7in;
	mso-header-margin:.3in;
	mso-footer-margin:.3in;}
.style0
	{mso-number-format:General;
	text-align:general;
	vertical-align:middle;
	white-space:nowrap;
	mso-rotate:0;
	mso-background-source:auto;
	mso-pattern:auto;
	color:black;
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:宋体;
	mso-generic-font-family:auto;
	mso-font-charset:134;
	border:none;
	mso-protection:locked visible;
	mso-style-name:常规;
	mso-style-id:0;}
td
	{mso-style-parent:style0;
	padding-top:1px;
	padding-right:1px;
	padding-left:1px;
	mso-ignore:padding;
	color:black;
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:宋体;
	mso-generic-font-family:auto;
	mso-font-charset:134;
	mso-number-format:General;
	text-align:general;
	vertical-align:middle;
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;
	mso-protection:locked visible;
	white-space:nowrap;
	mso-rotate:0;}
.xl65
	{mso-style-parent:style0;
	text-align:center;
	border:.5pt solid windowtext;}
.xl66
	{mso-style-parent:style0;
	text-align:center;}
.xl67
	{mso-style-parent:style0;
	border:.5pt solid windowtext;}
.xl68
	{mso-style-parent:style0;
	font-size:36.0pt;
	text-align:center;
	border:.5pt solid windowtext;}
.xl69
	{mso-style-parent:style0;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:none;}
.xl70
	{mso-style-parent:style0;
	color:red;
	font-family:"宋体 \(正文\)";
	mso-generic-font-family:auto;
	mso-font-charset:134;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:none;}
ruby
	{ruby-align:left;}
rt
	{color:windowtext;
	font-size:9.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:宋体;
	mso-generic-font-family:auto;
	mso-font-charset:134;
	mso-char-type:none;
	display:none;}
-->
</style>
</head>

<body link=blue vlink=purple>
<script type="text/javascript"> 
function myCheck()  
{  
   for(var i=0;i<document.form1.elements.length-1;i++)  
   {  
      if(document.form1.elements[i].value=="")  
      {  
         alert("当前表单不能有空项");  
         document.form1.elements[i].focus();  
         return false;  
      }  
   }  
   return true;  
    
}  
   /* $(function(){ 
         $("#submit").click(function(){ 
        	alert($(":input")+"11")
			if($(":input").value()==""){
				alert("请完整填写表格");
				return false;
			}else{
				alert("22");
				return true;
			}
         }) 
    }) */  
</script>
<table border=0 cellpadding=0 cellspacing=0 width=1273 style='border-collapse:
 collapse;table-layout:fixed;width:955pt'>
 <col width=72 style='width:54pt'>
 <col width=140 style='mso-width-source:userset;mso-width-alt:4480;width:105pt'>
 <col width=152 style='mso-width-source:userset;mso-width-alt:4864;width:114pt'>
 <col width=329 style='mso-width-source:userset;mso-width-alt:10538;width:247pt'>
 <col width=181 style='mso-width-source:userset;mso-width-alt:5802;width:136pt'>
 <col width=183 style='mso-width-source:userset;mso-width-alt:5845;width:137pt'>
 <col width=72 span=3 style='width:54pt'>
 <tr height=19 style='height:14.0pt'>
  <td colspan=6 rowspan=2 height=58 class=xl68 width=1057 style='height:43.0pt;
  width:793pt'>江西四联电力工程事业部客户资源</td>
  <td class=xl66 width=72 style='width:54pt'></td>
  <td class=xl66 width=72 style='width:54pt'></td>
  <td class=xl66 width=72 style='width:54pt'></td>
 </tr>
 <tr height=39 style='mso-height-source:userset;height:29.0pt'>
  <td height=39 class=xl66 style='height:29.0pt'></td>
  <td class=xl66></td>
  <td class=xl66></td>
 </tr>
 <tr height=19 style='height:14.0pt'>
  <td height=19 class=xl67 style='height:14.0pt;border-top:none'>编号</td>
  <td class=xl67 style='border-top:none;border-left:none'>区域</td>
  <td class=xl67 style='border-top:none;border-left:none'>客户名称<span
  style='display:none'></span></td>
  <td class=xl67 style='border-top:none;border-left:none'>地址</td>
  <td class=xl67 style='border-top:none;border-left:none'>客户信息来源<span
  style='display:none'></span></td>
  <td class=xl67 style='border-top:none;border-left:none'>预拜访日期<span
  style='display:none'></span></td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <s:form action="kehuziyuanAction_add.action" id="form1" name="form1" method="post" >
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>1</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>2</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>3</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>4</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>5</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>6</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>7</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>8</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>9</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>10</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>11</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>12</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>13</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>14</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=43 style='mso-height-source:userset;height:32.0pt'>
  <td height=43 class=xl65 style='height:32.0pt;border-top:none'>15</td>
  <td class=xl67 style='border-top:none;border-left:none'>	<s:textfield name="qy" style="width:138px;height:38px"></s:textfield>　</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khmc" style="width:130px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="dz" style="width:300px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="khxxly" style="width:150px;height:38px"></s:textfield>	</td>
  <td class=xl67 style='border-top:none;border-left:none'>　<s:textfield name="ybf" style="width:150px;height:38px"></s:textfield>	</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr height=19 style='height:14.0pt'>
  <td colspan=6 height=19 class=xl70 style='height:14.0pt'>注:每周五22点前提交15个下周拜访客户信息</td>
  <td colspan=3 style='mso-ignore:colspan'></td>
 </tr>
 <tr>
 	<td> <input id="submit" type="submit" value="提交" onclick="return myCheck()" /></td>
 </tr>
 </s:form>
 
 
 
</table>

</body>

</html>


