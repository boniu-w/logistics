<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lmm101 </title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css" charset="UTF-8" />
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.validate.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery.metadata.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/messages_cn.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/commons-vacation.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/lmm101.js"></script>
<script type="text/javascript">
  
  $(function(){
	  
	    //検索範囲の初期値の設定処理
        var searchZone_Rdos = $("input[name='searchZone_Rdo']");
        $.each(searchZone_Rdos,function(i, e) {
            var value = $(e).attr("value");
            if(value == "${searchZone_Rdo}"){
                $(e).attr("checked","true");
            }
        });
        
      //一覧明細部のデフオルト処理    
      window.document.all("ck")[0].checked = true;
      
    });
    
   //jquery　validate
    $.validator.setDefaults({
        //submitHandler: function() { alert("newform!"); }
    });

    $().ready(function() { 
       $("#newform").validate();
    });

    //メンテナンス画面に遷移する 更新の場合
    function toUpdate(){
        var tntcod = $("input[name='ck']:checked").attr('tntcode');
        var orgcod = $("input[name='ck']:checked").attr('alt');
        var apptime = $("input[name='ck']:checked").attr('start1');
        //検索条件の保持用
        var formVals = $("#newform").serialize();//json 数据类型  只对form有效
        console.log(formVals);
        if(tntcod == undefined){
            alert("対象が選択されていません");
            return;
        } else {
            location.href="../lmm102Controller/init?modeGam_Hdn=1&orgcod="+orgcod+"&appstaymdhms="+apptime+"&tntcod="+tntcod+"&"+formVals;
        }
    }

    //メンテナンス画面に遷移する 新規の場合
    function toAdd(){
        location.href="../lmm102Controller/init?modeGam_Hdn=0";
    }
    
 </script>
</head>
<body>
    <form action="quallBy" method="post" id="newform">
        <table class="body">
            <tr>
                <td colspan="2">
                    <table class="header_area">
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
                                        <td class="menu">
                                            <jsp:include page="menu.jsp" flush="true" /></td>
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
                                                        <table width="727" height="258">
                                                            <tr>
                                                                <td class="label_center">&nbsp;</td>
                                                                <td class="label_color" width="120">
                                                                    <nobr>検索範囲</nobr>
                                                                </td>
                                                                <td class="label_left" width="600">
                                                                    <input type="radio" value="1" name="searchZone_Rdo"/>全件
                                                                    <input type="radio" value="2" name="searchZone_Rdo">適用期間内
                                                                    
                                                                </td>
                                                                <td width="10">&nbsp;</td>
                                                                <td width="140">&nbsp;</td>
                                                                <td width="200">&nbsp;</td>
                                                            </tr>
                                                            <tr>
                                                                <td class="label_center">&nbsp;</td>
                                                                <td class="label_color" width="140">申請組織コード</td>

                                                                <td class="label_left" width="200"><input
                                                                    type="text" name="appOrgcod_Txt"
                                                                    value='${appOrgcod_Txt}'
                                                                    class="{dspNum:true,max:5}" size="12" />
                                                                </td>
                                                                <td width="10">&nbsp;</td>
                                                                <td width="140">&nbsp;</td>
                                                                <td width="200">&nbsp;</td>
                                                            </tr>
                                                            <tr>
                                                                <td class="label_center">&nbsp;</td>
                                                                <td class="label_color" width="140">組織コード</td>
                                                                <td class="label_left" width="200"><input
                                                                    type="text" name="orgCode_Txt"
                                                                    value='${orgCode_Txt}'
                                                                    maxlength="12" size="37" />
                                                                </td>
                                                                <td width="10">&nbsp;</td>
                                                                <td class="label_color" width="140">組織名１</td>
                                                                <td class="label_left" width="200">
                                                                    <input type="text" name="orgNam1_Txt"
                                                                    value='${orgNam1_Txt}'
                                                                    maxlength="35" size="37" class="" />
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td class="label_center">&nbsp;</td>
                                                                <td class="label_color" width="140">組織識別区分</td>
                                                                <td class="label_left" width="200">
                                                                    <select name="orgKbn2_Sct">
                                                                        <option value="">[全件]</option>
                                                                        <c:forEach items="${listOrgKbn2_Sct}" var="list">
	                                                                        <option value="${list.gnrprpcod}">${list.gnrprpnam1}</option>
                                                                        </c:forEach>
                                                                    </select>
                                                                </td>
                                                                <td width="10">&nbsp;</td>
                                                                <td width="140">&nbsp;</td>
                                                                <td width="200">&nbsp;</td>

                                                                <td align="right"><input type="submit" value="検索"
                                                                    id="search_Btn" class="button_normal" /></input></td>
                                                            </tr>
                                                        </table>
                                                    </td>
                                                </tr>

                                                <tr>
                                                    <td colspan="2">
                                                        <table id="org_List" class="data_table">
                                                            <tr>
                                                                <th class="col_header">選択</th>
                                                                <th class="col_header">廃止</th>
                                                                <th class="col_header">組織コード</th>
                                                                <th class="col_header">適用開始日時</th>
                                                                <th class="col_header">適用終了日時</th>
                                                                <th class="col_header">組織名１</th>
                                                                <th class="col_header">組織名２</th>
                                                                <th class="col_header">組織名3</th>
                                                                <th class="col_header">組織名4</th>
                                                                <th class="col_header">組織名５</th>
                                                                <th class="col_header">オーダー作成可否区分名称</th>
                                                                <th class="col_header">組織識別区分名称</th>
                                                                <th class="col_header">申請組織コード</th>
                                                            </tr>


                                                            <c:forEach items="${listLmm101Dto}" var="list" varStatus="status">
                                                                <tr>

                                                                    <td class="label_center_groove">
                                                                    <input type="radio" tntcode="${list.tntcod}"
                                                                        alt="${list.orgcod}"
                                                                        start1="${list.appstaymdhms}"
                                                                        value="${status.index}" name="ck" value="1" />
                                                                     </td>
                                                                     
                                                                    <td class="label_center_groove">
                                                                        <c:choose>
                                                                            <c:when test="${list.aboflg==1}">〇</c:when>
                                                                            <c:otherwise><br></c:otherwise>
                                                                        </c:choose>
                                                                    </td>
                                                                    <td class="label_center_groove">${list.orgcod}</td>
                                                                    <td class="label_center_groove">${list.appstaymdhms}</td>
                                                                    <td class="label_center_groove">${list.appendymdhms}</td>
                                                                    <td class="label_center_groove">${list.orgnam1}</td>
                                                                    <td class="label_center_groove">${list.orgnam2}</td>
                                                                    <td class="label_center_groove">${list.orgnam3}</td>
                                                                    <td class="label_center_groove">${list.orgnam4}</td>
                                                                    <td class="label_center_groove">${list.orgnam5}</td>
                                                                    <td class="label_center_groove">${list.orgkbn01}</td>
                                                                    <td class="label_center_groove">${list.orgkbn02}</td>
                                                                    <td class="label_center_groove">${list.apporgcod}</td>
                                                                </tr>
                                                            </c:forEach>

                                                        </table>
                                                    </td>
                                                </tr>
                                            </table>
                                            <table class="common_area">
                                                <tr>
                                                    <td align="right"><input type="button" value="新規"
                                                        id="insert_Btn" onclick="toAdd();" class="button_normal" />
                                                        <input type="button" value="変更" id="modify_Btn"
                                                        onclick="toUpdate();" class="button_normal" /></td>
                                                </tr>
                                                <tr>
                                                    <td align="left"><input type="submit" value="戻る"
                                                        id="backDashBoard_Btn" name="backDashBoard_Btn"
                                                        onclick="javascript:history.go(-1);" class="button_normal" />
                                                    </td>
                                                </tr>
                                            </table>
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