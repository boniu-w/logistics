package org.cloud.webapp.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm108Dto;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm108Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

@Controller
@RequestMapping("/lmm108Controller")
public class Lmm108Controller extends BaseController{

	//lmm101Serviceの自動注入
	@Autowired
	private Lmm108Service lmm108Service;

	//前のページで取得したオブジェクト
	private Lmmmevtm selectOne;



	/**
	 * 
	 * @Title:init_108
	 * @Description:TODO ページ初期化
	 * @param:@param request
	 * @param:@return
	 * @param:@throws UnsupportedEncodingException
	 * @return:ModelAndView
	 * @throws:
	 */
	@RequestMapping(value = "/init_108", method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView init_108( HttpServletRequest request ) throws UnsupportedEncodingException {

		//フロントから取得した値
		String parm = request.getParameter("modflg");

		//intタイプに変換
		int modflg = Integer.valueOf( parm );

		//セッションオブジェクトを取得
		HttpSession session = request.getSession();

		//セッションにメッセージを追加します。
		session.setAttribute("userName", "hjk");
		session.setAttribute("tntcod", "01001006");

		//追加か修正かを判断します。
		if ( modflg == 0 ) {

			//ModelAndViewの定義
			ModelAndView modelAndView = new ModelAndView();

			//オブジェクトを具体化,初期値を指定します
			Lmm108Dto lmm108 = new Lmm108Dto();
			lmm108.setEvtmrgcod("");
			lmm108.setEvtmrgnam("");
			lmm108.setDispnum("");
			lmm108.setApporgcod("");
			lmm108.setAboflg("0");
			lmm108.setUpdnam("");
			lmm108.setUpdymdhms("");

			//model AndViewにパラメータを追加します。
			modelAndView.addObject("lmm108dto", lmm108);
			modelAndView.addObject("message", MessageSource.getText(request, "LVB-000002"));
			modelAndView.addObject("modflg", modflg);
			modelAndView.setViewName("lmm108/SLMM108");

			//ModelAndViewオブジェクトを返します。
			return modelAndView;

		}else {

			//オブジェクトを具体化,値を賦与する
			Lmmmevtm lmmm = new Lmmmevtm();
			lmmm.setTntcod("01001006");
			lmmm.setEvtmrgcod("100");

			//サービス層の呼び出し方法
			selectOne = lmm108Service.selectOne(lmmm);

			//ModelAndViewの定義
			ModelAndView modelAndView = new ModelAndView();

			if ( selectOne != null ) {

				//オブジェクトを具体化,値を賦与する
				Lmm108Dto lmm108 = new Lmm108Dto();
				lmm108.setEvtmrgcod( selectOne.getEvtmrgcod() );
				lmm108.setEvtmrgnam( selectOne.getEvtmrgnam() );
				lmm108.setDispnum( selectOne.getDispnum() );
				lmm108.setApporgcod( selectOne.getApporgcod() );
				lmm108.setAboflg( selectOne.getAboflg() );
				lmm108.setUpdnam( selectOne.getUpdnam() );
				lmm108.setUpdymdhms( new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format( selectOne.getUpdymdhms() ) );

				//model AndViewにパラメータを追加します。
				modelAndView.addObject("lmm108dto", lmm108);
				modelAndView.addObject("message", MessageSource.getText( request, "LVB-000002") );
				modelAndView.addObject("modflg", modflg);
				modelAndView.setViewName("lmm108/SLMM108");

			} else {

				//ツールクラスの出力情報を呼び出します。
				this.saveMessage( MessageSource.getText( request, "LVB-005004", null ) );
			}

			//ModelAndViewオブジェクトを返します。
			return modelAndView;
		}

	}



	/**
	 * 
	 * @Title:doAdd_108
	 * @Description:TODO 情報を追加
	 * @param:@param request
	 * @param:@param lmm108dto
	 * @param:@return
	 * @param:@throws UnsupportedEncodingException
	 * @return:ModelAndView
	 * @throws:
	 */
	@RequestMapping(value = "/doAdd_108", method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView doAdd_108( HttpServletRequest request, @ModelAttribute Lmm108Dto lmm108dto ) 
			throws UnsupportedEncodingException {

		//ModelAndViewの定義
		ModelAndView modelAndView = new ModelAndView();

		//セッションオブジェクトを取得
		HttpSession session = request.getSession();

		//オブジェクトを具体化,値を賦与する
		Lmmmevtm lmm = new Lmmmevtm();
		lmm.setTntcod("01001006");
		lmm.setEvtmrgcod( lmm108dto.getEvtmrgcod() );
		lmm.setEvtmrgnam( lmm108dto.getEvtmrgnam() );
		lmm.setDispnum( lmm108dto.getDispnum() );
		lmm.setApporgcod( lmm108dto.getApporgcod() );
		lmm.setAboflg( "on".equals(lmm108dto.getAboflg() ) ? "1":"0" );
		lmm.setInsymdhms( new Date() );
		lmm.setInsnam( (String)session.getAttribute("userName") );


		Lmmmevtm selectOne2 = lmm108Service.selectOne(lmm);

		//データベースにこのデータが存在するかどうかを判断します。
		if ( selectOne2 != null ) {

			//出力情報を取得する
			this.saveMessage( MessageSource.getText( request, "LVB-005005", null ) );

			modelAndView.addObject("lmm108dto", lmm);

		}

		//データ情報を再検索
		Lmmmorg selectLmmmorg = lmm108Service.selectLmmmorg( lmm.getTntcod(), lmm108dto.getApporgcod() );

		if	( selectLmmmorg == null ) {

			//出力情報を取得する
			this.saveMessage( MessageSource.getText( request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"} ) );

			//model AndViewにパラメータを追加します。
			modelAndView.addObject("modflg", 0);

			modelAndView.addObject("lmm108dto", lmm);

			modelAndView.setViewName("lmm108/SLMM108");

		} 
		
		if ( selectOne2 == null && selectLmmmorg != null) {

			//追加データの呼び出し方法
			int add = lmm108Service.add( lmm );

			//追加に成功したかどうかを判断します。
			if ( add == 0 ) {

				//出力情報を取得する
				this.saveMessage( MessageSource.getText( request, "LVB-005005", null ) );

				modelAndView.addObject("lmm108dto", lmm);
			} else {

				//出力情報を取得する
				this.saveMessage( MessageSource.getText( request, "LVB-000003", null ) );

				lmm108dto.setAboflg("0");
				lmm108dto.setApporgcod("");
				lmm108dto.setDispnum("");
				lmm108dto.setEvtmrgcod("");
				lmm108dto.setEvtmrgnam("");
				lmm108dto.setUpdnam("");
				lmm108dto.setUpdymdhms("");

				modelAndView.addObject("lmm108dto", lmm108dto);
			}


		}




		//model AndViewにパラメータを追加します。
		modelAndView.addObject("modflg", 0);

		modelAndView.setViewName("lmm108/SLMM108");

		//ModelAndViewオブジェクトを返します。
		return modelAndView;
	}



	/**
	 * 
	 * @Title:doUdp_108
	 * @Description:TODO 情報を更新する
	 * @param:@param request
	 * @param:@param lmm108dto
	 * @param:@return
	 * @param:@throws UnsupportedEncodingException
	 * @return:ModelAndView
	 * @throws:
	 */
	@RequestMapping(value = "/doUdp_108", method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView doUdp_108(HttpServletRequest request,@ModelAttribute Lmm108Dto lmm108dto) 
			throws UnsupportedEncodingException {

		//オブジェクトを具体化,値を賦与する
		Lmmmevtm lmmm = new Lmmmevtm();
		lmmm.setTntcod("01001006");
		lmmm.setEvtmrgcod("100");

		//サービス層の呼び出し方法
		selectOne = lmm108Service.selectOne(lmmm);

		//ModelAndViewの定義
		ModelAndView modelAndView = new ModelAndView();

		//セッションオブジェクトを取得
		HttpSession session = request.getSession();

		//ページで取得したデータを共通のオブジェクトに更新します。
		selectOne.setEvtmrgcod( lmm108dto.getEvtmrgcod() );
		selectOne.setEvtmrgnam( lmm108dto.getEvtmrgnam() );
		selectOne.setDispnum( lmm108dto.getDispnum() );
		selectOne.setApporgcod( lmm108dto.getApporgcod() );
		selectOne.setAboflg( "on".equals(lmm108dto.getAboflg() ) ? "1":"0" );
		selectOne.setUpdnam( (String) session.getAttribute("userName") );
		selectOne.setUpdymdhms( new Date() );
		lmm108dto.setAboflg(selectOne.getAboflg());

		//セッションからtntcodを取得する
		String tntcod = ( String ) session.getAttribute( "tntcod" );

		//データ情報を再検索
		Lmmmorg selectLmmmorg = lmm108Service.selectLmmmorg( tntcod, lmm108dto.getApporgcod() );

		//オブジェクトが空かどうかを判断します。
		if ( selectLmmmorg == null ) {

			//出力情報を取得する
			this.saveMessage(MessageSource.getText(request, "LVB-004023",new String[] { "申請組織コード", "組織マスタ" }));

			modelAndView.addObject("lmm108dto", lmm108dto);
			
			//model AndViewにパラメータを追加します。
			modelAndView.addObject("modflg", 1);

			//最新のデータでない場合は、ページを移動します。
			modelAndView.setViewName("lmm108/SLMM108");

		} else {

			//データの更新方法を呼び出します。
			int update = lmm108Service.update(selectOne);

			//データの更新が成功したかどうかを判断します。
			if ( update > 0 ) {

				//出力情報を取得する
				this.saveMessage(MessageSource.getText(request, "LVB-000004", null ) );

				modelAndView.addObject("message", MessageSource.getText(request, "LVB-000004", null ) );

			} else {

				//出力情報を取得する
				this.saveMessage(MessageSource.getText(request, "LVB-005010", null ) );

				modelAndView.addObject("message", MessageSource.getText(request, "LVB-005010", null ) );

			}


			modelAndView.addObject("lmm108dto", lmm108dto);

			//model AndViewにパラメータを追加します。
			modelAndView.addObject("modflg", 1);

			//ページの更新に成功しました。
			modelAndView.setViewName("lmm108/SLMM108");
		}

		//ModelAndViewオブジェクトを返します。
		return modelAndView;
	}



	/**
	 * 
	 * @Title:lmm108checkOrgCode
	 * @Description:TODO 組織コード二重登録チェック
	 * @param:@param orgCode
	 * @param:@return
	 * @return:String
	 * @throws:
	 */
	@RequestMapping(value="/lmm108checkOrg",produces="text/html; charset=UTF-8")
	@ResponseBody
	public String lmm108checkOrgCode(String orgCode){

		//セッションオブジェクトを取得
		HttpSession session = request.getSession();

		//キーワード：TNTCOD
		String tntcod = (String)session.getAttribute("tntcod");

		//調査組織マシタに関する情報
		Lmmmorg checkRs = lmm108Service.selectLmmmorg(tntcod, orgCode);

		//Stringオブジェクトを宣言します。
		String msg = ""; 

		//関連情報を調べることができるかどうかを判断します。
		if ( checkRs != null ){

			//調べたApple codの値をmsg変数に伝えます。
			msg = checkRs.getApporgcod();

		} else {

			//出力情報を取得する
			this.saveMessage(MessageSource.getText(request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"}));

			//取得したメッセージをmsg変数に送る
			msg = MessageSource.getText(request, "LVB-004023", new String[] {"申請組織コード","組織マスタ"});
		}

		//データをフロントに返します。
		return msg;
	}



	/**
	 * 
	 * @Title:lmm108checkMsg
	 * @Description:TODO 認証情報を取得
	 * @param:@param first
	 * @param:@param second
	 * @param:@return
	 * @return:Map<String,String>
	 * @throws:
	 */
	@RequestMapping(value="/lmm108checkMsg",method = {RequestMethod.POST, RequestMethod.GET })
	@ResponseBody
	public Map<String,String> lmm108checkMsg( String first, String second) {

		//文字列を切り取り、文字列配列を取得します。
		String[] split = second.split(",");

		//パラメータから異常情報を取得する
		String msg = MessageSource.getText(request, first,split);

		//mapオブジェクトを作成
		Map<String,String> map = new HashMap<String,String>();

		//mapに情報を追加する
		map.put("msg", msg);

		return map;
	}

}
