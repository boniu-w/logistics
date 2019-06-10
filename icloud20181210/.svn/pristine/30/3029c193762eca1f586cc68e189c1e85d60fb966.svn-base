<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>組織別名称メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/SLMM112.css">
<script type="text/javascript" src="../js/lmmAdd112.js"></script>
<script type="text/javascript" src="../js/lmmUpdate112.js"></script>
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
<script type="text/javascript">  
  
    //キャンセルボタン押下
    function cancel() {
	  window.location="http://localhost:8080/icloud20181210/lmm112Controller/init";
   }
    
    //組織検索画面がポップアップ
      function openSub() {
    	
          var apporgcod = window.document.getElementById("appOrgcod_Txt_search").value;
    	 	 window.open("${pageContext.request.contextPath}/slvb704/init?orgCode_Txt="+apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");

      }
    	
        //更新場合　戻るボタン押下
        function backg() {
    	    var tntcod = "01001006";
    	    var orgcod = $("#orgCode_Sct").val();
    		var orgItmCod = $("#orgItmCode_Txt").val();
    		var appStaYmd = $("#appStaYmd_Txt").val();
    		var appStaHh = $("#appStaHh_Txt").val();
    		var appStaMm = $("#appStaMm_Txt").val();
    	    //開始時間のスプライス
    	    var datestar = appStaYmd+" "+appStaHh+":"+appStaMm; 
    	 
    	    //画面遷移
            var url="http://localhost:8080/icloud20181210/lmmm111.jsp?tntcod"+tntcod;
    	     url+="&orgcod="+orgcod;
    	     url+="&orgItmCod="+orgItmCod;
    	     url+="&datestar="+datestar;
    	     window.location=url; 
        }

      //新规場合　戻る押下
      function back() {
    	 
    	   window.location="http://localhost:8080/icloud20181210/lmmm111.jsp"; 
      }
      
      //以下は単目チェック
      //変数の定義
      var tf=true; 
      
      //組織コード
      function orgCode_Scty() {
    	//orgCode_Sctの取得
        var orgCode_Sct = $("#orgCode_Sct").val();
      	
    	//正則表現の定義
　　　     var os = '[0-9A-z]';
      			  
		  if (orgCode_Sct == null || orgCode_Sct.length <= 0) {
			  $("#orgCode_Sct").css("color","red");
			  $("#orgCode_Sct").after("<span class='orgCode_Sct'style='color: red;'>組織コードは入力必須です.</span>");
		  		tf=false;
		  } else {   				  			  
			 	  				 	
				if ( orgCode_Sct.match(os) == null ) {
					$("#orgCode_Sct").css("color","red");
					$("#orgCode_Sct").after("<span class='orgCode_Sct'style='color: red;'>組織コードに使用できない文字が含まれています.</span>");
					  tf=false;
				} else {
					
					 tf=true;
				}	
		  }
	  }
      			  
     //組織別商品コード 			
    function orgItmCode_Txty() {
      	//orgItmCode_Txtの取得		  
        var orgItmCode_Txt = $("#orgItmCode_Txt").val();
        //正則表現の定義		  
        var ot = '[0-9A-z]';
      			  
		  if (orgItmCode_Txt == null || orgItmCode_Txt.length <= 0) {
			  $("#orgItmCode_Txt").css("color","red");
			  $("#orgItmCode_Txt").after("<span class='orgItmCode_Txt'style='color: red;'>組織別商品コードは入力必須です.</span>");
		  		tf=false;
		  } else {				  			  
		       
			   if ( orgItmCode_Txt.match(ot) == null ) {
				    $("#orgItmCode_Txt").css("color","red");
					$("#orgItmCode_Txt").after("<span class='orgItmCode_Txt'style='color: red;'>組織別商品コードに使用できない文字が含まれています.</span>");
					  tf=false;
				} else {

				    if (orgItmCode_Txt.length>35) {
				      $("#orgItmCode_Txt").css("color","red");
					  $("#orgItmCode_Txt").after("<span class='orgItmCode_Txt'style='color: red;'>組織別商品コードは35文字以下で入力してください</span>");
					  
					  tf=false;
					  
				} else {
					 tf=true;
				}
			}	
	    }			  
    }
      		
    //適用開始日時  		
    function appStaYmd_Txty(){
      	//appStaYmd_Txtの取得		  
	    var appStaYmd_Txt = $("#appStaYmd_Txt").val();
		  if (appStaYmd_Txt == null || appStaYmd_Txt.length <= 0) {
			  $("#appStaYmd_Txt").css("color","red");
			  $("#appStaYmd_Txt").after("<span class='appStaYmd_Txt'style='color: red;'> 適用開始日時は入力必須です.</span>");
			  tf=false;
			  
		  } else {
			 
			  tf=true;
		  }
			  
    }
      		
    //適用開始日時・時  		
    function appStaHh_Txty() {
    	//appStaHh_Txtの取得	  
		var appStaHh_Txt = $("#appStaHh_Txt").val();
      	//正則表現の定義		  
	    var h = '[0-9]';
		var hh = '^([01][0-9]|2[0-3])';
		
		  if (appStaHh_Txt == null || appStaHh_Txt.length <= 0) {
			  $("#appStaHh_Txt").css("color","red");
			  $("#appStaHh_Txt").after("<span class='appStaHh_Txt'style='color: red;'>適用開始日時の時は入力必須です.</span>");
			  tf=false;
			  
		  } else {
				  
				if (appStaHh_Txt.match(h) == null ) {
					  $("#appStaHh_Txt").css("color","red");
					  $("#appStaHh_Txt").after("<span class='appStaHh_Txt'style='color: red;'>適用開始日時・時に使用できない文字が含まれています.</span>");
					  tf=false;
					  
				} else {
					
					 if (appStaHh_Txt.match(hh) == null ) {
						  $("#appStaHh_Txt").css("color","red");
						  $("#appStaHh_Txt").after("<span class='appStaHh_Txt'style='color: red;'> 適用開始日時・時の書式が不正です</span>");
						  tf=false;
						  
					   } else {
						   
						   if (appStaHh_Txt.length>2) {
							   $("#appStaHh_Txt").css("color","red");
							   $("#appStaHh_Txt").after("<span class='appStaHh_Txt'style='color: red;'>適用開始日時・時は2文字以下で入力してください</span>");
							   tf=false;
							   
						   } else {
							   
							   tf=true;
						   }
					   }
				}
		 }
			  
    }
      		
    //適用開始日時・分 		
    function appStaMm_Txty() {
    	//appStaMm_Txtの取得	
    	var appStaMm_Txt = $("#appStaMm_Txt").val();	
    	//正則表現の定義	
	    var m='[0-9]';
		var mm = '([0-5][0-9])$';
		
			
      			  if (appStaMm_Txt == null || appStaMm_Txt.length <= 0) {
      				  $("#appStaMm_Txt").css("color","red");
      				  $("#appStaMm_Txt").after("<span class='appStaMm_Txt'style='color: red;'>適用開始日時の分は入力必須です.</span>");
      				  tf=false;
      				  
      			  } else {
      				 
      				   if (appStaMm_Txt.match(m) == null ) {
      					  $("#appStaMm_Txt").css("color","red");	
      					  $("#appStaMm_Txt").after("<span class='appStaMm_Txt'style='color: red;'>適用開始日時・分に使用できない文字が含まれています.</span>");
      					  tf=false;
      					  
      			    } else {
      					 
      					 if (appStaMm_Txt.match(mm) == null ) {
      						  $("#appStaMm_Txt").css("color","red");
      						  $("#appStaMm_Txt").after("<span class='appStaMm_Txt'style='color: red;'> 適用開始日時・分の書式が不正です</span>");
      						  tf=false;
      						  
      					   } else {
      						   
      						   if (appStaMm_Txt.length>2) {
      							   $("#appStaMm_Txt").css("color","red");
      							   $("#appStaMm_Txt").after("<span class='appStaMm_Txt'style='color: red;'>適用開始日時・分は2文字以下で入力してください</span>");
      							   tf=false;
      							   
      						   } else {
      							   
      							   tf=true;
      						     }
      					    }
      			    }
      		   }
      			  
    }
      		
    //適用終了日時  		
    function appEndYmd_Txty() {
        //appEndYmd_Txtの取得 			  
        var appEndYmd_Txt = $("#appEndYmd_Txt").val();
      		
		  if (appEndYmd_Txt == null || appEndYmd_Txt.length <= 0) {
			  $("#appEndYmd_Txt").css("color","red");
			  $("#appEndYmd_Txt").after("<span class='appEndYmd_Txt'style='color: red;'>適用終了日時は入力必須です.</span>");
			  tf=false;
			  
		  } else {
			  
			  tf=true;
		  }
		  
	}
      		
    //適用終了日時・時
    function appEndHh_Txty(){
    	//appEndHh_Txtの取得		  
        var appEndHh_Txt = $("#appEndHh_Txt").val();
        //正則表現の定義	
      	var h = '[0-9]';
      	var hh = '^([01][0-9]|2[0-3])';
      			  
      			
  			  if (appEndHh_Txt == null || appEndHh_Txt.length <= 0) {
  				  $("#appEndHh_Txt").css("color","red");
  				  $("#appEndHh_Txt").after("<span class='appEndHh_Txt'style='color: red;'>適用終了日時の時は入力必須です.</span>");
  				  tf=false;
  				  
  			  }else{
  				  
  				if (appEndHh_Txt.match(h) == null ) {
  					  $("#appEndHh_Txt").css("color","red");
  					  $("#appEndHh_Txt").after("<span class='appEndHh_Txt'style='color: red;'>適用終了日時・時に使用できない文字が含まれています.</span>");
  					  tf=false;
  					  
  				} else {
  					 
  					 if (appEndHh_Txt.match(zz) == null ) { 
  						  $("#appEndHh_Txt").css("color","red");
  						  $("#appEndHh_Txt").after("<span class='appEndHh_Txt'style='color: red;'>適用終了日時の・時の書式が不正です</span>");
  						  tf=false;
  						  
  					   } else {
  						   
  						   if (appEndHh_Txt.length>2) {
  							   $("#appEndHh_Txt").css("color","red");
  							   $("#appEndHh_Txt").after("<span class='appEndHh_Txt'style='color: red;'>適用終了日時の・時は2文字以下で入力してください</span>");
  							   tf=false;
  							   
  						   } else {
  							   
  							   tf=true;
  						     }
  					    }
  				   }
  			  }  			  
    }
  		
     //適用終了日時・分
    function appEndMm_Txty(){
    	//appEndMm_Txtの取得		
        var appEndMm_Txt = $("#appEndMm_Txt").val();
        //正則表現の定義
      	var m = '[0-9]';
      	var mm = '([0-5][0-9])$';
      			
      			
		  if (appEndMm_Txt == null || appEndMm_Txt.length <= 0) {
			  $("#appEndMm_Txt").css("color","red");
			  $("#appEndMm_Txt").after("<span class='appEndMm_Txt'style='color: red;'>適用終了日時の分は入力必須です.</span>");
			  tf=false;
			  
		  } else {
			  
			  if (appEndMm_Txt.match(m) == null ) {
				  $("#appEndMm_Txt").css("color","red");
				  $("#appEndMm_Txt").after("<span class='appEndMm_Txt'style='color: red;'>適用終了日時の・分に使用できない文字が含まれています.</span>");
				  tf=false;
				  
			} else {
  					 
				 if (appEndMm_Txt.match(zz) == null ) {
					  $("#appEndMm_Txt").css("color","red");
					  $("#appEndMm_Txt").after("<span class='appEndMm_Txt'style='color: red;'>適用終了日時の・分の書式が不正です</span>");
					  tf=false;
					  
				   } else {
					   
					   if (appEndMm_Txt.length>2) {
						   $("#appEndMm_Txt").css("color","red");
						   $("#appEndMm_Txt").after("<span class='appEndMm_Txt'style='color: red;'>適用終了日時の・分は2文字以下で入力してください</span>");
 						   tf=false;
 						   
					   } else {
						   
						   tf=true;
					     }
				     }
				  }
		     } 			 
    }
  	
     //組織別商品名
    function orgItmName_Txty(){
    	//orgItmName_Txtの取得	
        var orgItmName_Txt = $("#orgItmName_Txt").val();
    	
      	  if (orgItmName_Txt == null || orgItmName_Txt.length <= 0) {
      		      $("#orgItmName_Txt").css("color","red");
 				  $("#orgItmName_Txt").after("<span class='orgItmName_Txt'style='color: red;'>組織別商品コードは入力必須です.</span>");
 				  tf=false;
 				  
      	  } else {
			 
			  if (orgItmName_Txt.length>50) {
				  $("#orgItmName_Txt").css("color","red");
				  $("#orgItmName_Txt").after("<span class='orgItmName_Txt'style='color: red;'>組織別商品コードは50文字以下で入力してください</span>");
				  tf=false;
				  
			  } else {
				  
				  tf=true;
			   }
		  }
    }
      		
    //商品コード
    function itmCode_Txty(){
      	//itmCode_Txtの取得		  
        var itmCode_Txt = $("#itmCode_Txt").val();
      	//正則表現の定義		  
      	var z= '[0-9A-z]';
      			  
		  if (itmCode_Txt == null || itmCode_Txt.length <= 0) {
			  $("#itmCode_Txt").css("color","red");
			  $("#itmCode_Txt").after("<span class='itmCode_Txt'style='color: red;'>商品コードは入力必須です.</span>");
			  tf=false;
			  
		  } else {
			  
			  if (itmCode_Txt.match(z) == null ) {
				  $("#itmCode_Txt").css("color","red");
				  $("#itmCode_Txt").after("<span class='itmCode_Txt'style='color: red;'>商品コードに使用できない文字が含まれています.</span>");
				  tf=false;
				  
			  } else {
				  
				  if (itmCode_Txt.length>35) {
					  $("#itmCode_Txt").css("color","red");
					  $("#itmCode_Txt").after("<span class='itmCode_Txt'style='color: red;'>商品コードは35文字以下で入力してください</span>");
					  tf=false;
					  
				  } else {
					  
					  tf=true;
				    }
			    }
			  
		    }
    }
      		
    //申請組織コード
    function appOrgcod_Txt_searchy(){
    	//appOrgcod_Txt_searchの取得
        var appOrgcod_Txt_search = $("#appOrgcod_Txt_search").val();
    	//正則表現の定義
        var z= '[0-9A-z]';
      			  
		  if (appOrgcod_Txt_search== null || appOrgcod_Txt_search.length <= 0) {
		
			  
			  tf=true;
			  
		  } else {
			  if (appOrgcod_Txt_search.match(z) == null ) {
				  $("#appOrgcod_Txt_search").css("color","red");
				  $("#appOrgcod_Txt_search").after("<span class='appOrgcod_Txt_search'style='color: red;'>申請組織コードに使用できない文字が含まれています.</span>");
				  tf=false;
				  
			  } else {
				  
				  if (appOrgcod_Txt_search.length>12) {
					  $("#appOrgcod_Txt_search").css("color","red");
					  $("#appOrgcod_Txt_search").after("<span class='appOrgcod_Txt_search'style='color: red;'>申請組織コードは12文字以下で入力してください</span>");
					  tf=false;
					  
				  } else {
					  
					  tf=true;
				    }
			   }
		   }	  
    }
 
</script>


</head>
<body>
        <!-- 新規場合フォーカス -->
		<c:if test="${modflg==0}">
		
		<script type="text/javascript">
			 $(function(){
				
			     $("#orgCode_Sct").focus();
				})
				
			 </script> 
		</c:if> 
		
		<!-- 更新場合フォーカス -->
		<c:if test="${modflg==1}">
			<script type="text/javascript">
					 $(function(){
						
						$("#appEndYmd_Txt").focus();
						})
			</script> 
		</c:if> 



<form action="" id="lmm112Form">
<table  class="body">
   <tr>
     <td colspan="2">
        <table  class="header_area">
            <tr>
                <td>
                    <jsp:include page="header.jsp" flush="true"/>
                </td>
            </tr>
        </table>
     </td>
   </tr>
   <tr>
       <td>
            <table class="menu">
                <tr >
                    <td class="menu">
                        <jsp:include page="menu.jsp" flush="true"/>
                    </td>
                </tr>
            </table>
       </td>
       <td>
            <table class="main">
                <tr>
                    <td class="main">
						<table class="body">
							<tr>
							   <td>
								 <table >
									<tr>
										<td class="label_normal" width="100">
											&nbsp;
										</td>
										<td class="label_normal" width="200" >
											<u><nobr>前回更新ユーザ&nbsp;${lmm112.updnam}</nobr></u>
										</td>
										<td class="label_normal" width="180">
											&nbsp;
					                    </td>
										<td class="label_normal" width="200">
											<u><nobr>前回更新日時:${lmm112.updymdhms}</nobr></u>
										</td>
							        </tr>
						        </table>
						      </td>
					        </tr>
							<tr>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>
								<table class="condition">
								
								           
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										
										<td class="label_color"><nobr>組織コード</nobr></td>
										<td class="label_left" >
										<!-- 新規場合組織別コード編集可 -->
										<c:if test="${modflg==0}">
											<select id="orgCode_Sct" size="1" name="orgCode_Sct" onblur="orgCode_Scty()">
											 <c:forEach var="list" items="${orgSelect}" begin="0" step="1">
												<option value="${list.orgcod}">
												 ${list.orgcod}
												 </option>
												 </c:forEach>
											</select> 
									    </c:if>
					                  <!-- 更新場合組織別コード編集不可 -->
									  <c:if test="${modflg==1}">
									  <select id="orgCode_Sct" size="1" name="orgCode_Sct" >
										<option value="${lmm112Dto.orgCode_Sct}">${lmm112Dto.orgCode_Sct}
										 </option>
												
										</select>
									  </c:if>
											
										</td>
										
										
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										
										<td class="label_color" width="200" >
											<nobr>組織別商品コード</nobr>
										</td>
										<td class="label_left"  width="500">
										
										<!-- 新規場合組織別商品コード編集可 -->
										<c:if test="${modflg==0}">
										<input type="text" id="orgItmCode_Txt" name="orgItmCode_Txt" maxlength="12" size="74" value="${lmm112.orgitmcod}" onblur="orgItmCode_Txty()"/>
											
									    </c:if>
					                  <!-- 更新場合組織別商品コード編集不可 -->
									  <c:if test="${modflg==1}">
									   <input type="text" id="orgItmCode_Txt" name="orgItmCode_Txt" maxlength="12" size="74" value="${lmm112Dto.orgItmCode_Txt}" readonly="readonly"/>
									  
									  </c:if>
										</td>
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>適用開始日時</nobr>
										</td>
										
										<!-- 新規場合日期適用開始日時編集可 -->
										<c:if test="${modflg==0}">
											<td class="label_left"  width="500">
											    <input type="date" id="appStaYmd_Txt" name="appStaYmd_Txt" maxlength="10" size="10" value="${lmm112.appstaymdhms}" onblur="appStaYmd_Txty()"/>
												<input type="text" id="appStaHh_Txt" name="appStaHh_Txt" maxlength="2" size="2" value="${lmm112.appstaymdhms}" onblur="appStaHh_Txty()"/> :
												<input type="text" id="appStaMm_Txt" name="appStaMm_Txt" maxlength="2" size="2" value="${lmm112.appstaymdhms}" onblur="appStaMm_Txty()"/>
											</td>
									    </c:if>
					                  <!-- 更新場合適用開始日時編集不可  -->
									  <c:if test="${modflg==1}">
									  	<td class="label_left"  width="500">
										   	<input type="date" id="appStaYmd_Txt" name="appStaYmd_Txt" maxlength="10" size="20" readonly="readonly" value="${lmm112Dto.appStaYmd_Txt}"/>
								            <input type="text" id="appStaHh_Txt" name="appStaHh_Txt" maxlength="2" size="2" value="${lmm112Dto.appStaHh_Txt}" readonly="readonly"/>：
											<input type="text" id="appStaMm_Txt" name="appStaMm_Txt" maxlength="2" size="2" value="${lmm112Dto.appStaMm_Txt}" readonly="readonly"/> 
										</td>
									  </c:if>
										
										
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>適用終了日時</nobr>
										</td>
										
									
							
											<td class="label_left"  width="500">
											<input type="date" id="appEndYmd_Txt" name="appEndYmd_Txt" maxlength="10" size="10" value="${lmm112Dto.appEndYmd_Txt}" onblur="appEndYmd_Txty()"/>
											<!-- <input type="submit" value= "…" id="ymdToCal_Btn" class="button_cal" />  -->
											<input type="text" id="appEndHh_Txt" name="appEndHh_Txt" maxlength="2" size="2" value="${lmm112Dto.appEndHh_Txt}" onblur="appEndHh_Txty()"/> :
											<input type="text" id="appEndMm_Txt" name="appEndMm_Txt" maxlength="2" size="2" value="${lmm112Dto.appEndMm_Txt}" onblur="appEndMm_Txty()"/>
										</td>
										
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>組織別商品名</nobr>
										</td>
										<td class="label_left"  width="500">
											<input type="text" id="orgItmName_Txt" name="orgItmName_Txt" maxlength="50" size="74" value="${lmm112Dto.orgItmName_Txt}" onblur="orgItmName_Txty()"/>
										</td>
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>商品コード</nobr>
										</td>
										<td class="label_left"  width="500">
											<input type="text" id="itmCode_Txt" maxlength="12" size="15" value="${lmm112Dto.itmCode_Txt}" onblur="itmCode_Txty()"/>
											
											
										</td>
										
									
									</tr>
									 <tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>商品名</nobr>
										</td>
										<td class="label_left"  width="500">
										<input type="text" id="itmCode_Txt" maxlength="35" size="74" value="${lmm112Dto.itmName_Txt}"/>
											
										</td>
										
									</tr> 
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>申請組織コード</nobr>
										</td>
										<td class="label_left"  width="500">
											<input type="text" id="appOrgcod_Txt_search"  name="appOrgCode_Txt" maxlength="12" size="15" value="${lmm112Dto.appOrgCode_Txt}" onblur="appOrgcod_Txt_searchy()"/>
											<input type="button" value="検索"  id="appSearch_Btn" class="button_app" onclick="openSub()"/>
											<input type="text"
                                                        name="appOrgName_Lbl" id="orgName_Txt"
                                                        class="{validate:{stringMaxLength:12}}" readonly="readonly">							
										</td>
									</tr>
									<tr>
										<td class="label_center">
											&nbsp;
										</td>
										<td class="label_color" width="200" >
											<nobr>廃止フラグ</nobr>
										</td>
										<td class="label_left"  width="500">
										<c:if test="${modflg==0}">
										<input type="checkbox"  id="aboFlg_Chk" name="aboFlg_Chk" readonly="readonly"  value="0" readonly="readonly">　廃止する場合にチェック
											
									    </c:if>
									    <c:if test="${modflg==1}">
											<input type="checkbox" id="aboFlg_Chk" name="aboFlg_Chk" value="${lmm112Dto.aboFlg_Chk}">　廃止する場合にチェック
							                <input type="hidden" id="updEac_Hdn" name="updEac_Hdn" value="${lmm112Dto.updEac_Hdn}" />
									    
									    </c:if>
										</td>
										
									</tr>
									
						     </table>
						 </td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
					</tr>
				</table>
				<table class="common_area">
					<tr>
						<td align="left">
						
						<c:if test="${modflg==0}">
						
							<input type="button" value= "戻る" id="back_Btn" class="button_normal" onclick="back()" /> 
						</c:if>
						
					     <c:if test="${modflg==1}">
							<input type="button" value= "戻る" id="back_Btn" class="button_normal" onclick="backg()" /> 
							
						 </c:if>
						  
						</td>
						<td align="right">
							<input type="button" value= "キャンセル" id="cancel_Btn" class="button_normal" onclick="cancel()"/>
							
						 <!-- 新規の場合 -->
						<c:if test="${modflg==0}">
						
						　　<input type="button" value= "更新" id="update_Btn" class="button_normal"  onclick="disp_confirmx()"/>
						
						</c:if> 
		
						<!-- 更新の場合 -->
						<c:if test="${modflg==1}">
						　　
						　　<input type="button" value= "更新" id="update_Btn" class="button_normal"  onclick="disp_confirmg()"/>
						
						</c:if> 
							
					 </td>				
					</tr>
				</table>
             </td>
            </tr>
           </table>
        </td>
    </tr>
</table>

</form>


</body>
</html>