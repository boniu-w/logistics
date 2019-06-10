package org.cloud.mapper;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;

public interface Lmm108Mapper {
	
	/**
	 * 
	 * @Title:insert
	 * @Description:TODO イベン集计マスタ表に情报を追加します
	 * @param:@param lmmmevtm
	 * @param:@return
	 * @return:int
	 * @throws:
	 */
	public int insert( Lmmmevtm lmmmevtm);
	
	/**
	 * 
	 * @Title:update
	 * @Description:TODO イベント集计マスタ表の情报を更新します。
	 * @param:@param lmmmevtm
	 * @param:@return
	 * @return:int
	 * @throws:
	 */
	public int update( Lmmmevtm lmmmevtm);
	
	/**
	 * 
	 * @Title:selectOne
	 * @Description:TODO イベン集计マスタ表の情报を调べます。
	 * @param:@param lmmmevtm
	 * @param:@return
	 * @return:Lmmmevtm
	 * @throws:
	 */
	public Lmmmevtm selectOne( Lmmmevtm lmmmevtm);
	
	/**
	 * 
	 * @Title:selectLmmmorg
	 * @Description:TODO アンケート組織「マステーブル」の情報
	 * @param:@param tntcod
	 * @param:@param orgcod
	 * @param:@return
	 * @return:Lmmmorg
	 * @throws:
	 */
	public Lmmmorg selectLmmmorg(@Param( value="tntcod") String tntcod, @Param(value="orgcod") String orgcod);
	
}
