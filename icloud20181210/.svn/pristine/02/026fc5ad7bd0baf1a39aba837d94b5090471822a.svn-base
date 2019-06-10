package org.cloud.webapp.controller;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm107DtoGrl;
import org.cloud.dto.Lmm107DtoPlc;
import org.cloud.service.Lmm107Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import org.util.MessageSource;

/*******************************************************************************
 * [処理概要] 
 * 
 * 組織メンテナンスモジュール、新規機能と更新機能の処理を行う
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 
 ******************************************************************************/
@Controller
@RequestMapping("/lmm107Controller")
public class Lmm107Controller extends BaseController{
    
    // lmm107Serviceの注入
	@Autowired
	private Lmm107Service lmm107Service;
	
	
	/**
	 * 画面一覧画面の初期化処理
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/init", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView init () {
		ModelAndView modelAndView = new ModelAndView ();
		HttpSession session = request.getSession();
		String tntcod = (String)session.getAttribute("tntcod");
		tntcod = "01001006" ;
		//検索範囲の初期値を２に設定する
	    String searchScope_Rdo = "2";
		// 初期表示データ検索範囲 の設定 
		modelAndView.addObject("searchScope_Rdo",searchScope_Rdo);
		// ページ遷移
		modelAndView.setViewName ("lmm107/lmm107");
		return modelAndView;
	}
	
	/**
	 *  findLmm107 検索ボタンのイベント
	 * @param lmm107DtoSelect 検索条件
	 * @param request
	 * @param model 一覧検索条件保持用の引数
	 * @param evtmrgcod_Txt 
	 * @param evtmrgnam_Txt 
	 * @return
	 * LVB-009001システム異常処理がCloudExceptionで行う
	 */
	@RequestMapping (value = "/findLmm107", method = { RequestMethod.POST, RequestMethod.GET } )
    public ModelAndView findLmm107 (@ModelAttribute Lmm107DtoGrl lmm107DtoGrl, HttpServletRequest request , ModelMap model, Object evtmrgcod_Txt, Object evtmrgnam_Txt) {
		System.out.println(lmm107DtoGrl.getEvtmrgnam_Txt()+"888*898");
		ModelAndView modelAndView = new ModelAndView ();
		modelAndView.setViewName ("lmm107/lmm107");
		// 画面表示結果のリスト
		List<Lmm107DtoGrl>  list=new LinkedList<Lmm107DtoGrl>();
		Lmm107DtoPlc lmm107DtoPlc = null;
		Integer searchScope_Rdo = lmm107DtoGrl.getSearchScope_Rdo();
        String appOrgCode_Txt = lmm107DtoGrl.getAppOrgCode_Txt();
        String evtmrgcod_Txt1 = lmm107DtoGrl.getEvtmrgcod_Txt();
        String evtmrgnam_Txt1 = lmm107DtoGrl.getEvtmrgnam_Txt();
        
      //更新から戻る場合、検索条件の保持
        if(searchScope_Rdo == null){
       	 searchScope_Rdo = (Integer)model.get("searchScope_Rdo");
        }
        
        if(appOrgCode_Txt == null){
       	 appOrgCode_Txt = (String)model.get("appOrgCode_Txt");
        }
        
        if(evtmrgcod_Txt1 == null){
        	evtmrgcod_Txt1 = (String)model.get("evtmrgcod_Txt");
        }
        
        if(evtmrgnam_Txt1 == null){
        	evtmrgnam_Txt1 = (String)model.get("evtmrgnam_Txt");
        }
        
        //検索条件の保持
        modelAndView.addObject("searchScope_Rdo", searchScope_Rdo);
        modelAndView.addObject("appOrgCode_Txt", appOrgCode_Txt);
        modelAndView.addObject("evtmrgcod_Txt", evtmrgcod_Txt1);
        modelAndView.addObject("evtmrgnam_Txt", evtmrgnam_Txt1);
     	
		List<HashMap<String, String>> findLmm107 = lmm107Service.findLmm107(lmm107DtoGrl.getSearchScope_Rdo(), appOrgCode_Txt,  evtmrgcod_Txt1, evtmrgnam_Txt1);
	    if(findLmm107 !=null) {
	    	int count = findLmm107.size();
	    	// 検索結果が0件の場合 
            if (count == 0) {
                // 「LVB-004017:検索条件に該当するデータが存在しません。」表示される 
                this.saveMessage(MessageSource.getText(request, "LVB-004017", null));
                return modelAndView;
            }
            // 検索結果が閾値を超えた場合
            if (count > 15) {
         	   count = 15;
                // 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される
                this.saveMessage(MessageSource.getText(request, "LVB-004018", new String[] { "15" }));    
             }
	    	  	    	
	    	for (int i = 0; i < count; i++) {
	    		lmm107DtoGrl = new Lmm107DtoGrl();
	    		Map object = (Map) findLmm107.get(i);
	    		// テナントコード
	            String tntcod = (String) object.get("TNTCOD");
	            // 廃止フラグ
	            String aboflg = (String) object.get("ABOFLG");
	            // 表示顺
	    		String dispnum =(String) object.get("ORGCOD");
	    		// イベント集計コード
	            String evtmrgcod = (String) object.get("ORGITMCOD");
	            // イベント集計名
	            String evtmrgnam = (String) object.get("ITMNAM1");
	            // 申請組織コード
	            String apporgcod = (String) object.get("APPORGCOD");
	            
	            //javabeanで保存
	            lmm107DtoPlc.setTntcod(tntcod);
	            lmm107DtoPlc.setAboflg(aboflg);
	            lmm107DtoPlc.setApporgcod(dispnum);
	            lmm107DtoPlc.setEvtmrgcod(evtmrgcod);
	            lmm107DtoPlc.setEvtmrgnam(evtmrgnam);
	    		list.add(i, lmm107DtoGrl);
			}
	    }
	    modelAndView.addObject("list", list);
     	
     	return modelAndView;
    }
	
}
