package org.cloud.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmgrl;

/**
 * 
 * @author liuRanRan
 * @createDate 2019年5月22日 下午4:20:53
 * @Explain 汎用一覧dao层接口
 * @tel 18838918324
 */
public interface Lmm115Mapper {

	/**
	 * 汎用区分リスト作成処理
	 * 
	 * @param tntcod 检索条件：テナントコード＝ログインユーザのテナントコード
	 * @return
	 */
	public List<Lmmmgrl> findGnrprpKbn_Sct(@Param("grltntcod") String grltntcod);

	/**
	 * 汎用一览画面检索方法
	 * 
	 * @param grltntcod
	 * @param searchScope_Rdo
	 * @param appOrgCode_Txt
	 * @param gnrprpKbn_Sct
	 * @param gnrprpKbnName_Txt
	 * @param gnrprpCode_Txt
	 * @param gnrprpName1_Txt
	 * @return
	 */
	public List<HashMap<String, String>> findTable115(@Param("grltntcod") String grltntcod,
			@Param("searchScope_Rdo") String searchScope_Rdo, @Param("appOrgCode_Txt") String appOrgCode_Txt,
			@Param("gnrprpKbn_Sct") String gnrprpKbn_Sct, @Param("gnrprpKbnName_Txt") String gnrprpKbnName_Txt,
			@Param("gnrprpCode_Txt") String gnrprpCode_Txt, @Param("gnrprpName1_Txt") String gnrprpName1_Txt);

}
