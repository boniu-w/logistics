package org.cloud.webapp.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Constants;
import org.cloud.dto.Lmm113Dto;
import org.cloud.dto.Lmm113DtoKsjk;
import org.cloud.dto.Lmm115DtoKsjk;
import org.cloud.model.Lmmmplc;
import org.cloud.service.Lmm113Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

/** 

* @author 作者 : 李青阳

* @version 创建时间：2019年5月23日 下午9:48:49 

* 类说明 

*/
@Controller
@RequestMapping("/lmm113Controller")
public class Lmm113Controller extends BaseController{
	
	//lmm113Serviceの自動注入
	@Autowired
	private Lmm113Service lmm113Service;
		
	@RequestMapping(value="/init",method ={ RequestMethod.POST, RequestMethod.GET }) 
	public ModelAndView init(HttpServletRequest request) {
		
		//画面の初期化							

		//ModelAndViewの定義
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		String tntcod = (String)session.getAttribute("tntcod");						
		
        //検索範囲  廃止除くの値
    	final String searchScope_Rdo = "2";
    	//初期表示データ検索範囲 の設定 
        modelAndView.addObject("searchScope_Rdo", searchScope_Rdo);
    	                      		
    	modelAndView.setViewName("/lmm113/SLMM113");
		return modelAndView;
				
	}
	
	/**
	 *  quallByy 検索ボタンのイベント
     * @param lmm113DtoKsjk 検索条件
     * @param request
     * @param model 一覧検索条件保持用の引数
	 * @return
	 */
	@RequestMapping(value="/quallByy",method={ RequestMethod.POST,RequestMethod.GET})
	public ModelAndView quallByy(@ModelAttribute Lmm113DtoKsjk lmm113DtoKsjk,ModelMap model,HttpServletRequest request){
		
		// ModelAndView の定義
		ModelAndView modelAndView = new ModelAndView(); 
		
		// ページの遷移
		modelAndView.setViewName("/lmm113/SLMM113");
		HttpSession session = request.getSession();
		String tntcod = (String) session.getAttribute("tntcod");			
//		int maxValue = (int) session.getAttribute("max");	
		
    	// 画面表示結果のリスト
    	LinkedList<Lmm113Dto> linkedList = new LinkedList<Lmm113Dto>();
		
    	// 113画面一覧の対象
    	Lmm113Dto lmm113Dto;
    	
    	Integer searchScope_Rdo = lmm113DtoKsjk.getSearchScope_Rdo();
    	String appOrgCode_Txt = lmm113DtoKsjk.getAppOrgCode_Txt();
    	String plcCode_Txt = lmm113DtoKsjk.getPlcCode_Txt();
    	String plcName_Txt = lmm113DtoKsjk.getPlcName_Txt();   	
    	
    	//更新から戻る場合、検索条件の保持
    	if(searchScope_Rdo == null) {
    		searchScope_Rdo = (Integer) model.get("searchScope_Rdo");
    	}
    	
    	if(appOrgCode_Txt == null) {
    		appOrgCode_Txt = (String) model.get("appOrgCode_Txt");
    	}
    	
    	if(plcCode_Txt == null) {
    		plcCode_Txt = (String) model.get("plcCode_Txt");
    	}
    	
    	if(plcName_Txt == null) {
    		plcName_Txt = (String) model.get("plcName_Txt");
    	}
    	
    	//検索条件の保持
    	modelAndView.addObject("searchScope_Rdo",searchScope_Rdo);
    	modelAndView.addObject("appOrgCode_Txt",appOrgCode_Txt);
    	modelAndView.addObject("plcCode_Txt",plcCode_Txt);
    	modelAndView.addObject("plcName_Txt",plcName_Txt);
            	    	
    	
    	// 検索結果のリスト
    	List<HashMap<String, String>> quallByy = lmm113Service.quallByy(searchScope_Rdo, appOrgCode_Txt, plcCode_Txt, plcName_Txt,Constants.ABOFLG_OFF);
    	
    	if(quallByy !=null) {
    		
    		 //取得結果の長さ
    		int size = quallByy.size();
    		
    		// 検索結果が0件の場合 
    		if(size==0) {
              
    			 // 「LVB-004017:検索条件に該当するデータが存在しません。」表示される 
                this.saveMessage(MessageSource.getText(request, "LVB-004017", null));
                return modelAndView;
    		}
    		
    		// 検索結果が閾値を超えた場合
    		if(size > 15) {    						    			
    			
                // 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される
                this.saveMessage(MessageSource.getText(request, "LVB-004018", new String[] {"15"}));    
                
    		}   		
    		
    		for(int i=0; i< size; i++) {
    			
    			lmm113Dto = new Lmm113Dto();
    			Map hashMap = quallByy.get(i);    			   		
    		
    			// テナントコード
    			lmm113Dto.setTntcod((String) hashMap.get("TNTCOD"));
    			
    			//廃止フラグ 
    			lmm113Dto.setAboflg((String) hashMap.get("ABOFLG"));
    			
    			//場所名
    			lmm113Dto.setPlcnam((String) hashMap.get("PLCNAM"));
    			
    			//場所コード
    			lmm113Dto.setPlccod((String) hashMap.get("PLCCOD"));
    			
    			//住所名１
    			lmm113Dto.setAdrnam1((String) hashMap.get("ADRNAM1"));
    			
    			//住所名2
    			lmm113Dto.setAdrnam2((String) hashMap.get("ADRNAM2"));
    			
    			//住所名3
    			lmm113Dto.setAdrnam3((String) hashMap.get("ADRNAM3"));
    			
    			//住所名4
    			lmm113Dto.setAdrnam4((String) hashMap.get("ADRNAM4"));
    			
    			//郵便コード
    			lmm113Dto.setZipcod((String) hashMap.get("ZIPCOD"));
    			
    			//申請組織コード
    			lmm113Dto.setApporgcod((String) hashMap.get("APPORGCOD"));
    			
    			//タイムゾーンコード
    			lmm113Dto.setTmeznecod((String) hashMap.get("TMEZNECOD"));
    			
    			//国コード
    			lmm113Dto.setCtrcod((String) hashMap.get("CTRCOD"));
    			
    			//返却用リストに設定する 
    			linkedList.add(lmm113Dto);
    		}
    		 //一覧明細表示のため、listLmm113DtoをmodelAndViewに置き
    		modelAndView.addObject("linkedList",linkedList);
    	}
    	
    	return modelAndView;
		
	}
}
