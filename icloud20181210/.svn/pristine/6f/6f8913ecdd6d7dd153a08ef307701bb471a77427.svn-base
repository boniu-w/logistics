package org.cloud.webapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.cloud.service.Slvb108Service;
import org.cloud.service.Slvb704Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
@RequestMapping("/slvb108")
public class Slvb108Controller {
	
	@Autowired
	Slvb108Service slvb108Service;
	
	/**
	 * 
	 * @Title:init
	 * @Description:TODO サブページ初期化
	 * @param:@param map
	 * @param:@param req
	 * @param:@return
	 * @return:ModelAndView
	 * @throws:
	 */
	@RequestMapping(value="/init", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView init(@RequestParam Map<String, String> map, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		
		//　画面をセットする
		mav.setViewName( "slvb108/slvb108" );
		
		// テナントコード取得
		String tntcod = (String) req.getSession().getAttribute("tntcod");
		
		map.put( "tntcod", tntcod );
		// 画面表示項目の検索処理
		List< Map< String, Object > > list = slvb108Service.query( map );
		
		//　データ
		mav.addObject("list", list);
		mav.addObject("orgCode_Txt", map.get("orgCode_Txt"));
		return mav;
	}
	
	
	/**
	 * 
	 * @Title:seacher
	 * @Description:TODO サブページで照会ボタン機能が実現されます。
	 * @param:@param orgcod
	 * @param:@param orgcodNam
	 * @param:@param req
	 * @param:@return
	 * @return:List<Map<String,Object>>
	 * @throws:
	 */
	@RequestMapping(value="/seacher", method= {RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public List< Map< String, Object > > seacher( String orgcod, String orgcodNam, HttpServletRequest req) {
		
		//mapオブジェクトを宣言
		Map<String,String> map = new HashMap<String,String>();
		
		//mapにフロントからの値を追加します。
		map.put("orgCode_Txt", orgcod);
		map.put("orgName1_Txt", orgcodNam);
		
		// テナントコード取得
		String tntcod = (String) req.getSession().getAttribute("tntcod");
		
		map.put("tntcod", tntcod);
		
		// 画面表示項目の検索処理
		List< Map< String, Object > > list = slvb108Service.query( map );
		
		//　データ
		req.setAttribute("orgCode_Txt", map.get("orgcod"));
		return list;
	}
}
