package org.cloud.service.impl;

import java.util.Date;
import java.util.List;

import org.cloud.dto.Lmm112Dto;
import org.cloud.dto.Lmm112Dtor;
import org.cloud.mapper.Lmm112Mapper;
import org.cloud.model.Llmmmorgitm;
import org.cloud.model.Lmmmitm;
import org.cloud.model.Lmmmorg;
import org.cloud.model.Lmmmorgitm;

import org.cloud.service.Lmm112Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 *@author: lr
 *@createdate:2019/05/22 19:14:46
 *@Explain： 
 *@Tel:
 */
@Service
public class Lmm112ServiceImpl implements Lmm112Service {
    
    //　Lmm112Mapperの注入
    @Autowired
    private Lmm112Mapper lmm112Mapper;
    
    //組織コード　セレクトリストの作成
    @Override
	public List<Lmmmorgitm> orgSelect(Llmmmorgitm llmmmorgitm) {
		
		return lmm112Mapper.orgSelect(llmmmorgitm);
	}
    
    
    @Override
	public int addCheckDate(Date datestar, Date datend) {
    	
		return lmm112Mapper.addCheckDate(datestar, datend);
	}

    //新規二重チェック
    @Override
	public int addCheck(Lmmmorgitm lmmmorgitm) {
    	int addCheck = lmm112Mapper.addCheck(lmmmorgitm);
		return addCheck;
	}
    
    //組織コードが組織マスタに未登録の場合
    @Override
	public int orgCodCheck(Lmmmorg lmmmorg) {
    	int orgcodCheck = lmm112Mapper.orgCodCheck(lmmmorg);
		return orgcodCheck;
	}
   
    //申請組織コードが組織マスタに未登録の場合
    @Override
	public int appOrgCodCheck(Lmmmorg lmmmorg) {
    	int appOrgCodCheck = lmm112Mapper.appOrgCodCheck(lmmmorg);
		return appOrgCodCheck;
	}
    
	//更新初期化
	@Override
	public Lmm112Dtor updateSelect(Lmmmorgitm lmmmorgitm) {
		
		return lmm112Mapper.updateSelect(lmmmorgitm);
	}
	
	//新规add
	@Override
	public int add(Lmmmorgitm lmmmorgitm) {
		
		return lmm112Mapper.add(lmmmorgitm);
	}

	//更新update
	@Override
	public int update(Lmmmorgitm lmmmorgitm) {
		
		return lmm112Mapper.update(lmmmorgitm);
	}


	//商品名取得
	@Override
	public Lmmmitm findItmName(String itmCode) {
		return lmm112Mapper.findItmName(itmCode);
		
	}

	

	//更新回数排他制御
	@Override
	public Lmmmorgitm updeac(Lmmmorgitm lmmmorgitm) {
		
		return lmm112Mapper.updeac(lmmmorgitm);
	}

	
	
	
	

	


	

	

	
	

		/*@Override
		public Lmmmorg findAppOrgName(String appOrgCode) {
			return lmm112Mapper.findAppOrgName(appOrgCode);
			
		}
       */
	
	

	
}
