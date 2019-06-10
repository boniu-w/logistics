function disp_confirmx(){
 var rr=confirm("确定更新吗");
	 if (rr==true){
		 var tft = false;
		 var plccod = $("#plcCode_Txt").val()
		 var apporgcod = $("#appOrgCode_Txt").val();
	   		//判断单项目验证
	   	     if(!tf){ 
	   	    	alert("单项目验证不通过,请重新输入");
	   	    	tft = false;
	   	             }else{
			   	            //新规验证ajax
			 	 	    	$.ajax({
			 	 	    		url:"http://localhost:8080/icloud20181210/Lmm114Controller/yanZhengXingui",
			 	 	    		data:{
			 	 	    			'plccod':plccod
			 	 	                  },
			 	 	    	    type:"POST",
			 	 	    	    dataType:'',
			 	 	    	    success:function(backData)
			 	 	    	    {
			 	 	    	       if(backData==0){	
			 	 	    	    		alert("二重验证通过,新规数据");
			 	 	    	    		tft=true;
			 	 	    	    		 //新规验证ajax
			 	 		 	 	    	 $.ajax({
			 	 		 	 	    		url:"http://localhost:8080/icloud20181210/Lmm114Controller/yanZhengXinguis",
			 	 		 	 	    		data:{
			 	 	                           'apporgcod':apporgcod
			 	 		 	 	                  },
			 	 		 	 	    	    type:"POST",
			 	 		 	 	    	    dataType:'',
			 	 		 	 	    	    success:function(backData)
			 	 		 	 	    	    {
			 	 		 	 	    	    	if(backData>0){
			 	 		 	 	    	    		alert("二重验证通过,新规数据");
			 	 		 	 	    	    	    tft=true;
			 	 		 	 	    	    	    if(tft){
			 	 		 	 		 	 	   	      alert("提交");
			 	 		 	 		 	 	 	      //验证通过，提交
			 	 		 	 		 	 	 	      document.getElementById("myform").submit(); 	 
			 	 		 	 		 	 	 	    	   }else{
			 	 		 	 		 	 	 	    		 alert("出错了");
			 	 		 	 		 	 	 	    		 document.getElementById("myform").reset();
			 	 		 	 		 	 	 	    	         }
			 	 		 	 	    	    }else{
			 	 		 	 	    	    	alert("二重验证失败，无法更新数据");
			 	 		 	 	    	    	tft = false;
			 	 		 	 	    	    	} 
			 	 		 	 	    	   }
			 	 		 	 	    	});	
			 	 	    	    	}else{
			 	 	    	    		alert("二重验证失败，无法更新数据");
			 	 	    	    		tft = false;
			 	 	    	    	     } 
				 	 	    	}
				 	 	    	});   	 
	                       } 	 
	}else{
	   alert("你点击了退出");
         }
}