package org.cloud.webapp.controller;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.cloud.model.Lmmmgrl;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm116Service;
import org.cloud.service.Slvb116Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

/**
 * 
* @author: 王卫兵 
* @date: 2019/05/31--15:03:59
* @Description: 新規機能と更新機能の処理を行う
* @version:
 */
@Controller
@RequestMapping("lmm116Controller")
public class Lmm116Controller extends BaseController {
	@Autowired
	private Lmm116Service lmm116Service;
	@Autowired
	private Slvb116Service slvb116Service;
	Lmm116Controller lmm116 = new Lmm116Controller();
	/**
	 * 画面表示時の初期処理
	 * @param lmmmgrl,modeGam_Hdn(新規処理または更新処理の判断)
	 * @return
	 */
	@RequestMapping(value="/init")
	public ModelAndView init(HttpSession session, int modeGam_Hdn, Lmmmgrl lmmmgrl) {
		//ModelAndViewの定義
		ModelAndView modelAndView = new ModelAndView();
		//更新の初期化表示情報の処理 
		if (modeGam_Hdn == 1) {	
			Lmmmgrl pupdate = lmm116Service.Pupdate(lmmmgrl);
			modelAndView.addObject("lmmmgrl", pupdate);
		}
		//汎用区分のセレクトリスト作成処理
		String tntcod = (String) session.getAttribute("tntcod");
		List<Lmmmgrl> selectFind = lmm116Service.selectFind(tntcod);
		//検索対象が存在しない場合
		if (selectFind==null) {
			this.saveMessage(MessageSource.getText(request, "LVB-005004"));
			modelAndView.setViewName("/lmm116/lmm116");
			return modelAndView;
		}
		modelAndView.addObject("selectFind",selectFind);
		//新規処理または更新処理の判断パラメータ
		modelAndView.addObject("modeGam_Hdn", modeGam_Hdn);
		modelAndView.setViewName("/lmm116/lmm116");
		return modelAndView;
	}
	
	/**
	 * 新規処理または更新処理
	 * @param lmmmgrl,lmmmorg,modeGam_Hdn(新規処理または更新処理の判断--0:追加,1:修正)
	 * @return
	 */
	@RequestMapping(value="/change")
	public ModelAndView change(Lmmmgrl lmmmgrl, Lmmmorg lmmmorg, HttpServletRequest request, int modeGam_Hdn) {
		ModelAndView modelAndView = new ModelAndView();
		//セッションを作成
		HttpSession session = request.getSession();
		String tntcod = (String) session.getAttribute("tntcod");
		lmmmgrl.setTntcod(tntcod);
		
		//新規処理(modeGam_Hdn判断)
		if (modeGam_Hdn == 0) {
			
			//申請組織コードが組織マスタに登録の場合作成処理
			Boolean appOrgCode = lmm116.appOrgCode(session, lmmmgrl, lmmmorg, modeGam_Hdn);
			if(appOrgCode==false) {
				return modelAndView;
			}
			
			//二重登録チェック
			int check = lmm116Service.check(lmmmgrl);							
			if (check == 1) {
				this.saveMessage(MessageSource.getText(request, "LVB-005005",null));
				modelAndView.setViewName("/lmm116/lmm116");
				return modelAndView;
			}
			
			//登録年月日時分秒
			lmmmgrl.setInsymdhms(new Date());
			
			//汎用マスタの新規処理
			int insert = lmm116Service.insert(lmmmgrl);
			//正常に追加できた場合、以下のメッセージを出力する。							
			if(insert == 1) {
				this.saveMessage(MessageSource.getText(request, "LVB-000003",null));
				modelAndView.setViewName("redirect:/lmm116Controller/init?modeGam_Hdn=0");
				return modelAndView;
			}
		}
				
		//更新処理
		if (modeGam_Hdn == 1) {
			
			//申請組織コードが組織マスタに登録の場合作成処理
			Boolean appOrgCode = lmm116.appOrgCode(session, lmmmgrl, lmmmorg, modeGam_Hdn);
			if(appOrgCode==false) {
				return modelAndView;
			}
			
			//廃止フラグの状態を判断する
			String parameter = request.getParameter("aboflg");
			if(parameter!=null&&parameter.equals("on")) {
				lmmmgrl.setAboflg("1");
			}else {
				lmmmgrl.setAboflg("0");
			}
					
			//汎用マスタの更新処理
			int update = lmm116Service.update(lmmmgrl);
			//更新できた場合、以下のメッセージを出力する。					
			if (update == 1) {
				this.saveMessage(MessageSource.getText(request, "LVB-000004",null));
				modelAndView.setViewName("redirect:/lmm116Controller/init?modeGam_Hdn=1");	
				return modelAndView;
			}else {
				//排他制御が発生した場合（更新回数が画面表示したときの更新回数と同じじゃない。
				this.saveMessage(MessageSource.getText(request, "LVB-005010",null));
				modelAndView.setViewName("/lmm116/lmm116");
				return modelAndView;
			}
		}
		return modelAndView;
	}
	
	/**
	 * 申請組織コードが組織マスタに登録の場合作成処理
	 * @param session
	 * @param lmmmgrl
	 * @param lmmmorg
	 * @param modeGam_Hdn
	 * @return
	 */
	@SuppressWarnings("unused")
	private Boolean appOrgCode(HttpSession session, Lmmmgrl lmmmgrl, Lmmmorg lmmmorg, int modeGam_Hdn) {
		ModelAndView modelAndView = new ModelAndView();
		String tntcod = (String) session.getAttribute("tntcod");
		//申請組織コードが組織マスタに登録の場合作成処理
		lmmmorg.setTntcod(tntcod);
		lmmmorg.setOrgcod(lmmmgrl.getApporgcod());
		List<Lmmmorg> query = slvb116Service.query(lmmmorg);
		//申請組織コードが組織マスタに未登録の場合（申請組織コードが入力されている場合のみ）
		if (query.size() == 0) {
			this.saveMessage(MessageSource.getText(request, "LVB-004023",new String [] {"申請組織コード","組織マスタ"}));
			//将更新前データページを返します
			modelAndView.addObject("lmmmgrl",lmmmgrl);
			modelAndView.addObject("modeGam_Hdn",modeGam_Hdn);
			modelAndView.setViewName("/lmm116/lmm116");
			return false;
		}else {
			return true;
		}
	}
}
