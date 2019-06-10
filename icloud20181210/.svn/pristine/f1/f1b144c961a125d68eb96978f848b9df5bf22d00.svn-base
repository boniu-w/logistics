//获取父窗口
//var k = window.dialogArguments;

function setVal(){
	var list = document.getElementsByClassName("appOrgCodeList");
	for(var i = 0; i < list.length; i++){
		var radio = list[i].children[0].children[0];
		if(radio.checked){
			var appOrgcod = list[i].children[1].innerHTML;
			var appOrgName = list[i].children[4].innerHTML;
			//兼容性
			//k.document.getElementById("appOrgcod_Txt_search").value = appOrgcod;
			//k.document.getElementById("orgName_Txt").value = appOrgName;
			
			window.opener.document.getElementById("applyOrgCod_Txt").value = appOrgcod;
			window.opener.document.getElementById("applyOrg_Lbl").value = appOrgName;
			break;
		}
	}
	
	//关闭子窗口
	window.close();
}

function exit(){
	//关闭子窗口
	window.close();
}