package org.cloud.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * select 商品一覧の検索処理
 * @param searchScope_Rdo  検索範囲
 * @param applyOrgCode_Txt   申請組織コード
 * @param itemCode_Txt     商品コード		
 * @param itemName_Txt     商品名
 * @param tnocod_Txt     テナントコード＝ログインユーザのテナントコード
 * @return 処理結果（List）
 **/
public interface Lmm109Service{

	public List<HashMap<String,String>> select( Integer searchScope_Rdo, String applyOrgCode_Txt , 
			
			String itemCode_Txt , String itemName_Txt ,String tnocod_Txt);
}
