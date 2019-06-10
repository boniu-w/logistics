package org.cloud.webapp.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm108Dto;
import org.cloud.dto.Lmm108_2Dto;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm108_2Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;
@Controller
@RequestMapping("/lmm108Controller2")
public class Lmm108Controller2 extends BaseController{
	
    @Autowired
    private Lmm108_2Service lmm108_2Service;
    
    private Lmmmevtm lmmm;
    
    /**
     * 画面表示時の初期処理																	
     * @param request
     * @return
     */
    @RequestMapping(value = "/init_108_2", method = {RequestMethod.POST, RequestMethod.GET })
    public ModelAndView init_108_2(HttpServletRequest request) {
    	
    	ModelAndView modelAndView = new ModelAndView();

    	String parameter = request.getParameter("modflg");
    	int modflg = Integer.parseInt(parameter);
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("name", "cst");
    	
    	//新規作成モードの場合の画面表示時の初期処理
    	if(modflg==0) {
    		Lmm108_2Dto lmm108_2 = new Lmm108_2Dto();
    		
    		//全ての項目を空白表示する									
    		lmm108_2.setEvtmrgcod("");
    		lmm108_2.setEvtmrgnam("");
    		lmm108_2.setDispnum("");
    		lmm108_2.setApporgcod("");
    		lmm108_2.setAboflg("0");
    		lmm108_2.setUpdnam("");
    		lmm108_2.setUpdymdhms("");
    		    		
    		modelAndView.addObject("lmm108_2dto", lmm108_2);
    		modelAndView.addObject("modflg", modflg);
    		modelAndView.addObject("message", MessageSource.getText(request, "LVB-000002"));
    		modelAndView.setViewName("lmm108_2/SLMM108"); 
    		
            return modelAndView;   						

    	}else {
    		
    		//編集モードの場合
    		Lmmmevtm lmmmevtm = new Lmmmevtm();
    		lmmmevtm.setTntcod("01001006");
    		lmmmevtm.setEvtmrgcod("12022");
    		
    		lmmm = lmm108_2Service.selectOne(lmmmevtm);	
    		
    		//一覧画面から引き継いだ情報でイベント集計マスタを検索する																				
    		if(lmmm != null) {
    			Lmm108_2Dto lmm108_2 = new Lmm108_2Dto();
    			
    			lmm108_2.setEvtmrgcod( lmmm.getEvtmrgcod() );
    			lmm108_2.setAboflg( lmmm.getAboflg() );
    			lmm108_2.setEvtmrgnam( lmmm.getEvtmrgnam() );
    			lmm108_2.setDispnum( lmmm.getDispnum() );
    			lmm108_2.setApporgcod( lmmm.getApporgcod() );
    			lmm108_2.setUpdnam( lmmm.getUpdnam() );
    			lmm108_2.setUpdymdhms( new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format( lmmm.getUpdymdhms() ) );
    			
    			modelAndView.addObject("lmm108_2dto", lmm108_2);
    			modelAndView.addObject("modflg", modflg);
        		modelAndView.addObject("message", MessageSource.getText(request, "LVB-000002"));
        		modelAndView.setViewName("lmm108_2/SLMM108");
    		}else {
    			
    			//検索対象が存在しない場合、以下のメッセージを出力し、一覧画面に遷移する。																										
    			this.saveMessage( MessageSource.getText( request, "LVB-005004", new String[] {"なし"} ) );
    		}
    		return modelAndView;
    	}		    	        	           	
    }
    
    /**
     * 新規作成モードの場合
     * @param request
     * @param lmm108_2
     * @return
     */
    @RequestMapping(value="/insert",method= {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView insert(HttpServletRequest request,@ModelAttribute Lmm108_2Dto lmm108_2) {
    	ModelAndView modelAndView = new ModelAndView();

    	HttpSession session=request.getSession();
    	
    	Lmmmevtm lmmmevtm = new Lmmmevtm();
		lmmmevtm.setTntcod("01001006");
		lmmmevtm.setEvtmrgcod( lmm108_2.getEvtmrgcod() );	
		lmmmevtm.setAboflg( "on".equals( lmm108_2.getAboflg() ) ? "1":"0" );
		lmmmevtm.setEvtmrgnam( lmm108_2.getEvtmrgnam() );
		lmmmevtm.setDispnum( lmm108_2.getDispnum());
		lmmmevtm.setApporgcod( lmm108_2.getApporgcod());
		lmmmevtm.setInsnam( (String)session.getAttribute("name"));
		lmmmevtm.setInsymdhms( new Date() );
		
		//二重登録チェック
		Lmmmevtm selectOne = lmm108_2Service.selectOne(lmmmevtm);
				
		if(selectOne != null) {
			
			//上記条件に合致するレコードが存在した場合、以下のメッセージを出力し、以降の処理を実施しない。
			this.saveMessage( MessageSource.getText( request, "LVB-005005", new String[] {"なし"} ) );
			
		}else {
			
			Lmmmorg selectLmmmorg = lmm108_2Service.selectLmmmorg( lmmmevtm.getTntcod(), lmm108_2.getApporgcod() );
			
			//申請組織コードが組織マスタに未登録の場合（申請組織コードが入力されている場合のみ）
			if( selectLmmmorg == null) {
				
				this.saveMessage( MessageSource.getText( request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"} ) );
				
				modelAndView.addObject("modflg", 0);
				
				modelAndView.setViewName("lmm108_2/SLMM108");
			}else {
				//申請組織コードが組織マスタに登録の場合
				
				int insertLmmmevtm = lmm108_2Service.insertLmmmevtm(lmmmevtm);
		    	
				if(insertLmmmevtm ==0) {
					
					this.saveMessage( MessageSource.getText( request, "LVB-005005", new String[] {"なし"} ) );
				
				}else {
					
					this.saveMessage( MessageSource.getText( request, "LVB-000003", new String[] {"なし"} ) );
					
				}
				
				modelAndView.addObject("modflg", 0);
				modelAndView.setViewName("lmm108_2/SLMM108");
				
			}
		}
		
		return modelAndView;   	
    }
    
    /**
     * 更新作成モードの場合
     * @param request
     * @param lmm108_2
     * @return
     */
    @RequestMapping(value = "/update",method = {RequestMethod.POST, RequestMethod.GET })
    public ModelAndView update(HttpServletRequest request,@ModelAttribute Lmm108_2Dto lmm108_2) {
    	
    	ModelAndView modelAndView = new ModelAndView();
    	
    	HttpSession session=request.getSession();
    	
    	lmmm.setEvtmrgcod( lmm108_2.getEvtmrgcod() );
    	lmmm.setAboflg( lmm108_2.getAboflg() );
    	lmmm.setEvtmrgnam( lmm108_2.getEvtmrgnam() );
    	lmmm.setDispnum( lmm108_2.getDispnum() );
    	lmmm.setApporgcod( lmm108_2.getApporgcod() );
    	lmmm.setUpdnam( (String)session.getAttribute("name") );
    	lmmm.setUpdymdhms( new Date() );
    	
    	String tntcod = (String)session.getAttribute("tntcod");
    	tntcod="01001006";
    	
    	Lmmmorg selectLmmmorg = lmm108_2Service.selectLmmmorg(tntcod, lmm108_2.getApporgcod());
    	
    	if(selectLmmmorg == null) {
    		
    		this.saveMessage(MessageSource.getText(request, "LVB-005010", new String[] {"なし"}));
    		
    		modelAndView.addObject("modflg", 1);
    		
    		modelAndView.setViewName("lmm108_2/SLMM108");
    	}else {
    		
    		int updateLmmmevtm = lmm108_2Service.updateLmmmevtm(lmmm);
    		
    		if(updateLmmmevtm>0){
    			
    			this.saveMessage(MessageSource.getText(request, "LVB-000004",new String[] {"なし"}));
    			
    			modelAndView.addObject("message", MessageSource.getText(request, "LVB-000004",new String[] {"なし"}) );
    		}else {
    			
				this.saveMessage(MessageSource.getText(request, "LVB-005010",new String[] {"なし"}));

				modelAndView.addObject("message", MessageSource.getText(request, "LVB-005010",new String[] {"なし"}) );
    		}
    		
    		modelAndView.addObject("lmm108_2dto", lmm108_2);
    		
    		modelAndView.addObject("modflg", 1);
    		
    		modelAndView.setViewName("lmm108_2/SLMM108");
    	}
    	
    	return modelAndView;
    }
    
    @RequestMapping(value="/checkOrgCode",produces="text/html; charset=UTF-8")
    @ResponseBody
    public String checkOrgCode(HttpServletRequest request,String orgcode) {
		
    	HttpSession session = request.getSession();
    	
    	String tntcod = (String)session.getAttribute("tntcod");
    	
    	tntcod="01001006";
    	
    	Lmmmorg selectLmmmorg = lmm108_2Service.selectLmmmorg(tntcod, orgcode);
    	
    	String message="";
    	
    	if(selectLmmmorg != null) {
    		
    		message = selectLmmmorg.getApporgcod();
    	
    	}else {
    		
    		this.saveMessage(MessageSource.getText(request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"}));
    		
    		message = MessageSource.getText(request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"});
    		
    	}
    	return message;    	
    }
    
    @RequestMapping(value="/checkMsg",method = {RequestMethod.POST, RequestMethod.GET })
    @ResponseBody
    public Map<String,String> checkMsg( String id, String mes ){
		
    	String[] split = mes.split(",");
    	
    	String msg = MessageSource.getText(request, id,split);
    	
    	Map<String,String> map = new HashMap<String,String>();
    	
    	map.put("msg", msg);
    	
    	return map;
    	   	
    }
    
}
