package org.cloud.webapp.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.Constants;

import org.apache.ibatis.annotations.Param;
import org.cloud.dto.Lmm112Dto;
import org.cloud.dto.Lmm112Dtor;
import org.cloud.model.Llmmmorgitm;
import org.cloud.model.Lmmmitm;
import org.cloud.model.Lmmmorg;
import org.cloud.model.Lmmmorgitm;
import org.cloud.service.Lmm112Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

import com.sun.corba.se.impl.orbutil.closure.Constant;

import javafx.scene.control.Alert;

/**
 * 
 *@author: lr
 *@createdate:2019/05/22 20:02:06
 *@Explain： 
 *@Tel:
 */
@Controller
@RequestMapping("/lmm112Controller")
public class Lmm112Controller extends BaseController{
    
    // lmm102Serviceの注入
    @Autowired
    private Lmm112Service lmm112Service;
    
    // ModelAndViewの定義
	ModelAndView modelAndView = new ModelAndView();
	
	//sessionからtntcodの取得
    HttpSession session = request.getSession();
    String tntcod= (String)session.getAttribute("tntcod");

	/**
	 * init 組織别名称メンテナンス画面の初期化処理
	 * @param tntcod
	 * @param date
	 * @param aboflg
	 * @return
	 * @throws ParseException 
	 */
    @RequestMapping(value="/init", method={RequestMethod.POST, RequestMethod.GET})
    public ModelAndView init(String tntcod, Date date, String ABOFLG_OFF ) throws ParseException {
            	
    	//modflg,新規と更新の判断
    	final String modflg = "0";   	
        
    	//Llmmmorgitm対象　lmmmorgitm
    	Llmmmorgitm lmmmorgitm=new Llmmmorgitm();
    	
    	
  		//tntcod
    	lmmmorgitm.setTntcod(tntcod);
    	//時間
    	lmmmorgitm.setDate(new Date());
    	//廃止flg
		lmmmorgitm.setAboflg(Constants.ABOFLG_OFF);

    	//組織コードセレクトリストの作成
		List <Lmmmorgitm> orgSelect = lmm112Service.orgSelect(lmmmorgitm);
		
    	 // 画面遷移パターンが「0(新規登録パターン)」
        if ("0".equals(modflg)) {
        	
    		//異常の場合
    		if (orgSelect.equals(null)) {    			
    			 this.saveMessage(MessageSource.getText(request, "LVB-009001")); 
    		} else {
    			
    			//lmm112画面に遷移する
	            modelAndView.setViewName("/lmm112/lmm112");
	            //modflgをjspに伝送し、新規と更新画面の区別に用いられる
	            modelAndView.addObject("modflg", modflg);
	            //組織コードセレクトリストをjspに伝送
    			modelAndView.addObject("orgSelect", orgSelect);
    			return modelAndView;  
    		}
  	
        // 画面遷移パターンが「1(更新パターン)」
        } else if ("1".equals(modflg)) {
        	
       //一覧画面選択行の検索キー値を引き継ぎ情報から取得し、検索して各項目を編集表示する
        	Lmmmorgitm lmm11=new Lmmmorgitm();
        	        	
        	//時間のタイプ変更
        	String sdate = "2017-02-23 10:09:00";
        	SimpleDateFormat star=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	Date parse = star.parse(sdate);
        	
        	lmm11.setTntcod(tntcod);
        	lmm11.setOrgcod("0010003");
        	lmm11.setOrgitmcod("dasd");
        	lmm11.setAppstaymdhms(parse);
        	
        	//関数の呼び出す
        	Lmm112Dtor lmm112 = lmm112Service.updateSelect(lmm11);
        	
        	//検索対象が存在しない場合、以下のメッセージを出力し、一覧画面に遷移する。
        	if (lmm112.equals(null)) {
   			    this.saveMessage(MessageSource.getText(request, "LVB-005004"));
   			    modelAndView.setViewName("lmm111/lmm111.jsp");
   			    return modelAndView;
			
        	} else {
        		
            	//Lmm112Dto対象　lmm112Dto
            	Lmm112Dto lmm112Dto = new Lmm112Dto() ;
            	
            	//Lmm112Dto対象　lmm112Dtoにパラメーターを伝送
            	lmm112Dto.setOrgCode_Sct(lmm112.getOrgcod());
            	lmm112Dto.setOrgItmCode_Txt(lmm112.getOrgitmcod());
                lmm112Dto.setItmCode_Txt(lmm112.getItmcod());
                lmm112Dto.setOrgItmName_Txt(lmm112.getOrgitmnam());
            	lmm112Dto.setItmName_Txt(lmm112.getItmnam1());
            	lmm112Dto.setAppOrgCode_Txt(lmm112.getApporgcod());
            	lmm112Dto.setAboFlg_Chk(lmm112.getAboflg());
            	lmm112Dto.setUpdEac_Hdn(lmm112.getUpdeac());
            	
            	
            	//SimpleDateFormat対象　sd
                SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm");
                //lmm112から開始時間を取得して、タイプ変更
            	String starformat = sd.format(lmm112.getAppstaymdhms());            	
    			String stardate = starformat.substring(0, 10);
    			String hh = new SimpleDateFormat("HH").format(lmm112.getAppstaymdhms());
    			String mm = new SimpleDateFormat("mm").format(lmm112.getAppstaymdhms());
    			    			
    			//適用開始日·年月日
    			lmm112Dto.setAppStaYmd_Txt(stardate);
    			//適用開始日時・時
    			lmm112Dto.setAppStaHh_Txt(hh);
    			//適用開始日時・分
    			lmm112Dto.setAppStaMm_Txt(mm);
    			
    			//lmm112から終了時間を取得して、タイプ変更
    			String endformat = sd.format(lmm112.getAppendymdhms());
    			String enddate = endformat.substring(0, 10);
    			String hhend = new SimpleDateFormat("HH").format(lmm112.getAppendymdhms());
    			String mmend = new SimpleDateFormat("mm").format(lmm112.getAppendymdhms());
    			
    			//適用終了日·年月日
            	lmm112Dto.setAppEndYmd_Txt(enddate);
            	//適用終了日時・時
            	lmm112Dto.setAppEndHh_Txt(hhend);
            	//適用終了日時・分
            	lmm112Dto.setAppEndMm_Txt(mmend);
	
				//画面に表示する
				modelAndView.addObject("lmm112Dto", lmm112Dto);
				
	        	//lmm112画面に遷移する
	            modelAndView.setViewName("/lmm112/lmm112");
	            //modflgをjspに伝送し、新規と更新画面の区別に用いられる
	            modelAndView.addObject("modflg", modflg);
	            
	            return modelAndView;  
	        	
			}      
        } 
        return modelAndView;  
    }
    
  	
  	//更新回数排他制御
  	@RequestMapping(value = "/updeac")
  	@ResponseBody
  	public Lmmmorgitm updeac(@Param("orgcod")String orgcod, @Param("orgItmCod")String orgItmCod, @Param("datestar")String datestar,@Param("updeac")Long updeac) throws ParseException {
  		
  		
  		//Lmmmorgitm対象　lmmmorgitm
  		Lmmmorgitm lmmmorgitm=new Lmmmorgitm();
  		
  		//Lmmmorgitm対象　lmmmorgitmにパラメーターを伝送
  	    
  		//tntcod
  		lmmmorgitm.setTntcod(tntcod);
  	    //組織コード
  		lmmmorgitm.setOrgcod(orgcod); 
  		
  		//時間のタイプ変更
  	    SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm");  		
  	    Date stardate = sd.parse(datestar); 	    
  	    lmmmorgitm.setAppstaymdhms(stardate);
  	    
  	    //更新回数
  		lmmmorgitm.setUpdeac(updeac);
   
  		//関数の呼び出す
  		Lmmmorgitm updeacCheck = lmm112Service.updeac(lmmmorgitm);
	
  		//判断
  		if (updeacCheck!=null) {
  			return updeacCheck;
  		} else {
			
  			this.saveMessage(MessageSource.getText(request,"LVB-005010"));
  		}
  		
		return null;
		
  	}
  	
	//日付チェック
  	@RequestMapping(value = "/addy")
  	@ResponseBody
  	public int addy() {
  		
  		//テスト値
  		int res = 0;
  		//98の時
  		if (res==98) {			
            //以下を出力
  			this.saveMessage(MessageSource.getText(request,"LVB-004002", new String[] {"適用開始日時","適用終了日時"}));
  	  	//99の時
  		} else if(res==99) {
  			//以下を出力
  			this.saveMessage(MessageSource.getText(request,"LVB-004002", new String[] {"適用開始日時","適用終了日時"}));
  		}
		return 0;
  	}	

  	
  	//登録の結果、処理日時点の有効データが存在しなくなる場合、ウォーニング（更新はする）																														
  	@RequestMapping(value = "/addCheckDate")
  	@ResponseBody
  	public int addCheckDate(@Param("datestar")String datestar, @Param("datend")String datend) throws ParseException {
  	 
       //SimpleDateFormat対象　sd
       SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm");
  	   //parse()でタイプ変更	
  		Date parse = sd.parse(datestar);
  		Date parseend = sd.parse(datend);
  		
  		//関数の呼び出す
  		int res = lmm112Service.addCheckDate(parse, parseend);
  		
  		if (res>0) {
			System.out.println("有効データ验证通过");
		} else {
  			
			this.saveMessage(MessageSource.getText(request,"LVB-004044"));

		}
  		
		return 0;
  		
  		
  	}
 
  	//新規二重登録チェック							
  	@RequestMapping(value = "/addCheck")
  	@ResponseBody
  	public int addCheck(@Param("orgcod")String orgcod, @Param("orgitmcod")String orgitmcod, @Param("inputDate")String inputDate) throws ParseException {

  		//Lmmmorgitm対象　lmmmorgitm
  		Lmmmorgitm lmmmorgitm=new Lmmmorgitm();
  		
  		//SimpleDateFormat対象　sd
  		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm");
  		//parse()でタイプ変更
  		Date appstaymdhms  = sd.parse(inputDate);
  		
  		//Lmmmorgitm対象　lmmmorgitm　にパラメーターを伝送
  		lmmmorgitm.setTntcod(tntcod);
  		lmmmorgitm.setOrgcod(orgcod);
  		lmmmorgitm.setOrgitmcod(orgitmcod);
  		lmmmorgitm.setAppstaymdhms(appstaymdhms);
  		
  		//関数の呼び出す
  		int res = lmm112Service.addCheck(lmmmorgitm);
  		
  		//リターンの判断
  		if (res>0) {
  			//上記条件に合致するレコードが存在した場合、以下のメッセージを出力し、以降の処理を実施しない
  			this.saveMessage(MessageSource.getText(request,"LVB-005005"));
		} else {
			
			return  res;
		}
		return 0;
  	}	
  	
  	//組織コードが組織マスタに未登録の場合
  	@RequestMapping(value = "/orgCodCheck")
  	@ResponseBody
  	public int orgCodCheck(@Param("orgcod")String orgcod,@Param("datestar")String datestar, @Param("datend")String datend) throws ParseException {
  		 		
  		//Lmmmorg対象　lmmmorg
  		Lmmmorg lmmmorg = new Lmmmorg();
  															
  	    //テスト値
    	//String tntcod = "01001006";
  		
        
  		//Lmmmorg対象　lmmmorg　にパラメーターを伝送
  		lmmmorg.setTntcod(tntcod);
  		lmmmorg.setOrgcod(orgcod);
  		lmmmorg.setUpdymdhms(new Date());
  		lmmmorg.setAboflg(Constants.ABOFLG_OFF);
  		
  		 //SimpleDateFormat対象
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm");
   	    //parse()でタイプを変える
   		Date appstaymdhms = sd.parse(datestar);
   		Date appendymdhms = sd.parse(datend);
  		lmmmorg.setAppstaymdhms(appstaymdhms);
  		lmmmorg.setAppendymdhms(appendymdhms);
  		
  		
  		//関数の呼び出す
  		int res = lmm112Service.orgCodCheck(lmmmorg);

  		//リターンの判断
  		if (res>0) {
  	
  			return res;

		}else {
  			
			this.saveMessage(MessageSource.getText(request,"LVB-004023", new String[] {"組織コード","組織マスタ"}));

		}
  		return 0;
	
  	}	
  	
	//申請組織コードが組織マスタに未登録の場合（申請組織コードが入力されている場合のみ）																																	
  	@RequestMapping(value = "/appOrgCodCheck")
  	@ResponseBody
  	public int appOrgCodCheck(@Param("apporgcod")String apporgcod, @Param("datestar")String datestar, @Param("datend")String datend) throws ParseException {
  		
  	    //Lmmmorg対象　lmmmorg
  		Lmmmorg lmmmorg = new Lmmmorg();
  		
  	    //sessionからtntcodの取得
  		HttpSession session = request.getSession();
  		String tntcod= (String)session.getAttribute("tntcod");
  	    //テスト値
    	//tntcod = "01001006";
    	
  	    //SimpleDateFormat对象
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd hh:mm");
   	    //parse()でタイプを変える	
   		Date appstaymdhms = sd.parse(datestar);
   		Date appendymdhms = sd.parse(datend);
   		
   	   //lmmmorgにパラメーターを伝送
  		lmmmorg.setTntcod(tntcod);
  		lmmmorg.setApporgcod(apporgcod);;
  		lmmmorg.setAboflg(Constants.ABOFLG_OFF);
  		lmmmorg.setUpdymdhms(new Date());
  		lmmmorg.setAppstaymdhms(appstaymdhms);
  		lmmmorg.setAppendymdhms(appendymdhms);
  		
  		//関数の呼び出す
  		int res = lmm112Service.appOrgCodCheck(lmmmorg);
  		
  		//リターンへの判断
  		if (res>0) {
  			
  			return res;

		}else {
  			
			this.saveMessage(MessageSource.getText(request,"LVB-004023", new String[] {"申請組織コード","組織マスタ"}));

		}
		return 0;	
  	}
  	
  	//新规add
  	@RequestMapping(value = "/add")
  	@ResponseBody
    public ModelAndView add(Lmm112Dto lmm112Dto) throws ParseException {
        //Lmmmorgitm対象　lmm
  		Lmmmorgitm lmm=new Lmmmorgitm();
  		
  		//lmm112Dtoからパラメーターを取得する
  		String aboFlg_Chk = lmm112Dto.getAboFlg_Chk();
  		String orgCode_Sct = lmm112Dto.getOrgCode_Sct();
  		String orgItmCode_Txt = lmm112Dto.getOrgItmCode_Txt();
  		String orgItmName_Txt = lmm112Dto.getOrgItmName_Txt();
  		String appOrgCode_Txt = lmm112Dto.getAppOrgCode_Txt();
  		
  		
  		//Lmmmorgitm対象　lmm　にパラメーターを伝送
  		//废止flg
  		lmm.setAboflg(aboFlg_Chk);
  		//組織コード
  		lmm.setOrgcod(orgCode_Sct);
  		//組織別商品コード
  		lmm.setOrgitmcod(orgItmCode_Txt);
  		//適用開始日時
  		lmm.setAppstaymdhms(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(lmm112Dto.getAppStaYmd_Txt()+" "+lmm112Dto.getAppStaHh_Txt()+":"+lmm112Dto.getAppStaMm_Txt()));
  		//適用終了日時
  		lmm.setAppendymdhms(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(lmm112Dto.getAppEndYmd_Txt()+" "+lmm112Dto.getAppEndHh_Txt()+":"+lmm112Dto.getAppEndMm_Txt()));
  		//組織別商品名
  		lmm.setOrgitmnam(orgItmName_Txt);
  		//申請組織コード
  		lmm.setApporgcod(appOrgCode_Txt);
  		
  		//DB共通.登録年月日時分秒 
  		lmm.setInsymdhms(new Date());
  		//DB共通.登録者
  		lmm.setInsnam("aloha");
  		//DB共通.登録者区分
  		lmm.setInskbn("111");
  		//DB共通.登録方法区分
  		lmm.setInsmethodkbn("test");
  		//DB共通.更新年月日時分秒
  		lmm.setUpdymdhms(new Date());
  		//DB共通.更新者
  		lmm.setUpdnam("arashi");
  		//DB共通.更新者区分
  		lmm.setUpdkbn("1");
  		//DB共通.更新方法区分
  		lmm.setUpdmethodkbn("test");
  		//DB共通.更新回数
  		lmm.setUpdeac(0l);
  		lmm.setTntcod("729");
  		//関数の呼び出す
  		int res = lmm112Service.add(lmm);
  	
  	    // 判断
        if(res == 1){
        	//新規が成功の場合
       	    this.saveMessage(MessageSource.getText(request, "LVB-000003"));
       	    modelAndView.addObject("lmm", lmm);
       	    
        } else {
       	    //以下のメッセージを出力し、以降の処理を実施しない
        	this.saveMessage(MessageSource.getText(request, "LVB-009001"));

        }
        return modelAndView;	
    }
  	
  	
    //更新update
  	@RequestMapping(value = "/update")
  	@ResponseBody
    public ModelAndView update(Lmm112Dto lmm112Dto) throws ParseException {
  		//Lmmmorgitm対象　lmm
  		Lmmmorgitm lmm=new Lmmmorgitm();
  		
  		
  		lmm.setTntcod("01001006");
  		//废止flg
  		lmm.setAboflg(lmm112Dto.getAboFlg_Chk());
  		//組織コード
  		lmm.setOrgcod(lmm112Dto.getOrgCode_Sct());
  		//組織別商品コード
  		lmm.setOrgitmcod(lmm112Dto.getOrgItmCode_Txt());

  		//適用開始日時  		
  		lmm.setAppstaymdhms(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(lmm112Dto.getAppStaYmd_Txt()+" "+lmm112Dto.getAppStaHh_Txt()+":"+lmm112Dto.getAppStaMm_Txt()));
  		
  		//適用終了日時
  		lmm.setAppendymdhms(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(lmm112Dto.getAppEndYmd_Txt()+" "+lmm112Dto.getAppEndHh_Txt()+":"+lmm112Dto.getAppEndMm_Txt()));
  		
  		
  		//組織別商品名
  		lmm.setOrgitmnam(lmm112Dto.getOrgItmName_Txt());
  		//申請組織コード
  		lmm.setApporgcod(lmm112Dto.getAppOrgCode_Txt());
  		
  		
  		
  		//DB共通.更新年月日時分秒
  		lmm.setUpdymdhms(new Date());
  		//DB共通.更新者
  		lmm.setUpdnam("arashi");
  		//DB共通.更新者区分
  		lmm.setUpdkbn("123");
  		//DB共通.更新方法区分
  		lmm.setUpdmethodkbn("0001"); 	
  		//DB共通.更新回数 	 	
        lmm.setUpdeac(lmm112Dto.getUpdEac_Hdn()); 	
  		
        //関数の呼び出す
  		int res = lmm112Service.update(lmm);
  	
  	    // 判断
        if(res == 1){
        	//新規が成功の場合
       	    this.saveMessage(MessageSource.getText(request, "LVB-000003"));
       	    modelAndView.setViewName("lmm111/lmm111jsp");
       	    
       	 return new ModelAndView("redirect:lmm111jsp?tntcod=?&orgcod=?&orgitmcod=?appstaymdhms=?");
       	     
        } else {
       	    //以下のメッセージを出力し、以降の処理を実施しない
        	this.saveMessage(MessageSource.getText(request, "LVB-009001"));

        }
        return null;	
    }
  	
  	
}
