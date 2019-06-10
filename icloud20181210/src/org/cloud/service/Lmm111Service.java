package org.cloud.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

/**    

*  @author :ZPH

*  @date 2019年5月24日 

*  @parameter:

*  @Explain 说明: 

*/
public interface Lmm111Service {
	public List<HashMap<String,String>> findLmm111( Integer searchScope_Rdo, String appOrgCode_Txt, String orgCode_Txt, String orgItmCode_Txt, String orgItmName_Txt, String tnocod_Txt );
}

