package org.cloud.webapp.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.cloud.service.Slvb704Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*******************************************************************************
 * [処理概要] 
 * 
 * 組織コード/名称を検索し、呼び出し元画面に引き渡す。
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2018/11/29 新規作成 
 ******************************************************************************/
@Controller
@RequestMapping("/slvb704")
public class Slvb704Controller {
	
	@Autowired
	Slvb704Service slvb704Service;

	@RequestMapping(value="/init", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView init(@RequestParam Map<String, Object> map, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		
		//　画面をセットする
		mav.setViewName("slvb704/slvb704");
		
		// テナントコード取得
		String tntcod = (String) req.getSession().getAttribute("tntcod");
		tntcod = "01001006";
		
		map.put("tntcod", tntcod);
		// 画面表示項目の検索処理
		List<Map<String, Object>> list = slvb704Service.query(map);
		
		//　データ
		mav.addObject("list", list);
		mav.addObject("orgCode_Txt", map.get("orgCode_Txt"));
		return mav;
	}
}
