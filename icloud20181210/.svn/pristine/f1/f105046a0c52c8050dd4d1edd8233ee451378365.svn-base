<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>イベント集計メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLMM108.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.validate.js"></script>
</head>
<body>
<script type="text/javascript">
	function caozuo(){
		
		var lmm108_2form = document.getElementById("lmm108_2Form");
		
		var message = "${message}";
		
		var check = window.confirm(message);
		
		if(check){
			
			if( ${modflg} == 1){
				
				lmm108_2Form.submit();
				
			}else{
				
				lmm108_2Form.action="insert";
				
				lmm108_2Form.submit();
			}
		}
	}
	
	function reset(){
		
		$("#evtMrgCode_Txt").val("${lmm108_2dto.evtmrgcod}");
		$("#evtMrgName_Txt").val("${lmm108_2dto.evtmrgnam }");
		$("#dspNum_Txt").val("${lmm108_2dto.dispnum }");
		$("#appOrgCode_Txt").val("${lmm108_2dto.apporgcod }");
	
		$("#span1").html("");
		$("#span2").html("");
		$("#span3").html("");
		$("#orgName_Txt").val("");
	}
	
	function checkOrgCode(){
		
		var orgCode = document.getElementById("appOrgCode_Txt").value;
	
		$.ajax({
			
			url:"checkOrgCode",
			
			data:{'orgcode':orgCode},
			
			type:"POST",
			
			dataType:'JSON',
			
			success:function(backData){
				
				$("#orgName_Txt").val(backData);
				
			},
			
			error:function(obj){
				
				alert("连接出现问题");
				
			}
		});		
	}
	
	function openWindow(){
		
		 var apporgcod = window.document.getElementById("appOrgCode_Txt").value;
		 
		 window.open("${pageContext.request.contextPath}/slvb108/init?orgCode_Txt=" + apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
	}
	
	
	function checkEvtMrgCode(){
		
		var regext = /^[0-9A-z!-]{0,12}$/;
		
		var code = document.getElementById("evtMrgCode_Txt").value;
		
		if(code == "" || code == null){
			var mes = "イベント集計コード";
			
			$.ajax({
				
				url:"checkMsg",
				data:{'id':"LVB-004009",'mes':mes},
				type:"POST",
				dataType:'JSON',
				success:function(obj){
					
					$("#span1").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
			
		}else if(code.length > 12){
			
			var mes = "イベント集計コード"+","+"20";
			
			$.ajax({
				url:"checkMsg",
				data:{'id':"LVB-004030",'mes':mes},
				type:"POST",
				dataType:'JSON',
				success:function(backData){
					
					$("#span1").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
		}else if( !regext.test(code) ){
			
			var mes = "イベント集計コード";
			
			$.ajax({
				
				url:"checkMsg",
				data:{'id':"LVB-004010",'mes':mes},
				type:"POST",
				dataType:'JSON',
				success:function(obj){
					
					$("#span1").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
		}else if( regext.test(code) ){
			$("#span1").html("");
		}
	}
	
	function checkEvtMrgName(){
		var name = document.getElementById("evtMrgName_Txt").value;
		
		if(name.length > 50){
			
			var mes = "イベント集計名称"+","+"50";
			
			$.ajax({
				
				url:"checkMsg",
				data:{'id':"LVB-004030",'mes':mes},
				type:"POST",
	    	    dataType:'JSON',
				success:function(obj){
					
					$("#span2").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
		}else{
			$("#span2").html("");
		}
	}
	
	function checkDspNum(){
		
		var regext = /^[0-9]{0,4}$/;
		
		var dspNum = document.getElementById("dspNum_Txt").value;
		
		if( dspNum.length > 4){
			
			var mes = "表示順"+","+"4";
			
			$.ajax({
				
				url:"checkMsg",
				data:{'id':"LVB-004030",'mes':mes},
				type:"POST",
	    	    dataType:'JSON',
				success:function(obj){
					
					$("#span3").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
		}else if ( !regext.test(dspNum) ){
			
			var mes = "表示順";
			
			$.ajax({
				
				url:"checkMsg",
				data:{'id':"LVB-004010",'mes':mes},
				type:"POST",
	    	    dataType:'JSON',
				success:function(obj){
					
					$("#span3").html(obj.msg);
					
				},
				errror:function(obj){
					
					alert("何か悪いこと！！！");
					
				}
			});
		}else if( regext.test(dspNum) ){
			
			$("#span3").html("");
			
		}
	}
	
</script>

<form action="update" method="post" id="lmm108_2Form">
<table  class="body">
    <tr>
    <td colspan="2">
        <table  class="header_area">
            <tr>
                <td>
                    <jsp:include page="header.jsp" flush="true"/>
                </td>
            </tr>
        </table>
    </td>
    </tr>
    <tr>
        <td>
            <table class="menu">
                <tr >
                    <td class="menu">
                        <jsp:include page="menu.jsp" flush="true"/>
                    </td>
                </tr>
            </table>
        </td>
        <td>
            <table class="main">
                <tr>
                    <td class="main">



<table class="body">
	<tr>
		<td>
		<table >
			<tr>
				<td class="label_normal" width="100">
					&nbsp;
				</td>
				<td class="label_normal" width="200" >
				<c:if test="${modflg == 0 }">
					<u><nobr>前回更新ユーザ:&nbsp;</nobr></u>
				</c:if>
				
				<c:if test="${modflg == 1 }">
					<u><nobr>前回更新ユーザ:&nbsp;${lmm108_2dto.updnam }</nobr></u>
				</c:if>
					
				</td>
				<td class="label_normal" width="180">
					&nbsp;
				</td>
				<td class="label_normal" width="200">
				<c:if test="${modflg == 0 }">
					<u><nobr>前回更新日時:
					</nobr></u>
				</c:if>
				
				<c:if test="${modflg == 1 }">
					<u><nobr>前回更新日時:
						${lmm108_2dto.updymdhms }
					</nobr></u>
				</c:if>
					
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
		<table class="condition">
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>イベント集計コード</nobr>
				</td>
				<td class="label_left"  width="500">
				<c:if test="${modflg == 0 }">
					<input type="text" id="evtMrgCode_Txt" name="evtmrgcod" maxlength="12" size="74" value="${lmm108_2dto.evtmrgcod }" onblur="checkEvtMrgCode()"/>
					<span id="span1"></span>
				</c:if>
				<c:if test="${modflg == 1 }">
					<input type="text" id="evtMrgCode_Txt" name="evtmrgcod" maxlength="12" size="74" value="${lmm108_2dto.evtmrgcod }" readonly="readonly"/>
				</c:if>	
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>イベント集計名称</nobr>
				</td>
				<td class="label_left"  width="500">
					<input type="text" id="evtMrgName_Txt" name="evtmrgnam" maxlength="50" size="74" value="${lmm108_2dto.evtmrgnam }" onblur="checkEvtMrgName()"/>
					<span id="span2"></span>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>表示順</nobr>
				</td>
				<td class="label_left"  width="500">
					<input type="text" id="dspNum_Txt" name="dispnum" maxlength="4" size="74" value="${lmm108_2dto.dispnum }" onblur="checkDspNum()"/>
					<span id="span3"></span>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>申請組織コード</nobr>
				</td>
				<td class="label_left"  width="500">
					<input type="text" id="appOrgCode_Txt" name="apporgcod" maxlength="12" size="15" value="${lmm108_2dto.apporgcod }"/>
					<input type="button" value= "検索" id="appSearch_Btn" class="button_app" onclick="openWindow()"/>
					<input type="text" id="orgName_Txt" class="{validate:{stringMaxLength:12}}" readonly="readonly">
                 
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>廃止フラグ</nobr>
				</td>
				<td class="label_left"  width="500">
				<c:if test="${modflg == 0 }">
                    <input type="checkbox" id="aboFlg_Chk" name="q1" value="1" disabled="disabled">　廃止する場合にチェック                                
                 </c:if>
                 <c:if test="${modflg == 1 }">
					<input type="checkbox" id="aboFlg_Chk" name="q1" value="1">　廃止する場合にチェック
				</c:if>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
</table>

<table class="common_area">
	<tr>
		<td align="left">
			<input type="button" value= "戻る" id="back_Btn" class="button_normal" onclick="history.go(-1)"/> 
		</td>
		<td align="right">
			<input type="reset" value= "クリア" id="clear_Btn" class="button_normal" onclick="reset()"/> 
			<input type="button" value= "変更" id="update_Btn" class="button_normal" onclick="caozuo()"/>
		</td>

	</tr>
</table>


                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>

</form>
</body>
</html>