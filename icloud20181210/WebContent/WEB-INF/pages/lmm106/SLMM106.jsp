<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<html>
   <f:view>
      <head>
         <!-- common header start-->
         <c:set var="sde.jspimport.src" value="/template/jsp/common_head.jsp" scope="request"/>
         <c:import url="${customizationJspImport.path}"/>
         <!-- common header end-->
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>
            イベントメンテナンス画面
         </title>
         <link rel="stylesheet" type="text/css" href="../../../css/common.css">
		 <link rel="stylesheet" type="text/css" href="../../../css/SLMM106.css">
		 <script src="../../../js/windowcontrol.js"></script>  
      </head>
      <body>
         <h:form>
            <table class="body">
               <tr>
                  <td colspan="2">
                     <table class="header_area">
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
                        <tr>
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
                                       <table>
                                          <tr>
                                             <td class="label_normal" width="100">
                                                &nbsp;
                                             </td>
                                             <td class="label_normal" width="200">
                                                <u>
                                                   <nobr>
                                                      前回更新ユーザ&nbsp;
                                                      <h:outputText value="#{SLMM106Form.updId_Are}"/>
                                                   </nobr>
                                                </u>
                                             </td>
                                             <td class="label_normal" width="180">
                                                &nbsp;
                                             </td>
                                             <td class="label_normal" width="200">
                                                <u>
                                                   <nobr>
                                                      前回更新日時: 
                                                      <h:outputText value="#{SLMM106Form.updYmdhms_Are}"/>
                                                   </nobr>
                                                </u>
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
                                       <table class="condition">
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color" width="200">
                                                <nobr>
                                                   イベントコード
                                                </nobr>
                                             </td>
                                             <td class="label_left" width="500">
                                                <h:inputText value="#{SLMM106Form.ivtCod_Are}" id="ivtCod_Are" maxlength="12" size="74">
                                                </h:inputText>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color" width="200">
                                                <nobr>
                                                   イベント名称
                                                </nobr>
                                             </td>
                                             <td class="label_left" width="500">
                                                <h:inputText value="#{SLMM106Form.ivtNam_Are}" id="ivtNam_Are" maxlength="100" size="74">
                                                </h:inputText>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color">
                                                <nobr>
                                                   アラート区分
                                                </nobr>
                                             </td>
                                             <td class="label_left">
                                                <h:selectOneMenu value="#{SLMM106Form.ivtKbn2_Sct}" id="ivtKbn2_Sct">
                                                   <f:selectItems value="#{SLMM106Form.ivtKbn2_SctList}"/>
                                                </h:selectOneMenu>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color">
                                                <nobr>
                                                   イベント種別区分
                                                </nobr>
                                             </td>
                                             <td class="label_left">
                                                <h:selectOneMenu value="#{SLMM106Form.ivtKbn1_Sct}" id="ivtKbn1_Sct">
                                                   <f:selectItems value="#{SLMM106Form.ivtKbn1_SctList}"/>
                                                </h:selectOneMenu>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color" width="200">
                                                <nobr>
                                                   アクションメモ
                                                </nobr>
                                             </td>
                                             <td class="label_left" width="500">
                                                <h:inputText value="#{SLMM106Form.atnFil_Ate}" id="atnFil_Ate" maxlength="100" size="74">
                                                </h:inputText>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color" width="200">
                                                <nobr>
                                                   申請組織
                                                </nobr>
                                             </td>
                                             <td class="label_left" width="500">
                                                <h:inputText value="#{SLMM106Form.appCod_Are}" id="appCod_Are" maxlength="12" size="15">
                                                </h:inputText>
                                                <h:commandButton action="#{SLMM106Action.appSearch_Btn}" type="submit" value="検索" id="appSearch_Btn" styleClass="button_normal">
                                                </h:commandButton>
                                                <h:inputText value="#{SLMM106Form.appNam_Are}" id="appNam_Are" maxlength="35" size="40">
                                                </h:inputText>
                                             </td>
                                          </tr>
                                          <tr>
                                             <td class="label_center">
                                                &nbsp;
                                             </td>
                                             <td class="label_color" width="200">
                                                <nobr>
                                                   廃止フラグ
                                                </nobr>
                                             </td>
                                             <td class="label_left" width="500">
                                                <h:selectBooleanCheckbox value="#{SLMM106Form.aboFlg_Chk}" id="aboFlg_Chk">
                                                </h:selectBooleanCheckbox>
                                                　廃止する場合にチェック
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
                                    <td>
                                       &nbsp;
                                    </td>
                                 </tr>
                                 <tr>
                                    <td>
                                       &nbsp;
                                    </td>
                                 </tr>
                              </table>
                           </td>
                        </tr>
                     </table>
                  </td>
               </tr>
            </table>
         </h:form>
      </body>
   </f:view>
</html>