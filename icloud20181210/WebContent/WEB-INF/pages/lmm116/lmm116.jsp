<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>汎用メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/SLMM116.css">
<script type="text/javascript" src="../js/lmm116.js"></script>
<script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
</head>
<body>
<script type="text/javascript">
window.onload = function(){
	var modeGam_Hdn=${modeGam_Hdn};
	if(modeGam_Hdn==1){
		var tObj = document.getElementById("codoutCode_Txt");
	}else{
		var tObj = document.getElementById("gnrprpKbn_Sct");
	}
	

	var sPos = tObj.value.length;
	setCaretPosition(tObj,sPos)

	}
</script>
	<form action="" id="lmm116From" method="post" onsubmit="return check(${modeGam_Hdn})">
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
													<td class="label_normal" width="200"><u><nobr>前回更新ユーザ&nbsp;&nbsp;${username}</nobr></u>
													</td>
													<td class="label_normal" width="180">&nbsp;</td>
													<td class="label_normal" width="200"><u><nobr>前回更新日時:${time}</nobr></u>
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
													<td class="label_color"><nobr>汎用区分</nobr></td>
													<td class="label_left"><c:choose>
															<c:when test="${modeGam_Hdn==1}">
																<input name="gnrprpkbn" value="${lmmmgrl.gnrprpkbn}"
																	readonly="readonly" />
															</c:when>
															<c:otherwise>
																<select id="gnrprpKbn_Sct" size="1" name="gnrprpkbn">
																<option value="${lmmmgrl.gnrprpkbn}" selected="selected">${lmmmgrl.gnrprpkbn}</option>
																	<c:forEach items="${list}" var="orgKbn01_Sct">
																	<option value="${orgKbn01_Sct.gnrprpkbn}" >${orgKbn01_Sct.gnrprpkbn}</option>
																	</c:forEach>				
																</select>
																<input style="border: 0px;background:white"  type="text" size="50" id="PgnrprpKbn_Sct" disabled="disabled" />
																
															</c:otherwise>
														</c:choose></td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>汎用区分名</nobr>
													</td>
													<td class="label_left" width="500"><label >${lmmmgrl.gnrprpnam1}</label></td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>汎用コード</nobr>
													</td>

													<td class="label_left" width="500"><c:choose>
															<c:when test="${modeGam_Hdn==1}">
																<input type="text" id="gnrprpCode_Txt" name="gnrprpcod"
																	maxlength="12" size="15" value="${lmmmgrl.gnrprpcod}"
																	readonly="readonly" />
															</c:when>
															<c:otherwise>
																<input type="text" id="gnrprpCode_Txt" name="gnrprpcod"
																	maxlength="12" size="15" value="${lmmmgrl.gnrprpcod}"
																	/>
															</c:otherwise>							
														</c:choose>
														<input style="border: 0px;background:white"  type="text" size="50" id="PgnrprpCode_Txt" disabled="disabled" />
														</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>コード種別</nobr>
													</td>

													<td class="label_left" width="500"><input type="text"
														id="codoutCode_Txt" name="codoutcod" maxlength="4"
														size="15" value="${lmmmgrl.codoutcod}" />
														<input style="border: 0px;background:white"  type="text" size="50" id="Pcodoutcod_Txt" disabled="disabled" />
														</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>汎用名１</nobr>
													</td>

													<td class="label_left" width="500"><input type="text"
														id="gnrprpName1_Txt" name="gnrprpnam1" maxlength="50"
														size="15" value="${lmmmgrl.gnrprpnam1}" />
														<input style="border: 0px;background:white"  type="text" size="50" id="PgnrprpName1_Txt" disabled="disabled" />
														</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>汎用名２</nobr>
													</td>

													<td class="label_left" width="500"><input type="text"
														id="gnrprpName2_Txt" name="gnrprpnam2" maxlength="50"
														size="15" value="${lmmmgrl.gnrprpnam2}" />
														<input style="border: 0px;background:white"  type="text" size="50" id="PgnrprpName2_Txt" disabled="disabled" />
														</td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>申請組織コード</nobr>
													</td>
													<td class="label_left" width="500"><input type="text"
														id="appOrgCode_Txt" maxlength="12" size="15"
														name="apporgcod" value="${lmmmgrl.apporgcod}" />
														<input type="text"
														id="updeac_Txt" maxlength="12" size="15"
														name="updeac" value="${lmmmgrl.updeac}" hidden="hidden"/>
														
														 <c:choose>
															<c:when test="${modeGam_Hdn==0}">
																<input type="text" id="orgName_Txt" maxlength="12"
																	size="15" name="orgnam1" value="${lmmmgrl.orgnam1}" />																
															</c:when>
															<c:otherwise>
																<input type="text" id="orgName_Txt" maxlength="12"
																	size="15" name="orgnam1" value="${lmmmgrl.orgnam1}" hidden="hidden"/>	
															</c:otherwise>
														</c:choose> <input type="button" value="检索" id="appSearch_Btn"
														class="button_app" onclick="openWindow()" />
														<input style="border: 0px;background:white"  type="text" size="50" id="PappOrgCode_Txt" disabled="disabled" /></td>
												</tr>
												<tr>
													<td class="label_center">&nbsp;</td>
													<td class="label_color" width="200"><nobr>廃止フラグ</nobr>
													</td>
													<c:choose>
														<c:when test="${modeGam_Hdn==0}">
															<td class="label_left" width="500"><input
																type="checkbox" id="aboFlg_Chk" name="q1" value="0"
																disabled="disabled"> 廃止する場合にチェック</td>
														</c:when>
														<c:otherwise>
															<c:choose>
																<c:when test="${lmmmgrl.aboflg=='1'}">
																	<td class="label_left" width="500"><input
																		type="checkbox" checked="checked" id="aboFlg_Chk"
																		name="aboflg"> 廃止する場合にチェック</td>
																</c:when>
																<c:otherwise>
																	<td class="label_left" width="500"><input
																		type="checkbox" id="aboFlg_Chk" name="aboflg">
																		廃止する場合にチェック</td>
																</c:otherwise>
															</c:choose>
														</c:otherwise>
													</c:choose>
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
										<td align="left"><input type="submit" value="戻る"
											id="back_Btn" class="button_normal" /></td>
										<td align="right">
												<input type="button" value="クリア"
											id="clear_Btn" class="button_normal" onclick="clearAll(${modeGam_Hdn})" />
													<input type="submit" value="変更" id="update_Btn"
														class="button_normal"  /></td>
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