<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>組織検索画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLVB704.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript">
    
    //获取父窗口
	//var k = window.dialogArguments;
    
    //選択した値を取得してウィンドウを閉じます。
	function setVal() {
    	
    	//ラジオの集合を取得します
		var list = document.getElementsByClassName("appOrgCodeList");
    	
    	//ラディオの集合
		for ( var i = 0; i < list.length; i++) {
			
			//ラジオオブジェクトを取得
			var radio = list[i].children[0].children[0];
			
			//appOrgcod値を取得
			var appOrgcod = list[i].children[1].innerHTML;
			
			//appOrgName値を取得
			var appOrgName = list[i].children[4].innerHTML;
			
			//ラジオが選択されているかどうかを判断します。
			if ( radio.checked ) {
				console.log ( appOrgcod, appOrgName );
				
				//兼容性
				//k.document.getElementById("appOrgcod_Txt_search").value = appOrgcod;
				//k.document.getElementById("orgName_Txt").value = appOrgName;
				//現在の値を親ウィンドウの要素に変換します。
				window.opener.document.getElementById("appOrgcod_Txt_search").value = appOrgcod;
				window.opener.document.getElementById("orgName_Txt").value = appOrgName;
				
				//ループを終了
				break;
			}
		}
		
		//サブウィンドウを閉じる
		window.close();
	}
	
	//クエリーボタン機能の実現
	function search(){
		
		//orgCode_Txt値を取得
		var orgcod = $("#orgCode_Txt").val();
		
		//orgName1_Txt値を取得
		var orgcodNam = $("#orgName1_Txt").val();
		
		//ajax表示結果
		$.ajax({
    		url:"seacher",
    		data:{
    			'orgcod':orgcod,
    			'orgcodNam':orgcodNam
    			}, //json格式
    	    type:"POST",
    	    dataType:'JSON',
    	  	//要求成功後のコールバック関数
    	    success:function(obj){
    	    	var list = obj;
    	    	var strThead = "<tr>"+
				"<th class='col_header'>選択</th>"+
				"<th class='col_header'>組織コード</th>"+
				"<th class='col_header'>適用開始日時</th>"+
				"<th class='col_header'>適用終了日時</th>"+
				"<th class='col_header'>組織名１</th>"+
				"<th class='col_header'>組織名２</th>"+
				"<th class='col_header'>組織名３</th>"+
				"<th class='col_header'>組織名４</th>"+
				"<th class='col_header'>組織名５</th>"+
			"</tr>";
    	    	var str = "";
				for(var i=0;i<list.length;i++){
					str+="<tr class='appOrgCodeList'>"+
					"<td class='label_center_groove'>"+
					"<input type='radio' value='1' />"+
				"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGCOD+"</td>"+
				"<td class='label_center_groove'>"+list[i].APPSTAYMDHMS+"</td>"+
				"<td class='label_center_groove'>"+list[i].APPENDYMDHMS+"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGNAM1+"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGNAM2+"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGNAM3+"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGNAM4+"</td>"+
				"<td class='label_center_groove'>"+list[i].ORGNAM5+"</td>"+
			"</tr>";
				}
    	    	//バックステージからのメッセージを表示します。
    	    	$("#org_List").html( strThead+str );
    	    },
    	  	//要求失敗のコールバック関数
    		error:function(obj) {
    			alert("何か悪いこと！！！");
    		}
    	});
	}
</script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/slvb108/init" id="slvb404Form" target="slvb404Window">
		<table class="body_popup">
			<tr>
				<td>
					<table>

						<tr>
							<td class="label_color_popup"><nobr>組織識別区分</nobr></td>
							<td class="label_left_popup"><nobr>
									<input type="radio" name="orgKbn_Rdo" />
										<label for="searchScope:1">システム利用組織</label>&nbsp; 
									<input type="radio" name="orgKbn_Rdo" />
										<label for="searchScope:2">荷送人/荷受人</label>
								</nobr></td>
							<td class="space_area">&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td class="label_color_popup"><nobr>組織コード</nobr></td>
							<td class="label_left_popup">
								<input type="text" id="orgCode_Txt" maxlength="12" size="20" name="orgCode_Txt" value="${orgCode_Txt }"/>
							</td>
							<td class="space_area">&nbsp;</td>
							<td class="label_color_popup"><nobr>組織名１</nobr></td>
							<td class="label_left_popup">
								<input type="text" id="orgName1_Txt" maxlength="35" size="35" name="orgName1_Txt"/>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right"><input type="button"
					value="検索" id="search_Btn"
					class="button_normal" onclick="search()"/></input> &nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					<div class="tablearea">
						<table id="org_List" class="data_table">
							<tr>
								<th class="col_header">選択</th>
								<th class="col_header">組織コード</th>
								<th class="col_header">適用開始日時</th>
								<th class="col_header">適用終了日時</th>
								<th class="col_header">組織名１</th>
								<th class="col_header">組織名２</th>
								<th class="col_header">組織名３</th>
								<th class="col_header">組織名４</th>
								<th class="col_header">組織名５</th>
							</tr>
							<c:forEach items="${list }" var="map">
								<tr class="appOrgCodeList">
									<td class="label_center_groove">
										<input type="radio" value="1" />
									</td>
									<td class="label_center_groove">${map.ORGCOD}</td>
									<td class="label_center_groove">${map.APPSTAYMDHMS}</td>
									<td class="label_center_groove">${map.APPENDYMDHMS}</td>
									<td class="label_center_groove">${map.ORGNAM1}</td>
									<td class="label_center_groove">${map.ORGNAM2}</td>
									<td class="label_center_groove">${map.ORGNAM3}</td>
									<td class="label_center_groove">${map.ORGNAM4}</td>
									<td class="label_center_groove">${map.ORGNAM5}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<table class="common_area">
						<tr>
							<td align="left"><input type="button" value="キャンセル" id="cancel_Btn" class="button_normal" onclick="window.close()"/></td>
							<td align="right"><input type="button" onclick="setVal()" value="確定" id="decision_Btn" class="button_normal" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>