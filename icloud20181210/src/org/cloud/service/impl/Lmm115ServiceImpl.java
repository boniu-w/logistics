package org.cloud.service.impl;

import java.util.HashMap;
import java.util.List;

import org.cloud.mapper.Lmm115Mapper;
import org.cloud.model.Lmmmgrl;
import org.cloud.service.Lmm115Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Lmm115ServiceImpl implements Lmm115Service {

	@Autowired
	private Lmm115Mapper lmm115Mapper;

	/**
	 * 凡用区分下拉列表
	 */
	@Override
	public List<Lmmmgrl> findGnrprpKbn_Sct(String grltntcod) {

		return lmm115Mapper.findGnrprpKbn_Sct(grltntcod);
	}

	/**
	 * 凡用表一览
	 */

	@Override
	public List<HashMap<String, String>> findTable115(String grltntcod, String searchScope_Rdo, String appOrgCode_Txt,
			String gnrprpKbn_Sct, String gnrprpKbnName_Txt, String gnrprpCode_Txt, String gnrprpName1_Txt) {

		return lmm115Mapper.findTable115(grltntcod, searchScope_Rdo, appOrgCode_Txt, gnrprpKbn_Sct, gnrprpKbnName_Txt,
				gnrprpCode_Txt, gnrprpName1_Txt);
	}

}
