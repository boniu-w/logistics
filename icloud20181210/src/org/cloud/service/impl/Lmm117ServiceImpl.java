package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;

import org.cloud.mapper.Lmm117Mapper;
import org.cloud.model.Lmm117ResultType;
import org.cloud.service.Lmm117Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*@author WG
*@date 2019年5月23日 上午11:49:41
*/
@Service
public class Lmm117ServiceImpl implements Lmm117Service{
	
	@Autowired
	Lmm117Mapper lmm117Mapper;
	
	/**
	 * 查询操作
	 */
	@Override
	public List<Lmm117ResultType> findSomeField(HashMap<String, String> hashMap) {
		List<Lmm117ResultType> findSomeField = lmm117Mapper.findSomeField(hashMap);
		return findSomeField;
	}

	@Override
	public List<HashMap<String, Object>> findAll() {
		 List<HashMap<String, Object>> findAll = lmm117Mapper.findAll();
		return findAll;
	}

}
