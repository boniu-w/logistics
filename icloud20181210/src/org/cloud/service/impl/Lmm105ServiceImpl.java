package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;

import org.cloud.mapper.Lmm105Mapper;
import org.cloud.model.LmmmgrlLmm105;
import org.cloud.service.Lmm105Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Lmm105ServiceImpl implements Lmm105Service{

	@Autowired
	private  Lmm105Mapper  lmm105Mapper;
	
	//1   初期処理
	
	@Override
	public List<LmmmgrlLmm105> findAllLmm105(String tntcod) throws Exception {
		
		return lmm105Mapper.findAllLmm105(tntcod);
	}

	
	
	
	/*
	 * 2   イベント一覧検索処理
	 * 
	 * @Param apporgcod   申請組織コード
	 *  @Param  gnrprpcod  汎用コード
	 *  @Param   gnrprpnam1  汎用名１
	 *  @Param   gnrprpnam2  汎用名２
	 */
	
	/*@Override
	public List<LmmmgrlLmm105> findByLmm105(String apporgcod, String gnrprpcod, String gnrprpnam) {
		
		return lmm105Service.findByLmm105(apporgcod, gnrprpcod, gnrprpnam);
	}*/

	@Override
	public List<HashMap<String, String>> findByLmm105(String tntcod, String apporgcod, String gnrprpcod, String aboflg,
			String codoutcod, String gnrprpnam1, String gnrprpnam2) throws Exception {
		 
		List <HashMap<String, String>>  lmm105Ser= lmm105Mapper.findByLmm105(tntcod, apporgcod, gnrprpcod, aboflg, codoutcod, gnrprpnam1, gnrprpnam2);
		return lmm105Ser;
	}




	@Override
	public int insert(LmmmgrlLmm105 lmg) {
		 
		return lmm105Mapper.insert(lmg);
	}




	@Override
	public int upDate(LmmmgrlLmm105 lmg) {
		 
		return lmm105Mapper.upDate(lmg);
	}











	
	
}
