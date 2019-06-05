/**
 * @author         cqq 
 * @version        V1.0   
 */
package org.cloud.service.impl;

import static org.junit.Assert.*;

import org.cloud.dto.Lmm102DtoTo;
import org.cloud.model.Lmmmorg;
import org.cloud.service.Lmm102Service;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/** 
 * @ClassName:     Lmm102ServiceImplTest.java 
 * @Description:   TODO(用一句话描述该文件做什么)  
 *  
 * @author         cqq 
 * @version        V1.0   
 * @Date           2018年3月27日 上午11:30:19  
 */
public class Lmm102ServiceImplTest {

private static Lmm102Service lmm102Service;
	
	@BeforeClass
	public static void setUp() throws Exception {
		System.out.println("=======setUp==========");
		// 加载Spring配置文件
	    ApplicationContext app = new ClassPathXmlApplicationContext(new String[] {"classpath:*.xml"});
		//ApplicationContext app=new FileSystemXmlApplicationContext("file:E:/train_work/cloud/WebRoot\\WEB-INF\\applicationContext-*.xml");
		// 注入Lmm101Service
		lmm102Service = (Lmm102Service) app.getBean("lmm102ServiceImpl");
		
		System.out.println("========setUp=======end====");
		
		
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		System.out.println("========tearDown===========");
	}

	

	/**
	 * ケース１：
	 *  更新の初期化表示情報の処理
	 *  入力データ：
	 *   申請組織コード:1111112
     *  適用開始日:2017-02-23
     *   テナントコード ：01001006
     *   結果内容確認（あり）：
     *   　
	 */
	@Test
	public void testUpdateSelectOne() {
       
		
		
		Lmmmorg lmm = lmm102Service.updateSelect("1111112", "2019-02-17", "01001006");
		Assert.assertEquals("1111112", lmm.getOrgcod());
		
		
		
		
	}
	
	/**
	 * ケース２：
	 *  更新の初期化表示情報の処理
	 *  入力データ：
	 *   申請組織コード:1111112
     *  適用開始日:2017-02-23
     *   テナントコード ：01001006
     *   結果内容確認（なし）：
     *   　
	 */
	@Test
	public void testUpdateSelectTwo() {
		Lmmmorg lmm = lmm102Service.updateSelect("1111116", "2017-02-23", "01001009");
		Assert.assertNull(lmm);
	}
}
