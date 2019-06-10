<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>組織別名称一覧画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLMM111.css" charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" charset="UTF-8" />
<script type="text/javascript" src="../js/lmm111.js"></script>
<script type="text/javascript" src="../scripts/jquery-3.1.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		  
	    //検索範囲の初期値の設定処理
	    var searchZone_Rdos = $("input[name='searchZone_Rdo']");
	    $.each(searchZone_Rdos,function(i, e) {
	        var value = $(e).attr("value");
	        if(value == "${searchZone_Rdo}"){
	            $(e).attr("checked","true");
	        }
	    });
	    
	  //一覧明細部のデフオルト処理    
	  window.document.all("ck")[0].checked = true;
	  
	});
	
	 //メンテナンス画面に遷移する 更新の場合
     function toUpdate(){
        var tntcod = $("input[name='ck']:checked").attr('tntcode');
        var orgcod=$("input[name='ck']:checked").attr('orgcod')
        var orgitmcod = $("input[name='ck']:checked").attr('orgitmcod');
        //検索条件の保持用
        var formVals = $("#newform").serialize();//json 数据类型  只对form有效
        console.log(formVals);
        if(tntcod == undefined){
            alert("対象が選択されていません");
            return;
        } else {                                         
            location.href="../lmm112Controller/init?modFlg=1&orgcod="+orgcod+"&orgitmcod="+orgitmcod+"&"+"&tntcod="+tntcod+"&"+formVals;
        }
    } 
   //メンテナンス画面に遷移する 新規の場合
 	function toAdd() {
 		location.href = "../lmm112Controller/init?modFlg=0";
 	}
</script>

</head>
<body>
<form action="../lmm111Controller/findLmm111" method="post"　id="newform">
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
				<c:if test="${searchZone_Rdo == 1 }">
				<td class="label_left inputwidth" ><nobr>
					<input type="radio" name="searchScope_Rdo"  value="1" checked /><label for="searchScope:1">全件</label>&nbsp;
					<input type="radio" name="searchScope_Rdo"  value="2"  /><label for="searchScope:2">適用期間内</label></nobr>
				</td>
				</c:if>
				<c:if test="${searchZone_Rdo !=1}">
				<td class="label_left inputwidth" ><nobr>
					<input type="radio" name="searchScope_Rdo"  value="1" /><label for="searchScope:1">全件</label>&nbsp;
					<input type="radio" name="searchScope_Rdo"  value="2" checked /><label for="searchScope:2">適用期間内</label></nobr>
				</td>
				</c:if>
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
				<td class="label_left" ><input type="text" id="appOrgCode_Txt" name="appOrgCode_Txt" value="${appOrgCode_Txt }" maxlength="12" size="37" onchange="checkAppOrgCode_Txt()"/>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>組織コード</nobr></td>
				<td class="label_left" ><input type="text" id="orgCode_Txt" name="orgCode_Txt" value="${orgCode_Txt }" maxlength="12" size="37" onchange="checkOrgCode_Txt()"/>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>組織別商品コード</nobr></td>
				<td class="label_left" ><input type="text" id="orgItmCode_Txt" name="orgItmCode_Txt" value="${orgItmCode_Txt }" maxlength="35" size="37" onchange="checkOrgItmCode_Txt()"/>
				</td>
				<td >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>組織別商品名称</nobr></td>
				<td class="label_left"  ><input type="text" id="orgItmName_Txt" name="orgItmName_Txt" value="${orgItmName_Txt }" maxlength="50" size="37" onchange="checkOrgItmName_Txt()" />
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
				class="button_normal" /></input> &nbsp;
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
		
		<table id="orgItm_List" class="data_table">
			<tr>
				<th class="col_header">選択</th>
				<th class="col_header">廃止</th>
				<th class="col_header">組織コード</th>
				<th class="col_header">組織別商品コード</th>
				<th class="col_header">適用開始日時</th>
				<th class="col_header">適用終了日時</th>
				<th class="col_header">組織別商品名</th>
				<th class="col_header">商品コード</th>
				<th class="col_header">商品名</th>
				<th class="col_header">申請組織コード</th>
			</tr>
			<c:forEach items="${list}" var="list1" varStatus="status">
				<tr>
					<td class="label_center_groove">
						<input type="radio" 
						  tntcode="${list1.tntcod}"
						  orgcod="${list1.orgcod}"
                          orgitmcod="${list1.orgitmcod}"
                          value="${status.index}" name="ck" class="ck" value="1" />						
					</td>
					<td class="label_center_groove">			
				    <c:choose>
                        <c:when test="${list1.aboflg==1}">〇</c:when>
                        <c:otherwise><br></c:otherwise>
                    </c:choose> 					
					</td>
					<td class="label_center_groove">${list1.orgcod}</td>
					<td class="label_center_groove">${list1.orgitmcod}</td>
					<td class="label_center_groove">${list1.appstaymdhms}</td>
					<td class="label_center_groove">${list1.appendymdhms}</td>
					<td class="label_center_groove">${list1.orgitmnam}</td>
					<td class="label_center_groove">${list1.itmcod}</td>
					<td class="label_center_groove">${list1.itmnam1}</td>
					<td class="label_center_groove">${list1.apporgcod}</td>
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
			<input type="submit" value= "DashBoardへ戻る" id="dashBoard_Btn" class="button_normal_bashB" onclick="javascript:history.go(-1);" /> 
		</td>
		<td align="right">
			<input type="submit" value= "新規" id="insert_Btn" class="button_normal" onclick="toAdd();"  /> 
			<input type="submit" value= "変更" id="modify_Btn" class="button_normal" onclick="toUpdate();" />
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