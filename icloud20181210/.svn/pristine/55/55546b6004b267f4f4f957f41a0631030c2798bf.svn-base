<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>イベント集計メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLMM108.css">
<!-- <script src="./js/windowcontrol.js"></script>  --> 
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.validate.js"></script>
</head>
<body>
<script type="text/javascript">
	/* 削除イベントの更新 */
	function updateOrAdd(){
		
		//フォームオブジェクトを取得
		var lmm108form = document.getElementById("lmm108Form");
		
		//楽屋からメッセージを取得します。
		var str = "${message}";
		
		//confirmをポップアップし、リターン値を取得します。
		var check = window.confirm(str);
		
		//trueかどうかを判断する
		if ( check ) {
			
			//追加か変更かを判断します。
			if( ${modflg} == 1 ){
				
				//変更ページの提出
				lmm108form.submit();
			//falseかどうかを判断する
			} else {
				
				//フォームのaction属性を変更します。
				lmm108form.action="doAdd_108";
				
				//新規ページの提出
				lmm108form.submit();
			}
		}
	}
	
	//組織検索画面がポップアップ
    function openWindow(){
        var apporgcod = window.document.getElementById("appOrgcod_Txt_search").value;
       	window.open("${pageContext.request.contextPath}/slvb108/init?orgCode_Txt=" + apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
       	
       	//兼容性
       // window.showModalDialog("${pageContext.request.contextPath}/slvb704/init?orgCode_Txt=" + apporgcod,"window","dialogWidth:876px;status:no;dialogHeight:1104px");
    }
	
	/* 申請組織コードイベントの検証 */
	function checkOrg(){
		
		//テキストボックスの値を取得します。
		var orgCodeVal = document.getElementById("appOrgcod_Txt_search").value;
		
		
		$.ajax({
    		url:"lmm108checkOrg",
    		data:{'orgCode':orgCodeVal}, //json格式
    	    type:"POST",
    	    dataType:'JSON',
    	    success:function(backData){
    	    	//alert("test");
    	    	//alert(backData);
    	    	//チェックメッセージを画面に表示する
    	    	$("#orgName_Txt").val(backData);
    	    },
    		error:function(obj){
    			alert("连接出了问题");
    		}
    	
    	});
	}
	
	/* 前のページに戻ります。 */
	function backUp(){
		
		//前のページに戻ります。
		history.go(-1);
		
	}
	
	/* 検証イベント集計コード*/
	function checkEvtCod(){
		
		//正規表現
		var reg = /[0-9A-z!-/]{1,12}$/;
		
		//テキストボックスの値を取得します。
		var str = document.getElementById("evtMrgCode_Txt").value;
		
		//空かどうか判断する
		if ( str == "" || str == null ) {
			//楽屋に伝わる情報が必要です。
			var second = "イベント集計コード";
			
			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004009",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	    //要求成功後のコールバック関数
	    	    success:function(obj){
	    	    	
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#evt_cod").html(obj.msg);
	    	    },
	    	    //要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//テキストボックスに文字列を入力する長さが要求を満たしていないかどうかを判断します。
		}else if ( str.length > 12 ) {
			//楽屋に伝わる情報が必要です。
			var second = "イベント集計コード"+","+"20";
			
			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004010",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	  	//要求成功後のコールバック関数
	    	    success:function(backData){
	    	    	
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#evt_cod").html(obj.msg);
	    	    },
	    	    //要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//正規表現の要求を満たしていない場合
		}else if ( !reg.test( str )){
			//楽屋に伝わる情報が必要です。
			var second = "イベント集計コード";

			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004010",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	 	//要求成功後のコールバック関数
	    	    success:function(obj){
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#evt_cod").html(obj.msg);
	    	    },
	    	  	//要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//正規表現の要求を満たす場合
		}else if ( reg.test( str )){
			$("#evt_cod").html("");
		}
	}
	
	/* 検証イベント集計名称 */
	function checkEvtNam(){
		
		//テキストボックスの値を取得します。
		var str = document.getElementById("evtMrgName_Txt").value;
		
		////テキストボックスに文字列を入力する長さが要求を満たしていないかどうかを判断します。
		if ( str.length > 50 ) {
			//楽屋に伝わる情報が必要です。
			var second = "イベント集計名称"+","+"50";
			
			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004010",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	 	//要求成功後のコールバック関数
	    	    success:function(obj){
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#evt_nam").html(obj.msg);
	    	    },
	    	  	//要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//正規表現の要求を満たす場合
		}else{
			$("#evt_nam").html("");
		}
	}
	
	/* 検証表示順 */
	function checkViewList(){
		
		//正規表現
		var reg = /[0-9]{1,4}$/;
		
		//テキストボックスの値を取得します。
		var str = document.getElementById("dspNum_Txt").value;
		
		//テキストボックスに文字列を入力する長さが要求を満たしていないかどうかを判断します。
		if ( str.length > 4 ) {
			//楽屋に伝わる情報が必要です。
			var second = "表示順"+","+"4";
			
			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004010",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	  	//要求成功後のコールバック関数
	    	    success:function(obj){
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#view_list").html(obj.msg);
	    	    },
	    	  	//要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//正規表現の要求を満たしていない場合
		}else if ( !reg.test( str )){
			//楽屋に伝わる情報が必要です。
			var second = "表示順";
			
			//ajaxはバックグラウンドの情報を取得する。
			$.ajax({
	    		url:"lmm108checkMsg",
	    		data:{'first':"LVB-004010",'second':second}, //json格式
	    	    type:"POST",
	    	    dataType:'JSON',
	    	    //要求成功後のコールバック関数
	    	    success:function(obj){
	    	    	//バックステージからのメッセージを表示します。
	    	    	$("#view_list").html(obj.msg);
	    	    },
	    	  	//要求失敗のコールバック関数
	    		error:function(obj){
	    			alert("何か悪いこと！！！");
	    		}
	    	});
		//正規表現の要求を満たす場合
		}else if ( reg.test( str )){
			$("#view_list").html("");
		}
	}
	
	/* ページプリロード */
	$(document).ready(function(){
		/* リセットボタンイベント */
		$("#clear_Btn").click(function(){

			//入力テキストボックスのリセット
			$("#evtMrgCode_Txt").val("${lmm108dto.evtmrgcod }");
			$("#evtMrgName_Txt").val("${lmm108dto.evtmrgnam }");
			$("#dspNum_Txt").val("${lmm108dto.dispnum }");
			$("#appOrgcod_Txt_search").val("${lmm108dto.apporgcod }");
			//リセットを検証
			$("#evt_cod").html("");
			$("#evt_nam").html("");
			$("#view_list").html("");
			$("#orgName_Txt").val("");
		});
	});
	
</script>
<form action="doUdp_108" method="post" id="lmm108Form">
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
					<u><nobr>前回更新ユーザ&nbsp;${lmm108dto.updnam }</nobr></u>
				</td>
				<td class="label_normal" width="180">
					&nbsp;
				</td>
				<td class="label_normal" width="200">
				<c:if test="${modflg == 0 }">
				</c:if>
				<c:if test="${modflg == 1 }">
					<u><nobr>前回更新日時:
						<input type="text" id="lmm108dto.updateYmdhm_Lbl"
                          name="updymdhms"
                          value="${lmm108dto.updymdhms }" />
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
					<input type="text" id="evtMrgCode_Txt" name="evtmrgcod" maxlength="12" 
					size="74" value="${lmm108dto.evtmrgcod }" onblur="checkEvtCod()"/>
					<span id="evt_cod"></span>
				</c:if>
				<c:if test="${modflg == 1 }">
					<input type="text" id="evtMrgCode_Txt" name="evtmrgcod" maxlength="12" 
					size="74" value="${lmm108dto.evtmrgcod }" readonly="readonly"/>
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
					<input type="text" id="evtMrgName_Txt" name="evtmrgnam" maxlength="50" size="74" value="${lmm108dto.evtmrgnam }" onblur="checkEvtNam()"/>
					<span id="evt_nam"></span>
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
					<input type="text" id="dspNum_Txt" name="dispnum" maxlength="4" size="74" value="${lmm108dto.dispnum }" onblur="checkViewList()"/>
					<span id="view_list"></span>
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
					<input type="text" id="appOrgcod_Txt_search" name="apporgcod" maxlength="12" size="15" value="${lmm108dto.apporgcod }"/>
					<input type="button" value= "検索" id="appSearch_Btn" class="button_app" onclick="openWindow()"/>
					<!-- <span id="orgMsg"></span> -->
					<input type="text" name="appOrgName_Lbl" id="orgName_Txt"
                     class="{validate:{stringMaxLength:12}}" readonly="readonly">
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
                    <input type="checkbox" id="aboFlg_Chk" name="aboflg" value="0" disabled="disabled">　廃止する場合にチェック                                
                 </c:if>
                 <c:if test="${modflg == 1 }">
                 
                 		<!-- 初期化時に表示される二つの場合 -->
                 		<c:if test="${lmm108dto.aboflg == '1' }">
							<input type="checkbox" id="aboFlg_Chk" name="aboflg" checked="checked">　廃止する場合にチェック
						</c:if>
						<c:if test="${lmm108dto.aboflg == '0'  }">
							<input type="checkbox" id="aboFlg_Chk" name="aboflg" >　廃止する場合にチェック
						</c:if>
						
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
			<input type="button" value= "戻る" id="back_Btn" class="button_normal" onclick="backUp()"/> 
		</td>
		<td align="right">
			<input type="button" value= "クリア" id="clear_Btn" class="button_normal"/> 
			<input type="button" value= "変更" id="update_Btn" class="button_normal" onclick="updateOrAdd()"/>
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