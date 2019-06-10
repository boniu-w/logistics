package org.cloud.service.impl;

import org.cloud.mapper.Lmm108Mapper;
import org.cloud.model.Lmmmevtm;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm108Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Lmm108ServiceImpl implements Lmm108Service {
	@Autowired
	Lmm108Mapper lmm108Mapper;
	@Override
	public Lmmmevtm selectOne( Lmmmevtm lmmmevtm) {
		// TODO Auto-generated method stub
		return lmm108Mapper.selectOne( lmmmevtm );
	}

	@Override
	public int add( Lmmmevtm lmmmevtm) {
		// TODO Auto-generated method stub
		return lmm108Mapper.insert( lmmmevtm );
	}

	@Override
	public int update( Lmmmevtm lmmmevtm ) {
		// TODO Auto-generated method stub
		return lmm108Mapper.update( lmmmevtm );
	}

	@Override
	public Lmmmorg selectLmmmorg( String tntcod, String orgcod ) {
		// TODO Auto-generated method stub
		return lmm108Mapper.selectLmmmorg( tntcod, orgcod );
	}

}
