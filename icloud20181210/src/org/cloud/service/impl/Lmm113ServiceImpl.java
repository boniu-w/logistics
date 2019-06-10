package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;

import org.cloud.mapper.Lmm113Mapper;
import org.cloud.model.Lmmmplc;
import org.cloud.service.Lmm113Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 李青阳

* @version 创建时间：2019年5月23日 下午9:49:30 

* 类说明 

*/
@Service
public class Lmm113ServiceImpl implements Lmm113Service{

	@Autowired
	private Lmm113Mapper lmm113Mapper;
	

	/**
	 * searchScope_Rdo  検索範囲
	 * appOrgCode_Txt   申請組織コード
	 * plcCode_Txt      場所コード
	 * plcName_Txt      場所名１
	 */
		
	public List<HashMap<String, String>> quallByy(Integer searchScope_Rdo, String appOrgCode_Txt, String plcCode_Txt,
			String plcName_Txt,String aboflg) {
				
		return lmm113Mapper.quallByy(searchScope_Rdo, appOrgCode_Txt, plcCode_Txt, plcName_Txt,aboflg);
	}

	
	
	
	
}
