<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:o="urn:schemas-microsoft-com:office:office"
xmlns:x="urn:schemas-microsoft-com:office:excel"
xmlns="http://www.w3.org/TR/REC-html40">


<head>

<script type="text/javascript">
function check(){
	var hbr = document.getElementById("hbr");
	var rq = document.getElementById("rq");
	var dwmc = document.getElementById("dwmc");
	var lxr = document.getElementById("lxr");
	var zbszd = document.getElementById("zbszd");
	var xmmc = document.getElementById("xmmc");
	var xmdd = document.getElementById("xmdd");
	var fcfdsj = document.getElementById("fcfdsj");
	var qyxz = document.getElementById("qyxz");
	var ydxz = document.getElementById("ydxz");
	var jzzmj = document.getElementById("jzzmj");
	var xmzrfa = document.getElementById("xmzrfa");
	var ydrl = document.getElementById("ydrl");
	var tz = document.getElementById("tz");
	var zbfs = document.getElementById("zbfs");
	var sjy = document.getElementById("sjy");
	var jl = document.getElementById("jl");
	var zg = document.getElementById("zg");
	var jcr = document.getElementById("jcr");
	var qt = document.getElementById("qt");
	var jzdw = document.getElementById("jzdw");
	if(hbr.value == ""){
    	alert("汇报人不能为空！");
   		return false;
	}else if(rq.value==""){
		alert("日期不能为空！");
   		return false;
	}else if(dwmc.value==""){
		alert("单位名称不能为空！");
   		return false;
	}else if(lxr.value==""){
		alert("联系人不能为空！");
   		return false;
	}else if(zbszd.value==""){
		alert("总部所在地不能为空！");
   		return false;
	}else if(xmmc.value==""){
		alert("项目名称不能为空！");
   		return false;
	}else if(xmdd.value==""){
		alert("项目地点不能为空！");
   		return false;
	}else if(fcfdsj.value==""){
		alert("房产封顶时间不能为空！");
   		return false;
	}else if(qyxz.value==""){
		alert("企业性质不能为空！");
   		return false;
	}else if(ydxz.value==""){
		alert("用电性质不能为空！");
   		return false;
	}else if(jzzmj.value==""){
		alert("建筑总面积不能为空！");
   		return false;
	}else if(xmzrfa.value==""){
		alert("项目植入方案不能为空！");
   		return false;
	}else if(ydrl.value==""){
		alert("用电容量不能为空！");
   		return false;
	}else if(tz.value==""){
		alert("图纸不能为空！");
   		return false;
	}else if(zbfs.value==""){
		alert("招标方式不能为空！");
   		return false;
	}else if(sjy.value==""){
		alert("设计院不能为空！");
   		return false;
	}else if(jl.value==""){
		alert("经理不能为空！");
   		return false;
	}else if(jcr.value==""){
		alert("决策人不能为空！");
   		return false;
	}else if(zg.value==""){
		alert("专工不能为空！");
   		return false;
	}else if(qt.value==""){
		alert("其他不能为空！");
   		return false;
	}else if(jzdw.value==""){
		alert("竞争单位不能为空！");
   		return false;
	}else{
		return true;
	}
} 	
</script>
<meta http-equiv=Content-Type content="text/html; charset=x-mac-chinesesimp">
<meta name=ProgId content=Excel.Sheet>
<meta name=Generator content="Microsoft Excel 15">
<link rel=File-List href="sl.fld/filelist.xml">
<style>
<!--table
	{mso-displayed-decimal-separator:"\.";
	mso-displayed-thousand-separator:"\,";}
@page
	{margin:1.0in .75in 1.0in .75in;
	mso-header-margin:.51in;
	mso-footer-margin:.51in;}
.font7
	{color:windowtext;
	font-size:10.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:宋体;
	mso-generic-font-family:auto;
	mso-font-charset:134;}
.font12
	{color:red;
	font-size:10.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:宋体;
	mso-generic-font-family:auto;
	mso-font-charset:134;}
.style0
	{mso-number-format:General;
	text-align:general;
	vertical-align:middle;
	white-space:nowrap;
	mso-rotate:0;
	mso-background-source:auto;
	mso-pattern:auto;
	color:windowtext;
	font-size:12.0pt;
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
	color:windowtext;
	font-size:12.0pt;
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
	font-size:10.0pt;
	text-align:center;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl66
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-weight:700;
	text-align:center;
	vertical-align:top;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl67
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:left;
	vertical-align:top;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl68
	{mso-style-parent:style0;
	font-size:14.0pt;
	text-align:center;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl69
	{mso-style-parent:style0;
	font-size:24.0pt;
	font-weight:700;
	font-family:黑体;
	mso-generic-font-family:auto;
	mso-font-charset:134;
	text-align:center;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl70
	{mso-style-parent:style0;
	font-weight:700;
	font-family:黑体;
	mso-generic-font-family:auto;
	mso-font-charset:134;
	text-align:center;
	border:.5pt solid windowtext;
	white-space:normal;}
.xl71
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:center;
	border:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl72
	{mso-style-parent:style0;
	font-size:14.0pt;
	text-align:center;
	border:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl73
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:left;
	border:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl74
	{mso-style-parent:style0;
	font-size:10.0pt;
	mso-number-format:0%;
	text-align:center;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl75
	{mso-style-parent:style0;
	font-size:10.0pt;
	mso-number-format:0%;
	text-align:center;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl76
	{mso-style-parent:style0;
	text-align:center;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl77
	{mso-style-parent:style0;
	text-align:center;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl78
	{mso-style-parent:style0;
	font-size:10.0pt;
	mso-number-format:"yyyy\0022年\0022m\0022月\0022";
	text-align:center;
	border:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl79
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:left;
	vertical-align:top;
	border:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl80
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:center;
	vertical-align:top;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
.xl81
	{mso-style-parent:style0;
	font-size:10.0pt;
	text-align:center;
	vertical-align:top;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:white;
	mso-pattern:black none;
	white-space:normal;}
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
<s:form action="chuchaiAction_add.action" >
	<table border=0 cellpadding=0 cellspacing=0 width=915 style='border-collapse:
	 collapse;table-layout:fixed;width:686pt'>
	 <col width=84 style='mso-width-source:userset;mso-width-alt:2688;width:63pt'>
	 <col width=72 span=4 style='width:54pt'>
	 <col width=32 style='mso-width-source:userset;mso-width-alt:1024;width:24pt'>
	 <col width=37 span=2 style='mso-width-source:userset;mso-width-alt:1194;
	 width:28pt'>
	 <col width=72 style='width:54pt'>
	 <col width=67 style='mso-width-source:userset;mso-width-alt:2133;width:50pt'>
	 <col width=103 style='mso-width-source:userset;mso-width-alt:3285;width:77pt'>
	 <col width=73 style='mso-width-source:userset;mso-width-alt:2346;width:55pt'>
	 <col width=55 style='mso-width-source:userset;mso-width-alt:1749;width:41pt'>
	 <col width=67 style='mso-width-source:userset;mso-width-alt:2133;width:50pt'>
	 <tr height=40 style='mso-height-source:userset;height:30.75pt'>
	  <td colspan=14 height=40 class=xl69 width=915 style='height:30.75pt;
	  width:686pt'>江西四联电力工程事业部出差汇报书</td>
	 </tr>
	 <tr height=23 style='height:17.0pt'>
	  <td colspan=2 rowspan=3 height=80 class=xl67 width=156 style='height:60.0pt;
	  width:117pt'>汇报人：<s:textfield name="hbr"  id="hbr" class="bt"  style="width:155px;height:94px" > </s:textfield> </td>
	  <td colspan=2 class=xl65 width=144 style='border-left:none;width:108pt'>日期<font
	  class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'><s:textfield name="rq" id="rq" class="bt" style="width:139px;height:21px"></s:textfield> </td>
	  <td rowspan=4 class=xl68 width=37 style='border-top:none;width:28pt'>单位基本情况</td>
	  <td class=xl65 width=72 style='border-top:none;border-left:none;width:54pt'>单位名称<font
	  class="font12">*</font></td>
	  <td colspan=5 class=xl71 width=365 style='border-left:none;width:273pt'>　<s:textfield name="dwmc" id="dwmc" class="bt" style="width:356px;height:25px"></s:textfield></td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td colspan=2 height=20 class=xl65 width=144 style='height:15.0pt;border-left:
	  none;width:108pt'>要求完成日期</td>
	  <td colspan=3 class=xl65 width=141 style='border-left:none;width:106pt'><s:textfield name="yqwcrq" style="width:139px;height:43px"></s:textfield>　</td>
	  <td class=xl65 width=72 style='border-top:none;border-left:none;width:54pt'>联系人<font
	  class="font12">*</font></td>
	  <td colspan=5 class=xl73 width=365 style='border-left:none;width:273pt'><span
	  style='mso-spacerun:yes'>&nbsp;&nbsp;&nbsp;&nbsp;</span><s:textfield name="lxr" id="lxr" class="bt" style="width:356px;height:50px"></s:textfield></td>
	 </tr>
	 <tr height=37 style='height:28.0pt'>
	  <td colspan=2 height=37 class=xl65 width=144 style='height:28.0pt;border-left:
	  none;width:108pt'>报价时限</td>
	  <td colspan=3 class=xl65 width=141 style='border-left:none;width:106pt'><s:textfield name="bjsx" style="width:139px;height:43px"></s:textfield>　</td>
	  <td class=xl65 width=72 style='border-top:none;border-left:none;width:54pt'>总部所在地<font
	  class="font12">*</font></td>
	  <td colspan=5 class=xl71 width=365 style='border-left:none;width:273pt'><s:textfield name="zbszd" id="zbszd" class="bt" style="width:356px;height:50px"></s:textfield>　</td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td rowspan=15 height=402 class=xl65 width=84 style='height:301.75pt;
	  border-top:none;width:63pt'>有关甲方单位情况</td>
	  <td rowspan=7 class=xl65 width=72 style='border-top:none;width:54pt'>项目情况</td>
	  <td colspan=2 class=xl65 width=144 style='border-left:none;width:108pt'>项目名称<font
	  class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'><s:textfield name="xmmc" id="xmmc" class="bt" style="width:139px;height:43px"></s:textfield>　</td>
	  <td class=xl65 width=72 style='border-top:none;border-left:none;width:54pt'>项目地点<font
	  class="font12">*</font></td>
	  <td colspan=5 class=xl74 width=365 style='border-right:.5pt solid black;
	  border-left:none;width:273pt'>　<s:textfield name="xmdd" id="xmdd" class="bt" style="width:356px;height:50px"></s:textfield></td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td colspan=2 height=20 class=xl65 width=144 style='height:15.0pt;border-left:
	  none;width:108pt'>所属供电公司</td>
	  <td colspan=3 class=xl65 width=141 style='border-left:none;width:106pt'><s:textfield name="ssgdgs" style="width:139px;height:43px"></s:textfield>　</td>
	  <td colspan=2 class=xl65 width=109 style='border-left:none;width:82pt'>房产封顶时间<font
	  class="font12">*</font></td>
	  <td colspan=2 class=xl78 width=170 style='border-left:none;width:127pt'>　<s:textfield name="fcfdsj" id="fcfdsj" class="bt" style="width:163px;height:61px"></s:textfield></td>
	  <td class=xl78 width=73 style='border-top:none;border-left:none;width:55pt'>企业性质<font
	  class="font12">*</font></td>
	  <td colspan=2 class=xl78 width=122 style='border-left:none;width:91pt'><s:textfield name="qyxz" id="qyxz" class="bt" style="width:116px;height:78px"></s:textfield>　</td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td colspan=2 height=20 class=xl65 width=144 style='height:15.0pt;border-left:
	  none;width:108pt'>用电性质<font class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'>　<s:textfield name="ydxz" id="ydxz" class="bt" style="width:139px;height:43px"></s:textfield></td>
	  <td colspan=2 class=xl65 width=109 style='border-left:none;width:82pt'>建筑总面积<font
	  class="font12">*</font></td>
	  <td colspan=5 class=xl71 width=365 style='border-left:none;width:273pt'>　<s:textfield name="jzzmj" id="jzzmj" class="bt" style="width:356px;height:62px"></s:textfield></td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td colspan=2 height=20 class=xl65 width=144 style='height:15.0pt;border-left:
	  none;width:108pt'>项目植入方案<font class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'><s:textfield name="xmzrfa" id="xmzrfa" class="bt" style="width:139px;height:43px"></s:textfield>　</td>
	  <td colspan=2 class=xl65 width=109 style='border-left:none;width:82pt'>用电容量<font
	  class="font12">*</font></td>
	  <td colspan=2 class=xl71 width=170 style='border-left:none;width:127pt'>　<s:textfield name="ydrl" id="ydrl" class="bt" style="width:162px;height:60px"></s:textfield></td>
	  <td class=xl71 width=73 style='border-top:none;border-left:none;width:55pt'>图纸*</td>
	  <td colspan=2 class=xl71 width=122 style='border-left:none;width:91pt'>　<s:textfield name="tz" id="tz" class="bt" style="width:116px;height:78px"></s:textfield></td>
	 </tr>
	 <tr height=24 style='mso-height-source:userset;height:18.75pt'>
	  <td colspan=2 height=24 class=xl65 width=144 style='height:18.75pt;
	  border-left:none;width:108pt'>招标方式<font class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'><s:textfield name="zbfs" id="zbfs" class="bt" style="width:139px;height:43px"></s:textfield>　</td>
	  <td colspan=2 rowspan=2 class=xl65 width=109 style='width:82pt'>项目联系人<font
	  class="font12">*</font></td>
	  <td class=xl79 width=67 style='border-top:none;border-left:none;width:50pt'>经理：<font
	  class="font12">* </font><font class="font7"><span
	  style='mso-spacerun:yes'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></font></td>
	  <td class=xl79 width=103 style='border-top:none;border-left:none;width:77pt'>　<s:textfield name="jl" id="jl" class="bt" style="width:100px;height:60px"></s:textfield></td>
	  <td class=xl79 width=73 style='border-top:none;border-left:none;width:55pt'>专工：<font
	  class="font12">*<span style='mso-spacerun:yes'>&nbsp;</span></font></td>
	  <td colspan=2 class=xl80 width=122 style='border-right:.5pt solid black;
	  border-left:none;width:91pt'>　<s:textfield name="zg" id="zg" class="bt" style="width:100px;height:60px"></s:textfield></td>
	 </tr>
	 <tr height=19 style='mso-height-source:userset;height:14.0pt'>
	  <td colspan=2 height=19 class=xl65 width=144 style='height:14.0pt;border-left:
	  none;width:108pt'>设计院<font class="font12">*</font></td>
	  <td colspan=3 class=xl71 width=141 style='border-left:none;width:106pt'><s:textfield name="sjy" id="sjy" class="bt" style="width:139px;height:43px"></s:textfield>　</td>
	  <td class=xl79 width=67 style='border-top:none;border-left:none;width:50pt'>决策人：<font
	  class="font12">*</font></td>
	  <td class=xl79 width=103 style='border-top:none;border-left:none;width:77pt'>　<s:textfield name="jcr" id="jcr" class="bt" style="width:100px;height:60px"></s:textfield></td>
	  <td class=xl79 width=73 style='border-top:none;border-left:none;width:55pt'>其他：<font
	  class="font12">*</font></td>
	  <td colspan=2 class=xl80 width=122 style='border-right:.5pt solid black;
	  border-left:none;width:91pt'>　<s:textfield name="qt" id="qt" class="bt" style="width:100px;height:60px"></s:textfield></td>
	 </tr>
	 <tr height=52 style='mso-height-source:userset;height:39.0pt'>
	  <td colspan=2 height=52 class=xl65 width=144 style='height:39.0pt;border-left:
	  none;width:108pt'>搭火点</td>
	  <td colspan=10 class=xl67 width=615 style='border-left:none;width:461pt'><s:textfield name="dhd" style="width:600px;height:50px" ></s:textfield></td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td rowspan=8 height=227 class=xl65 width=72 style='height:170.0pt;
	  border-top:none;width:54pt'>甲方特殊要求</td>
	  <td colspan=12 rowspan=8 class=xl67 width=759 style='width:569pt'><s:textarea name="jftsyq" style="width:751px;height:223px"></s:textarea>　</td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=87 style='mso-height-source:userset;height:65.0pt'>
	 </tr>
	 <tr height=32 style='mso-height-source:userset;height:24.0pt'>
	  <td height=32 class=xl65 width=84 style='height:24.0pt;border-top:none;
	  width:63pt'>缺失材料</td>
	  <td colspan=13 class=xl65 width=831 style='border-left:none;width:623pt'>　<s:textarea name="qscl" style="width:823px;height:44px" ></s:textarea></td>
	 </tr>
	 <tr height=32 style='mso-height-source:userset;height:24.0pt'>
	  <td height=32 class=xl65 width=84 style='height:24.0pt;border-top:none;
	  width:63pt'>竞争单位<font class="font12">*</font></td>
	  <td colspan=13 class=xl71 width=831 style='border-left:none;width:623pt'><s:textarea name="jzdw" id="jzdw" class="bt" style="width:823px;height:44px"></s:textarea>　</td>
	 </tr>
	 <tr height=35 style='mso-height-source:userset;height:26.0pt'>
	  <td rowspan=2 height=67 class=xl65 width=84 style='height:50.75pt;border-top:
	  none;width:63pt'>市场部意见</td>
	  <td colspan=13 class=xl65 width=831 style='border-left:none;width:623pt'>　<s:textarea name="scbyj" style="width:823px;height:44px"></s:textarea></td>
	 </tr>
	 <tr height=32 style='mso-height-source:userset;height:24.75pt'>
	  <td colspan=13 height=32 class=xl65 width=831 style='height:24.75pt;
	  border-left:none;width:623pt'>　</td>
	 </tr>
	 <tr height=36 style='mso-height-source:userset;height:27.0pt'>
	  <td rowspan=2 height=64 class=xl65 width=84 style='height:48.0pt;border-top:
	  none;width:63pt'>工程部意见</td>
	  <td colspan=13 class=xl65 width=831 style='border-left:none;width:623pt'>　<s:textarea name="gcbyj" style="width:823px;height:44px"></s:textarea>　</td>
	 </tr>
	 <tr height=28 style='mso-height-source:userset;height:21.0pt'>
	  <td colspan=13 height=28 class=xl65 width=831 style='height:21.0pt;
	  border-left:none;width:623pt'>　</td>
	 </tr>
	 <tr height=32 style='mso-height-source:userset;height:24.0pt'>
	  <td height=32 class=xl65 width=84 style='height:24.0pt;border-top:none;
	  width:63pt'>评标小组</td>
	  <td colspan=13 class=xl65 width=831 style='border-left:none;width:623pt'>　<s:textarea name="pbxz" style="width:823px;height:44px"></s:textarea>　</td>
	 </tr>
	 <tr height=36 style='mso-height-source:userset;height:27.0pt'>
	  <td height=36 class=xl65 width=84 style='height:27.0pt;border-top:none;
	  width:63pt'>合同评定小组</td>
	  <td colspan=13 class=xl65 width=831 style='border-left:none;width:623pt'>　<s:textarea name="htpdxz" style="width:823px;height:44px"></s:textarea>　</td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	  <td rowspan=5 height=100 class=xl65 width=84 style='height:75.0pt;border-top:
	  none;width:63pt'>任务完成情况</td>
	  <td colspan=13 rowspan=5 class=xl66 width=831 style='width:623pt'>　<s:textarea name="rwwcqk" style="width:823px;height:88px"></s:textarea>　</td>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	 <tr height=20 style='height:15.0pt'>
	 </tr>
	</table>
	<div align="center">
		<s:a href="chuchaiAction_shenheTG.action?ccid=%{ccid}"><input type="button" value="审核通过"/></s:a>
		<s:a href="chuchaiAction_shenheBTG.action?ccid=%{ccid}"><input type="button" value="审核不通过" style="color:red"/></s:a><br>
	</div>
	<img  src="${pageContext.request.contextPath }/%{zipaiPath}">
	<img  src="${pageContext.request.contextPath }/<s:property value="zipaiPath"/>"  style="width:300; height:300px"  > 
	
</s:form>
</body>


</html>


