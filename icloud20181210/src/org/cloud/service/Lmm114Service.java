package org.cloud.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.cloud.dto.GcLmmmplcDto;
import org.cloud.model.GcLmmmco;
import org.cloud.model.GcLmmmorg;
import org.cloud.model.GcLmmmplc;
import org.cloud.model.GcLmmmtmz;
import org.cloud.model.GcLmmmy;
import org.cloud.model.Lmmmplc;

/**
 * 
* @author 作者：GC
* @createDate 创建时间：2019年5月22日下午1:02:36
* @version 版本：
* @Explain 说明：findLmmplcInfoByTntcodAndPlccod service
* @Email 邮箱：
 */
public interface Lmm114Service {
	
	/**
	 *
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:21
	 * @version 版本:
	 * @Explain 说明: 根据主键查询Lmmplc数据
	 * @Email 邮箱:
	 */
	public GcLmmmplc findLmmplcInfoByTntcodAndPlccod(GcLmmmplc gclmmmplc);
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:34
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmco数据
	 * @Email 邮箱:
	 */
	public  List<GcLmmmco> findLmmplcAllGcLmmmcoInfo();
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:14:54
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmtmz数据
	 * @Email 邮箱:
	 */
	public  List<GcLmmmtmz> findLmmplcAllGcLmmmtmzInfo(String aboflg);
	
	/** 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:15:03
	 * @version 版本:
	 * @Explain 说明:查询GcLmmmplcDto数据
	 * @Email 邮箱:
	 */
	public GcLmmmplcDto findLmmplcDtoInfoByTntcodAndPlccod(GcLmmmplc gclmmmplc);
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:15:49
	 * @version 版本:
	 * @Explain 说明:新规验证
	 * @Email 邮箱:
	 */
	public int yanZhengXingui(@Param("plccod") String plccod /*,@Param("apporgcod")String apporgcod*/);	
	/**
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:02
	 * @version 版本:
	 * @Explain 说明:新规
	 * @Email 邮箱:
	 */
	public int Xingui(Lmmmplc lmmmplc);
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:14
	 * @version 版本:
	 * @Explain 说明:更新验证	
	 * @Email 邮箱:
	 */
	public int GengxinYanZ(GcLmmmorg gcLmmmorg);
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:22
	 * @version 版本:
	 * @Explain 说明:更新回数验证
	 * @Email 邮箱:
	 */
	public GcLmmmplc Gengxin(GcLmmmplc gcLmmmplc);
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:16:32
	 * @version 版本:
	 * @Explain 说明:更新
	 * @Email 邮箱:
	 */
	public int Gengxinj(Lmmmplc lmmmplc);
	
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午11:19:24
	 * @version 版本:
	 * @Explain 说明:新规验证
	 * @Email 邮箱:
	 */
	public int yanZhengXinguis(GcLmmmy gcLmmmy);
	
}
