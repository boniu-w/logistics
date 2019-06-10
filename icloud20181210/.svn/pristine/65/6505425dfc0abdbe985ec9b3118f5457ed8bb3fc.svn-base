package org.cloud.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmm110Model;
import org.cloud.model.Lmmmorg;

/**
 * @作者 霍五星
 * @时间 2019/05/22 16:27:20
 * @位置 河南省郑州市高新区河南八六三软件园 
 * @用途
 */
public interface Lmm110Mapper {
	/**
	 * 更新前のクエリー
	 * @param tntcod
	 * @param itmcod
	 * @param appstaymdhms
	 * @return
	 */
	public Lmm110Model updateSelect(@Param("tntcod")String tntcod,@Param("itmcod")String itmcod,@Param("appStaymdhms")Date appstaymdhms);
	
	/**
	 * 追加の操作
	 * @param lmmmitm
	 * @return
	 */
	public int insert(Lmm110Model lmm110Model);
	
	/**
	 * 更新の操作
	 * @param lmmmitm
	 * @return
	 */
	public int update(Lmm110Model lmm110Model);
	
	/**
	 * 商品コードが存在するかどうかを判断する
	 * @param tntcod
	 * @param itmcod
	 * @param appstaymdhms
	 * @return
	 */
	public int checkItmcod(@Param("tntcod")String tntcod,@Param("itmcod")String itmcod,@Param("appStaymdhms")Date appStaymdhms);
	
	/**
	 * 申請組織コードが存在するかどうかを判断する
	 * @param tntcod
	 * @param apporgcod
	 * @param appstaymdhms
	 * @param appendymdhms
	 * @return
	 */
	public int checkApporgcod(@Param("tntcod")String tntcod,@Param("apporgcod")String apporgcod,
			@Param("appStaymdhms")Date appstaymdhms,@Param("appEndymdhms")Date appendymdhms);
	
	/**
	 * 組織IDに基づいて組織名を検索する
	 * @param tntcod
	 * @param orgcod
	 * @param orgnam1
	 * @return
	 */
	public List<Lmmmorg> selectOrg(@Param("tntcod")String tntcod,@Param("orgcod")String orgcod,@Param("orgnam1")String orgnam1);
}
