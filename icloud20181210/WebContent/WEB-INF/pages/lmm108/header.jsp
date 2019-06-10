<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/common/taglibs.jsp"%>
        <table class="header">
        	<tr>
                <td width=100 align="left">Information</td>
                <td align="center">&nbsp;</td>
            </tr>
            <tr>
                <td width=500 align="left">
                <%@ include file="/common/messages.jsp"%>
                </td>
            </tr>
            <tr>
                <td width=100 align="center">&nbsp;</td>
                <td align="right">
                    ${userName } &nbsp;&nbsp;
                    <input type="submit" value="ログアウト" id="logout" class="button_normal" />
                </td>
            </tr>
        </table>
