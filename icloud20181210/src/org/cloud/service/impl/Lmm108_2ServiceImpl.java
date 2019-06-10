package org.cloud.service.impl;

import org.cloud.mapper.Lmm108_2Mapper;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm108_2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Lmm108_2ServiceImpl implements Lmm108_2Service{
	@Autowired
	Lmm108_2Mapper lmm108_2Mapper;
	
	@Override
	public int insertLmmmevtm(Lmmmevtm lmmmevtm) {
		int insertLmmmevtm = lmm108_2Mapper.insertLmmmevtm(lmmmevtm);
		return insertLmmmevtm;
	}

	@Override
	public int updateLmmmevtm(Lmmmevtm lmmmevtm) {
		int updateLmmmevtm = lmm108_2Mapper.updateLmmmevtm(lmmmevtm);
		return updateLmmmevtm;
	}

	@Override
	public Lmmmevtm selectOne(Lmmmevtm lmmmevtm) {
		Lmmmevtm selectOne = lmm108_2Mapper.selectOne(lmmmevtm);
		return selectOne;
	}

	@Override
	public Lmmmorg selectLmmmorg(String tntcod, String orgcod) {
		Lmmmorg selectLmmmorg = lmm108_2Mapper.selectLmmmorg(tntcod, orgcod);
		return selectLmmmorg;
	}

}
