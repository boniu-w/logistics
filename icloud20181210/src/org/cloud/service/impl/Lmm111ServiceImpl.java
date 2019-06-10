package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;
import org.cloud.mapper.Lmm111Mapper;
import org.cloud.service.Lmm111Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**    

*  @author :ZPH

*  @date 2019年5月24日 

*  @parameter:

*  @Explain 说明: 

*/
@Service
public class Lmm111ServiceImpl implements Lmm111Service{
    
	@Autowired
	
	private Lmm111Mapper lmm111Mapper;
  
	@Override
	public List<HashMap<String, String>> findLmm111(Integer searchScope_Rdo, String appOrgCode_Txt, String orgCode_Txt,
			String orgItmCode_Txt, String orgItmName_Txt, String tnocod_Txt) {
	
		return lmm111Mapper.findLmm111(searchScope_Rdo, appOrgCode_Txt, orgCode_Txt, orgItmCode_Txt, orgItmName_Txt, tnocod_Txt);
	}
	
	
	

}

