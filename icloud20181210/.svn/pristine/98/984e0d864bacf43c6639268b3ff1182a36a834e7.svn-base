<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lmm102</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.validate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/messages_cn.js"></script>
<script type="text/javascript">
    
    //画面初期化事件
    $(function(){
    	
    	//オーダー作成可否区分の初期処理
    	$("#orgKbn01_Sct").val("${lmm102Dto.orgKbn01_Sct}");

    	
    	
    　　  //組織識別区分の初期処理
    	
    });
    
    
    //組織検索画面がポップアップ
    function openWindow(){
        var apporgcod = window.document.getElementById("appOrgcod_Txt_search").value;
       	window.open("${pageContext.request.contextPath}/slvb704/init?orgCode_Txt=" + apporgcod,"newwindow","height=1104,width=876,top=0,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no");
       	
       	//兼容性
       // window.showModalDialog("${pageContext.request.contextPath}/slvb704/init?orgCode_Txt=" + apporgcod,"window","dialogWidth:876px;status:no;dialogHeight:1104px");
    }

   
    //更新ボタンのクリック事件
    function update(){
        // 新規 or 更新
        var lmm102From = document.getElementById("lmm102From");
        if(window.confirm("処理を実行します。よろしいですか？")){
        	 if(${modeGam_Hdn} == 1){
                lmm102From.submit();  
             } else {
                 lmm102From.action = "add";
                 lmm102From.submit();
             }
        }
       
    }
    
   
    $(function(){	
    	
       //组织コードの二重登録検証
       // 组织コードの入力した後で、フォカスが失う事件の追加
	    $("#orgCode_TxtId").blur(function(){
	    	
	    	//組織コードの入力する値を取得する
	    	var orgCodeVal = $("#orgCode_TxtId").val();
	    	alert(orgCodeVal);
	    	
	    	//ajax
	    	$.ajax({
	    		url:"checkOrg",
	    		data:{'orgCode':orgCodeVal}, //json格式
	    	    type:"POST",
	    	    dataType:'',
	    	    success:function(backData){
	    	    	alert("test");
	    	    	alert(backData);
	    	    	//チェックメッセージを画面に表示する
	    	    	$("#orgMsg").html(backData);
	    	    }
	    	
	    	
	    	});
	    	
	    	
	    });
    });
    
    
    
    
</script>
</head>
<body>
    <form action="update" id="lmm102From" method="post">
        <!-- 画面モード　隠れ -->
        <input type="hidden" id="modeGam_Hdn" name="modeGam_Hdn" />
        
        <!-- 一覧画面の検索条件保持　隠れ -->
        <input type="hidden" id="searchZone_Rdo" name="searchZone_RdoKsjk" value="${lmm101DtoKsjk.searchZone_Rdo}"/>
        <input type="hidden" id="orgCode_Txt" name="orgCode_TxtKsjk" value="${lmm101DtoKsjk.orgCode_Txt}"/>
        <input type="hidden" id="appOrgcod_Txt" name="appOrgcod_TxtKsjk" value="${lmm101DtoKsjk.appOrgcod_Txt}"/>
        <input type="hidden" id="orgNam1_Txt" name="orgNam1_TxtKsjk" value="${lmm101DtoKsjk.orgNam1_Txt}"/>
        <input type="hidden" id="orgKbn2_Sct" name="orgKbn2_SctKsjk" value="${lmm101DtoKsjk.orgKbn2_Sct}"/>
        
        <table class="body">
            <tr>
                <td colspan="2">
                    <table class="header_area">
                        <tr>
                            <td><jsp:include page="header.jsp" flush="true" /></td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <table class="menu">
                        <tr>
                            <td class="menu"><jsp:include page="menu.jsp" flush="true" /><br></td>
                        </tr>
                    </table>
                </td>
                <td>
                    <table class="main">
                        <tr>
                            <td class="main">
                                <table class="data_table">
                                    <tr>
                                        <td>
                                            <table>
                                                <tr>
                                                    <td class="label_normal" width="100">&nbsp;</td>
                                                    <td class="label_normal" width="200">
                                                        <nobr>前回更新ユーザ&nbsp;
                                                            ${lmm102Dto.updId_Lbl}
                                                        </nobr>
                                                    </td>
                                                    <td class="label_normal" width="180">&nbsp;</td>
                                                    <td class="label_normal" width="200">
                                                        <nobr>前回更新日時:
                                                            <input type="text" id="lmm102Dto.updateYmdhm_Lbl"
                                                            name="updateYmdhm_Lbl"
                                                            value="${lmm102Dto.updateYmdhm_Lbl }" />
                                                        </nobr>
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
                                        <td>
                                            <table class="condition">
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織コード</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <c:if test="${modeGam_Hdn == 0 }">
                                                            <input type="text" id="orgCode_TxtId"
                                                                class="{validate:{string:true}}"
                                                                name="orgCode_Txt" maxlength="12" size="50"
                                                                value="${lmm102Dto.orgCode_Txt}" />
                                                        </c:if>
                                                        <c:if test="${modeGam_Hdn == 1 }">
                                                            <input type="text" id="orgCode_TxtId"
                                                                readonly="readonly"
                                                                class="{validate:{string:true,number:true}}"
                                                                name="orgCode_Txt" maxlength="12" size="50"
                                                                value="${lmm102Dto.orgCode_Txt }" />
                                                        </c:if>
                                                        <!-- 组织code二重登录验证信息显示 -->
                                                        <span id="orgMsg"></span>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>適用開始日時</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <c:if test="${modeGam_Hdn == 1 }">
                                                            <input type="date" id="lmm102Dto.appStaYmd_Txt"
                                                                name="appStaYmd_Txt" maxlength="10" size="10"
                                                                value="${lmm102Dto.appStaYmd_Txt}"
                                                                class="{validate:{required:true}}" readonly="readonly" />
                                                            
                                                            <input type="text" id="appStaHh_Txt"
                                                                name="appStaHh_Txt" maxlength="2" size="2"
                                                                class="{validate:{required:true,number:true}}"
                                                                value="${lmm102Dto.appStaHh_Txt}"
                                                                readonly="readonly" /> :
                                                            <input type="text" id=appStaMm_Txt
                                                                name="appStaMm_Txt" maxlength="2" size="2"
                                                                class="{validate:{required:true,number:true}}"
                                                                value="${lmm102Dto.appStaMm_Txt}" />
                                                        </c:if>
                                                        <c:if test="${modeGam_Hdn == 0 }">
                                                            <input type="date" id="appStaYmd_Txt"
                                                                name="appStaYmd_Txt" maxlength="10" size="10"
                                                                value="${lmm102Dto.appStaYmd_Txt}"
                                                                class="{validate:{required:true}}" />
                                                            
                                                            <input type="text" id="appStaHh_Txt"
                                                                name="appStaHh_Txt" maxlength="2" size="2"
                                                                class="{validate:{required:true,number:true}}"
                                                                value="${lmm102Dto.appStaHh_Txt}" />:
                                                                <input type="text" id=appStaMm_Txt
                                                                name="appStaMm_Txt" maxlength="2" size="2"
                                                                class="{validate:{required:true,number:true}}"
                                                                value="${lmm102Dto.appStaMm_Txt}" />
                                                        </c:if>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>適用終了日時</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="date" id="appEndYmd_Txt"
                                                        name="appEndYmd_Txt" maxlength="10" size="10"
                                                        value="${lmm102Dto.appEndYmd_Txt}"
                                                        class="{validate:{required:true}}" />
                                                       
                                                        <input type="text"
                                                        id="appEndHh_Txt" name="appEndHh_Txt"
                                                        maxlength="2" size="2"
                                                        class="{validate:{required:true,number:true}}"
                                                        value="${lmm102Dto.appEndHh_Txt}"/> :
                                                        
                                                        <input type="text" id=appEndMm_Txt
                                                        name="appEndMm_Txt" maxlength="2" size="2"
                                                        class="{validate:{required:true,number:true}}"
                                                        value="${lmm102Dto.appEndMm_Txt}"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織名１</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="text" id="orgNam1_TxtId"
                                                        name="orgNam1_Txt"
                                                        maxlength="35" size="50"
                                                        class="{validate:{maxLength:35}}"
                                                        value="${lmm102Dto.orgNam1_Txt}" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織名2</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="text" id="lmm102Dto.orgNam2_Txt"
                                                        name="orgNam2_Txt"
                                                        value="${lmm102Dto.orgNam2_Txt}"
                                                        maxlength="35" size="50" 
                                                        class="{validate:{stringMaxLength:35}}" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織名3</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="text"
                                                        id="lmm102Dto.orgNam3_Txt" name="orgNam3_Txt"
                                                        value="${lmm102Dto.orgNam3_Txt}"
                                                        maxlength="35" size="50"
                                                        class="{validate:{stringMaxLength:35}}" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織名4</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="text"
                                                        id="lmm102Dto.orgNam4_Txt" name="orgNam4_Txt"
                                                        value="${lmm102Dto.orgNam4_Txt}"
                                                        maxlength="35" size="50"
                                                        class="{validate:{stringMaxLength:35}}" />
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200">
                                                        <nobr>組織名5</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <input type="text"
                                                        id="lmm102Dto.orgNam5_Txt" name="orgNam5_Txt"
                                                        value="${lmm102Dto.orgNam5_Txt}"
                                                        maxlength="35" size="50"
                                                        class="{validate:{stringMaxLength:35}}" /></td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color">
                                                        <nobr>オーダー作成可否区分</nobr>
                                                    </td>
                                                    <td class="label_left">
                                                        <select id="orgKbn01_Sct" size="1" name="orgKbn01_Sct">
                                                            <c:forEach items="${list1 }" var="orgKbn01_Sct">
	                                                            <option value="${orgKbn01_Sct.gnrprpcod}">
                                                                    ${orgKbn01_Sct.gnrprpcod}
                                                                </option>
                                                            </c:forEach>
                                                        </select>
                                                     </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color"><nobr>組織識別区分</nobr></td>
                                                    <td class="label_left">
                                                        <select  name="orgKbn02_Sct">
	                                                        <c:forEach items="${list2 }" var="orgKbn02_Sct">
	                                                           <option value="${orgKbn02_Sct.gnrprpcod}">${orgKbn02_Sct.gnrprpcod}</option>
	                                                        </c:forEach>
                                                        </select>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200"><nobr>申請組織コード</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                    	<input type="text" id="appOrgcod_Txt_search" name="appOrgCod_Txt"
                                                        value="${lmm102Dto.appOrgCod_Txt}"
                                                        maxlength="12" size="15" /> <input type="button"
                                                        value="検索組織名" id="appSearch_Btn" class="button_app"
                                                        onclick="openWindow();" /> 
                                                        <input type="text"
                                                        name="appOrgName_Lbl" id="orgName_Txt"
                                                        class="{validate:{stringMaxLength:12}}" readonly="readonly"></td>
                                                </tr>
                                                <tr>
                                                    <td class="label_center">&nbsp;</td>
                                                    <td class="label_color" width="200"><nobr>廃止フラグ</nobr>
                                                    </td>
                                                    <td class="label_left" width="500">
                                                        <c:if test="${modeGam_Hdn == 0}">
                                                            <input type="checkbox" id="lmm102Dto.aboFlg_Chk"
                                                                name="aboFlg_Chk"
                                                                value="${lmm102Dto.aboFlg_Chk}"
                                                                disabled="disabled" readonly="readonly">　廃止する場合にチェック
                                                        </c:if>
                                                        <c:if test="${modeGam_Hdn == 1}">
                                                            <c:if test="${lmm102Dto.aboFlg_Chk == 0 }">
                                                                <input type="checkbox" name="aboFlg_Chk"
                                                                    />　廃止する場合にチェック
                                                            </c:if>
                                                            <c:if test="${lmm102Dto.aboFlg_Chk == 1 }">
                                                                <input type="checkbox" name="aboFlg_Chk" checked="checked"
                                                                    />　廃止する場合にチェック
                                                            </c:if>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                            </table>
                                            <input type="hidden" id="transition_Hdn"  name="transition_Hdn">
                                            <input type="hidden"
                                            id="updEac_Hdn" name="updEac_Hdn"
                                            value="${lmm102Dto.updEac_Hdn}" />
                                            <input type="hidden" id="tntcod" name="tntcod"
                                            value="${lmm102Dto.tntcod}" />
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
                                <table class="common_area" width="700" height="74">
                                    <tr>
                                        <td align="right"><input type="reset" value="クリア"
                                            id="cleasr_Btn" class="button_normal" /> <input
                                            type="button" value="更新" id="update_Btn"
                                            class="button_normal" onclick="update();" /></td>
                                    </tr>
                                    <tr>
                                        <td align="left"><input type="button" value="戻る"
                                            id="back_Btn" class="button_normal"
                                            onclick="javascript:history.go(-1);" /></td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </form>
    <script type="text/javascript">
	 
    
    </script>
</body>
</html>