<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/SLMM110.css">
<script type="text/javascript" src="../js/lmm110.js"></script>
<script type="text/javascript" src="../scripts/jquery-3.1.0.min.js"></script>
</head>
<body>
	<form action="../lmm110Controller/<c:if test='${modFlg==0}'>insert</c:if><c:if test='${modFlg==1}'>update</c:if>"
		onsubmit="return check()">
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
							<td class="menu"><jsp:include page="menu.jsp" flush="true" />
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
													<td class="label_normal" width="100">&nbsp;</td>
													<td class="label_normal" width="200"><u><nobr>前回更新ユーザ&nbsp;${lmm110.updnam}</nobr></u>
													</td>
													<td class="label_normal" width="180">&nbsp;</td>
													<td class="label_normal" width="200"><u><nobr>前回更新日時：${lmm110.updymdhms}</nobr></u>
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
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>商品コード</nobr>
													</td>
													<td class="label_left" width="500">
													
														<input  type="text" id="itemCode_Txt" maxlength="35" size="74"
														name="itmcod" value="${lmm110.itmcod}"
														<c:if test='${modFlg==1}'>readOnly="readOnly"</c:if>
														<c:if test='${modFlg==0}'>autofocus</c:if>/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>適用開始日時</nobr></td>
													<td class="label_left" width="500">
														<input type="date" id="appStaYmd_Txt" maxlength="10"
<<<<<<< .mine
															name="appStaYmd_Txt" size="10" value="${lmm110.appStaYmd_Txt}" 
															<c:if test='${modFlg==1}'>autofocus</c:if>/>
=======
															name="appStaymd" size="10" value="${lmm110.appStaymd}" <c:if test='${modFlg==1}'>autofocus</c:if>/>
>>>>>>> .r568
														<input type="text" id="appStaHh_Txt" maxlength="2" size="2"
															name="appStaHh" value="${lmm110.appStaHh}"/>:
														<input type="text" id="appStaMm_Txt" maxlength="2" size="2"
															name="appStaMm" value="${lmm110.appStaMm}""/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>適用終了日時</nobr>
													</td>
													<td class="label_left" width="500">
														<input type="date" id="appEndYmd_Txt" maxlength="10"
															name="appEndymd" size="10" value="${lmm110.appEndymd}"/>
														<input type="text" id="appEndHh_Txt" maxlength="2" size="2"
															name="appEndHh" value="${lmm110.appEndHh}"/>:
														<input type="text" id="appEndMm_Txt" maxlength="2" size="2"
															name="appEndMm" value="${lmm110.appEndMm}"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>商品名</nobr></td>
													<td class="label_left" width="500">
														<input type="text" id="itemName_Txt" maxlength="50" size="74"
															name="itmnam1" value="${lmm110.itmnam1}"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>申請組織コード</nobr>
													</td>
													<td class="label_left" width="500">
														<input type="text" id="applyOrgCod_Txt" maxlength="12" size="15"
															name="apporgcod" value="${lmm110.apporgcod}"/>
														<input type="button" value="検索" id="applyOrgSearch_Btn"
															class="button_normal" onclick="openWindow()"/>
														<input type="text" id="applyOrg_Lbl" maxlength="12" size="45"
															name="orgnam1" readonly="readonly" value="${lmm110.orgnam1}"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>廃止フラグ</nobr></td>
													<td class="label_left" width="500">
														<input type="checkbox" id="aboFlg_Chk" name="aboflg" 
															<c:if test='${lmm110.aboflg=="1"}'>checked="checked"</c:if>
															<c:if test='${modFlg=="0"}'>onclick="return false;"</c:if>/>
															廃止する場合にチェック
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
                                        <td align="right">
                                        	<input type="reset" value="クリア" id="clear_Btn" class="button_normal"/>
                                        	<input type="submit" value="更新" id="update_Btn" class="button_normal"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="left">
                                        	<input type="button" value="戻る" id="back_Btn" class="button_normal"
                                            onclick="window.location='../index.jsp'"/>
                                        </td>
                                    </tr>
								</table>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<!-- 更新回数の保持 -->
		<input type="text" name="updeac" value="${lmm110.updeac}" style="display: none;"/>
		<!-- 一覧画面の検索条件の保持 -->
		<input type="text" id="searchScope_" name="searchScope_" value="${lmm109DtoKsjk.searchScope_Rdo}" style="display: none;">
		<input type="text" id="applyOrgCode_" name="applyOrgCode_" value="${lmm109DtoKsjk.applyOrgCode_Txt}" style="display: none;">
		<input type="text" id="itemCode_" name="itemCode_" value="${lmm109DtoKsjk.itemCode_Txt}" style="display: none;">
		<input type="text" id="itemName_" name="itemName_" value="${lmm109DtoKsjk.itemName_Txt}" style="display: none;">
	</form>
</body>
</html>