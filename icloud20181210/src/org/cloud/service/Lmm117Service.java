package org.cloud.service;

import java.util.HashMap;
import java.util.List;

import org.cloud.model.Lmm117ResultType;

/**
*@author WG
*@date 2019年5月23日 上午11:49:19
*/
public interface Lmm117Service {
	
	public List<Lmm117ResultType> findSomeField(HashMap<String,String> hashMap);
	public List<HashMap<String, Object>> findAll();

}
