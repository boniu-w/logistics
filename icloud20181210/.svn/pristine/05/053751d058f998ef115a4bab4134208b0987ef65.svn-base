<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>場所一覧画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLMM113.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript">

	//ペジ初期化
	window.onload=function(){ 
	
		if(document.readyState=="complete"){
			//光标定位到第一个输入框
			document.getElementById("appOrgCode_Txt").focus();			
		}			  	
	}			
	
	$(function(){
		  
	    //検索範囲の初期値の設定処理
	    var searchScope_Rdos = $("input[name='searchScope_Rdo']");
	    $.each(searchScope_Rdos,function(i, e) {
	        var value = $(e).attr("value");
	        if(value == "${searchScope_Rdo}"){
	            $(e).attr("checked","true");
	        }
	    });
	    
	  //一覧明細部のデフオルト処理    
	  window.document.all("ck")[0].checked = true;
	  
	});
	
	$().ready(function() { 
	       $("#newform").validate();
	    });
					
	 //メンテナンス画面に遷移する 更新の場合
    function toUpdate(){
        var tntcod = $("input[name='ck']:checked").attr('tntcode');
      
        //検索条件の保持用
        var formVals = $("#newform").serialize();//json 数据类型  只对form有效
       
        console.log(formVals);      
        if(tntcod == undefined){
            alert("対象が選択されていません");
            return;
        } else {
            location.href="../lmm114Controller/init?tntcod&formVals";
        }
    } 	
	
 	
</script>

</head>
<body>
<form action="quallByy" id="newform" method="post" >
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

<table>
	<tr >
		<td>
		<table class="fixedTable">
			<tr>
				<td class="label_center" class="spacewidth" >
					&nbsp;
				</td>
				<td class="label_color lablewidth" >
					<nobr>検索範囲</nobr>
				</td>
				<td class="label_left inputwidth" ><nobr>
					<input type="radio" name="searchScope_Rdo" value="1"/><label for="searchScope_Rdo1:1">全件</label>&nbsp;
					<input type="radio" name="searchScope_Rdo" value="2" checked="checked"/><label for="searchScope_Rdo1:2">廃止を除く</label></nobr>
				</td>
				<td class="spacewidth">
					&nbsp;
				</td>
				<td class="lablewidth">
					&nbsp;
				</td>
				<td class="inputwidth">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>申請組織コード</nobr></td>
				<td class="label_left" ><input type="text" id="appOrgCode_Txt" name="appOrgCode_Txt"  maxlength="12" size="37"/>
				
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>場所コード</nobr></td>
				<td class="label_left" ><input type="text" id="plcCode_Txt" name="plcCode_Txt" maxlength="35" size="37"/>
				</td>
				<td>
					&nbsp;
				</td>
				<td class="label_color" ><nobr>場所名</nobr></td>
				<td class="label_left"  ><input type="text" id="plcName_Txt" name="plcName_Txt" maxlength="256" size="37"/>
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
		<td align= "right">
			<input type="submit" value="検索" id="search_Btn"
				class="button_normal"/></input> &nbsp;
		</td>
	</tr>
	<tr>
		<td>
		&nbsp;
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<div class="tablearea">
		<table id="plc_List" class="data_table">
			<tr>
				<th class="col_header">選択</th>
				<th class="col_header">廃止</th>
				<th class="col_header">場所コード</th>
				<th class="col_header">場所名</th>
				<th class="col_header">住所名１</th>
				<th class="col_header">住所名２</th>
				<th class="col_header">住所名３</th>
				<th class="col_header">住所名４</th>
				<th class="col_header">郵便コード</th>
				<th class="col_header">国名</th>
				<th class="col_header">タイムゾーン名</th>
				<th class="col_header">申請組織コード</th>
			</tr>
			<c:forEach var="list" items="${linkedList}" varStatus="mystatus" >
				<tr>
					<td class="label_center_groove">
						<input type="radio" tntcode="${list.tntcod}"					
						value="${mystatus.index }" name="ck"
						value="1" />
					</td>
					<td class="label_center_groove">
					
						<c:choose>
                             <c:when test="${list.aboflg==1}">〇</c:when>
                             <c:otherwise><br></c:otherwise>
                        </c:choose>
                        
                    </td>
					<td class="label_center_groove">${list.plccod}</td>
					<td class="label_center_groove">${list.plcnam}</td>
					<td class="label_center_groove">${list.adrnam1}</td>
					<td class="label_center_groove">${list.adrnam2}</td>
					<td class="label_center_groove">${list.adrnam3}</td>
					<td class="label_center_groove">${list.adrnam4}</td>
					<td class="label_center_groove">${list.zipcod}</td>
					<td class="label_center_groove">${list.ctrcod}</td>
					<td class="label_center_groove">${list.tmeznecod}</td>
					<td class="label_center_groove">${list.apporgcod}</td>
				</tr>
			</c:forEach>
			
		</table>
		</div>
		</td>
	</tr>
</table>
<table class="common_area">
	<tr>
		<td align="left">
			<input type="submit" value= "DashBoardへ戻る" id="dashBoard_Btn" onclick="javascript:history.go(-1);" class="button_normal_bashB" /> 
		</td>
		<td align="right">
			<input type="submit" value= "新規" id="insert_Btn" class="button_normal" /> 
			<input type="submit" value= "変更" id="modify_Btn" class="button_normal" />
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