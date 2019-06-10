package org.cloud.webapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm101DtoKsjk;
import org.cloud.dto.Lmm105Dto;
import org.cloud.model.LmmmgrlLmm105;
import org.cloud.service.Lmm105Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

@Controller
@RequestMapping(value = "/lmm105Controller")
public class Lmm105Controller extends   BaseController{

	@Autowired
	private  Lmm105Service  lmm105Service;
	
	/*
	 * findAllLmm105进入画面
	 * 
	 */
	@RequestMapping(value="/findAllLmm105" , method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView findAllLmm105(HttpServletRequest request) throws Exception  {
		
		//ModelAndViewの定義
		ModelAndView  modelAndView=new ModelAndView();      
		
		HttpSession session = request.getSession();
		
		//取出tntcod，テナントコード＝ログインユーザのテナントコード
		String tntcod = (String) session.getAttribute("tntcod");
		String tntcod1 = "01001006";
		
		//汎用区分＝1006
		 String gnrprpcod = "1006";
		
		//1件目は「全件」とし
			String searchZone = "1";
			modelAndView.addObject("searchZone",searchZone);
			
		//2件目以降に取得した汎用名１でリストを作成する  
		List<LmmmgrlLmm105>findLmm=lmm105Service.findAllLmm105(tntcod1);
		modelAndView.addObject(findLmm);
		
		
		modelAndView.setViewName("/lmm105/lmm105");

		return   modelAndView;
		}

	@RequestMapping(value="/findByLmm105" ,method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView findByLmm105(
			@ModelAttribute Lmm105Dto  lmm105Dto,
			Model model,
            HttpServletRequest request) throws Exception {
		
		   // ModelAndView の定義
    	   ModelAndView modelAndView = new ModelAndView();
    	
    	   HttpSession session=request.getSession();
    	   String session2 =(String) session.getAttribute("apporgcod, gnrprpcod, gnrprpnam");
    	  
    	   
    	 //テナントコード＝ログインユーザのテナントコード   
 		  String gnrprpcod = (String) session.getAttribute("gnrprpcod");
    	  
 		  //申請組織コードが存在する場合
    	   String apporgcod = (String) session.getAttribute("apporgcod");
    
    	   //イベント区分０１が存在する場合
    	   //イベント区分０2が存在する場合
    	  // String gnrprpnam1 =(String) session.getAttribute("gnrprpnam1");
    	   //String gnrprpnam2 =(String) session.getAttribute(" gnrprpnam2");
 
		String   tntcod=lmm105Dto.getTntcod();
		String   gnrprpkbn=lmm105Dto.getGnrprpkbn();
		String   gnrpprpcod=lmm105Dto.getGnrprpcod();
		String   aboflg= lmm105Dto.getAboflg();
		String   codoutcod= lmm105Dto.getCodoutcod();
		String   gnrprpnam1= lmm105Dto.getGnrprpnam1();
		String   gnrprpnam2=lmm105Dto.getGnrprpnam2();

		//検索結果
		List<HashMap<String, String>>findByLmm=lmm105Service.findByLmm105(tntcod, apporgcod, gnrprpcod, aboflg, codoutcod, gnrprpnam1, gnrprpnam2);
		
	 	LmmmgrlLmm105 lmmmgrlLmm105;
		String tntcod1 = "1006";
		// Lmm105Dto.setTntcod(tntcod1);
		 
		 List<Lmm105Dto> list;
		
		
		if(findByLmm!=null) {
			int size = findByLmm.size();
			if(size==0) {
				modelAndView.setViewName("/lmm105/lmm105");
			    this.saveMessage(MessageSource.getText(request, "LVB-004017",null));	
			}
			if (size > 1) {
				size = 1;
				this.saveMessage(MessageSource.getText(request, "LVB-004018", new String[] { "1" }));
			}	
			list = new ArrayList();
			for(int i = 0; i <size; i++) {
				Lmm105Dto lmm105Dto1=new Lmm105Dto();
				Map<String,String> object = (Map<String,String>)findByLmm.get(i);
				
			String tntcod11= (String)	object.get("tntcod");
			String  apporgcod1=(String)object.get("apporgcod");
			String  gnrprpcod1=(String)object.get("gnrprpcod");	
			String  aboflg1=(String)object.get("aboflg");
			String  codoutcod1=(String)object.get("codoutcod");
			String  gnrprpnam11=(String)object.get("gnrprpnam1");
			String  gnrprpnam22=(String)object.get("gnrprpnam2");
			
			//保存
			lmm105Dto1.setTntcod(tntcod11);
			lmm105Dto1.setApporgcod(apporgcod1);
			lmm105Dto1.setGnrprpcod(gnrprpcod1);
			lmm105Dto1.setAboflg(aboflg1);
			lmm105Dto1.setCodoutcod(codoutcod1);
			lmm105Dto1.setGnrprpnam1(gnrprpnam11);
			lmm105Dto1.setGnrprpnam2(gnrprpnam22);
			
			list.add(lmm105Dto1);
			modelAndView.addObject("list",list);
			 
		}	
			
		}
		
		

		 
		//遷移
		 modelAndView.setViewName("/lmm105/lmm105");
		return modelAndView;
		}
	
	
	
	
	
	
	@RequestMapping(value="insert1" ,method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView insert1(HttpServletRequest request) {
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
