/**
 * 
 */
package org.cloud.webapp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.cloud.dto.Lmm119Dto;
import org.Constants;
import org.cloud.model.Lmmmtrkg2;
import org.cloud.service.Lmm119Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

/**************************************************************************************
* @author 著者:车健豪
* @createDate 時間を作る:2019年5月22日午後2:09:25
* @version 版本: 1.0
* @Explain 说明: 119一览画面
**************************************************************************************/

@Controller
@RequestMapping("/lmm119Controller")
public class Lmm119Controller extends BaseController{

	//lmm119Serviceの自動注入
    @Autowired
    private Lmm119Service lmm119Service;
	
	/**
     * トラッキング（跟踪）一覧画面の初期化処理
     * @param request
     * @return
     */
	@RequestMapping( value = "/init", method = { RequestMethod.POST, RequestMethod.GET } )
    public ModelAndView init(String numCode, String addressID, String tntcod, String trkgrpcod, 
    		String trkgrpnam, String apporgcod) {
		
    	ModelAndView modelAndView = new ModelAndView();
    	
    	/* 更新ページの飛び込み一覧ページは、
    	 * 回転前のページにデータを表示するために戻る必要がある */
    	if ( "1".equals(numCode) ) {
    		modelAndView.addObject("addressID",addressID);
    		modelAndView.addObject("tntcod",tntcod);
    		modelAndView.addObject("trkgrpcod",trkgrpcod);
    		modelAndView.addObject("trkgrpnam",trkgrpnam);
    		modelAndView.addObject("apporgcod",apporgcod);
    	}
    	
    	/* oトランジスターページ */
    	 modelAndView.setViewName( "/lmm119/lmm119" );
    	 
        return modelAndView;
    }
	
	/**
	 * リストは空欄でmessageを選択する LVB-004024
	 * @return
	 */
	@RequestMapping( value = "/radioIsUnchecked", method = { RequestMethod.POST, RequestMethod.GET } )
	@ResponseBody
    public String radioIsUnchecked() {
    	
    	this.saveMessage( MessageSource.getText( request, "LVB-004024") );    
    	
        return "200";
    }
	
	/**
	 * messageに基づきます
	 * @param judgeNum パラメータを表すコードをする
	 * @return
	 */
	@RequestMapping( value = "/trkgrpnamRegularTest", method = { RequestMethod.POST, RequestMethod.GET } )
	@ResponseBody
    public String trkgrpnamRegularTest(String judgeNum) {
    	
		/* フロントから送られてきた違法トークンを数式に分ける */
		String [] jNum = judgeNum.split("/");
		
		/* 違法トークンの集合を運ぶことです */
		List<String> list = new ArrayList<String>();
		/* 違法トークン数組をくまなく通過する */
        for (int i=0; i<jNum.length; i++) {
        	/* 違法なトークンを削除します */
        	if(!list.contains(jNum[i])) {
        		/* 違法トークン・セットに追加される */
        		list.add(jNum[i]);
            }
        }
        /* 違法トークンの集合を全て経験する */
			for (String string : list) {
				/* 非デフォルト・違法トークンはアクセス可能 */
				if ( !"0".equals(string) ) {
					/* よびだすメッセージフリップフロップが出る
					 * （メッセージ実際の業務処理方法） */
					this.retrieveMessage(string);
				}
		} 
			/* 違法トークンが集合して重された後に1つの値しかなく、
			 * 長さが1の場合は、違法トークンをデフォルトであり、
			 * すべての入力のために正しい */
			if (list.size() == 1 &&"0".equals(list.get(0))) {
				/* すべて正しくコードに戻り、
				 * フロントが受付を受け付けます */
				return "200";
			}
			/* 入力異常が返信された場合、
			 * 受付は受け付けません */
			return "500";
    }
	
	/**
	 * 検索
	 * @return
	 */
	@SuppressWarnings("unused")
	@RequestMapping( value = "/selectDate", method = { RequestMethod.POST, RequestMethod.GET } )
	@ResponseBody
    public List< Object > selectDate(String tntcod, String trkgrpcod, String trkgrpnam, String apporgcod, 
    		String aboflg, HttpServletRequest request, ModelMap model) {
		
		/* なお、フロントエンドページ表は、結果セットのコンテナ(以下、単に「前コンテナ」という。)を表示する。 */
		List< Object > obj = new ArrayList< Object >();
		
		/* 受付の容器を作成する */
		Lmm119Dto lmm119Dto = new Lmm119Dto();
		
		/* 共通正則 */
		String str =  "^[a-z0-9A-Z]+$";
		
		/* 初期トークンを作成する */
		String aString  = "";
		
		/* 最終的に違法なトークンの集合を運ぶためです */
		List<String> list = new ArrayList<String>();
		
		/* 次のコードは、2次検証判断をして、フロントの不正操作を防止し、
		 * 条件に合わないトークンを違法トークンの集合に保管する */
		if( !apporgcod.matches(str) ) { 
			aString = "1";
			list.add(aString);
		}
		if(!trkgrpcod.matches(str)) {
			aString = "2";
			list.add(aString);
		}
		if(apporgcod.length()>12) {
			aString = "3";
			list.add(aString);
		}
		if(trkgrpcod.length()>12) {
			aString = "4";
			list.add(aString);
		}
		if(trkgrpnam.length()>50) {
			aString = "5";
			list.add(aString);
		}
		
		/* 最終的にトークンが空でなければ、
		 * 違法なトークンが入っていると説明し、
		 * もし空なら不法のトークンがないと説明すれば、
		 * 手続きは引き続き進行することができる */
		if(list != null) {
			/* 違法トークンの集合を全て経験する */
			for (String string : list) {
				/* すべてのものを得るメッセージ */
				this.retrieveMessage(string);
			}
			/* 空の集合リストをフロントに戻して表示する */
			return obj;
		}
		
		/* 非廃止状態であるか否かを判断し、
		 * 非廃止状態であれば、
		 * 非廃止内容のみを表示し、
		 * そうでなければすべて表示する */
		if ( Constants.ABOFLG_OFF.equals(aboflg) ) { 
			lmm119Dto.setAboflg( aboflg );													// 非廃止状態のデータのみを表示する
		} else {
			lmm119Dto.setAboflg(""); 															// 全部を表示する
		}
		/* 受付の容器にはまる */
		lmm119Dto.setTntcod( tntcod );					    								// アイデンティティコード
		lmm119Dto.setApporgcod( apporgcod );		    							// 申請組織コード
		lmm119Dto.setTrkgrpcod( trkgrpcod );											// トラッキングGコード
		lmm119Dto.setTrkgrpnam( trkgrpnam );		    							// トラッキングＧ名称
		
		/* 楽屋容器を作る */
		Lmmmtrkg2 lmmmtrkg2 = new Lmmmtrkg2();
		
		/* 楽屋の容器に入る */
		lmmmtrkg2.setTntcod( lmm119Dto.getTntcod() );							// アイデンティティコード
		lmmmtrkg2.setTrkgrpcod( lmm119Dto.getTrkgrpcod() );   			// トラッキングGコード
		lmmmtrkg2.setTrkgrpnam( lmm119Dto.getTrkgrpnam() );			// トラッキングＧ名称
		lmmmtrkg2.setApporgcod( lmm119Dto.getApporgcod() );			// 申請組織コード
		lmmmtrkg2.setAboflg( lmm119Dto.getAboflg() );							// 受付リスト表示状態/舞台裏検索処理検索範囲0は正常1で破棄する

		/* 取得したリストデータは全てです */
		List<Lmmmtrkg2>  lmmmtrkg_L2  = lmm119Service.seleteTransportData( lmmmtrkg2 );
		
		/* データがnullであるかどうかを判断することは何もないということですか */
		if ( lmmmtrkg_L2 != null ) {
			
			/* 前装置の内部データの数です */
			int count = lmmmtrkg_L2.size();
			
			if ( count == 0 ) {
				
				/* 「LVB-004017:検索条件に該当するデータが存在しません。」表示される */
	               this.saveMessage( MessageSource.getText( request, "LVB-004017" ) );
	               
	               return obj;
			}
			
			/* sessionからは、現在のキャラクタの最大リスト表示ライン数を取得する */
			HttpSession session = request.getSession();
	    	String max_Number = (String)session.getAttribute("max_Number");
			
			/* 検索結果が閾値を超えた場合  データが最大数を超える */ 
	           if (count > Integer.valueOf(max_Number)) {
	        	   
	        	   /* 循環によって得られる最大の数です */
	        	   count = Integer.valueOf(max_Number);
	        	   
	               /* 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される */
	               this.saveMessage( MessageSource.getText( request, "LVB-004018", new String[] { max_Number } ) );    
	            }
			
	           /* 楽屋の中身をロットごとにフロント容器に入れます */
	           for ( int i = 0 ; i < count; i++ ) {
	        	   
	        	   /* 前器2はコンテンツの上書きを防止する */
	        	   Lmm119Dto lmm119Dto2 = new Lmm119Dto();
	        	   
	        	   /* バックグラウンド容器の内容をフロント容器に追加します */
	        	   /* l2.get(i).getOrgnam1()oがnullであればページが空に表示される */
	        	   if ( lmmmtrkg_L2.get( i ).getOrgnam1() == null ) {
	        		   lmm119Dto2.setOrgnam1(" ");
	        	   } else {
	        		   lmm119Dto2.setOrgnam1( lmmmtrkg_L2.get( i ).getOrgnam1() );
	        	   }
	        	   lmm119Dto2.setTrkgrpcod( lmmmtrkg_L2.get( i ).getTrkgrpcod() );
	        	   lmm119Dto2.setTrkgrpnam( lmmmtrkg_L2.get( i ).getTrkgrpnam() );
	        	   
	        	   /* 廃止状態表示 */
	        	   if ( "1".endsWith( lmmmtrkg_L2.get( i ).getAboflg() ) ) {
	        		   
	        		   /* 廃棄した状態が表示される */
	        		   lmm119Dto2.setAboflg("〇");
	        	   } else {
	        		   
	        		   /* 未廃止状態を表示する */
	        		   lmm119Dto2.setAboflg(" ");
	        	   }
	        	   
	        	   /* getUpdeac(getUpdeac)は、LongタイプのパラメータをtoStringに変換する必要があります */
	        	   String updeac = lmmmtrkg_L2.get( i ).getUpdeac().toString();
	        	   lmm119Dto2.setUpdeac( updeac );
	        	   
	        	   /* フロントのデータセットに戻ります */
	        	   obj.add( lmm119Dto2 );
	           }
	           
		}
		
        return obj;
    }

	/* メッセージフリップフロップが出る */
	public void retrieveMessage(String numCode) {
		
		switch (numCode) {
		
		/* 申請組織コード 文字の違法化ではありません */	
		case "1":
			
			this.saveMessage( MessageSource.getText( request, "LVB-004010", new String[] { "申請組織コード" } ) );
			
			break;
		/* トラッキングGコード文字の違法化ではありません */
		case "2":
			
			this.saveMessage( MessageSource.getText( request, "LVB-004010", new String[] { "トラッキングGコード" } ) );
			
			break;
		/* 申請組織コード 最大12バイトを超えてはいけません */
		case "3":
			
			this.saveMessage( MessageSource.getText( request, "LVB-004030", new String[] { "申請組織コード", "12" } ) );
			
			break;
		
			/* トラッキングGコード最大12バイトを超えてはいけません */
		case "4":
			
			this.saveMessage( MessageSource.getText( request, "LVB-004030", new String[] { "トラッキングGコード", "12" } ) );
			
			break;
			
		/* トラッキングG名 最大50バイトを超えてはいけません */
		case "5":
				
			this.saveMessage( MessageSource.getText( request, "LVB-004030", new String[] { "トラッキングG名", "50" } ) );
					
			break;
		default:
			break;
		}
	}
}
