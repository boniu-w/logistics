package org.cloud.service.impl;

import java.util.List;
import java.util.Map;

import org.cloud.mapper.Slvb108Mapper;
import org.cloud.mapper.Slvb704Mapper;
import org.cloud.service.Slvb108Service;
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
public class Slvb108ServiceImpl implements Slvb108Service {

	@Autowired
	Slvb108Mapper slvb108Mapper;
	@Override
	public List< Map< String, Object >> query( Map< String, String > map) {
		return slvb108Mapper.query( map );
	}

}
