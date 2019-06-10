<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>イベント一覧画面</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/css/SLMM105.css">
	
<script src="./js/windowcontrol.js"></script>  
<script type="text/javascript"
	src="${pageContext.request.contextPath}/scripts/jquery-3.2.1.min.js"></script>	
	
<script type="text/javascript">

    /* 画面表示時の初期処理 */
 $(function(){	  
	    //検索範囲の初期値の設定処理
     var search_Tntcod = $("input[name='search_Tntcod']");
     $.each(search_Tntcod,function(i, e) {
         var value = $(e).attr("value");
         if(value == "${search_Tntcod}"){
             $(e).attr("checked","true");
         }
     });
     
     
     // 検索のサブミットの検証
     $("#search_Btn").click(function(){
         if(flg1 && flg2 && flg3 && flg4){
             $("#newform").submit();
         }else{
             alert("入力が間違っています");  
             return false;
         }
     });
   
 });
    
 
 
 //検索条件の保持用
	  var formVals = $("#newform").serialize();//json 数据类型  只对form有效
	  console.log(formVals);
	  if(tntcod == undefined){
		  alert("申請組織コード欄、イベントコード欄、イベント名称欄を空白にする");
	  }else{
		  location.href="../lmm105Controller/findAllLmm105?searchZone=2&tntcod="+tntcod+"&gnrprpcod="+gnrprpcod+formVals;
	  }



 
 
 
 
</script>


</head>
<body>

 <form action="${pageContext.request.contextPath}/lmm105Controller/findByLmm105"  method="post" id="newform">
 
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

<table>
	<tr >
		<td>
		<table class="fixedTable">
			<tr>
				<td class="label_center" class="spacewidth" >
					&nbsp;
				</td>
				<td class="label_color lablewidth" >
					<nobr>検索範囲</nobr>
				</td>
				<td class="label_left inputwidth" ><nobr>
					<input type="radio" name="searchScope_Rdo" /><label for="searchScope:1">全件</label>&nbsp;
					<input type="radio" name="searchScope_Rdo" checked/><label for="searchScope:2">廃止を除く</label></nobr>
				</td>
				<td class="spacewidth">
					&nbsp;
				</td>
				<td class="lablewidth">
					&nbsp;
				</td>
				<td class="inputwidth">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label_center" class="spacewidth" >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>申請組織コード</nobr></td>
				<td class="label_left"  >
				<input type="text" id="appCod_Are" name="gnrprp_apporgcod"  maxlength="12" size="37" value='${gnrprp_apporgcod}'/>
				</td>
				<td class="spacewidth">
					&nbsp;
				</td>
				<td class="lablewidth">
					&nbsp;
				</td>
				<td class="inputwidth">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>アラート区分</nobr></td>
				<td class="label_left" >
					<select id="ivtKbn2_Sct"  name="gnrprp_List1_aboflg"  size="1" >
						
                      <option>
                         <c:choose>
                           <c:when  
                          test="${gnrprp_List1_aboflg}!=null//${gnrprp_List1_aboflg}!=''">${gnrprp_List1_aboflg}</c:when>
							<c:otherwise>全件</c:otherwise>
								</c:choose>
								</option>
								<c:forEach items="${list1}" var="gnrprpKbn_Sct"    varStatus="loop">
									<option>${gnrprpKbn_Sct.gnrprpKbn_Sct}</option>
											</c:forEach>						
		
						
					</select>
				</td>
				<td >
					&nbsp;
				</td>
				<td class="label_color"><nobr>イベント種別区分</nobr></td>
				<td class="label_left" >
					<select id="ivtKbn1_Sct"  name="gnrprpKbn2_codoutcod" size="1" >
						<option value="">[全件]</option>
                          <c:forEach items="${listOrgKbn2_Sct}" var="list">
	                        <option value="${list.gnrprpcod}">${list.gnrprpnam1}</option>
                               </c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>イベントコード</nobr></td>
				<td class="label_left" ><input type="text" id="ivtCod_Are" maxlength="12" size="37" name="gnrprpcod" value='${gnrprpcod}'/>
				</td>
				<td >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>イベント名称</nobr></td>
				<td class="label_left"  ><input type="text" id="ivtNam_Are" maxlength="100" size="37"  name="gnrprpnam"  value='${gnrprpnam}'/>
				</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td>
		&nbsp;
		</td>
	</tr>
	<tr>
		<td>
		&nbsp;
		</td>
	</tr>
	<tr>
		<td>
		&nbsp;
		</td>
	</tr>
	<tr>
		<td align= "right">
			<input type="submit" value="検索" id="search_Btn"
				class="button_normal" /></input> &nbsp;
		</td>
	</tr>
	<tr>
		<td>
		&nbsp;
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<div class="tablearea">
		<table id="ivt_List" class="data_table">
			<tr>
				<th class="col_header">テナントコード</th>
				<th class="col_header">汎用区分</th>
				<th class="col_header">汎用コード</th>
				<th class="col_header">廃止フラグ</th>
				<th class="col_header">コード種別</th>
				<th class="col_header">汎用名１</th>
				<th class="col_header">汎用名2</th>
				<th class="col_header">申請組織コード</th>
				<th class="col_header">登録年月日時分秒</th>
				<th class="col_header">登録者</th>
				<th class="col_header">登録者区分</th>
				<th class="col_header">登録方法区分</th>
				<th class="col_header">更新回数</th>
				<th class="col_header">更新年月日時分秒</th>
				<th class="col_header">更新者</th>
				<th class="col_header">更新者区分</th>
				<th class="col_header">更新方法区分</th>
			</tr>
			
			<c:forEach items="${listLmm105Dto}" var="list" >
			<tr>
			
				<td class="label_center_groove">
					<input type="radio"  tntcod="${list.tntcod}"  value="${list.tntcod}"   value="${status.index}"  value=""  />
				</td>
				<%--  <td class="label_center_groove">${list.tntcod}</td> --%>
				<td class="label_center_groove">${list.gnrprpkbn}</td>
				<td class="label_center_groove">${list.gnrprpcod}</td>
				<td class="label_center_groove">${list.aboflg}</td>
				<td class="label_center_groove">${list.codoutcod}</td>
				<td class="label_center_groove">${list.gnrprpnam1}</td>
				<td class="label_center_groove">${list.gnrprpnam2}</td>
				<td class="label_center_groove">${list.apporgcod}</td>
				<td class="label_center_groove">${list.insymdhms}</td>
				<td class="label_center_groove">${list.insnam}</td>
				<td class="label_center_groove">${list.inskbn}</td>
				<td class="label_center_groove">${list.insmethodkbn}</td>
				<td class="label_center_groove">${list.updymdhms}</td>
				<td class="label_center_groove">${list.updnam}</td>
				<td class="label_center_groove">${list.updkbn}</td>
				<td class="label_center_groove">${list.updmethodkbn}</td> 
				<td class="label_center_groove">${list.updmethodkbn}</td>
				
			</tr>
			</c:forEach>
					
		</table>
		</div>
		</td>
	</tr>
</table>
<table class="common_area">
	<tr>
		<td align="left">
			<input type="submit" value= "DashBoardへ戻る" id="backDashBoard_Btn" class="button_normal_bashB" /> 
		</td>
		<td align="right">
			<input type="submit" value= "新規" id="insert_Btn" class="button_normal" /> 
			<input type="submit" value= "変更" id="modify_Btn" class="button_normal" />
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