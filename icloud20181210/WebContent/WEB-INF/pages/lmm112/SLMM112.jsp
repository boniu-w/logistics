<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>組織別名称メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="../css/common.css">
<link rel="stylesheet" type="text/css" href="../css/SLMM112.css">
<!-- <script src="../js/windowcontrol.js"></script>   -->
</head>
<body>
<form action="">
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
					<u><nobr>前回更新ユーザ&nbsp;L[前回更新ユーザ]</nobr></u>
				</td>
				<td class="label_normal" width="180">
					&nbsp;
				</td>
				<td class="label_normal" width="200">
					<u><nobr>前回更新日時:L[前回更新日時]</nobr></u>
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
				<td class="label_color"><nobr>組織コード</nobr></td>
				<td class="label_left" >
					<select id="orgCode_Sct" size="1" >
						<option value="1">R[組織コード]</option>
					</select>
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
					<input type="text" id="orgItmCode_Txt" maxlength="12" size="74" value="L[組織別商品コード]"/>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>適用開始日時</nobr>
				</td>
				<td class="label_left"  width="500">
					<input type="text" id="appStaYmd_Txt" maxlength="10" size="10" value="L[適用開始日時]"/>
					<input type="submit" value= "…" id="ymdFromCal_Btn" class="button_cal" />
					<input type="text" id="appStaHh_Txt" maxlength="2" size="2" value="L[適用開始日時・時]"/> :
					<input type="text" id="appStaMm_Txt" maxlength="2" size="2" value="L[適用開始日時・分]"/>
				</td>
			</tr>
			<tr>
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color" width="200" >
					<nobr>適用終了日時</nobr>
				</td>
				<td class="label_left"  width="500">
					<input type="text" id="appEndYmd_Txt" maxlength="10" size="10" value="L[適用終了日時]"/>
					<input type="submit" value= "…" id="ymdToCal_Btn" class="button_cal" />
					<input type="text" id="appEndHh_Txt" maxlength="2" size="2" value="L[適用終了日時・時]"/> :
					<input type="text" id="appEndMm_Txt" maxlength="2" size="2" value="L[適用終了日時・分]"/>
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
					<input type="text" id="orgItmName_Txt" maxlength="50" size="74" value="L[組織別商品名]"/>
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
					<input type="text" id="itmCode_Txt" maxlength="35" size="74" value="L[商品コード]"/>
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
					L[商品名]
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
					<input type="text" id="appOrgCode_Txt" maxlength="12" size="15" value="L[申請組織コード]"/>
					<input type="submit" value= "検索" id="appSearch_Btn" class="button_app" />
					L[申請組織名]
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
					<input type="checkbox" id="aboFlg_Chk" name="q1" value="1">　廃止する場合にチェック
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

<table class="common_area">
	<tr>
		<td align="left">
			<input type="submit" value= "戻る" id="back_Btn" class="button_normal" /> 
		</td>
		<td align="right">
			<input type="submit" value= "キャンセル" id="cancel_Btn" class="button_normal" /> 
			<input type="submit" value= "変更" id="update_Btn" class="button_normal" />
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