package org.cloud.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface Lmm109Mapper {
	
	/**
     * selectBy109 商品一覧の検索処理
     * @param searchScope_Rdo  検索範囲
     * @param applyOrgCode_Txt   申請組織コード
     * @param itemCode_Txt     商品コード		
     * @param itemName_Txt     商品名
     * @param tnocod_Txt     テナントコード＝ログインユーザのテナントコード																	
     * @return 処理結果（List）
     **/
	
	public List<HashMap<String,String>> selectBy109(@Param("searchScope_Rdo") 
	
	Integer searchScope_Rdo,@Param("applyOrgCode_Txt") String applyOrgCode_Txt , 
	
	@Param("itemCode_Txt") String itemCode_Txt ,@Param("itemName_Txt") String itemName_Txt ,
	
	@Param("tnocod_Txt") String tnocod_Txt);
}
