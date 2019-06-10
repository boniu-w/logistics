package org.cloud.mapper;



import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.dto.Lmm112Dto;
import org.cloud.dto.Lmm112Dtor;
import org.cloud.model.Llmmmorgitm;
import org.cloud.model.Lmmmitm;
import org.cloud.model.Lmmmorg;
import org.cloud.model.Lmmmorgitm;


public interface Lmm112Mapper {
	
	/**
	 *  組織コードのセレクトリストを作成する
	 * @param 
	 * @return
	 */
    public List<Lmmmorgitm> orgSelect(Llmmmorgitm llmmmorgitm);
    
    /**
          * 登録の結果、処理日時点の有効データが存在しなくなる場合、ウォーニング（更新はする）
     * @param datestar
     * @param datend
     * @return
     */
    public int addCheckDate(@Param("datestar")Date datestar, @Param("datend")Date datend);
    
    /**
          * 新規二重チェック
     * @param lmmmorgitm
     * @return
     */
    public int addCheck(Lmmmorgitm lmmmorgitm);
    
    /**
          * 組織コードが組織マスタに未登録の場合
     * @param lmmmorg
     * @return
     */
    public int orgCodCheck(Lmmmorg lmmmorg);
	
    /**
          * 申請組織コードが組織マスタに未登録の場合
     * @param lmmmorg
     * @return
     */
    public int appOrgCodCheck(Lmmmorg lmmmorg);
    
	 /**
	    *更新初期化--引き継い情報で各項目を検索して表示する
	  * 
	  */
    public Lmm112Dtor updateSelect(Lmmmorgitm lmmmorgitm);

    /**
     * add  新規処理
     * @param lmmmorgitm
     * @return
     */
    public int add (Lmmmorgitm lmmmorgitm);

    /**
     * update 更新処理
     * @param lmmmorgitm
     * @return
     */
    public int update (Lmmmorgitm lmmmorgitm);
    
    
   /**
        * 商品名取得
    * @param itmCode
    * @return
    */
    public Lmmmitm findItmName(@Param("itmCode") String itmCode); 
   
    
    /**
          * 排他制御
     * @param lmmmorgitm
     * @return
     */
    public Lmmmorgitm updeac(Lmmmorgitm lmmmorgitm);


}
