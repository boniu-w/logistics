package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;

import org.cloud.mapper.Lmm101Mapper;
import org.cloud.mapper.Lmm109Mapper;
import org.cloud.service.Lmm109Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Lmm109ServiceImpl implements Lmm109Service{
	
	// Lmm109Daoの注入
	
	@Autowired
	
	private Lmm109Mapper lmm109Mapper;
	/**
	 * select 商品一覧の検索処理
	 * @param searchScope_Rdo  検索範囲
	 * @param applyOrgCode_Txt   申請組織コード
	 * @param itemCode_Txt     商品コード		
	 * @param itemName_Txt     商品名
	 * @param tnocod_Txt     テナントコード＝ログインユーザのテナントコード
	 * @return 処理結果（List）
	 **/
	
	@Override
	
	public List<HashMap<String, String>> select(Integer searchScope_Rdo, String applyOrgCode_Txt, String itemCode_Txt, String itemName_Txt ,String tnocod_Txt) {

		return lmm109Mapper.selectBy109(searchScope_Rdo, applyOrgCode_Txt, itemCode_Txt, itemName_Txt ,tnocod_Txt );
	}

}
