package org.cloud.webapp.controller;

import java.util.HashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.Constants;
import org.cloud.dto.Lmm101Dto;
import org.cloud.dto.Lmm101DtoKsjk;
import org.cloud.model.Lmmmgrl;
import org.cloud.service.Lmm101Service;
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
 * [処理概要] <blockquote>
 * 
 * 組織一覧画面処理部品
 * 
 * </blockquote>
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎
 ******************************************************************************/
@Controller
@RequestMapping("/lmm101Controller")
public class Lmm101Controller extends BaseController{

    //lmm101Serviceの自動注入
    @Autowired
    private Lmm101Service lmm101Service;
    
    /**
     * 組織一覧画面の初期化処理
     * @param request
     * @return
     */
    @RequestMapping(value = "/init", method = {RequestMethod.POST, RequestMethod.GET })
    public ModelAndView init(HttpServletRequest request) {
    	//ModelAndViewの定義
    	ModelAndView modelAndView = new ModelAndView();
    	HttpSession session = request.getSession();
    	String tntcod = (String)session.getAttribute("tntcod");
    	//テスト値（納品時、削除必要）
    	tntcod = "01001006";
    	
        //メーニュから場合
    	// DashBoardから遷移した場合、全項目をブランク表示にする。 
    	//当从Dash Board进行转换时，所有项目作消隐显示。
        //検索範囲の初期値を２に設定する  初期值设定为2
    	String searchZone_Rdo = "2";
    	//メンテナンス画面から遷移した場合、
        //quallBy()事件で、元検索条件の保持を行う

    	// 組織識別区分のリスト表示処理   对后台controller 和 server 和表 传值处理
    	List<Lmmmgrl> listOrgKbn2_Sct = lmm101Service.findOrgKbn2_Sct(tntcod,Constants.GENERAL_Flg1);
        modelAndView.addObject("listOrgKbn2_Sct", listOrgKbn2_Sct);
        
       // 初期表示データ検索範囲 の設定 
        modelAndView.addObject("searchZone_Rdo", searchZone_Rdo);
        
        // ページ遷移 页面跳转
        modelAndView.setViewName("/lmm101/lmm101");
        return modelAndView;
    }
    
    /**
     *  quallBy 検索ボタンのイベント
     * @param lmm101DtoKsjk 検索条件
     * @param request
     * @param model 一覧検索条件保持用の引数
     * @return
     * LVB-009001システム異常処理がCloudExceptionで行う
     */
    @RequestMapping(value = "/quallBy", method = {RequestMethod.POST, RequestMethod.GET })
    public ModelAndView quallBy(@ModelAttribute Lmm101DtoKsjk lmm101DtoKsjk, HttpServletRequest request , ModelMap model) {
    	
    	// ModelAndView の定義
    	ModelAndView modelAndView = new ModelAndView();
    	// ページの遷移
        modelAndView.setViewName("/lmm101/lmm101");
    	HttpSession session = request.getSession();
    	String tntcod = (String)session.getAttribute("tntcod");
    	//テスト値（納品時、削除必要）
    	tntcod = "01001006";
        // 画面表示結果のリスト
        List<Lmm101Dto> listLmm101Dto = new LinkedList<Lmm101Dto>();
    	// 101画面一覧の対象
        Lmm101Dto lmm101Dto;
        
       //検索条件の保持  sessionに置くのことが正しくない 不要
      //  HttpSession session = request.getSession();
//       if(searchZone_Rdo == null){
//    	   searchZone_Rdo = (String)session.getAttribute("searchZone_Rdo");
//    	}else{
//    		session.setAttribute("searchZone_Rdo", searchZone_Rdo);
//    	}
//       if(appOrgcod_Txt == null){
//    	   appOrgcod_Txt = (String)session.getAttribute("appOrgcod_Txt");
//    	}else{
//    		session.setAttribute("appOrgcod_Txt", appOrgcod_Txt);
//    	}
//       if(orgCode_Txt == null){
//    	   orgCode_Txt = (String)session.getAttribute("orgCode_Txt");
//    	}else{
//    		session.setAttribute("orgCode_Txt", orgCode_Txt);
//    	}
//       if(orgNam1_Txt == null){
//    	   orgNam1_Txt = (String)session.getAttribute("orgNam1_Txt");
//    	}else{
//    		session.setAttribute("orgNam1_Txt", orgNam1_Txt);
//    	}
//       if(orgKbn2_Sct == null){
//    	   orgKbn2_Sct = (String)session.getAttribute("orgKbn2_Sct");
//    	}else{
//    		session.setAttribute("orgKbn2_Sct", orgKbn2_Sct);
//    	}
        String searchZone_Rdo = lmm101DtoKsjk.getSearchZone_Rdo();
        String orgCode_Txt = lmm101DtoKsjk.getOrgCode_Txt();
        String appOrgcod_Txt = lmm101DtoKsjk.getAppOrgcod_Txt();
        String orgNam1_Txt = lmm101DtoKsjk.getOrgNam1_Txt();
        String orgKbn2_Sct = lmm101DtoKsjk.getOrgKbn2_Sct();
       //更新から戻る場合、検索条件の保持
       if(searchZone_Rdo == null){
    	   searchZone_Rdo = (String)model.get("searchZone_Rdo");
       }
       if(orgCode_Txt == null){
    	   orgCode_Txt = (String)model.get("orgCode_Txt");
       }
       if(appOrgcod_Txt == null){
    	   appOrgcod_Txt = (String)model.get("appOrgcod_Txt");
       }
       if(orgNam1_Txt == null){
    	   orgNam1_Txt = (String)model.get("orgNam1_Txt");
       }
       if(orgKbn2_Sct == null){
    	   orgKbn2_Sct = (String)model.get("orgKbn2_Sct");
       }
       
        //検索条件の保持
    	modelAndView.addObject("searchZone_Rdo", searchZone_Rdo);
    	modelAndView.addObject("appOrgcod_Txt", appOrgcod_Txt);
    	modelAndView.addObject("orgCode_Txt", orgCode_Txt);
    	modelAndView.addObject("orgNam1_Txt", orgNam1_Txt);
    	modelAndView.addObject("orgKbn2_Sct", orgKbn2_Sct);
    	
       // 組織識別区分のリスト表示処理  下拉菜单  
       List<Lmmmgrl> listOrgKbn2_Sct = lmm101Service.findOrgKbn2_Sct(tntcod,Constants.GENERAL_Flg1);
       modelAndView.addObject("listOrgKbn2_Sct", listOrgKbn2_Sct);

   	   // 入力、選択された検索条件にて組織マスタテーブルを検索し、検索結果一覧を表示する。
   	   // 検索結果のリスト  主要搜索内容 得到所有符合的数据
   	   List<HashMap<String,String>> listLmm101 = lmm101Service.quallBy(searchZone_Rdo, appOrgcod_Txt,
               orgCode_Txt, orgNam1_Txt, orgKbn2_Sct);
      //判断数据库是否为null  数据是错误的  什么都没找到
       if(listLmm101 != null){
       	
       	   //取得結果の長さ  //不是null 的话 根据 List 得到最大元素数量
       	   int count = listLmm101.size();
       	
       	   // 検索結果が0件の場合    数据没找到一条
           if (count == 0) {
               // 「LVB-004017:検索条件に該当するデータが存在しません。」表示される 
               this.saveMessage(MessageSource.getText(request, "LVB-004017", null));
               return modelAndView;
           }
           // 検索結果が閾値を超えた場合  数据超出最大数量
           if (count > 15) {
        	   count = 15;
               // 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される
               this.saveMessage(MessageSource.getText(request, "LVB-004018", new String[] { "15" }));    
            }
           //for循环遍历 得到model 容器数据 转成String格式  在装进dto容器中到前台显示
           for (int i = 0; i < count; i++) {
               lmm101Dto = new Lmm101Dto();
               Map object = (Map) listLmm101.get(i);
               // テナントコード
               String resultTntcod = (String) object.get("TNTCOD");
               // 組織コード
               String resultOrgCode_Lbl = (String) object.get("ORGCOD");
               // 廃止フラグ
               String resultAboflg_Lbl = (String) object.get("ABOFLG");
               // 適用開始日時
               String resultAppStaYmdhms_Lbl = (String) object.get("APPSTAYMDHMS");
               // 適用終了日時
               String resultAppEndYmdhms_Lbl = (String) object.get("APPENDYMDHMS");
               // 組織名１
               String resultOrgNam1_Lbl = (String) object.get("ORGNAM1");
               // 組織名２
               String resultOrgNam2_Lbl = (String) object.get("ORGNAM2");
               // 組織名３
               String resultOrgNam3_Lbl = (String) object.get("ORGNAM3");
               // 組織名４
               String resultOrgNam4_Lbl = (String) object.get("ORGNAM4");
               // 組織名５
               String resultOrgNam5_Lbl = (String) object.get("ORGNAM5");
               // オーダー作成可否区分
               String resultOrgKbn1_Lbl = (String) object.get("ORGKBN01");
               // 組織識別区分
               String resultOrgKbn2_Lbl = (String) object.get("ORGKBN02");
               // 申請組織コード
               String resultAppOrgCod_Lbl = (String) object.get("ORGCOD");

               //javabeanで保存
               lmm101Dto.setTntcod(resultTntcod);
               lmm101Dto.setOrgcod(resultOrgCode_Lbl);
               lmm101Dto.setAboflg(resultAboflg_Lbl);
               lmm101Dto.setAppstaymdhms(resultAppStaYmdhms_Lbl);
               lmm101Dto.setAppendymdhms(resultAppEndYmdhms_Lbl);
               lmm101Dto.setOrgnam1(resultOrgNam1_Lbl);
               lmm101Dto.setOrgnam2(resultOrgNam2_Lbl);
               lmm101Dto.setOrgnam3(resultOrgNam3_Lbl);
               lmm101Dto.setOrgnam4(resultOrgNam4_Lbl);
               lmm101Dto.setOrgnam5(resultOrgNam5_Lbl);
               lmm101Dto.setOrgkbn01(resultOrgKbn1_Lbl);
               lmm101Dto.setOrgkbn02(resultOrgKbn2_Lbl);
               lmm101Dto.setApporgcod(resultAppOrgCod_Lbl);
               
               // 返却用リストに設定する 
               listLmm101Dto.add(lmm101Dto); 
           }
           //一覧明細表示のため、listLmm101DtoをmodelAndViewに置き
           modelAndView.addObject("listLmm101Dto", listLmm101Dto);
           
       }
        return modelAndView;
    }
    
}
