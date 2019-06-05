package org.cloud.util;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.cloud.webapp.BaseController;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

/**
*@author WG
*@date 2019/06/04 10:42:20
*/
/*@Component
@Aspect*/
public class Lmm117Aspect extends BaseController{

	@Pointcut("execution(* org.cloud.webapp.controller.Lmm117Controller.findSomeField(..))")
	public void regAll() {}

	@Before(value = "regAll()")
	public ModelAndView before(JoinPoint joinPoint ) {
		
		Object[] args = joinPoint.getArgs();
		//得到切点的参数
		HashMap<String,String> hashMap=(HashMap<String,String>)args[0];
		HttpServletRequest request=(HttpServletRequest)args[1];
		
		//得到对应的键值,对其验证;
//		var reg_appOrgCode_Txt = /^[0-9A-Z]{0,12}$/; // 申請組織コード
//		var reg_shipmentPlaceCode_Txt = /^[0-9A-Z]{0,12}$/; // 出荷場所コード
//		var reg_finalDestinationCode_Txt = /^[0-9A-Z]{0,12}$/ // 最終届先cod
//		var reg_trackingGCode_Txt=/^[0-9A-Z]{0,12}$/;  // トラッキンググループコード
//		LVB-004030     最大文字数チェック
//		LVB-004010 正規表現チェック
		String appOrgCode_Txt = hashMap.get("appOrgCode_Txt");
		
		String regLength="^[0-9A-Z]{0,12}$";
		String regTxt="[0-9A-Z]";
		Pattern patternLength=Pattern.compile(regLength);
		Pattern patternTxt=Pattern.compile(regTxt);
		
		Matcher matcher = patternLength.matcher(appOrgCode_Txt);
		boolean findLength = matcher.find();
		System.out.println(findLength+"-----findLength------");
		
		boolean findTxt=patternTxt.matcher(appOrgCode_Txt).find();
		System.out.println(findTxt+"-----findTxt------");
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/lmm117/lmm117");
		
		
		if(!findTxt) {
			System.out.println("findTxt 有错");
			String [] messages= {"申請組織コード"};
			super.saveMessage(MessageSource.getText(request, "LVB-004010", messages));
			return modelAndView;
		}else if(!findLength) {
				System.out.println("findLength 有错");
				String [] messages= {"申請組織コード","12"};
				String text = MessageSource.getText(request, "LVB-004030", messages);
				super.saveMessage(text);
				return modelAndView;
			}
		return modelAndView;
	}
}
