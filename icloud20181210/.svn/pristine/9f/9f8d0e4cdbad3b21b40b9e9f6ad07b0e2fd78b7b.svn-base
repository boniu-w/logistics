//クリア
function clearAll(modeGam_Hdn){
	if(modeGam_Hdn==0){
		window.location="/icloud20181210/lmm116Controller/init?modeGam_Hdn=0"
	}else{
		window.location="/icloud20181210/lmm116Controller/init?modeGam_Hdn=1"
	}
	
}

//新規
function add() {
	var lmm116From = document.getElementById("lmm116From");
	if (window.confirm("処理を実行します。よろしいですか？")) {
		lmm116From.action = "/icloud20181210/lmm116Controller/change?modeGam_Hdn=0";
		lmm116From.submit();
	}
}
//編集
function update() {
	var lmm116From = document.getElementById("lmm116From");
	if (window.confirm("処理を実行します。よろしいですか？")) {
		lmm116From.action = "/icloud20181210/lmm116Controller/change?modeGam_Hdn=1";
		lmm116From.submit();
	}
}
//サブウィンドウ
function openWindow() {
	var appOrgCode_Txt = window.document
	.getElementById("appOrgCode_Txt").value;
	window
	.open(
			"/icloud20181210/slvb116Controller/init?appOrgCode="
			+ appOrgCode_Txt,
			"newwindow",
	"height=800,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");

}
//(else:検証が通ることを示す)。
function check(modeGam_Hdn) {
	var sum = 0;//条件を満たす数
	var zz = /^[0-9A-Za-z_]+$/;
	//汎用区分チェック
	if (modeGam_Hdn == 0) {
		 var gnrprpKbn_Sct = document.getElementById("gnrprpKbn_Sct");
		 var gnrprpKbn_Sct_TxtLength = document.getElementById("gnrprpKbn_Sct").value.length;
		 //汎用区分を空する
		 if (gnrprpKbn_Sct_TxtLength == 0) {
			 document.getElementById("PgnrprpKbn_Sct").value = "        汎用区分がに未登録です.";
			 setCaretPosition(gnrprpKbn_Sct,gnrprpKbn_Sct_TxtLength);
		 }else {
			  document.getElementById("PgnrprpKbn_Sct").value = "";
			  sum++;
		 }
	}else {
		 sum++;
	}
	//申請組織コードチェック
	var appOrgCode =  document.getElementById("appOrgCode_Txt");
	var appOrgCode_Txt = document.getElementById("appOrgCode_Txt").value;
	appOrgCode_TxtResult = zz.test(appOrgCode_Txt);
	var appOrgCode_TxtLength = document.getElementById("appOrgCode_Txt").value.length;
	//申請組織コードを空する
	if (appOrgCode_TxtLength == 0) {
		document.getElementById("PappOrgCode_Txt").value="";
		sum++;
	}
	//申請組織コード正規表現と一致しない
	else if (appOrgCode_TxtResult == false) {
		document.getElementById("PappOrgCode_Txt").value = "         申請組織コードに使用できない文字が含まれています.";
		setCaretPosition(appOrgCode,appOrgCode_TxtLength);
	}else {
		//申請組織コード長さを超える
		if (appOrgCode_TxtLength > 12) {
			document.getElementById("PappOrgCode_Txt").value = "        申請組織コードが12に未登録です.";
			setCaretPosition(appOrgCode,appOrgCode_TxtLength);
		}else {
			document.getElementById("PappOrgCode_Txt").value = "";
			sum++;
		}
	}
	//汎用名１チェック
	var gnrprpName1 = document.getElementById("gnrprpName1_Txt");
	var gnrprpName1_Txt = document.getElementById("gnrprpName1_Txt").value;
	var gnrprpName1_TxtLength = document.getElementById("gnrprpName1_Txt").value.length;
	//汎用名１長さを超える
	if (gnrprpName1_TxtLength > 50) {
		document.getElementById("PgnrprpName1_Txt").value = "        汎用名１が50に未登録です.";
		setCaretPosition(gnrprpName1,gnrprpName1_TxtLength);
	}else {
		document.getElementById("PgnrprpName1_Txt").value = "";
		sum++;
	}
	//汎用名２チェック
	var gnrprpName2 = document.getElementById("gnrprpName2_Txt");
	var gnrprpName2_Txt = document.getElementById("gnrprpName2_Txt").value;
	var gnrprpName2_TxtLength = document.getElementById("gnrprpName2_Txt").value.length;
	//汎用名２長さを超える
	if (gnrprpName2_TxtLength > 50) {
		document.getElementById("PgnrprpName2_Txt").value = "       汎用名２が50に未登録です.";
		setCaretPosition(gnrprpName2,gnrprpName2_TxtLength);
	}else {
		document.getElementById("PgnrprpName2_Txt").value = "";
		sum++;
	}
	//コード種別チェック
	var codoutcod_Txt = document.getElementById("codoutCode_Txt").value;
	codoutcod_TxtResult = zz.test(codoutcod_Txt);
	var codoutCode = document.getElementById("codoutCode_Txt");
	var codoutcod_TxtLength = document.getElementById("codoutCode_Txt").value.length;
	//コード種別を空する
	if (codoutcod_TxtLength == 0) {
		document.getElementById("Pcodoutcod_Txt").value = "";
		sum++;
	}
	//コード種別正規表現と一致しない
	else if (codoutcod_TxtResult == false) {
		document.getElementById("Pcodoutcod_Txt").value = "        コード種別に使用できない文字が含まれています.";
		setCaretPosition(codoutCode,codoutcod_TxtLength);

	}else {
		//コード種別長さを超える
		if (codoutcod_TxtLength > 4) {
			document.getElementById("Pcodoutcod_Txt").value = "        コード種別が4に未登録です.";
			setCaretPosition(codoutCode,codoutcod_TxtLength);
		}else {
			document.getElementById("Pcodoutcod_Txt").value = "";
			sum++;
		}
	}
	//汎用コードチェック
	var gnrprpCode_Txt = document.getElementById("gnrprpCode_Txt").value;
	gnrprpCode_TxtResult = zz.test(gnrprpCode_Txt);
	var gnrprpCode = document.getElementById("gnrprpCode_Txt")
	var gnrprpCode_TxtLength = document.getElementById("gnrprpCode_Txt").value.length;
	//汎用コードを空する
	if (gnrprpCode_TxtLength == 0 || gnrprpCode_Txt == null) {
		document.getElementById("PgnrprpCode_Txt").value = "        汎用コードがに未登録です.";
		setCaretPosition(gnrprpCode,gnrprpCode_TxtLength);
	}
	else {
		//汎用コード正規表現と一致しない
		if (gnrprpCode_TxtResult == false) {
			document.getElementById("PgnrprpCode_Txt").value = "        汎用コードに使用できない文字が含まれています.";
			setCaretPosition(gnrprpCode,gnrprpCode_TxtLength);
		}else {
			//汎用コード長さを超える
			if (gnrprpCode_TxtLength > 12) {
				document.getElementById("PgnrprpCode_Txt").value = "       汎用コードが12に未登録です.";
				setCaretPosition(gnrprpCode,gnrprpCode_TxtLength);
			}else {
				document.getElementById("PgnrprpCode_Txt").value = "";
				sum++;

			}
		}

	}
	//条件が全部満たされた場合
	if (sum == 6 && modeGam_Hdn == 0) {	
		add();
		return true;
	}
	else if (sum == 6 && modeGam_Hdn == 1) {
		update();
		return true;
	}else {
		return false;
	}
	
}
//カーソル位置
function setCaretPosition(tObj, sPos){
	if (tObj.setSelectionRange) {
		setTimeout (function() {
			tObj.setSelectionRange(sPos, sPos);
			tObj.focus();
		}, 0);
	}else if (tObj.createTextRange) {
		var rng = tObj.createTextRange();
		rng.move('character', sPos);
		rng.select();
	}
} 

