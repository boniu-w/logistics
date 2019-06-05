package org.cloud.service.impl;

import java.util.List;
import java.util.Map;

import org.cloud.mapper.Slvb704Mapper;
import org.cloud.service.Slvb704Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*******************************************************************************
 * [処理概要] 
 * 
 * 組織コード/名称を検索し、呼び出し元画面に引き渡す。
 * 
 * @author ソフトウェア事業本部
 * @version 01.00 2018/11/29 新規作成 
 ******************************************************************************/
@Service
public class Slvb704ServiceImpl implements Slvb704Service {

	@Autowired
	Slvb704Mapper slvb704Mapper;
	@Override
	public List<Map<String, Object>> query(Map<String, Object> map) {
		return slvb704Mapper.query(map);
	}

}
