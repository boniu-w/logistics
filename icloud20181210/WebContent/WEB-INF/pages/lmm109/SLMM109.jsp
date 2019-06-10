<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧画面</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/common.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js"
	charset="UTF-8"></script>
<script type="text/javascript">
	$(function() {

		//検索範囲の初期値の設定処理
		var searchScope_Rdos = $("input[name='searchScope_Rdo']");
		$.each(searchScope_Rdos, function(i, e) {
			var value = $(e).attr("value");
			if (value == "${searchScope_Rdo}") {
				$(e).attr("checked", "true");
			}
		});

		//一覧明細部のデフオルト処理    
		window.document.all("ck")[0].checked = true;

	});

	
    $(document).ready(function(){
    	 //検証
        var LVB004010="に使用できない文字が含まれています.<br>";
        var LVB004030="文字以下で入力してください.<br>";
        
        var flg1=true;
        var flg2=true;
        var flg3=true;
        //申請組織コード
	    $('input[name=applyOrgCode_Txt]').blur(function(){
	    	var str = $('input[name=applyOrgCode_Txt]').val();
	    	if(str.search(/^[0-9a-zA-Z]*$/)!=-1){
	    		flg1=true;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("");
	    		if(str.length>=13){
	    			flg1=false;
	    			$(".header tbody tr:eq(1) td:eq(0)").html("申請組織コードは12"+LVB004030)
	    		}
	    	}else{
	    		flg1=false;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("申請組織コード"+LVB004010);
	    		if(str.length>=13){
	    			$(".header tbody tr:eq(1) td:eq(0)").append("申請組織コードは12"+LVB004030);
	    		}
	    	}
	    });
        
	  //商品一覧画面に遷移する 更新の場合
		function toUpdate() {
			var tntcod = $("input[name='ck']:checked").attr('tntcode');
			
			var itmcod = $("input[name='ck']:checked").attr('itmcod');
			
			var formVals =$("#newform").serialize();
			
			if (tntcod == undefined) {
				
				alert("対象が選択されていません");
				return;
			} else {
				location.href = "../lmm110Controller/init?modeGam_Hdn=1&itmcod="+ itmcod + "&tntcod=" + tntcod +"&"+formVals;
			}
		}
		//新規作成モードで商品メンテナンス画面に遷移する
		function toAdd() {
			location.href = "../lmm110Controller/init?modeGam_Hdn=0";
		}
		
		 
	    //商品コード
	    $('input[name="itemCode_Txt"]').blur(function(){
	    	var str =$('input[name="itemCode_Txt"]').val();
	    	if(str.search(/^[0-9a-zA-Z]*$/)!=-1 ){
	    		flg2=true;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("");
	    	if(str.length>=35){
	    		flg2=false;	
	    		$(".header tbody tr:eq(1) td:eq(0)").html("商品コードは35"+LVB004030);
	    	   }
	    	}else{
	    		flg2=false;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("商品コード"+LVB004010);
	    		if(str.length>=13){
	    		$(".header tbody tr:eq(1) td:eq(0)").append("商品コードは12"+msge+LVB004030);
	    		}
	    	}
	    });
	    //商品名
	    $('input[name="itemName_Txt"]').blur(function(){
	    	var str = $('input[name="itemName_Txt"]').val();
	    	if(str.length>=51){
	    		flg3=false;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("商品名は50"+msge+LVB004030);
	    	}else{
	    		flg3=true;
	    		$(".header tbody tr:eq(1) td:eq(0)").html("");
	    	}
	    });
	    //検索
	    $("#search_Btn").click(function(){
	    	console.log("ok1:"+flg1);
	    	console.log("ok2:"+flg2);
	    	console.log("ok3:"+flg3);
	    	if(flg1 && flg2 && flg3){
	    		$("form").submit();
	    	}else{
	    		return false;
	    	}
	   });
     
    
    	});
    
    
</script>

</head>
<body>
	<form action="../lmm109Controller/selectInfo" method="post" id="newform">
		<table class="body">
			<tr>
				<td colspan="2">
					<table class="header_area">
						<tr>
							<td><jsp:include page="header.jsp" flush="true" /></td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>
					<table class="menu">
						<tr>
							<td class="menu"><jsp:include page="menu.jsp" flush="true" />
							</td>
						</tr>
					</table>
				</td>
				<td>
					<table class="main">
						<tr>
							<td class="main">

								<table>
									<tr>
										<td>
											<table class="fixedTable">
												<tr>
													<td class="label_center" class="spacewidth">&nbsp;</td>
													<td class="label_color lablewidth"><nobr>検索範囲</nobr></td>
													<c:if test="${searchScope_Rdo == 1 }">
														<td class="label_left inputwidth"><nobr>
																<input type="radio" value="1" name="searchScope_Rdo"
																	checked /><label for="searchScope:1">全件</label>&nbsp;
																<input type="radio" value="2" name="searchScope_Rdo" /><label
																	for="searchScope:2">適用期間内</label>
															</nobr></td>
													</c:if>
													<c:if test="${searchScope_Rdo != 1 }">
														<td class="label_left inputwidth"><nobr>
																<input type="radio" value="1" name="searchScope_Rdo" /><label
																	for="searchScope:1">全件</label>&nbsp; <input
																	type="radio" value="2" name="searchScope_Rdo" checked /><label
																	for="searchScope:2">適用期間内</label>
															</nobr></td>
													</c:if>
													<td class="spacewidth">&nbsp;</td>
													<td class="lablewidth">&nbsp;</td>
													<td class="inputwidth">&nbsp;</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color"><nobr>申請組織コード</nobr></td>
													<td class="label_left"><input type="text"
														name="applyOrgCode_Txt" id="applyOrgCode_Txt"
														maxlength="12" size="37" value="${ applyOrgCode_Txt}" /></td>
													<td>&nbsp;</td>
													<td>&nbsp;</td>
													<td>&nbsp;</td>

													</td>
													<span id="huo"></span>
												</tr>

												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color"><nobr>商品コード</nobr></td>
													<td class="label_left"><input name="itemCode_Txt"
														type="text" id="itemCode_Txt" maxlength="35" size="37"
														value="${ itemCode_Txt}" /></td>
													<td>&nbsp;</td>
													<td class="label_color"><nobr>商品名</nobr></td>
													<td class="label_left"><input type="text"
														name="itemName_Txt" id="itemName_Txt" maxlength="50"
														size="37" value="${ itemName_Txt}" /></td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td align="right"><input type="submit" value="検索"
											id="search_Btn" class="button_normal" /></input> &nbsp;</td>
									</tr>
									<tr>
										<td>&nbsp;</td>
									</tr>
									<tr>
										<td colspan="2">
											<div class="tablearea">
												<table id="evtMrg_List" class="data_table">
													<tr>
														<th class="col_header">選択</th>
														<th class="col_header">廃止</th>
														<th class="col_header">商品コード</th>
														<th class="col_header">適用開始日時</th>
														<th class="col_header">適用終了日時</th>
														<th class="col_header">商品名</th>
														<th class="col_header">申請組織</th>
													</tr>
													<!-- <tr>
														<td class="label_center_groove">
															<input type="radio" value="1" />
														</td>
														<td class="label_center_groove">L[廃止]</td>
														<td class="label_center_groove">L[商品コード]</td>
														<td class="label_center_groove">L[適用開始日時]</td>
														<td class="label_center_groove">L[適用終了日時]</td>
														<td class="label_center_groove">L[商品名]</td>
														<td class="label_center_groove">L[申請組織]</td>
													</tr> -->
													<c:forEach items="${ list109}" var="list"
														varStatus="status">
														<tr>
															<td class="label_center_groove"><input type="radio"
																tntcod="${list.tntcod}" itmcod="${list.itmcod}"
																value="${status.index}" name="ck" /></td>
															<td class="label_center_groove"><c:choose>
																	<c:when test="${list.aboflg==1}">〇</c:when>
																	<c:otherwise><br>
																	</c:otherwise>
																</c:choose></td>
															<%-- <td class="label_center_groove">${list.aboflg}</td> --%>
															<td class="label_center_groove">${list.itmcod }</td>
															<td class="label_center_groove">${list.appstaymdhms }</td>
															<td class="label_center_groove">${list.appendymdhms }</td>
															<td class="label_center_groove">${list.itmnam1 }</td>
															<td class="label_center_groove">${list.orgnam1 }</td>
														</tr>

													</c:forEach>
												</table>
											</div>
										</td>
									</tr>
								</table>
								<table class="common_area">
									<tr>
										<td align="left"><input type="submit"
											value="DashBoardへ戻る" id="goToDashBoard_Btn"
											class="button_normal_bashB"
											onclick="javascript:history.go(-1);" /></td>
										<td align="right"><input type="submit" value="新規"
											id="goToItemDetail_Insert_Btn" class="button_normal"
											onclick="toAdd();" /> <input type="submit" value="変更"
											id="goToItemDetail_Update_Btn" class="button_normal"
											onclick="toUpdate();" /></td>
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