package org.cloud.service;

import java.util.HashMap;

import java.util.List;

import org.cloud.model.Lmmmgrl;

/*******************************************************************************
 * [処理概要] <blockquote>
 * 
 * 組織一覧画面処理部品（Service）
 * 
 * </blockquote>
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎 <br/>
 ******************************************************************************/
public  interface Lmm101Service {

	/**
     * 組織識別区分の検索
     * @param generalFlg 汎用区分
     * @return 処理結果
     **/
	public List<Lmmmgrl> findOrgKbn2_Sct(String lgustntcod,String generalFlg);
	
	/**
     * quallBy 組織一覧の検索処理
     * @param searchZone_Rdo  検索範囲
     * @param appOrgcod_Txt   申請組織コード
     * @param orgCode_Txt     組織コード
     * @param orgNam1_Txt     組織名１
     * @param orgKbn2_Sct     組織識別区分
     * @return 処理結果（List）
     **/
	public List<HashMap<String,String>> quallBy(String searchZone_Rdo, String appOrgcod_Txt, String orgCode_Txt, String orgNam1_Txt, String orgKbn2_Sct);
}
