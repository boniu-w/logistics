package org.cloud.mapper;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;

public interface Lmm108_2Mapper {
	
	//組織情報の新規処理
	public int insertLmmmevtm(Lmmmevtm lmmmevtm);
	//組織情報の更新処理
	public int updateLmmmevtm(Lmmmevtm lmmmevtm);
	//二重登録チェック
	public Lmmmevtm selectOne(Lmmmevtm lmmmevtm);
	//申請組織コードが組織マスタに未登録の場合（申請組織コードが入力されている場合のみ） 
	public Lmmmorg selectLmmmorg(@Param(value="tntcod") String tntcod,@Param(value="orgcod")String orgcod);
	
}
