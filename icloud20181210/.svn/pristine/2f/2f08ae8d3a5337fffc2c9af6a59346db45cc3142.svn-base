package org.cloud.service;

import java.util.Date;
import java.util.List;

import org.cloud.model.Lmm110Model;
import org.cloud.model.Lmmmorg;
import org.springframework.stereotype.Service;

/**
 * @作者 霍五星
 * @时间 2019/05/22 11:52:38
 * @位置 河南省郑州市高新区河南八六三软件园 
 * @用途
 */
@Service
public interface Lmm110Service {
	public Lmm110Model updateSelect(String tntcod, String itmcod, Date appstaymdhms);
	public int insert(Lmm110Model lmm110Model);
	public int update(Lmm110Model lmm110Model);
	public int checkItmcod(String tntcod, String itmcod, Date appstaymdhms);
	public int checkApporgcod(String tntcod, String apporgcod, Date appstaymdhms, Date appendymdhms);
	public List<Lmmmorg> selectOrg(String tntcod, String orgcod, String orgnam1);
}
