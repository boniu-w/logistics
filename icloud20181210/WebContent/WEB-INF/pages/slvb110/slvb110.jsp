<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>組織検索画面</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/SLVB110.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/scripts/jquery-3.1.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/slvb110.js"></script>
</head>
<body>
	<form action="../lmm110Controller/selectOrg">
		<table class="body_popup">
			<tr>
				<td>
					<table>
						<tr>
							<td class="label_color_popup"><nobr>組織識別区分</nobr></td>
							<td class="label_left_popup"><nobr>
									<input type="radio" name="orgKbn_Rdo" /><label
										for="searchScope:1">システム利用組織</label>&nbsp; <input
										type="radio" name="orgKbn_Rdo" /><label for="searchScope:2">荷送人/荷受人</label>
								</nobr></td>
							<td class="space_area">&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td class="label_color_popup"><nobr>組織コード</nobr></td>
							<td class="label_left_popup">
								<input type="text" id="orgCode_Txt" maxlength="12" size="20" name="orgcod" value="${orgcod}"/>
							</td>
							<td class="space_area">&nbsp;</td>
							<td class="label_color_popup"><nobr>組織名１</nobr></td>
							<td class="label_left_popup">
								<input type="text" id="orgName1_Txt" maxlength="35" size="35" name="orgNam1_Txt" value="${orgnam1}"/>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td align="right">
					<input type="submit" value="検索" id="search_Btn" class="button_normal"/>&nbsp;
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>
					<div class="tablearea">
						<table id="org_List" class="data_table">
							<tr>
								<th class="col_header">選択</th>
								<th class="col_header">組織コード</th>
								<th class="col_header">適用開始日時</th>
								<th class="col_header">適用終了日時</th>
								<th class="col_header">組織名１</th>
								<th class="col_header">組織名２</th>
								<th class="col_header">組織名３</th>
								<th class="col_header">組織名４</th>
								<th class="col_header">組織名５</th>
							</tr>
							<c:forEach items="${list}" var="lmmmorg">
								<tr class="appOrgCodeList">
									<td class="label_center_groove">
										<input type="radio" value="1" />
									</td>
									<td class="label_center_groove">${lmmmorg.orgcod}</td>
									<td class="label_center_groove">${lmmmorg.appstaymdhms}</td>
									<td class="label_center_groove">${lmmmorg.appendymdhms}</td>
									<td class="label_center_groove">${lmmmorg.orgnam1}</td>
									<td class="label_center_groove">${lmmmorg.orgnam2}</td>
									<td class="label_center_groove">${lmmmorg.orgnam3}</td>
									<td class="label_center_groove">${lmmmorg.orgnam4}</td>
									<td class="label_center_groove">${lmmmorg.orgnam5}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<table class="common_area">
						<tr>
							<td align="left"><input type="button" value="キャンセル" id="cancel_Btn" class="button_normal" /></td>
							<td align="right"><input type="button" onclick="setVal()" value="確定" id="decision_Btn" class="button_normal" /></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>