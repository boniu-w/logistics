package org.cloud.mapper;

import java.util.HashMap;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmgrl;

/*******************************************************************************
 * [処理概要] <blockquote>
 * 
 * 組織一覧画面処理部品（Dao）
 * 
 * </blockquote>
 *
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎 <br/>
 ******************************************************************************/
public interface Lmm101Mapper{
	
	/**
	 * 組織識別区分リスト作成処理
	 * @param lgustntcod
	 * @param generalFlg
	 * @return
	 */
	public List<Lmmmgrl> findOrgKbn2_Sct(@Param("lgustntcod") String lgustntcod,@Param("generalFlg") String generalFlg);
	
	/**
     * quallBy 組織一覧の検索処理
     * @param searchZone_Rdo  検索範囲
     * @param appOrgcod_Txt   申請組織コード
     * @param orgCode_Txt     組織コード
     * @param orgNam1_Txt     組織名１
     * @param orgKbn2_Sct     組織識別区分
     * @return 処理結果（List）
     **/
	public List<HashMap<String,String>> quallBy101(@Param("searchZone_Rdo") String searchZone_Rdo,@Param("appOrgcod_Txt") String appOrgcod_Txt,@Param("orgCode_Txt") String orgCode_Txt,@Param("orgNam1_Txt") String orgNam1_Txt,@Param("orgKbn2_Sct") String orgKbn2_Sct);
}
