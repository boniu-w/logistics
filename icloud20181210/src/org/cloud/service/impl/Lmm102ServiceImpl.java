package org.cloud.service.impl;

import java.util.List;

import org.cloud.mapper.Lmm102Mapper;
import org.cloud.model.Lmmmgrl;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm102Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*******************************************************************************
 * [処理概要] 
 * 
 * 組織メンテナンスモジュール、新規機能と更新機能の処理を行う
 * 
 * serviceImpl
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2017/10/12 新規作成 太郎 <br/>
 ******************************************************************************/
@Service
public class Lmm102ServiceImpl implements Lmm102Service {
    
    //　Lmm102Mapperの注入
    @Autowired
    private Lmm102Mapper lmm102Mapper;
    
    /** 
     * 更新の初期化表示情報の処理
     * 
     * @param sr 申請組織コード
     * @param st 適用開始日
     * @param tntcod テナントコード
     * 
     * @return Lmm102DtoTo
     **/
    public Lmmmorg updateSelect(String orgcod,String appstaymdhms, String tntcod) {
        
        return lmm102Mapper.updateSelect(orgcod, appstaymdhms, tntcod);
    }

    
    /** 
     * 区分リストの作成
     * 
     * @param lgustntcod ログインユーザのテナントコード
     * @return List
     **/
    public List<Lmmmgrl> selectFind(String lgustntcod,String generalFlg) {
        
        return lmm102Mapper.selectFind(lgustntcod,generalFlg);
    }
    
    /** 
     * 組織情報の新規処理
     * 
     * @param Lmmmorg 組織情報
     * @return null
     **/
    public int insert(Lmmmorg lmmmorg) {
        
        return lmm102Mapper.insert(lmmmorg);
    }
    
    /** 
     * 組織情報の更新処理
     * 
     * @param Lmmmorg 組織情報
     * @return null
     **/
    public int upDate(Lmmmorg lmmmorg){
        
        return lmm102Mapper.upDate(lmmmorg);
    }


    /**
     * 组织code二重登录验证
     */
	@Override
	public int checkOrgCode(String orgCodeVal, String tntcod) {
		
		return lmm102Mapper.checkOrgCode(orgCodeVal,tntcod);
		
		
	}
}
