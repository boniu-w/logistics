<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>イベント集計メンテナンス画面</title>
<link rel="stylesheet" type="text/css" href="./css/common.css">
<link rel="stylesheet" type="text/css" href="./css/SLMM106.css">
 
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
				<td class="label_center">
					&nbsp;
				</td>
				<td class="label_color"><nobr>イベント集計コード</nobr></td>
				<td class="label_left" ><input type="text" id="evtMrgCode_Txt" maxlength="12" size="37"/>
				</td>
				<td >
					&nbsp;
				</td>
				<td class="label_color" ><nobr>イベント集計名称</nobr></td>
				<td class="label_left"  ><input type="text" id="evtMrgName_Txt" maxlength="50" size="37" />
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
		<table id="evtMrg_List" class="data_table">
			<tr>
				<th class="col_header">選択</th>
				<th class="col_header">廃止</th>
				<th class="col_header">表示順</th>
				<th class="col_header">イベント集計コード</th>
				<th class="col_header">イベント集計名称</th>
				<th class="col_header">申請組織コード</th>
			</tr>
			<tr>
				<td class="label_center_groove">
					<input type="radio" value="1" />
				</td>
				<td class="label_center_groove">L[廃止]</td>
				<td class="label_center_groove">L[表示順]</td>
				<td class="label_center_groove">L[イベント集計コード]</td>
				<td class="label_center_groove">L[イベント集計名称]</td>
				<td class="label_center_groove">L[申請組織コード]</td>
			</tr>
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