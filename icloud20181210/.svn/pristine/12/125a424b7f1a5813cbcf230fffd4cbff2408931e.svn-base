package org.cloud.service;

import java.util.HashMap;
import java.util.List;

import org.cloud.model.Lmmmgrl;

/**
 * 
 * @author liuRanRan
 * @createDate 2019年5月22日 下午8:27:32
 * @Explain Lmm115Service接口
 * @tel 18838918324
 */
public interface Lmm115Service {

	/**
	 * 汎用区分リスト作成処理
	 * 
	 * @param tntcod 检索条件：テナントコード＝ログインユーザのテナントコード
	 * @return
	 */
	public List<Lmmmgrl> findGnrprpKbn_Sct(String grltntcod);

	/**
	 * 汎用一览画面检索方法
	 * 
	 * @param tntcod
	 * @param searchScope_Rdo
	 * @param appOrgCode_Txt
	 * @param gnrprpKbn_Sct
	 * @param gnrprpKbnName_Txt
	 * @param gnrprpCode_Txt
	 * @param gnrprpName1_Txt
	 * @return
	 */
	public List<HashMap<String, String>> findTable115(String grltntcod, String searchScope_Rdo, String appOrgCode_Txt,
			String gnrprpKbn_Sct, String gnrprpKbnName_Txt, String gnrprpCode_Txt, String gnrprpName1_Txt);

}
