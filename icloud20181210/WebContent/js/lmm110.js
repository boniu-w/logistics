//サブミットを検証する
function check(){
	if(window.confirm("処理を実行します。よろしいですか？")){
		if(checkItemCode_Txt()&checkAppStaHM_Txt()&checkAppEndHM_Txt()&checkItemName_Txt()&checkAppOrgCod_Txt()){
			return true;
		}else{
			return false;
		}
	}else{
		return false;
	}
}

//商品コードを検証する
function checkItemCode_Txt(){
	var itemCode_Txt = $("#itemCode_Txt").val();
	var reg = /^[0-9A-Za-z]{1,35}$/;
	var resultCheckItemCode_Txt = reg.test(itemCode_Txt);
	if(resultCheckItemCode_Txt){
		$(".s_itemCode_Txt").remove();
		/*$("#itemCode_Txt").after("<span class='s_itemCode_Txt'>○</span>");*/
		return true;
	}else{
		$(".s_itemCode_Txt").remove();
		$("#itemCode_Txt").after("<span class='s_itemCode_Txt'>商品コードに使用できない文字が含まれています.</span>");
		return false;
	}
}

//適用開始日·時分を検証する
function checkAppStaHM_Txt(){
	var appStaHh_Txt = $("#appStaHh_Txt").val();
	var appStaMm_Txt = $("#appStaMm_Txt").val();
	var reg = /^[0-9]{1,2}$/;
	var resultCheckAppStaHh_Txt = reg.test(appStaHh_Txt);
	var resultCheckAppStaMm_Txt = reg.test(appStaMm_Txt);
	if(resultCheckAppStaHh_Txt&&resultCheckAppStaMm_Txt){
		appStaHh_Txt = parseInt(appStaHh_Txt);
		appStaMm_Txt = parseInt(appStaMm_Txt);
		if(appStaHh_Txt=="NaN"||appStaMm_Txt=="NaN"){
			$(".s_appStaMm_Txt").remove();
			$("#appStaMm_Txt").after("<span class='s_appStaMm_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
		}else{
			if(appStaHh_Txt>=0&&appStaHh_Txt<=23&&appStaMm_Txt>=0&&appStaMm_Txt<=59){
				$(".s_appStaMm_Txt").remove();
				/*$("#appStaMm_Txt").after("<span class='s_appStaMm_Txt'>○</span>");*/
				return true;
			}else{
				$(".s_appStaMm_Txt").remove();
				$("#appStaMm_Txt").after("<span class='s_appStaMm_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
			}
		}
	}else{
		$(".s_appStaMm_Txt").remove();
		$("#appStaMm_Txt").after("<span class='s_appStaHh_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
		return false;
	}
}
//適用適用終了日時日·時分を検証する
function checkAppEndHM_Txt(){
	var appEndHh_Txt = $("#appEndHh_Txt").val();
	var appEndMm_Txt = $("#appEndMm_Txt").val();
	var reg = /^[0-9]{1,2}$/;
	var resultCheckAppEndHh_Txt = reg.test(appEndHh_Txt);
	var resultCheckAppEndMm_Txt = reg.test(appEndMm_Txt);
	if(resultCheckAppEndHh_Txt&&resultCheckAppEndMm_Txt){
		appEndHh_Txt = parseInt(appEndHh_Txt);
		appEndMm_Txt = parseInt(appEndMm_Txt);
		if(appEndHh_Txt=="NaN"||appEndMm_Txt=="NaN"){
			$(".s_appEndMm_Txt").remove();
			$("#appEndMm_Txt").after("<span class='s_appEndMm_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
		}else{
			if(appEndHh_Txt>=0&&appEndHh_Txt<=23&&appEndMm_Txt>=0&&appEndMm_Txt<=59){
				$(".s_appEndMm_Txt").remove();
				/*$("#appEndMm_Txt").after("<span class='s_appEndMm_Txt'>○</span>");*/
				return true;
			}else{
				$(".s_appEndMm_Txt").remove();
				$("#appEndMm_Txt").after("<span class='s_appEndMm_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
			}
		}
	}else{
		$(".s_appEndMm_Txt").remove();
		$("#appEndMm_Txt").after("<span class='s_appEndHh_Txt'>適用開始日·時分に使用できない文字が含まれています.</span>");
		return false;
	}
}

//商品名を検証する
function checkItemName_Txt(){
	var itemName_Txt = $("#itemName_Txt").val();
	if(itemName_Txt.length>=1&&itemName_Txt.length<=50){
		$(".s_itemName_Txt").remove();
		/*$("#itemName_Txt").after("<span class='s_itemName_Txt'>○</span>");*/
		return true;
	}else{
		$(".s_itemName_Txt").remove();
		$("#itemName_Txt").after("<span class='s_itemName_Txt'>请输入1-50位商品名</span>");
		return false;
	}
}

//申請組織コードを検証する
function checkAppOrgCod_Txt(){
	var applyOrgCod_Txt = $("#applyOrgCod_Txt").val();
	var reg = /^[0-9A-Za-z]{1,12}$/;
	var resultCheckApplyOrgCod_Txt = reg.test(applyOrgCod_Txt);
	if(resultCheckApplyOrgCod_Txt){
		$(".s_applyOrgCod_Txt").remove();
		/*$("#applyOrg_Lbl").after("<span class='s_applyOrgCod_Txt'>○</span>");*/
		return true;
	}else{
		$(".s_applyOrgCod_Txt").remove();
		$("#applyOrg_Lbl").after("<span class='s_applyOrgCod_Txt'>申請組織コードに使用できない文字が含まれています.</span>");
		return false;
	}
}
//組織検索画面がポップアップ
function openWindow(){
    var apporgcod = window.document.getElementById("applyOrgCod_Txt").value;
   	window.open("../lmm110Controller/selectOrg?orgcod=" + apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
   	
   	//兼容性
   // window.showModalDialog("${pageContext.request.contextPath}/lmm110Controller/selectOrgName?orgCode_Txt=" + apporgcod,"window","dialogWidth:876px;status:no;dialogHeight:1104px");
}