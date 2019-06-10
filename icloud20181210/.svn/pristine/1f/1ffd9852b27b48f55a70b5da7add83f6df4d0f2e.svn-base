package org.cloud.webapp.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm109Dto;
import org.cloud.dto.Lmm109DtoSelect;
import org.cloud.service.Lmm109Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;


@Controller
@RequestMapping("/lmm109Controller")
public class Lmm109Controller extends BaseController{
	
	@Autowired
	
	private Lmm109Service lmm109Service;

	/**
	 * 画面一覧画面の初期化処理
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/init", method = {RequestMethod.POST, RequestMethod.GET })
	
	public ModelAndView init(HttpServletRequest request) {
		
		//ModelAndViewの定義
		
		ModelAndView modelAndView = new ModelAndView();
		
		HttpSession session = request.getSession();
		
		String tntcod = (String)session.getAttribute("tntcod");
		
		//検索範囲の初期値を２に設定する
		
		Integer searchScope_Rdo = 2;
		
		// 初期表示データ検索範囲 の設定 
		
		modelAndView.addObject("searchScope_Rdo", searchScope_Rdo);

		// ページ遷移
		
		modelAndView.setViewName("/lmm109/SLMM109");
		
		return modelAndView;
	}

	/**
	 *  selectInfo 検索ボタンのイベント
	 * @param lmm109DtoSelect 検索条件
	 * @param request
	 * @param model 一覧検索条件保持用の引数
	 * @return
	 * LVB-009001システム異常処理がCloudExceptionで行う
	 */
	@RequestMapping(value = "/selectInfo", method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView  selectInfo(@ModelAttribute Lmm109DtoSelect lmm109DtoSelect,
			HttpServletRequest httpServletRequest, ModelMap model) {

		// ModelAndView の定義
		
		ModelAndView modelAndView = new ModelAndView();
		
		HttpSession session = request.getSession();
		
		//セッション．tntcod
		
		String tntcod = (String)session.getAttribute("tntcod");
		
		//tntcod = "01001006";
		
		//セッション．最大表示件数														

		Integer max = null;
		
		if((String)session.getAttribute("max") !=null) {
			
			max = Integer.valueOf( (String)session.getAttribute("max") ) ;
			
		}
		
		//  max =20;
		
		// ページの遷移
		
		modelAndView.setViewName("/lmm109/SLMM109");
		
		// 画面表示結果のリスト
		
		List<Lmm109Dto> list =new LinkedList<Lmm109Dto>();
		
		// 109画面一覧の対象
		
		Lmm109Dto lmm109Dto;
		
		//ページの入来値を取得する
		
		Integer searchScope_Rdo = lmm109DtoSelect.getSearchScope_Rdo();
		
		String applyOrgCode_Txt = lmm109DtoSelect.getApplyOrgCode_Txt();
		
		String itemCode_Txt = lmm109DtoSelect.getItemCode_Txt();
		
		String itemName_Txt = lmm109DtoSelect.getItemName_Txt();
		
		//入来する値が空であるかどうかを判断する
		
		if(searchScope_Rdo==null) {
			
			searchScope_Rdo=(Integer)model.get("searchScope_Rdo");
		
		}
		
		if(applyOrgCode_Txt==null) {
			
			applyOrgCode_Txt=(String)model.get("applyOrgCode_Txt");
		
		}
		
		if(itemCode_Txt==null) {
			
			itemCode_Txt=(String)model.get("itemCode_Txt");
		
		}
		
		if(itemName_Txt==null) {
			
			itemName_Txt=(String)model.get("itemName_Txt");
		}

		//検索条件の保持
		
		modelAndView.addObject("searchScope_Rdo", searchScope_Rdo);
		
		modelAndView.addObject("applyOrgCode_Txt", applyOrgCode_Txt);
		
		modelAndView.addObject("itemCode_Txt", itemCode_Txt);
		
		modelAndView.addObject("itemName_Txt", itemName_Txt);

		// 検索結果のリスト
		
		List<HashMap<String, String>> select = lmm109Service.select(searchScope_Rdo,
				applyOrgCode_Txt, itemCode_Txt, itemName_Txt ,tntcod);
		
		if (select !=null) {
			
			//取得結果の長さ
			
			int count = select.size();

			// 検索結果が0件の場合 
			
			if(count==0) {
			
				// 「LVB-004017:検索条件に該当するデータが存在しません。」表示される 
				
				this.saveMessage(MessageSource.getText(request, "LVB-004017", null));
				
				return modelAndView;
			
			}
			
			// 検索結果が閾値を超えた場合  
			
			if(count >max) {
			
				count=max;
				
				// 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される
				
				this.saveMessage(MessageSource.getText(request, "LVB-004018", 
						new String[] { "max" }));
			
			}

			for (int i = 0; i < count; i++) {
				
				lmm109Dto =new Lmm109Dto();
				
				HashMap<String, String> hashMap = select.get(i);

				String aboflg = hashMap.get("ABOFLG");

				String itmcod = hashMap.get("ITMCOD");

				String appstaymdhms = hashMap.get("APPSTAYMDHMS");

				String appendymdhms = hashMap.get("APPENDYMDHMS");

				String itmnam1 = hashMap.get("ITMNAM1");

				String orgnam1 = hashMap.get("ORGNAM1");
				
				String tntcod1 = hashMap.get("TNTCOD");

				//javabeanで保存
				
				lmm109Dto.setAboflg(aboflg);
				
				lmm109Dto.setItmcod(itmcod);
				
				lmm109Dto.setAppstaymdhms(appstaymdhms);
				
				lmm109Dto.setAppendymdhms(appendymdhms);
				
				lmm109Dto.setItmnam1(itmnam1);
				
				lmm109Dto.setOrgnam1(orgnam1);
				
				lmm109Dto.setTntcod(tntcod1);
				
				// 返却用リストに設定する
				
				list.add(lmm109Dto);

			}
		}

		//バックグラウンドデータはmodel AndViewを通じてフロントに伝えられます。
		
		modelAndView.addObject("list109", list);
		
		return modelAndView;

	}



}
