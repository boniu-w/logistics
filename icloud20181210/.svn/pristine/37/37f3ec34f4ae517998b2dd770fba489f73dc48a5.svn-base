package org.cloud.mapper;
 
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmgrl;
import org.cloud.model.Lmmmorg;

/*******************************************************************************
 * [処理概要] 
 * 
 * 組織メンテナンスモジュール、新規機能と更新機能の処理を行う
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎 <br/>
 ******************************************************************************/
public interface Lmm102Mapper {

	/**
	 * 更新の初期化表示情報の処理
	 * @param orgcod
	 * @param appstaymdhms
	 * @param tntcod
	 * @return
	 */
    public Lmmmorg updateSelect(@Param("orgcod") String orgcod,@Param("appstaymdhms") String appstaymdhms,@Param("tntcod")  String tntcod);
    
    /**
     * 区分リストの作成
     * @param lgustntcod
     * @param generalFlg
     * @return
     */
    public List<Lmmmgrl> selectFind(@Param("lgustntcod") String lgustntcod, @Param("generalFlg") String generalFlg);
    
    /**
     * insert 組織情報の新規処理
     * @param lmmmorg
     * @return
     */
    public int insert(Lmmmorg lmmmorg);
    
    /**
     * upDate 組織情報の更新処理
     * @param lmmmorg
     * @return
     */
    public int upDate(Lmmmorg lmmmorg);

    
    /**
     * 组织code二重登录验证
     * @param orgCodeVal
     * @param tntcod
     */
	public int checkOrgCode(@Param("orgCodeVal") String orgCodeVal, @Param("tntcod") String tntcod);
}
