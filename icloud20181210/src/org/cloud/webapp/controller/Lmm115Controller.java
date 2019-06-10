package org.cloud.webapp.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.dto.Lmm115Dto;
import org.cloud.dto.Lmm115DtoKsjk;
import org.cloud.model.Lmmmgrl;
import org.cloud.service.Lmm115Service;
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
 * 
 * @author liuRanRan
 * @createDate 2019年5月23日 下午8:07:34
 * @Explain 模仿demo101
 * @tel 18838918324
 */
@Controller
@RequestMapping("/lmm115Controller")
public class Lmm115Controller extends BaseController {

	// lmm115Serviceの自動注入
	@Autowired
	private Lmm115Service lmm115Service;

	/**
	 * 凡用一覧画面の初期化処理
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/init", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView init115(HttpServletRequest request) {

		// ModelAndViewの定義
		ModelAndView modelandview = new ModelAndView();
		HttpSession session = request.getSession();

		String tntcod = (String) session.getAttribute("tntcod");

		tntcod = "11001006";

		String searchScope_Rdo = "2";

		List<Lmmmgrl> findGnrprpKbn_Sct = lmm115Service.findGnrprpKbn_Sct(tntcod);

		modelandview.addObject("gnrprpKbn_Sct", findGnrprpKbn_Sct);

		modelandview.addObject("searchScope_Rdo", searchScope_Rdo);

		modelandview.setViewName("/lmm115/lmm115");

		return modelandview;

	}

	/**
	 * quallBy115 検索ボタンのイベント
	 * 
	 * @param lmm101DtoKsjk
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/quallBy", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView quallBy115(@ModelAttribute Lmm115DtoKsjk lmm115DtoKsjk, HttpServletRequest request,
			ModelMap model) {

		// ModelAndView の定義
		ModelAndView modelAndView = new ModelAndView();

		// 5ページの遷移
		modelAndView.setViewName("/lmm115/lmm115");
		HttpSession session = request.getSession();

		// 2テスト値（納品時、削除必要）
		String tntcod = (String) session.getAttribute("tntcod");
		tntcod = "11001006";

		// 2画面表示結果のリスト
		List<Lmm115Dto> listLmm115Dto = new LinkedList<Lmm115Dto>();

		// lmm115画面一覧の対象
		Lmm115Dto lmm115Dto;

		String searchScope_Rdo = lmm115DtoKsjk.getSearchScope_Rdo();
		String appOrgCode_Txt = lmm115DtoKsjk.getAppOrgCode_Txt();
		String gnrprpKbn_Sct = lmm115DtoKsjk.getGnrprpKbn_Sct();
		String gnrprpKbnName_Txt = lmm115DtoKsjk.getGnrprpKbnName_Txt();
		String gnrprpCode_Txt = lmm115DtoKsjk.getGnrprpCode_Txt();
		String gnrprpName1_Txt = lmm115DtoKsjk.getGnrprpName1_Txt();

		// 4更新から戻る場合、検索条件の保持
		if (searchScope_Rdo == null) {
			searchScope_Rdo = (String) model.get("searchScope_Rdo");
		}
		if (appOrgCode_Txt == null) {
			appOrgCode_Txt = (String) model.get("appOrgCode_Txt");
		}
		if (gnrprpKbn_Sct == null) {
			gnrprpKbn_Sct = (String) model.get("gnrprpKbn_Sct");
		}
		if (gnrprpKbnName_Txt == null) {
			gnrprpKbnName_Txt = (String) model.get("gnrprpKbnName_Txt");
		}
		if (gnrprpCode_Txt == null) {
			gnrprpCode_Txt = (String) model.get("gnrprpCode_Txt");
		}
		if (gnrprpName1_Txt == null) {
			gnrprpName1_Txt = (String) model.get("gnrprpName1_Txt");
		}

		// 2検索条件の保持
		modelAndView.addObject("searchScope_Rdo", searchScope_Rdo);
		modelAndView.addObject("appOrgCode_Txt", appOrgCode_Txt);
		modelAndView.addObject("gnrprpKbnName_Txt", gnrprpKbnName_Txt);
		modelAndView.addObject("gnrprpCode_Txt", gnrprpCode_Txt);
		modelAndView.addObject("gnrprpName1_Txt", gnrprpName1_Txt);

		// g汎用区分リスト表示処理
		List<Lmmmgrl> findGnrprpKbn_Sct = lmm115Service.findGnrprpKbn_Sct(tntcod);
		modelAndView.addObject("gnrprpKbn_Sct", findGnrprpKbn_Sct);

		// 入力、選択された検索条件にて汎用マスタテーブルを検索し、検索結果一覧を表示する。
		List<HashMap<String, String>> findTable115 = lmm115Service.findTable115(tntcod, searchScope_Rdo, appOrgCode_Txt,
				gnrprpKbn_Sct, gnrprpKbnName_Txt, gnrprpCode_Txt, gnrprpName1_Txt);

		if (findTable115 != null) {
			int count = findTable115.size();

			// 4検索結果が0件の場合
			if (count == 0) {
				// 「LVB-004017:検索条件に該当するデータが存在しません。」表示される
				this.saveMessage(MessageSource.getText(request, "LVB-004017", null));
				return modelAndView;
			}
			// 4検索結果が閾値を超えた場合
			if (count > 15) {
				count = 15;

				// 「LVB-004018:最大表示件数を超えたため{0}件まで表示します。」表示される
				this.saveMessage(MessageSource.getText(request, "LVB-004018", new String[] { "15" }));

			}

			for (int i = 0; i < count; i++) {

				lmm115Dto = new Lmm115Dto();
				Map hashMap = (Map) findTable115.get(i);

				// 1 废止
				String gnrprp_List_aboFlg_Lbl = (String) hashMap.get("ABOFLG");

				// 1汎用区分
				String gnrprp_List_gnrprpKbn_Lbl = (String) hashMap.get("GNRPRPKBN");

				// 1汎用コード
				String gnrprp_List_gnrprpCode_Lbl = (String) hashMap.get("GNRPRPCOD");

				// 1 コード种别
				String gnrprp_List_codOutCode_Lbl = (String) hashMap.get("CODOUTCOD");

				// 1汎用名１
				String gnrprp_List_gnrprpName1_Lbl = (String) hashMap.get("GNRPRPNAM1");

				// 1汎用名２
				String gnrprp_List_gnrprpName2_Lbl = (String) hashMap.get("GNRPRPNAM2");

				// 1申請組織コード
				String gnrprp_List_appOrgCode_Lbl = (String) hashMap.get("APPORGCOD");

				// javabeanで保存
				lmm115Dto.setAboflg(gnrprp_List_aboFlg_Lbl);
				lmm115Dto.setGnrprpkbn(gnrprp_List_gnrprpKbn_Lbl);
				lmm115Dto.setGnrprpcod(gnrprp_List_gnrprpCode_Lbl);
				lmm115Dto.setCodoutcod(gnrprp_List_codOutCode_Lbl);
				lmm115Dto.setGnrprpnam1(gnrprp_List_gnrprpName1_Lbl);
				lmm115Dto.setGnrprpnam2(gnrprp_List_gnrprpName2_Lbl);
				lmm115Dto.setApporgcod(gnrprp_List_appOrgCode_Lbl);

				// 1 返却用リストに設定する
				listLmm115Dto.add(lmm115Dto);
			}

			// 1一覧明細表示のため、listLmm115DtoをmodelAndViewに置き
			modelAndView.addObject("listLmm115Dto", listLmm115Dto);

		}

		return modelAndView;

	}
}
