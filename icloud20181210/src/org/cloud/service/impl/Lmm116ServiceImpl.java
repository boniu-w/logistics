package org.cloud.service.impl;

import java.util.List;

import org.cloud.mapper.Lmm116Mapper;
import org.cloud.model.Lmmmgrl;
import org.cloud.service.Lmm116Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
* @author: 王卫兵 
* @date: 2019/05/31--15:03:44
* @Description: 
* @version:
 */
@Service
public class Lmm116ServiceImpl implements Lmm116Service{
	
	@Autowired
		private Lmm116Mapper lmm116Mapper;
	@Override
	public List<Lmmmgrl> selectFind(String lgustntcod) {
		List<Lmmmgrl> selectFind = lmm116Mapper.selectFind(lgustntcod);
		return selectFind;
	}
	@Override
	public int insert(Lmmmgrl lmmmgrl) {
		int insert = lmm116Mapper.insert(lmmmgrl);
		return insert;
	}
	@Override
	public int check(Lmmmgrl lmmmgrl) {
		int check = lmm116Mapper.check(lmmmgrl);
		return check;
	}
	@Override
	public Lmmmgrl Pupdate(Lmmmgrl lmmmgrl) {
		Lmmmgrl pupdate = lmm116Mapper.Pupdate(lmmmgrl);
		return pupdate;
	}
	@Override
	public int update(Lmmmgrl lmmmgrl) {
		int update = lmm116Mapper.update(lmmmgrl);
		return update;
	}

}
