<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
<title>場所メンテナンス画面【位置维护画面】 </title>
<link href="../css/bootstrap.min.css" title="" rel="stylesheet" />
<link title="orange" href="../css/login.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/lmm114.js"></script>
<script type="text/javascript" src="../js/lmmx114.js"></script>
<script type="text/javascript" src="../js/lmmg114.js"></script>
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>

 
<script type="text/javascript">

</script>
</head>
<body>

      
        <!-- 新规画面 -->
		<c:if test="${modflggc==0}">
		
		<script type="text/javascript">
			 $(function(){
			     //光标聚集
			     $("#plcCode_Txt").focus();
				})
			 //无操作返回
			 function fanhuix(){
				 
				 window.location="http://localhost:8080/icloud20181210/SLMM113.jsp";  
			 }
			 </script> 
			 
		</c:if> 
		
		<!-- 更新画面 -->
		<c:if test="${modflggc==1}">
		<script type="text/javascript">
				 $(function(){
					//下拉列表
					$("#ctrName_Sct").val("${findconam}");
					$("#tmezneName_Sct").val("${findlmmmt}");
					//光标聚集
					$("#plcnam").focus();
					})
					</script> 
		</c:if> 
				
<script type="text/javascript">			 
				 
				 //更新带原参返回
		 function fanhui(){
			 
			 var tntcod= ${fLIByTAP.tntcod};
			 var plccod= document.getElementById("plcCode_Txt").value;
			 window.location="http://localhost:8080/icloud20181210/SLMM113.jsp?tntcod="+tntcod+"?plccod="+plccod+""; 
			 
		 }
		 
</script> 

	<div style="text-align:center; color:#ffffff">
    <p style="margin-top: 20px;color: burlywood;">
    		<!-- 判断messages -->
			<c:if test="${messages==null}">
		     ErrorInfo<input type="text" name="" id="" value="页面正常" /></br>
		    </c:if>
		
		<c:if test="${messages!=null}">
		   
	     ErrorInfo<input type="text" name="" id="" value="${messages}" /></br>
				 
		</c:if>
    <span id="orgMsg"></span>
    
  	 <div id="topdiv">
  	 <b><h3>前回更新ユーザ：${findLmmplcDto.updnam} &nbsp; &nbsp;前回更新日時：${findLmmplcDto.updymdhmsu }</h3></b>
  	 &nbsp;
	 &nbsp;
	 &nbsp;
  	 <a href="#" style="color:darkgoldenrod">[退出登录]</a>
  	 
  	 </div>
      
	 </p>
  </div>
 
<div style="height:1px;"></div>
<div class="login">
 <header>
	<h1>場所メンテナンス画面</h1>
 </header>
 <div class="sr">
 	
 	<form action="http://localhost:8080/icloud20181210/Lmm114Controller/Xingui" id="myform" method="post">
            
            <!--新规code为空且可编辑  -->
			<c:if test="${modflggc==0}">
			  場所コード [位置代码 ]<input type="text" id="plcCode_Txt" name ="plccod" maxlength="35" size="74" value="${fLIByTAP.plccod}" onblur="confirmcode()"/></br></br>
		    </c:if>
		 <!--新规code不为空且不可编辑  -->
		<c:if test="${modflggc==1}">
		   
		  場所コード [位置代码 ]<input type="text" id="plcCode_Txt" name ="plccod" maxlength="35" size="74" value="${fLIByTAP.plccod}" readonly="readonly"/></br></br>
				 
		</c:if>
             <input type="hidden" id="tntcod" name ="tntcod" value="${fLIByTAP.tntcod}"/>
             <input type="hidden" id="ctrcod" name ="ctrcod"  value="${fLIByTAP.ctrcod}"/>
			 <input type="hidden" id="tmeznecod" name ="tmeznecod" value="${fLIByTAP.tmeznecod}"/>
			 <input type="hidden" id="updeac" name ="updeac" value="${fLIByTAP.updeac}"/>
			 场所名[ 场所名]<input type="text" id="plcnam" class="plcnamy" name ="plcnam" maxlength="100" size="74" value="${fLIByTAP.plcnam}" onblur="plcnamy()"/></br>
			住所名１[住所名]<input type="text" id="adrNam1" class="adrNam1" name ="adrnam1" maxlength="100" size="74" value="${fLIByTAP.adrnam1}" onblur="adrNamy(this.value,1)"/></br>
			住所名２[住所名]<input type="text" id="adrNam2" class="adrNam2" name ="adrnam2" maxlength="100" size="74" value="${fLIByTAP.adrnam2}" onblur="adrNamy(this.value,2)"/></br>
			住所名3[住所名]<input type="text" id="adrNam3" class="adrNam3" name ="adrnam3" maxlength="100" size="74" value="${fLIByTAP.adrnam3}" onblur="adrNamy(this.value,3)"/></br>
			住所名4[住所名]<input type="text" id="adrNam4" class="adrNam4" name ="adrnam4" maxlength="100" size="74" value="${fLIByTAP.adrnam4}" onblur="adrNamy(this.value,4)"/></br>
			郵便コード [邮政编码]<input type="text" id="zip_Txt" class="zipcod" name ="zipcod" maxlength="15" size="74" value="${fLIByTAP.zipcod}" onblur="confirmzipcod()"/></br></br>
			
			
			国名<select id="ctrName_Sct" size="1" name="ctrcod">
			
						<c:forEach var="list" items="${findLmmplc}">
						<%-- ${list.coalpha3} --%>
			            <option value="${list.conam}" >${list.conam}</option> 
			            
			            </c:forEach>
			            	
				</select></br></br>

					
		タイムゾーン名<select id="tmezneName_Sct" size="1" name="tmeznecod">
		
		    <c:forEach var="findt" items="${lmmmtmz}" varStatus="status">
						<%-- ${findt.tmeznecod} --%>
			            <option value="${findt.tmeznenam}" >${findt.tmeznenam}</option> 
			            
			            </c:forEach>
						
					</select></br></br>
			申請組織コード<input type="text" id="appOrgCode_Txt" name ="apporgcod" class="appOrgCode" maxlength="12" size="15" value="${fLIByTAP.apporgcod}" onblur="OrgCode_Txt()"/>
					                <input type="button" value= "检索" id="buttons" onclick="findcodename()" />
					 <input type="text" size="15" value= "" id="jian" class="jiansuo" name ="" /></br></br>
		
		<!-- 新规页面废止默认为0 -->
			<c:if test="${modflggc==0}">
			  廃止フラグ [废除标志]	<input type="checkbox" checked="checked" size="15" id="aboFlg_Chk" name ="aboflg" name="q1" value="0" readonly="readonly" style="margin-left: 43px;"></br></br>
		    </c:if>
		    
		    
		<!-- 更新页面废止默认为可选 -->
			<c:if test="${modflggc==1}">
			
			<c:if test="${fLIByTAP.aboflg}==1">
			  廃止フラグ [废除标志]	<input type="checkbox" checked="checked" size="15" id="aboFlg_Chk" name ="aboflg" name="q1" value="0" readonly="readonly" style="margin-left: 43px;"></br></br>
		    </c:if>
		<!-- 更新页面废止默认为可选 -->
			<c:if test="${fLIByTAP.aboflg}==0">
			   
			  廃止フラグ [废除标志]	<input type="checkbox" id="aboFlg_Chk" name ="aboflg" value="${fLIByTAP.aboflg}"></br></br>		 
			</c:if>
			   	 
			</c:if>
		
			
		</br>		
		<input type="button" id="buttonq" class="pulse" onclick="fomrReset()" value="清空" target="_blank" style="margin-left: 180px;" >
		  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		   <!-- 新规画面 -->
		<c:if test="${modflggc==0}">
		  <input type="button" id="buttong" class="pulse" onclick="disp_confirmx()" value="更新" >
			 
		</c:if> 
		<!-- 更新画面 -->
		<c:if test="${modflggc==1}">
		  <input type="button" id="buttong" class="pulse" onclick="disp_confirmg()" value="更新" >
		</c:if> 
		
		  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		  <c:if test="${modflggc==1}">
			 <input type="button" id="buttonf" class="pulse" onclick="fanhui()" value="返回"  ">	
		    </c:if>
		
		<c:if test="${modflggc==0}">
		   
		 <input type="button" id="buttonf" class="pulse" onclick="fanhuix()" value="返回">	
				 
		</c:if>
		
</form>
      
 </div>
 
</div>
<p>&nbsp;</p>
<p>&nbsp;</p>
 <!-- <div style="text-align:center;margin:-150px 0; font:normal 14px/24px 'MicroSoft YaHei';color:#ffffff">
</div>  -->
</body>
</html>