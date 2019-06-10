function disp_confirmx(){

	var r=confirm("処理を実行します。よろしいですか？");
	var orgcod = $("#orgCode_Sct").val();
	var apporgcod = $("#appOrgcod_Txt_search").val();
	
	var orgItmCod = $("#orgItmCode_Txt").val();
	var appStaYmd = $("#appStaYmd_Txt").val();
	var appStaHh = $("#appStaHh_Txt").val();
	var appStaMm = $("#appStaMm_Txt").val();
	
	var appEndYmd = $("#appEndYmd_Txt").val();
	var appEndHh = $("#appEndHh_Txt").val();
	var appEndMm = $("#appEndMm_Txt").val();
	
	//开始时间拼接
	var datestar = appStaYmd+" "+appStaHh+":"+appStaMm;
	
	//结束时间拼接
	var datend = appEndYmd+" "+appEndHh+":"+appEndMm;

	 if (r==true){
		
		if(!tf){
			alert("入力验证失败，请重新输入");
		}else{
			
			 //日付チェック処理結果														
   	    	$.ajax({
   	    		url:"http://localhost:8080/icloud20181210/lmm112Controller/addCheckDate",
   	    		
   	    		data:{
 	    			
 	    			'datend':datend,
 	    			'datestar':datestar
   	             },
   	             
   	    	    type:"POST",
   	    	    dataType:'',
   	    	    
   	    	    success:function(backData){
   	    	    	alert("日付チェック処理結果模拟验证通过");
   	    	    }
   	 	  });	
		  
   	    	//新規二重チェック
   	    	$.ajax({
   	    		url:"http://localhost:8080/icloud20181210/lmm112Controller/addCheck",
   	    		data:{
   	    			'orgcod':orgcod,
 	    			'orgitmcod':orgItmCod,
 	    			'inputDate':datestar
   	             },
   	             
   	    	    type:"POST",
   	    	    dataType:'',
   	    	    success:function(backData){
   	    	    	alert("新規二重登録模拟验证通过");
   	    	    }
   	    	});		
		   
   	     //組織コードが組織マスタに未登録の場合
 	    	$.ajax({
   	    		url:"http://localhost:8080/icloud20181210/lmm112Controller/orgCodCheck",
   	    		
   	    		data:{
 	    			'orgcod':orgcod,
 	    			'datend':datend,
 	    			'datestar':datestar
   	             },
   	             
   	    	    type:"POST",
   	    	    dataType:'',
   	    	    
   	    	    success:function(backData){
   	    	    	alert("組織コード模拟验证通过");
   	    	    }
   	    	});	
   	     
 	    	var lmm112Form = document.getElementById("lmm112Form"); 
 	    	var url= "http://localhost:8080/icloud20181210/lmm112Controller/add";
 	    	lmm112Form.action = url;
 	    	lmm112Form.submit(); 	
			
		}
	}else{
		alert("您点击了退出");
	}
}				
				