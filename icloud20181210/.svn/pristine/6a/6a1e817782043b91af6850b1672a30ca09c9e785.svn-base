var tf=true;
	 //清空
	 function fomrReset(){
		 
		 document.getElementById("myform").reset();
		 
	 }
	 
	 
	//組織検索画面がポップアップ
	 function findcodename(){
		 
		 var apporgcod = window.document.getElementById("appOrgCode_Txt").value;
		
	 	 window.open("http://localhost:8080/icloud20181210/slvb704/init?appOrgCode_Txt="+apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
	 	
	}
	 
	 
      //plcCode单项目验证
	 function confirmcode(){
		
		var zz = '[0-9A-z]';
		var plcCode = $("#plcCode_Txt").val();
		
		if(plcCode == null || plcCode.length <= 0){
			
			$(".plcCode_Txt").remove();
			
			$("#plcCode_Txt").after("<span class='plcCode_Txt'style='color: red;'>{場所コード}は入力必須です.</span>");
			tf= false; 
			
		}else{
			
			$(".plcCode_Txt").remove();
			if ( plcCode.match(zz) == null ) {
				$(".plcCode_Txt").remove();
				$("#plcCode_Txt").after("<span class='plcCode_Txt' style='color: red;'>{場所コード}に使用できない文字が含まれています.</span>");
				tf= false; 
			}else{
				$(".plcCode_Txt").remove();
				if ( plcCode.length >25 ) {
					$(".plcCode_Txt").remove();
					$("#plcCode_Txt").after("<span class='plcCode_Txt' style='color: red;'>{場所コード}は{25}文字以下で入力してください</span>");
					
					tf= false; 
					
				}else{
					$(".plcCode_Txt").remove();
					
					tf= true; 
				}
			}
			
		}
		
	 }
	 
	 
	  //plcnam单项目验证
	 function plcnamy(){
		 
		 var plcnamy = $("#plcnam").val();
		 if ( plcnamy.length >256 ) {
			 $(".plcnamys").remove(); 
				$("#plcnam").after("<span class='plcnamys' style='color: red;'>{ 場所名}は{256}文字以下で入力してください</span>");
				tf= false; 
			}
		 else{
			 $(".plcnamys").remove(); 
			 tf= true; 
		 }
	 }
	 
	 
	 //adrNam单项目验证
	 function  adrNamy(adrNam1,n){
		
		 if ( adrNam1.length >100 ) {
			  $('.adrNamy'+ n +'s').remove();
				$('#adrNam'+n).after('<span class="adrNamy'+ n +'s" style="color: red;">{住所名'+ n +'}は{100}文字以下で入力してください</span>');
				tf= false; 
			}else{
				$('.adrNamy'+ n +'s').remove();
				tf= true; 
			}

	 }

	 //zipcod单项目验证
	 function confirmzipcod(){
			
			var zz = '[0-9]';
			var zipcod = $("#zip_Txt").val();
		
				if ( zipcod.match(zz) == null ) {
					$(".zipcods").remove();
					$("#zip_Txt").after("<span class='zipcods'style='color: red;'>{郵便コード}に使用できない文字が含まれています.</span>");
					tf= false; 
					
				}else{
					$(".zipcods").remove();
					if ( zipcod.length >15 ) {
						$(".zipcods").remove();	
						$("#zip_Txt").after("<span class='zipcods'style='color: red;'>{郵便コード}は{15}文字以下で入力してください</span>");
						tf= false; 
					}else{
						$(".zipcods").remove();	
						tf= true; 
					}
			}
				
	 }
	 
	 //OrgCode单项目验证
	 function OrgCode_Txt(){		

		 
		    var zz = '[0-9A-z]';
			var appOrgCode_Txt = $("#appOrgCode_Txt").val();
			
		
				if ( appOrgCode_Txt.match(zz) == null ) {
					$(".appOrgCode_Txts").remove();
					$(".jiansuo").after("<span class='appOrgCode_Txts'style='color: red;'>{申請組織コード}に使用できない文字が含まれています.</span>");
					tf= false; 
				}else{
					$(".appOrgCode_Txts").remove();
					if (appOrgCode_Txt.length >12 ) {
						$(".appOrgCode_Txts").remove();	
						$(".jiansuo").after("<span class='appOrgCode_Txts'style='color: red;'>{申請組織コード}は{12}文字以下で入力してください</span>");
						tf= false; 
					}else{
						$(".appOrgCode_Txts").remove();	
						
						tf= true;
					}
			}
	 }
	 
