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
													<td class="label_normal" width="200"><u><nobr>前回更新ユーザ&nbsp;${lmm110.updateUserCode_Lbl}</nobr></u>
													</td>
													<td class="label_normal" width="180">&nbsp;</td>
													<td class="label_normal" width="200"><u><nobr>前回更新日時：${lmm110.updateYmdhm_Lbl}</nobr></u>
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
														name="itemCode_Txt" value="${lmm110.itemCode_Txt}"
														<c:if test='${modFlg==1}'>readOnly="readOnly"</c:if>
														<c:if test='${modFlg==0}'>autofocus</c:if>/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>適用開始日時</nobr></td>
													<td class="label_left" width="500">
														<input type="date" id="appStaYmd_Txt" maxlength="10"
															name="appStaYmd_Txt" size="10" value="${lmm110.appStaYmd_Txt}" 
															<c:if test='${modFlg==1}'>autofocus</c:if>/>
														<input type="text" id="appStaHh_Txt" maxlength="2" size="2"
															name="appStaHh_Txt" value="${lmm110.appStaHh_Txt}"/>:
														<input type="text" id="appStaMm_Txt" maxlength="2" size="2"
															name="appStaMm_Txt" value="${lmm110.appStaMm_Txt}""/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>適用終了日時</nobr>
													</td>
													<td class="label_left" width="500">
														<input type="date" id="appEndYmd_Txt" maxlength="10"
															name="appEndYmd_Txt" size="10" value="${lmm110.appEndYmd_Txt}"/>
														<input type="text" id="appEndHh_Txt" maxlength="2" size="2"
															name="appEndHh_Txt" value="${lmm110.appEndHh_Txt}"/>:
														<input type="text" id="appEndMm_Txt" maxlength="2" size="2"
															name="appEndMm_Txt" value="${lmm110.appEndMm_Txt}"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>商品名</nobr></td>
													<td class="label_left" width="500">
														<input type="text" id="itemName_Txt" maxlength="50" size="74"
															name="itemName_Txt" value="${lmm110.itemName_Txt}"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>申請組織コード</nobr>
													</td>
													<td class="label_left" width="500">
														<input type="text" id="applyOrgCod_Txt" maxlength="12" size="15"
															name="appOrgCod_Txt" value="${lmm110.appOrgCod_Txt}"/>
														<input type="button" value="検索" id="applyOrgSearch_Btn"
															class="button_normal" onclick="openWindow()"/>
														<input type="text" id="applyOrg_Lbl" maxlength="12" size="45"
															name="applyOrg_Lbl" readonly="readonly"/>
													</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>廃止フラグ</nobr></td>
													<td class="label_left" width="500">
														<input type="checkbox" id="aboFlg_Chk" name="aboFlg_Chk" 
															<c:if test='${lmm110.aboFlg_Chk=="1"}'>checked="checked"</c:if>
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
		<input type="text" name="updEac_Hdn" value="${lmm110.updEac_Hdn}" style="display: none;"/>
	</form>
</body>
</html>