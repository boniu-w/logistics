package org.cloud.mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName:Slvb108Mapper
 * @Description:TODO
 * @author: hjk
 * @date:2019年5月28日 上午10:16:44
 * @Copyright:2019 258期第四小组 .All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface Slvb108Mapper {
	
	/**
	 * 
	 * @Title:query
	 * @Description:TODO  調査組織マットに関する情報
	 * @param:@param map
	 * @param:@return
	 * @return:List<Map<String,Object>>
	 * @throws:
	 */
	public List< Map< String, Object >> query( Map< String, String > map);
}
