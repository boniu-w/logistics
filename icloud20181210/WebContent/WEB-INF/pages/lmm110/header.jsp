<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/taglibs.jsp"%>
        <table class="header">
            <tr>
                <td width=100 align="center">L[画面名]</td>
                <td align="center">&nbsp;</td>
            </tr>
            <tr>
                <td width=100 align="center">Information</td>
                <td align="center"><%@ include file="/common/messages.jsp"%></td>
            </tr>
            <tr>
                <td width=100 align="center">&nbsp;</td>
                <td align="right">
                    L[ログインユーザー名] &nbsp;&nbsp;
                    <input type="submit" value="ログアウト" id="logout" class="button_normal" />
                </td>
            </tr>
        </table>
