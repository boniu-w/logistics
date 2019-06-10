package org.cloud.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.LmmmgrlLmm105;

public interface Lmm105Service {

	/*
	 *1   初期処理 ---  ログアウト
	 */
public  List<LmmmgrlLmm105> findAllLmm105(String tntcod) throws Exception;
	


/*
 * 2   イベント一覧検索処理
 * 
 * @Param apporgcod   申請組織コード
 * @Param  gnrprpcod  汎用コード
 * @Param   aboflg      アラート区分    
 * @Param   codoutcod  イベント種別区分
 * @Param   gnrprpnam1  汎用名１
 * @Param   gnrprpnam2  汎用名２
 */

public 	List <HashMap<String, String>> findByLmm105(
        @Param("tntcod")String tntcod,
        @Param("apporgcod")String apporgcod,
        @Param("gnrprpcod")String gnrprpcod,
        @Param("aboflg")String aboflg,
        @Param("codoutcod")String codoutcod,
         @Param("gnrprpnam1")String gnrprpnam1,
          @Param("gnrprpnam2")String gnrprpnam2)	 throws Exception;
       


        //新規処理
        public int insert(LmmmgrlLmm105 lmg);
   	 
   	 
    	//変更ボタン
    	 public int upDate(LmmmgrlLmm105 lmg);
        
        
        
}
