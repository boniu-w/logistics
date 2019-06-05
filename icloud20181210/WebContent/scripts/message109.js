 var check;
  /* 
   * 
   * 申請組織コード  の    検証
   *     */
function applyOrgCodeText(){ 
	 /* 申請組織コード */
	 var applyOrgCodeId = $("#applyOrgCode_Txt").val();
	 
	 if (applyOrgCodeId == ""){
		 $("#applyOrgCode_message").html("");
		 return;
	 }
	 if (applyOrgCodeId.length > 12){

	 	 $("#applyOrgCode_message").html("申請組織コードに超えたため12を入力します");

	 	 $("#applyOrgCode_message").html("申請組織コードに超えたため12を入力します");    

	 	 return;
	 }else{
		 check = applyOrgCodeId.match(/^[a-zA-Z0-9]+$/);
		 
		 if(check == null){
			 $("#applyOrgCode_message").html("申請組織コードに使用できない文字が含まれています");
		 }else{


			 $("#applyOrgCode_message").html("");    

			 return ;
		 }
	 }
}

function itemCodeTxt(){
	/* 商品コード */
	 var itemCodeId = $("#itemCode_Txt").val();
	
	 if (itemCodeId == ""){
		 $("#itemCode_message").html("");
		 return;
	 }
	 if (itemCodeId.length > 35){

	 	 $("#itemCode_message").html("申請組織コードに超えたため35を入力します");

	 	 $("#itemCode_message").html("申請組織コードに超えたため35を入力します");    

	 	 return;
	 }else{
		 check = itemCodeId.match(/^[a-zA-Z0-9]+$/);
		 
		 if(check == null){
			 $("#itemCode_message").html("申請組織コードに使用できない文字が含まれています");
		 }else{

			 $("#itemCode_message").html("");

			 $("#itemCode_message").html("");    

			 return ;
		 }
	 } 
}

function itemNameTxt(){ 
	 /* 商品名 */
	 var itemNameId = $("#itemName_Txt").val();
	 
	 if (itemNameId == ""){
		 $("#itemName_message").html("");
		 return;
	 }
	 if (itemNameId.length > 35){

	 	 $("#itemName_message").html("申請組織コードに超えたため35を入力します");

	 	 $("#itemName_message").html("申請組織コードに超えたため35を入力します");    

	 	 return;
	 }else{
		 check = itemNameId.match(/^[a-zA-Z0-9]+$/);
		 
		 if(check == null){
			 $("#itemName_message").html("申請組織コードに使用できない文字が含まれています");
		 }else{

			 $("#itemName_message").html("");


			 return ;
		 }
	 } 
	
	
}