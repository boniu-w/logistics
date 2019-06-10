/**
 * 
 */
package org.cloud.service.impl;

import java.util.List;

import org.cloud.mapper.Lmm119Mapper;
import org.cloud.model.Lmmmtrkg2;
import org.cloud.service.Lmm119Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author 著者:车健豪
* @createDate 時間を作る:2019年5月24日下午12:05:50
* @version バージョン: 1.0
* @Explain 说明: 119-一览表示
*/
@Service
public class Lmm119ServiceImpl implements Lmm119Service{

	// Lmm119Daoの注入
		@Autowired
		private Lmm119Mapper lmm119Mapper;
	
	/**
	 * 	照会データ
	 */
	@Override
	public List<Lmmmtrkg2> seleteTransportData(Lmmmtrkg2 lmmmtrkg2) {

		String tntcod = lmmmtrkg2.getTntcod();
		String aboflg = lmmmtrkg2.getAboflg();
		String trkgrpnam = lmmmtrkg2.getTrkgrpnam();
		String trkgrpcod = lmmmtrkg2.getTrkgrpcod();
		String apporgcod = lmmmtrkg2.getApporgcod();	
		
		return lmm119Mapper.seleteTransportData(tntcod, aboflg, trkgrpnam, trkgrpcod, apporgcod);
	}

}
