package org.cloud.service.impl;

import java.util.List;
import org.Constants;
import org.apache.ibatis.annotations.Param;
import org.cloud.dto.GcLmmmplcDto;
import org.cloud.mapper.Lmm114Mapper;
import org.cloud.model.GcLmmmco;
import org.cloud.model.GcLmmmorg;
import org.cloud.model.GcLmmmplc;
import org.cloud.model.GcLmmmtmz;
import org.cloud.model.GcLmmmy;
import org.cloud.model.Lmmmplc;
import org.cloud.service.Lmm114Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
* @author 作者：GC
* @createDate 创建时间：2019年5月22日下午1:03:17
* @version 版本：
* @Explain 说明：findLmmplcInfoByTntcodAndPlccod serviceImpl
* @Email 邮箱：
 */
@Service
public class Lmm114ServiceImpl extends BaseController implements Lmm114Service {
	
	//Lmm114Mapper注入
	@Autowired 
	Lmm114Mapper lmm114Mapper;
	
	/**
	 *
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:21
	 * @version 版本:
	 * @Explain 说明: 根据主键查询Lmmplc数据
	 * @Email 邮箱:
	 */
	@Override
	public GcLmmmplc findLmmplcInfoByTntcodAndPlccod(GcLmmmplc gclmmmplc) {
		
		return lmm114Mapper.findLmmplcInfoByTntcodAndPlccod(gclmmmplc);
		
	}
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:34
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmco数据
	 * @Email 邮箱:
	 */
	@Override
	public List<GcLmmmco> findLmmplcAllGcLmmmcoInfo() {
		
		return lmm114Mapper.findLmmplcAllGcLmmmcoInfo();
	}
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:54
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmtmz数据
	 * @Email 邮箱:
	 */
	@Override
	public List<GcLmmmtmz> findLmmplcAllGcLmmmtmzInfo(String aboflg) {
		
		return lmm114Mapper.findLmmplcAllGcLmmmtmzInfo(aboflg);
	}
	
	/** 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:15:03
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmplcDto数据
	 * @Email 邮箱:
	 */
	@Override
	public GcLmmmplcDto findLmmplcDtoInfoByTntcodAndPlccod(GcLmmmplc gclmmmplc) {
		
		return lmm114Mapper.findLmmplcDtoInfoByTntcodAndPlccod(gclmmmplc);
	}
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:15:49
	 * @version 版本:
	 * @Explain 说明:新规验证
	 * @Email 邮箱:
	 */
	@Override
	public int yanZhengXingui(@Param("plccod") String plccod /*,@Param("apporgcod")String apporgcod*/) {
		//创建实体类
		GcLmmmy gcLmmmy = new GcLmmmy();
		//废止0
		@SuppressWarnings({ "unused", "static-access" })
		String aboflg = new Constants().ABOFLG_OFF;
		
		//模拟测试数据对象
    	gcLmmmy.setTntcod("000");
    	gcLmmmy.setPlccod(plccod);
    	
    	System.err.println(gcLmmmy+"gcLmmmy");
    	
    	int yanZ = lmm114Mapper.yanZhengXingui(gcLmmmy);
    	
		return yanZ;

	}
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:14
	 * @version 版本:
	 * @Explain 说明:新规	
	 * @Email 邮箱:
	 */
	@Override
	public int Xingui(Lmmmplc lmmmplc) {
		
		return lmm114Mapper.Xingui(lmmmplc);
	}
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:14
	 * @version 版本:
	 * @Explain 说明:更新验证	
	 * @Email 邮箱:
	 */
	@Override
	public int GengxinYanZ(GcLmmmorg gcLmmmorg) {
		return lmm114Mapper.GengxinYanZ(gcLmmmorg);
	}
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:22
	 * @version 版本:
	 * @Explain 说明:更新回数验证
	 * @Email 邮箱:
	 */
	@Override
	public GcLmmmplc Gengxin(GcLmmmplc gcLmmmplc) {
		
		return lmm114Mapper.Gengxin(gcLmmmplc);
	}
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:32
	 * @version 版本:
	 * @Explain 说明:更新
	 * @Email 邮箱:
	 */
	@Override
	public int Gengxinj(Lmmmplc lmmmplc) {
		
		return lmm114Mapper.Gengxinj(lmmmplc);	
	}
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午11:19:24
	 * @version 版本:
	 * @Explain 说明:新规验证
	 * @Email 邮箱:
	 */
	@Override
	public int yanZhengXinguis(GcLmmmy gcLmmmy) {
		
		return lmm114Mapper.yanZhengXinguis(gcLmmmy);
	}
	
}
