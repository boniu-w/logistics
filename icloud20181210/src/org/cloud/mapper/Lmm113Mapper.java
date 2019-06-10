package org.cloud.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmplc;

/** 

* @author 作者 : 李青阳

* @version 创建时间：2019年5月23日 下午9:50:51 

* 类说明  

*/

public interface Lmm113Mapper {
	
	
	
	/**
     * quallByy 組織一覧の検索処理
     * @param searchScope_Rdo  検索範囲
     * @param appOrgCode_Txt   申請組織コード
     * @param plcCode_Txt     場所コード
     * @param plcName_Txt     場所名１
     * @return 処理結果（List）
     **/
	
	public List<HashMap<String,String>> quallByy(@Param("searchScope_Rdo") Integer searchScope_Rdo,@Param("appOrgCode_Txt") String appOrgCode_Txt,@Param("plcCode_Txt") String plcCode_Txt,@Param("plcName_Txt") String plcName_Txt,@Param("aboflg")String aboflg);
}
