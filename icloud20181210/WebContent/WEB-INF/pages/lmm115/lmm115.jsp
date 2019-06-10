<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lmm115</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLMM115.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>

<script type="text/javascript">

   window.onload=function(){ 
		if(document.readyState=="complete"){
		  	document.getElementById("appOrgCode_Txt").focus(); 
		}
   }
	$(function(){
		
		//1一覧明細部のデフオルト処理  
		window.document.all("ck")[0].checked = true;
				
	})
	
	$.validator.setDefaults({		
	});
	
	
	$().ready(function(){
		$("#newform").validate();
	})

//this画面に遷移する 新規の場合
    function toAdd(){
        location.href="../lmm116Controller/init?modflg=0";
    }
    
//this画面に遷移する 更新の場合
	function toUpdate(){
	
		//1テナントコードを引き継ぐ   選択行の検索キー値（汎用区分、汎用コード）
	    var tntcod = $("input[name='ck']:checked").attr('tntcode');
	    var gnrprpkbn = $("input[name='ck']:checked").attr('alt1');
	    var gnrprpcod = $("input[name='ck']:checked").attr('alt2');
	    
	    //1検索条件の保持用--serialize（）指序列化表单值     json 数据类型  只对form有效
	    var formVals = $("#newform").serialize();
	    
	    //1用于在控制台输出信息
	    console.log(formVals);
	    if(tntcod == undefined){
	    	alert("対象が選択されていません");
	    	return;
	    }else{
		    location.href="../lmm116Controller/init?modflg=1";
	    }	    
	}

//s単項目チェックを行う:
	function toCheck(){
		var searchScope_Rdo = $("input[name='searchScope_Rdo']:checked").val();//検索範囲
		
		var gnrprpKbn_Sct = document.getElementById("gnrprpKbn_Sct").value;//汎用区分
		
		var appOrgCode_Txt = document.getElementById("appOrgCode_Txt").value;//申請組織コード
		
		var gnrprpKbnName_Txt = document.getElementById("gnrprpKbnName_Txt").value;//汎用区分名
		
		var gnrprpCode_Txt = document.getElementById("gnrprpCode_Txt").value;//汎用コード
		
		var gnrprpName1_Txt = document.getElementById("gnrprpName1_Txt").value;//汎用名１
		 
		/* 1下面是具体的验证各字段满足检索条件的方法 */
        var a=/^[0-9a-zA-Z]{1,12}$/;
		
      //a申請組織コード
		if((appOrgCode_Txt != null) && (appOrgCode_Txt != "")){
			var re1=a.test(appOrgCode_Txt);
			if(re1 == false){
				alert("验证checked");
				document.getElementById("appOrgCode_Txt").style.color = red;
			}
		}
		
		//a汎用コード
		if((gnrprpCode_Txt != null) && (gnrprpCode_Txt != "")){
			var re2=a.test(gnrprpCode_Txt);
		}
				
		
		//a汎用区分
		if((gnrprpKbn_Sct != null) && (gnrprpKbn_Sct != "")){
			var re6 = true;
		}
			
		
	    var b=/^[0-9a-zA-Z]{1,50}$/;

		
		//a汎用区分名
		if((gnrprpKbnName_Txt != null) && (gnrprpKbnName_Txt != "")){
			var re3=b.test(gnrprpKbnName_Txt);
				
		}
		
		//a汎用名１
		if((gnrprpName1_Txt != null) && (gnrprpName1_Txt != "")){
			var re4=b.test(gnrprpName1_Txt);
		}
		 
						
		if((re1 = true)||(re2 = true)||(re3 = true)||(re4 = true)||(re6 = true)){	
			 alert("检索条件验证成功，即将为您跳转到画面！");
			 location.href="http://localhost:8080/icloud20181210/lmm115Controller/quallBy?searchScope_Rdo="+searchScope_Rdo+"&gnrprpKbn_Sct="+gnrprpKbn_Sct+"&appOrgCode_Txt="+appOrgCode_Txt+"&gnrprpKbnName_Txt="+gnrprpKbnName_Txt+"&gnrprpCode_Txt="+gnrprpCode_Txt+"&gnrprpName1_Txt="+gnrprpName1_Txt;		     
			 
		}else{
			alert("您输入的检索条件不符合条件，请重新输入！");
		}
		
	}

</script>
</head>
<body>
<form method="post" id="newform">
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
		<table class="fixedTable" cellspacing="0">
			<tr>
				<td class="label_center" class="spacewidth" >
					&nbsp;
				</td>
				<td class="label_color lablewidth" >
					<nobr>検索範囲</nobr>
				</td>
				<td class="label_left inputwidth"><nobr>
					<input type="radio" name="searchScope_Rdo" id="searchScope_Rdo" value="1"/><label for="searchScope_Rdo:1">全件</label>&nbsp;
					<input type="radio" name="searchScope_Rdo" id="searchScope_Rdo1" value="2" checked="checked"/><label for="searchScope_Rdo1:2">廃止を除く</label></nobr>
					
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
				<td class="label_left" ><input type="text" id="appOrgCode_Txt" name="appOrgCode_Txt" maxlength="12" size="37" value="${appOrgCode_Txt}" />
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>汎用区分</nobr></td>
				<td class="label_left" >
					<select name="gnrprpKbn_Sct" id="gnrprpKbn_Sct">
					    
					    <option value="">[全件]</option>
					    <c:forEach var="list" items="${gnrprpKbn_Sct}">					         
					         <option value="${list.gnrprpkbn}">${list.gnrprpkbn}</option>
					    </c:forEach>					
					
					</select>
				</td>
				
				<td >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>汎用区分名</nobr></td>
				<td class="label_left"  ><input type="text" id="gnrprpKbnName_Txt" name="gnrprpKbnName_Txt" maxlength="50" size="37" value="${gnrprpKbnName_Txt}"/>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>汎用コード</nobr></td>
				<td class="label_left" ><input type="text" id="gnrprpCode_Txt" name="gnrprpCode_Txt" maxlength="12" size="37" value="${gnrprpCode_Txt}"/>
				</td>
				<td >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>汎用名１</nobr></td>
				<td class="label_left"  ><input type="text" id="gnrprpName1_Txt" name="gnrprpName1_Txt" maxlength="50" size="37" value="${gnrprpName1_Txt}"/>
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
			<input type="button" value="検索" id="search_Btn"
				class="button_normal" onclick="toCheck()" /></input> &nbsp;
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
		<table id="gnrprp_List" class="data_table">
			<tr>
				<th class="col_header">選択</th>
				<th class="col_header">廃止</th>
				<th class="col_header">汎用区分</th>
				<th class="col_header">汎用コード</th>
				<th class="col_header">コード種別</th>
				<th class="col_header">汎用名１</th>
				<th class="col_header">汎用名２</th>
				<th class="col_header">申請組織コード</th>
			</tr>
			<c:forEach var="list115" items="${listLmm115Dto}" varStatus="status">
				<tr>
					<td class="label_center_groove">
						<input type="radio" 
						tntcode="${list115.tntcod}"
						alt1="${list115.gnrprpkbn}"
						alt2="${list115.gnrprpcod}"
						 value="${status.index}"
						 name="ck"					
						 value="1" />
					</td>
					<td class="label_center_groove">
					    <c:choose>
					       <c:when test="${list115.aboflg==1}">〇</c:when>
					       <c:otherwise><br/></c:otherwise>					    
					    </c:choose>
					
					</td>
					
					
					<td class="label_center_groove">${list115.gnrprpkbn}</td>
					<td class="label_center_groove">${list115.gnrprpcod}</td>
					<td class="label_center_groove">${list115.codoutcod}</td>
					<td class="label_center_groove">${list115.gnrprpnam1}</td>
					<td class="label_center_groove">${list115.gnrprpnam2}</td>
					<td class="label_center_groove">${list115.apporgcod}</td>
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
			<input type="submit" value= "DashBoardへ戻る" id="dashBoard_Btn" name="dashBoard_Btn"
			    class="button_normal_bashB" onclick="javascript:history.go(-1)"/> 
		</td>
		<td align="right">
			<input type="submit" value= "新規" id="insert_Btn" 
			     class="button_normal" onclick="toAdd();"/> 
			<input type="submit" value= "変更" id="modify_Btn" 
			     class="button_normal" onclick="toUpdate();"/> 
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