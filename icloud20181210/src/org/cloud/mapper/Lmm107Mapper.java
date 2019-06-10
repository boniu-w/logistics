package org.cloud.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmgrl;

/**
 * 
 * @author zhangshiyao
 * @createDate 2019年5月22日 下午4:20:53
 * @Explain イベント集計一覧dao层接口
 * @tel 18738213926
 */
public interface Lmm107Mapper {

	/**
	 * 
	 * 
	 * @param searchScope_Rdo検索範囲
	 * @param applyOrgCode_Txt申請組織コード
	 * @param evtmrgcod_Txtイベント集計コード
	 * @param evtmrgnam_Txtイベント集計名称
	 * @return
	 */
	public List<HashMap<String,String>> selectBy109(@Param("searchScope_Rdo") Integer searchScope_Rdo,@Param("applyOrgCode_Txt") String applyOrgCode_Txt ,@Param("evtmrgcod_Txt") String evtmrgcod_Txt ,@Param("evtmrgnam_Txt") String evtmrgnam_Txt );


}
