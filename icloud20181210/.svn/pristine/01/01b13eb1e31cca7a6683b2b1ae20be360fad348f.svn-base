package org.cloud.service.impl;

import java.util.List;

import org.cloud.mapper.Slvb116Mapper;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Slvb116Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Slvb116ServiceImpl implements Slvb116Service {
	@Autowired
		Slvb116Mapper slvb116Mapper;
	@Override
	public List<Lmmmorg> query(Lmmmorg lmmmorg) {
		List<Lmmmorg> query = slvb116Mapper.query(lmmmorg);
		return query;
	}

}
