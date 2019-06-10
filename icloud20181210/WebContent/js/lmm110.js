//サブミットを検証する
function check(){
	if (window.confirm("処理を実行します。よろしいですか？")){
		if (checkItemCode_Txt()&checkAppStaHM_Txt()&checkAppEndHM_Txt()&checkItemName_Txt()&checkAppOrgCod_Txt()){
			//結果全てがtrueであれば、フォームの提出を行います。
			return true;
		}else {
			return false;
		}
	}else {
		return false;
	}
}

//商品コードを検証する
function checkItemCode_Txt(){
	var itemCode_Txt = $("#itemCode_Txt").val();
	//非空認証
	if (itemCode_Txt!=null && itemCode_Txt!=""){
		var reg = /^[0-9A-z]+$/;
		var resultCheckItemCode_Txt = reg.test(itemCode_Txt);
		var result = true;
		//正則にかなう
		if (resultCheckItemCode_Txt){
			$("#fItemCode_Txt").remove();
		//正則にそむく
		}else {
			$("#fItemCode_Txt").remove();
			$("#itemCode_Txt").after("<span class='sItemCode_Txt' id='fItemCode_Txt'>商品コードに使用できない文字が含まれています.</span>");
			result = false;
		}
		//長さが合う
		if (itemCode_Txt.length<=35){
			$("#lItemCode_Txt").remove();
		//長さが合わない
		}else {
			$("#lItemCode_Txt").remove();
			$("#itemCode_Txt").after("<span class='sItemCode_Txt' id='lItemCode_Txt'>商品コードは35文字以下で入力してください.</span>");
			result = false;
		}
		
		if (result){
			$(".sItemCode_Txt").remove();
			return true;
		}else {
			return false;
		}
	}else {
		$("#itemCode_Txt").css("background","#89cff0");
		$("#lItemCode_Txt").remove();
		$("#itemCode_Txt").after("<span class='sItemCode_Txt' id='lItemCode_Txt'>商品コードは入力必須です.</span>");
		return false;
	}
}

//適用開始日·時分を検証する
function checkAppStaHM_Txt(){
	var appStaHh_Txt = $("#appStaHh_Txt").val();
	var appStaMm_Txt = $("#appStaMm_Txt").val();
	//適用開始日·時の非空認証
	if (appStaHh_Txt!=null && appStaHh_Txt!=""){
		var reg = /^[0-9]+$/;
		var hResult = true;
		var resultCheckAppStaHh_Txt = reg.test(appStaHh_Txt);
		
		//適用開始日·時の正則にかなう
		if (resultCheckAppStaHh_Txt){
			$("#hfAppStaHh_Txt").remove();
		//適用開始日·時の正則にそむく
		}else {
			$("#hfAppStaHh_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hfAppStaHh_Txt'>適用開始日·時に使用できない文字が含まれています.</span>");
			hResult = false;
		}
		
		//適用開始日·時の長さが合う
		if (appStaHh_Txt.length>2){
			$("#hlAppStaHh_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hlAppStaHh_Txt'>適用開始日·時は2文字以下で入力してください.</span>");
			hResult = false;
		//適用開始日·時の長さが合わない
		}else {
			$("#hlAppStaHh_Txt").remove();
		}
		
		//適用開始日·時のフォーマットが合う
		if (appStaHh_Txt>=0 && appStaHh_Txt<=23){
			$("#hAppStaHh_Txt").remove();
		//適用開始日·時のフォーマットが合わない
		}else {
			$("#hAppStaHh_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hAppStaHh_Txt'>適用開始日·時の書式が不正です.</span>");
			hResult = false;
		}
	}else{
		$("#appStaHh_Txt").css("background","#89cff0");
		$(".sAppStaHh_Txt").remove();
		$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hAppStaHh_Txt'>適用開始日·時は入力必須です.</span>");
		hResult = false;
	}
	
	//適用開始日·分の非空認証
	if (appStaMm_Txt!=null && appStaMm_Txt!=""){
		var reg = /^[0-9]+$/;
		var mResult = true;
		var resultCheckAppStaMm_Txt = reg.test(appStaMm_Txt);
		
		//適用開始日·分の正則にかなう
		if (resultCheckAppStaMm_Txt){
			$("#hfAppStaMm_Txt").remove();
		//適用開始日·分の正則にそむく
		}else {
			$("#hfAppStaMm_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hfAppStaMm_Txt'>適用開始日·分に使用できない文字が含まれています.</span>");
			mResult = false;
		}
		
		//適用開始日·分の長さが合う
		if (appStaMm_Txt.length>2){
			$("#hlAppStaMm_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hlAppStaMm_Txt'>適用開始日·分は2文字以下で入力してください.</span>");
			mResult = false;
		//適用開始日·分の長さが合わない
		}else {
			$("#hlAppStaMm_Txt").remove();
		}
		
		//適用開始日·分のフォーマットが合う
		if (appStaMm_Txt>=0 && appStaMm_Txt<=59){
			$("#hAppStaMm_Txt").remove();
		//適用開始日·分のフォーマットが合わない
		}else {
			$("#hAppStaMm_Txt").remove();
			$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hAppStaMm_Txt'>適用開始日·分の書式が不正です.</span>");
			mResult = false;
		}
		
	}else{
		$("#appStaMm_Txt").css("background","#89cff0");
		$(".sAppStaMm_Txt").remove();
		$("#appStaMm_Txt").after("<span class='sAppStaMm_Txt' id='hAppStaMm_Txt'>適用開始日·分は入力必須です.</span>");
		mResult = false;
	}
	//適用開始日·時分が法にかなう
	if (hResult && mResult){
		$(".sAppStaMm_Txt").remove();
		return true;
	}else {
		return false;
	}
}
//適用終了日·時分を検証する
function checkAppEndHM_Txt(){
	var appEndHh_Txt = $("#appEndHh_Txt").val();
	var appEndMm_Txt = $("#appEndMm_Txt").val();
	//適用終了日·時の非空認証
	if (appEndHh_Txt!=null && appEndHh_Txt!=""){
		var reg = /^[0-9]+$/;
		var hResult = true;
		var resultCheckAppEndHh_Txt = reg.test(appEndHh_Txt);
		
		//適用終了日·時の正則にかなう
		if (resultCheckAppEndHh_Txt){
			$("#hfAppEndHh_Txt").remove();
		//適用終了日·時の正則にそむく
		}else {
			$("#hfAppEndHh_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hfAppEndHh_Txt'>適用終了日·時に使用できない文字が含まれています.</span>");
			hResult = false;
		}
		
		//適用終了日·時の長さが合う
		if (appEndHh_Txt.length>2){
			$("#hlAppEndHh_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hlAppEndHh_Txt'>適用終了日·時は2文字以下で入力してください.</span>");
			hResult = false;
		//適用終了日·時の長さが合わない
		}else {
			$("#hlAppEndHh_Txt").remove();
		}
		
		//適用終了日·時のフォーマットが合う
		if (appEndHh_Txt>=0 && appEndHh_Txt<=23){
			$("#hAppEndHh_Txt").remove();
		//適用終了日·時のフォーマットが合わない
		}else {
			$("#hAppEndHh_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hAppEndHh_Txt'>適用終了日·時の書式が不正です.</span>");
			hResult = false;
		}
	}else{
		$("#appEndHh_Txt").css("background","#89cff0");
		$(".sAppEndMm_Txt").remove();
		$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hAppEndHh_Txt'>適用終了日·時は入力必須です.</span>");
		hResult = false;
	}
	
	//適用終了日·分の非空認証
	if (appEndMm_Txt!=null && appEndMm_Txt!=""){
		var reg = /^[0-9]+$/;
		var mResult = true;
		var resultCheckAppEndMm_Txt = reg.test(appEndMm_Txt);
		
		//適用終了日·分の正則にかなう
		if (resultCheckAppEndMm_Txt){
			$("#hfAppEndMm_Txt").remove();
		//適用終了日·分の正則にそむく
		}else {
			$("#hfAppEndMm_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hfAppEndMm_Txt'>適用終了日·分に使用できない文字が含まれています.</span>");
			mResult = false;
		}
		
		//適用終了日·分の長さが合う
		if (appEndMm_Txt.length>2){
			$("#hlAppEndMm_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hlAppEndMm_Txt'>適用終了日·分は2文字以下で入力してください.</span>");
			mResult = false;
		//適用終了日·分の長さが合わない
		}else {
			$("#hlAppEndMm_Txt").remove();
		}
		
		//適用終了日·分のフォーマットが合う
		if (appEndMm_Txt>=0 && appEndMm_Txt<=59){
			$("#hAppEndMm_Txt").remove();
		//適用終了日·分のフォーマットが合わない
		}else {
			$("#hAppEndMm_Txt").remove();
			$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hAppEndMm_Txt'>適用終了日·分の書式が不正です.</span>");
			mResult = false;
		}
	}else{
		$("#appEndMm_Txt").css("background","#89cff0");
		$(".sAppEndMm_Txt").remove();
		$("#appEndMm_Txt").after("<span class='sAppEndMm_Txt' id='hAppEndMm_Txt'>適用終了日·分は入力必須です.</span>");
		mResult = false;
	}
	
	if (hResult && mResult){
		$(".sAppEndMm_Txt").remove();
		return true;
	}else {
		return false;
	}
}

//商品名を検証する
function checkItemName_Txt(){
	var itemName_Txt = $("#itemName_Txt").val();
	//商品名の長さが合う
	if (itemName_Txt.length<=50){
		$(".sItemName_Txt").remove();
		return true;
	//商品名の長さが合わない
	}else {
		$(".sItemName_Txt").remove();
		$("#itemName_Txt").after("<span class='sItemName_Txt'>商品名は2文字以下で入力してください.</span>");
		return false;
	}
}

//申請組織コードを検証する
function checkAppOrgCod_Txt(){
	var applyOrgCod_Txt = $("#applyOrgCod_Txt").val();
	var reg = /^[0-9A-z]*$/;
	var resultCheckApplyOrgCod_Txt = reg.test(applyOrgCod_Txt);
	var result = true;
	//申請組織コードの正則にかなう
	if (resultCheckApplyOrgCod_Txt){
		$("#fApplyOrgCod_Txt").remove();
	//申請組織コードの正則にそむく
	}else {
		$("#fApplyOrgCod_Txt").remove();
		$("#applyOrg_Lbl").after("<span class='sApplyOrgCod_Txt' id='fApplyOrgCod_Txt'>申請組織コードに使用できない文字が含まれています.</span>");
		result = false;
	}
	//申請組織コードの長さが合う
	if (applyOrgCod_Txt.length<=12){
		$("#lApplyOrgCod_Txt").remove();
	//申請組織コードの長さが合わない
	}else {
		$("#lApplyOrgCod_Txt").remove();
		$("#applyOrg_Lbl").after("<span class='sApplyOrgCod_Txt' id='lApplyOrgCod_Txt'>申請組織コードは2文字以下で入力してください.</span>");
		result = false;
	}
	if (result){
		return true;
	}else {
		return false;
	}
}
//組織検索画面がポップアップ
function openWindow(){
	//申請組織コードと組織名を取得する
    var apporgcod = window.document.getElementById("applyOrgCod_Txt").value;
    var orgNam1 = window.document.getElementById("applyOrg_Lbl").value;
    //サブウィンドウを開ける
   	window.open("../lmm110Controller/selectOrg?orgcod=" + apporgcod+"&orgNam1="+orgNam1,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
   	
   	//兼容性
   	// window.showModalDialog("${pageContext.request.contextPath}/lmm110Controller/selectOrgName?orgCode_Txt=" + apporgcod,"window","dialogWidth:876px;status:no;dialogHeight:1104px");
}