package org.cloud.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.model.Lmmmgrl;

/**    

*  @author :ZPH

*  @date 2019年5月23日 

*  @parameter:

*  @Explain 说明: 

*/
public interface Lmm111Mapper {
	
	public List<HashMap<String,String>> findLmm111(@Param("searchScope_Rdo") Integer searchScope_Rdo, @Param("appOrgCode_Txt") String appOrgCode_Txt, @Param("orgCode_Txt") String orgCode_Txt, @Param("orgItmCode_Txt") String orgItmCode_Txt, @Param("orgItmName_Txt") String orgItmName_Txt, @Param("tnocod_Txt") String tnocod_Txt);
}

