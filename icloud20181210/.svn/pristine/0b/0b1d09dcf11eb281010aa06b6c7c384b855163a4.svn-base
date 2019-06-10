package org.cloud.webapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.Constants;
import org.apache.ibatis.annotations.Param;
import org.cloud.dto.GcLmmmplcDto;
import org.cloud.model.GcLmmmco;
import org.cloud.model.GcLmmmorg;
import org.cloud.model.GcLmmmplc;
import org.cloud.model.GcLmmmtmz;
import org.cloud.model.GcLmmmy;
import org.cloud.model.Lmmmplc;
import org.cloud.service.Lmm114Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

/**
 * 
 * @author 作者：GC
 * @createDate 创建时间：2019年6月1日上午9:45:43
 * @version 版本：
 * @Explain 说明：Lmm114Controller
 * @Email 邮箱：
 */
@Controller
@RequestMapping("/Lmm114Controller")
public class Lmm114Controller extends BaseController{
	
	//注入Lmm114Service
	@Autowired
	Lmm114Service lmm114Service;
	
	HttpSession session = request.getSession();
	
	String tntcod = (String)session.getAttribute("tntcod");
	
	
	//废止标志==0
    @SuppressWarnings("static-access")
	String aboflg = new Constants().ABOFLG_OFF;
	
    //国名选择列表		
	List<GcLmmmco> findLmmplc = lmm114Service.findLmmplcAllGcLmmmcoInfo();
	
	//时区选择列表					
	List<GcLmmmtmz> lmmmtmz = lmm114Service.findLmmplcAllGcLmmmtmzInfo(aboflg);
	
	//日期转换
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	/**
	 *
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:21
	 * @version 版本:
	 * @Explain 说明: 根据主键查询Lmmplc数据
	 * @Email 邮箱:
	 */
	@RequestMapping(value = "/findLmmplcInfoByTntcodAndPlccod")
	@ResponseBody
	public  ModelAndView findLmmplcInfoByTntcodAndPlccod(HttpServletRequest request, String modflg, GcLmmmplc gclmmmplc){
		
		//创建ModelAndView对象
		ModelAndView modelview = new ModelAndView();
		
		//模拟参数数据，新规or更新
		final String MODFLGX= "0";
		
		final String MODFLGG = "1";
		
		final String MODFLGGC = "0";
		
		//添加 findLmmplc，lmmmtmz 到modelview
	    modelview.addObject("findLmmplc", findLmmplc);
	    
	    modelview.addObject("lmmmtmz", lmmmtmz);
		
		//判断操作类型
		 if (MODFLGX.equals(MODFLGGC)) {
	        //新规操作
			modelview.setViewName("/lmm114/lmm114");	
			//返回新规画面
			modelview.addObject("modflggc", MODFLGGC);
			//返回modelview
			return modelview;
			
			//更新操作
	        } else if (MODFLGGC.equals(MODFLGG)) {
	        	
	        	//テナントコード
	        	gclmmmplc.setTntcod(tntcod);
	        	//廃止フラグ
	        	gclmmmplc.setAboflg(aboflg);
	        	//場所コード
	    		gclmmmplc.setPlccod(gclmmmplc.getPlccod());
	    		
	    		//查询对象
	    		GcLmmmplc fLIByTAP = lmm114Service.findLmmplcInfoByTntcodAndPlccod(gclmmmplc);
	    		
	    		//如果搜索目标不存在，则输出以下消息
	    		if(fLIByTAP.equals(null)){
	    			
	    			 this.saveMessage(MessageSource.getText(request, "LVB-005004"));
	    			 //返回页面
	    			 modelview.setViewName("/lmm114/lmm114");
	    			 
	    			 return modelview;
	    			
	    		}else{
	    			
	    		  //添加modflggc,fLIByTAP对象，页面获取
	  	          modelview.addObject("modflggc", MODFLGGC);
	    			  
	  	          modelview.addObject("fLIByTAP", fLIByTAP);
	  	          
	  	        //查询页面top GcLmmmplcDto数据
		        GcLmmmplcDto findLmmplcDto= lmm114Service.findLmmplcDtoInfoByTntcodAndPlccod(gclmmmplc); 
	    		     
	  	          //更新时国名下拉列表数据回显
	    			for (int i = 0; i < findLmmplc.size(); i++) {
						//判断更新时国名key
	    				if(findLmmplc.get(i).getCoalpha3().equals(fLIByTAP.getCtrcod())){
	    					//添加更新时国名value
							 modelview.addObject("findconam", findLmmplc.get(i).getConam());
						}
					}	
	    		//更新时时区下拉列表数据回显
	    		for (int i = 0; i < lmmmtmz.size(); i++) {
	    			//判断更新时时区key
	    			if(lmmmtmz.get(i).getTmeznecod().equals(fLIByTAP.getTmeznecod())){
	    				//添加更新时时区value
	    				modelview.addObject("findlmmmt", lmmmtmz.get(i).getTmeznenam());
					
	    			}
				}	
	    		
	          //top信息日期格式转换
	          Date updymdhms = findLmmplcDto.getUpdymdhms();
             
	          String dateString = formatter.format(updymdhms);
             
	          findLmmplcDto.setUpdymdhmsu(dateString);
             
	          //添加findLmmplcDto对象，页面获取
              modelview.addObject("findLmmplcDto", findLmmplcDto);
            
              //lmm114画面に遷移する
              modelview.setViewName("/lmm114/lmm114");
		     
              return modelview;
	    	
	    		}
	        }
		 
		return null;
		
	}

	  
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:15:49
	 * @version 版本:
	 * @Explain 说明:新规验证
	 * @Email 邮箱:
	 */
		@RequestMapping(value = "/yanZhengXingui")
		@ResponseBody
		public int yanZhengXingui(@Param("plccod") String plccod) {
			//新规验证
			int yan = lmm114Service.yanZhengXingui(plccod);
		
			//判断验证结果
			if(yan>0){
			
			return yan;	
			
			}else{
				//验证不通过报信息
	       	    this.saveMessage(MessageSource.getText(request, "LVB-005005"));
	       	    
			}
			
			return 0;	
		}
		
		
		@RequestMapping(value = "/yanZhengXinguis")
		@ResponseBody
		public int yanZhengXinguis(@Param("apporgcod")String apporgcod) {

			//创建实体类
			GcLmmmy gcLmmmy = new GcLmmmy();
			//废止0
			@SuppressWarnings("static-access")
			String aboflg = new Constants().ABOFLG_OFF;
			//テナントコード
	    	gcLmmmy.setTntcod(tntcod);
	        //处理日期
	    	gcLmmmy.setDatee(new Date());
	    	//廃止フラグ
	    	gcLmmmy.setAboflg(aboflg);
	    	//申請組織コード
	    	gcLmmmy.setApporgcod(apporgcod);
	    	//验证结果
	    	int yanZhengXinguis = lmm114Service.yanZhengXinguis(gcLmmmy);
	    	
			//判断验证结果
			if(yanZhengXinguis>0){
			
			return yanZhengXinguis;													

			}else{
				//验证不通过报信息
	       	    this.saveMessage(MessageSource.getText(request, "LVB-004023",new String[] {"申請組織コード","組織マスタ"}));  
			}
			
			return 0;	
		}

		/**
		 * 
		 * @author 作者:
		 * @createDate 创建时间：2019年6月1日上午9:16:14
		 * @version 版本:
		 * @Explain 说明:新规	
		 * @Email 邮箱:
		 */
		@RequestMapping(value = "/Xingui")
		@ResponseBody
		public ModelAndView Xingui(GcLmmmplc gcLmmmplc) {
			
			//创建新規对象
			Lmmmplc lmmmplc = new Lmmmplc();
			//テナントコード
			String plccod = gcLmmmplc.getPlccod();
			//廃止フラグ
			String aboflg = gcLmmmplc.getAboflg();
			//場所名
			String plcnam = gcLmmmplc.getPlcnam();
			//住所名1
			String adrnam1 = gcLmmmplc.getAdrnam1();
			//住所名2
			String adrnam2 = gcLmmmplc.getAdrnam2();
			//住所名3
			String adrnam3 = gcLmmmplc.getAdrnam3();
			//住所名4
			String adrnam4 = gcLmmmplc.getAdrnam4();
			//郵便コード
			String zipcod = gcLmmmplc.getZipcod();
			//国コード
			String ctrcod = gcLmmmplc.getCtrcod();
			//タイムゾーンコード
			String tmeznecod = gcLmmmplc.getTmeznecod();
			
			//截取前台ctrcod，tmeznecod
			String conam = ctrcod.substring(ctrcod.indexOf(",") + 1);
			String tmeznenam = tmeznecod.substring(tmeznecod.indexOf(",") + 1);
			
			//通过得到的国名与时区名获取相对应的ctrcod，tmeznecod添加数据
			for (GcLmmmco gcLmmmco : findLmmplc) {
				
				if(gcLmmmco.getConam().equals(conam)){
					String coal = gcLmmmco.getCoalpha3();
					lmmmplc.setCtrcod(coal);
				}
			}
			
			for (GcLmmmtmz gcLmmmtmz : lmmmtmz) {
				
				if(gcLmmmtmz.getTmeznenam().equals(tmeznenam)){
					String tmez = gcLmmmtmz.getTmeznecod();
					lmmmplc.setTmeznecod(tmez);
				}
			}
			//申請組織コード
			String apporgcod = gcLmmmplc.getApporgcod();
			//更新回数
			Long updeac = gcLmmmplc.getUpdeac();
			//テナントコード
			lmmmplc.setPlccod(plccod);
			//廃止フラグ
			lmmmplc.setAboflg(aboflg);
			//場所名
			lmmmplc.setPlcnam(plcnam);
			//住所名1
			lmmmplc.setAdrnam1(adrnam1);
			//住所名2
			lmmmplc.setAdrnam2(adrnam2);
			//住所名3
			lmmmplc.setAdrnam3(adrnam3);
			//住所名4
			lmmmplc.setAdrnam4(adrnam4);
			//郵便コード
			lmmmplc.setZipcod(zipcod);
			//申請組織コード
			lmmmplc.setApporgcod(apporgcod);
			//テナントコード
			lmmmplc.setTntcod(tntcod);
			//適用終了日時
			lmmmplc.setInsymdhms(new Date());
			//共通部品情报
			//登録者
			lmmmplc.setInsnam("");
			//登録者区分
			lmmmplc.setInskbn("");
			//登録方法区分
			lmmmplc.setInsmethodkbn("");
			//更新年月日時分秒
			lmmmplc.setUpdymdhms(new Date());
			//更新者
			lmmmplc.setUpdnam("");
			//更新者区分
			lmmmplc.setUpdkbn("");
			//更新方法区分
			lmmmplc.setUpdmethodkbn("");
			//更新回数
			lmmmplc.setUpdeac(updeac);
			
			//新規返回結果
			int xingui = lmm114Service.Xingui(lmmmplc);
		
			//新规成功message
			if(xingui==1){
				
				this.saveMessage(MessageSource.getText(request, "LVB-000003"));
				
				//返回新规页面 继续添加
				ModelAndView modelview = new ModelAndView();
				
				modelview.setViewName("/lmm114/lmm114");
				
				//传递modflggc
				String modflggc = "0";
				
				modelview.addObject("modflggc", modflggc);
				//重定向新规初始化页面
				return new ModelAndView("redirect:findLmmplcInfoByTntcodAndPlccod");
				
			}else{
			
			//新规失败message					
			this.saveMessage(MessageSource.getText(request, "LVB-009001"));
			
			}
			
			return null;
			
		}
			
		/**
		 * 
		 * @author 作者:
		 * @createDate 创建时间：2019年6月1日上午9:16:14
		 * @version 版本:
		 * @Explain 说明:更新验证	
		 * @Email 邮箱:
		 */
		@RequestMapping(value = "/GengxinYanZ")
		@ResponseBody
		public int GengxinYanZ(@Param("apporgcod")String apporgcod) {
		
			//gclmmmorg创建对象
			GcLmmmorg gclmmmorg = new GcLmmmorg();
			//タイムゾーンコード		
		    gclmmmorg.setTntcod(tntcod);
		    //申請組織コード
			gclmmmorg.setApporgcod(apporgcod);
			//处理日
			gclmmmorg.setDate(new Date());
			
			//废止标志
			@SuppressWarnings("static-access")
			String aboflg = new Constants().ABOFLG_OFF;
			
			gclmmmorg.setAboflg(aboflg);

			//验证结果
			int gengxinYanZ = lmm114Service.GengxinYanZ(gclmmmorg);
		
			//验证成功
			if(gengxinYanZ > 0){
				
				return gengxinYanZ;
				
			}else{
			//验证失败message					
			this.saveMessage(MessageSource.getText(request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"}));
			 
			}
			return 0;
		}
		
		
		/**
		 * 
		 * @author 作者:
		 * @createDate 创建时间：2019年6月1日上午9:16:22
		 * @version 版本:
		 * @Explain 说明:更新回数验证
		 * @Email 邮箱:
		 */
		@RequestMapping(value = "/Gengxin")
		@ResponseBody
		public GcLmmmplc Gengxin(@Param("plccod")String plccod, @Param("tntcod")String tntcod, @Param("updeac")Long updeac){
			
		    //创建对象
			GcLmmmplc gcLmmmplc= new GcLmmmplc();
			//タイムゾーンコード	
			gcLmmmplc.setTntcod(tntcod);
			//場所コード
			gcLmmmplc.setPlccod(plccod);
			//更新回数
			gcLmmmplc.setUpdeac(updeac);
			
			//验证成功返回对象
			GcLmmmplc gengxin = lmm114Service.Gengxin(gcLmmmplc);
			
			//验证成功
			if(gengxin!=null){
				
				return gengxin;
				
			}else{
			
			//排他治愈所产生异常
			this.saveMessage(MessageSource.getText(request,"LVB-005010"));
			
			}
			
			return null;
			
		}

		/**
		 * 
		 * @author 作者:
		 * @createDate 创建时间：2019年6月1日上午9:16:32
		 * @version 版本:
		 * @Explain 说明:更新
		 * @Email 邮箱:
		 */
		@RequestMapping(value = "/Gengxinj")
		@ResponseBody
		public ModelAndView Gengxinj(GcLmmmplc gcLmmmplc){
			
			//创建对象
			ModelAndView modelview = new ModelAndView();
			//创建Lmmmplc对象
			Lmmmplc lmmmplc = new Lmmmplc();
			//更新数据
			String plccod = gcLmmmplc.getPlccod();
			//廃止フラグ
			String aboflg = gcLmmmplc.getAboflg();
			//場所名
			String plcnam = gcLmmmplc.getPlcnam();
			//住所名1
			String adrnam1 = gcLmmmplc.getAdrnam1();
			//住所名2
			String adrnam2 = gcLmmmplc.getAdrnam2();
			//住所名3
			String adrnam3 = gcLmmmplc.getAdrnam3();
			//住所名4
			String adrnam4 = gcLmmmplc.getAdrnam4();
			//郵便コード
			String zipcod = gcLmmmplc.getZipcod();
			//国コード
			String ctrcod = gcLmmmplc.getCtrcod();
			//タイムゾーンコード
			String tmeznecod = gcLmmmplc.getTmeznecod();
			
			//获取开始截取的位置，之后截取逗号后面的所有内容
			String conam = ctrcod.substring(ctrcod.indexOf(",") + 1);
			
			String tmeznenam = tmeznecod.substring(tmeznecod.indexOf(",") + 1);
			
			//通过得到的国名与时区名获取相对应的ctrcod，tmeznecod加入更新数据
			for (GcLmmmco gcLmmmco : findLmmplc) {
				
				if(gcLmmmco.getConam().equals(conam)){
					String coalpha3 = gcLmmmco.getCoalpha3();
					lmmmplc.setCtrcod(coalpha3);
					
				}
			}
			
			for (GcLmmmtmz gcLmmmtmz : lmmmtmz) {
				
				if(gcLmmmtmz.getTmeznenam().equals(tmeznenam)){
					String tmeznecod2 = gcLmmmtmz.getTmeznecod();
					lmmmplc.setTmeznecod(tmeznecod2);
				}
			}
			//申請組織コード
			String apporgcod = gcLmmmplc.getApporgcod();
			//更新回数
			Long updeac = gcLmmmplc.getUpdeac();
			//テナントコード
			lmmmplc.setTntcod(tntcod);
			//場所コード
			lmmmplc.setPlccod(plccod);
			//廃止フラグ
			lmmmplc.setAboflg(aboflg);
			//場所名
			lmmmplc.setPlcnam(plcnam);
			//住所名1
			lmmmplc.setAdrnam1(adrnam1);
			//住所名2
			lmmmplc.setAdrnam2(adrnam2);
			//住所名3
			lmmmplc.setAdrnam3(adrnam3);
			//住所名4
			lmmmplc.setAdrnam4(adrnam4);
			//郵便コード
			lmmmplc.setZipcod(zipcod);
			//申請組織コード
			lmmmplc.setApporgcod(apporgcod);
			//插入当前日期
			Date date = new Date();
			//更新年月日時分秒
			lmmmplc.setUpdymdhms(date);
			//更新者
			lmmmplc.setUpdnam("");
			//更新者区分
			lmmmplc.setUpdkbn(null);
			//更新方法区分
			lmmmplc.setUpdmethodkbn("0001");
			//更新回数
			lmmmplc.setUpdeac(updeac);
			//返回更新结果
			int gengxinj = lmm114Service.Gengxinj(lmmmplc);
			//新规成功message
			if(gengxinj==1){
				
				//更新成功message
				this.saveMessage(MessageSource.getText(request, "LVB-000003"));
				 
				//結果一覧の再表示							
				modelview.addObject("gengxinj", gengxinj);
				
				modelview.setViewName("场所一揽画面");
				
				return modelview;
				
			}else{
				
			//失败message					
			this.saveMessage(MessageSource.getText(request, "LVB-009001"));
			
			}
			
			return null;
		}

}
