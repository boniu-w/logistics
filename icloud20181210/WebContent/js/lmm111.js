/**
 * 入力チェック【SLMM111】
 * @returns
 */

//申請組織コードを検証する
function checkAppOrgCode_Txt(){
	var appOrgCode_Txt = $("#appOrgCode_Txt").val();
	var reg = /^[0-9A-Za-z]{0,12}$/;
	var resultCheckAppOrgCode_Txt = reg.test(appOrgCode_Txt);
	if(resultCheckAppOrgCode_Txt){
		$(".s_appOrgCode_Txt").remove();
		return true;
	}else{
		$(".s_appOrgCode_Txt").remove();
		$("#appOrgCode_Txt").after("<span class='s_appOrgCode_Txt'>申請組織コードに使用できない文字が含まれています.</span>");
		return false;
	}
}

//組織コードを検証する    orgCode_Txt;
function checkOrgCode_Txt(){
	var orgCode_Txt = $("#orgCode_Txt").val();
	var reg = /^[0-9A-Za-z]{0,12}$/;
	var resultCheckOrgCode_Txt = reg.test(orgCode_Txt);
	if(resultCheckOrgCode_Txt){
		$(".s_orgCode_Txt").remove();
		return true;
	}else{
		$(".s_orgCode_Txt").remove();
		$("#orgCode_Txt").after("<span class='s_orgCode_Txt'>組織コードに使用できない文字が含まれています.</span>");
		return false;
	}
}

//組織別商品コードを検証する  orgItmCode_Txt;
function checkOrgItmCode_Txt(){
	var orgItmCode_Txt = $("#orgItmCode_Txt").val();
	var reg = /^[0-9A-Za-z]{0,35}$/;
	var resultCheckOrgItmCode_Txt = reg.test(orgItmCode_Txt);
	if(resultCheckOrgItmCode_Txt){
		$(".s_orgItmCode_Txt").remove();
		return true;
	}else{
		$(".s_orgItmCode_Txt").remove();
		$("#orgItmCode_Txt").after("<span class='s_orgItmCode_Txt'>組織別商品コードに使用できない文字が含まれています.</span>");
		return false;
	}
}

//組織別商品名を検証する  orgItmName_Txt;
function checkOrgItmName_Txt(){
	var orgItmName_Txt = $("#orgItmName_Txt").val();
	if(orgItmName_Txt.length>=1&&orgItmName_Txt.length<=50){
		$(".s_orgItmName_Txt").remove();
		return true;
	}else{
		$(".s_orgItmName_Txt").remove();
		$("#orgItmName_Txt").after("<span class='s_orgItmName_Txt'>組織別商品名は50文字以下で入力してください.</span>");
		return false;
	}
}







