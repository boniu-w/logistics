function disp_confirmg(){
 var rrr=confirm("确定更新吗");
 if (rrr==true){
     var t=false;
	 var plccod = $("#plcCode_Txt").val()
	 var apporgcod = $("#appOrgCode_Txt").val();
	 var myform = document.getElementById("myform"); 
     var updeac = $("#updeac").val();
     var tntcod = $("#tntcod").val();
     //判断单项目验证
     if(!tf){ 
   	    	alert("单项目验证不通过,请重新输入"); 	
   	    	t=false;
            }else{
   	    	      //新规验证ajax
 	 	    	  $.ajax({
		 	 	    	url:"http://localhost:8080/icloud20181210/Lmm114Controller/GengxinYanZ",
		 	 	    	data:{
	                    'apporgcod':apporgcod
							  },
					    type:"POST",
					    dataType:'',
					    success:function(backData)
					    {
					    if(backData>0){
					    alert("二重验证通过,新规数据");
					    t=true;
								    //更新回数验证ajax
									$.ajax({
								    url:"http://localhost:8080/icloud20181210/Lmm114Controller/Gengxin",
								    data:{
			    	    			'plccod':plccod,
			    	    			'tntcod':tntcod,
				                    'updeac':updeac
			    	                      },
				    	    	    type:"POST",
				    	    	    dataType:'', 
				    	    	    success:function(backData)
				    	    	    {	
						               if(backData!=null)
						               {
						    	    	alert("二重验证通过,确定更新数据");
						    	    	tft=true;
						    	        if(tft){
					 	   	            /* alert("提交");*/
					 	 	 	    	//验证通过，提交
							    	    myform.action = "http://localhost:8080/icloud20181210/Lmm114Controller/Gengxinj";
					 	 	 	    	document.getElementById("myform").submit(); 	 
						 	 	 	    	     }else{
								 	 	 	    		alert("出错了");
								 	 	 	    		//清空
								 	 	 	    		document.getElementById("myform").reset();
					 	 	    		                 }    
								        }else{
								    		    alert("二重验证失败，无法更新数据");	
								    		    t=false;
							                  } 
								  }   
								});	
								}else{
						    	    alert("二重验证失败，无法更新数据");
									t = false;
					                 }
							     } 
							     });	
			}
			}else{
				 alert("你点击了退出");
				 }
 
      }
						     