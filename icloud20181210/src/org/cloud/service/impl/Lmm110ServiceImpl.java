package org.cloud.service.impl;

import java.util.Date;
import java.util.List;

import org.cloud.mapper.Lmm110Mapper;
import org.cloud.model.Lmm110Model;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm110Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @作者 霍五星
 * @时间 2019/05/22 11:53:15
 * @位置 河南省郑州市高新区河南八六三软件园 
 * @用途
 */
@Service
public class Lmm110ServiceImpl implements Lmm110Service{
	@Autowired
	Lmm110Mapper mapper;
	
	@Override
	public Lmm110Model updateSelect(String tntcod, String itmcod, Date appstaymdhms) {
		Lmm110Model lmm110Model = mapper.updateSelect(tntcod, itmcod, appstaymdhms);
		return lmm110Model;
	}
	
	@Override
	public int insert(Lmm110Model lmm110Model) {
		int insert = mapper.insert(lmm110Model);
		return insert;
	}
	
	@Override
	public int update(Lmm110Model lmm110Model) {
		int update = mapper.update(lmm110Model);
		return update;
	}

	@Override
	public int checkItmcod(String tntcod, String itmcod, Date appstaymdhms) {
		int insertSelect = mapper.checkItmcod(tntcod, itmcod, appstaymdhms);
		return insertSelect;
	}

	@Override
	public int checkApporgcod(String tntcod, String apporgcod, Date appstaymdhms,
			Date appendymdhms) {
		int checkApporgcod = mapper.checkApporgcod(tntcod, apporgcod, appstaymdhms, appendymdhms);
		return checkApporgcod;
	}

	@Override
	public List<Lmmmorg> selectOrg(String tntcod, String orgcod, String orgnam1) {
		List<Lmmmorg> orgs = mapper.selectOrg(tntcod, orgcod, orgnam1);
		return orgs;
	}

}
