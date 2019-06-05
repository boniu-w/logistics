package org.cloud.service;

import java.util.List;

import org.cloud.model.Lmmmgrl;
import org.cloud.model.Lmmmorg;
/*******************************************************************************
 * [処理概要] 
 * 
 * 組織メンテナンスモジュール、新規機能と更新機能の処理を行う
 * 
 * service
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎 <br/>
 ******************************************************************************/
public  interface Lmm102Service {
	
	/** 
	 * 
     * 更新の初期化表示情報の処理
     * 
     * @param sr 申請組織コード
     * @param st 適用開始日
     * @param tntcod テナントコード
     * 
     * @return Lmm102DtoTo
     **/
	public Lmmmorg updateSelect(String orgcod,String appstaymdhms, String tntcod);
	
	/** 
     * 区分リストの作成
     * 
     * @param lgustntcod ログインユーザのテナントコード
     * @return List
     **/
	public List<Lmmmgrl> selectFind(String lgustntcod,String generalFlg);
	
	/** 
     * 組織情報の新規処理
     * 
     * @param Lmmmorg 組織情報
     * @return null
     **/
	public int insert(Lmmmorg lmmmorg);
	
	/** 
     * 組織情報の更新処理
     * 
     * @param Lmmmorg 組織情報
     * @return null
     **/
	public int upDate(Lmmmorg lmmmorg);

	
	/**
	 * 组织code二重登录验证
	 * @param orgCodeVal
	 * @param tntcod 
	 */
	public int checkOrgCode(String orgCodeVal, String tntcod);
}
