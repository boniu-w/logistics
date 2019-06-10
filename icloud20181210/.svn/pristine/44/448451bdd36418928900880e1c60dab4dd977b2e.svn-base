function disp_confirmg()
    	 {
	   
    	var r=confirm("処理を実行します。よろしいですか？");
    	
    	if (r==true){
    		
    	
    		 
    		   var orgcod = $("#orgCode_Sct").val();
    			var apporgcod = $("#appOrgcod_Txt_search").val();
    			
    			var orgItmCod = $("#orgItmCode_Txt").val();
    			var appStaYmd = $("#appStaYmd_Txt").val();
    			var appStaHh = $("#appStaHh_Txt").val();
    			var appStaMm = $("#appStaMm_Txt").val();
    			
    			var appEndYmd = $("#appEndYmd_Txt").val();
    			var appEndHh = $("#appEndHh_Txt").val();
    			var appEndMm = $("#appEndMm_Txt").val();
    			
    			var updeac=$("#updEac_Hdn").val();
    			
    			//开始时间拼接
    			var datestar = appStaYmd+" "+appStaHh+":"+appStaMm;
    			
    			//结束时间拼接
    			var datend = appEndYmd+" "+appEndHh+":"+appEndMm;
    		
    			if(!tf){
    				alert("入力验证失败请重新输入");	
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
		   	      
		 	 		 //更新前验证排他制御
		  	    	 $.ajax({
		    	    		url:"http://localhost:8080/icloud20181210/lmm112Controller/updeac",
		    	    		
		    	    		data:{
		  	    			'orgcod':orgcod,
		  	    			'orgItmCod':orgItmCod,
		  	    			'datestar':datestar,
		  	    			'updeac':updeac 
		    	             },
		    	              
		    	    	    type:"POST",
		    	    	    dataType:'',
		    	    	    
		    	    	    success:function(backData){
		    	    	    	alert("更新回数验证通过");
		    	    	    }
		    	    	});	  	
    			
    			
    		    var lmm112Form = document.getElementById("lmm112Form"); 
    			var url="http://localhost:8080/icloud20181210/lmm112Controller/update";
    		 	 alert(url);
    		 	 lmm112Form.action = url;
    		 	 lmm112Form.submit(); 
    		}
    		 
    	 }else{
    		 alert("您点击了退出");
    	 }

    }