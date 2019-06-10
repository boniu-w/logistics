/**
 * 
 */
package org.cloud.dto;
/**
* @author 作者:车健豪 
* @createDate 创建时间:2019年5月22日下午1:51:50
* @version 版本: 
* @Explain 说明: 前后台交互数据封装类
*/
public class Lmm119Dto {
	
	/*o前台列表显示内容*/
	private String updeac;				//o更新回数  前台一览列表显示内容
	private String orgnam1;				//o组织名称 前台一览列表显示内容(非本表字段)
	
	/*o前后台互用内容*/
	private String trkgrpcod;		//oトラッキングGコード  前台列表显示内容  后台if判断类容
	private String trkgrpnam;			//oトラッキングＧ名称   前台列表显示内容  后台if判断内容
	private String aboflg;					//o前台列表显示状态/后台检索处理 检索范围 0正常 1废除
	
	 /*o后台使用内容*/
	private String tntcod;					//o后台session获取身份信息内容
	private String orgcod;					//o组织code  和 apporgcod 内容一致   后台sql条件
	private String apporgcod;			//o申請組織コード 和 orgcod 内容一致  后台sql条件
 
	public String getAboflg() {
		return aboflg;
	}
	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}
	public String getOrgnam1() {
		return orgnam1;
	}
	public void setOrgnam1(String orgnam1) {
		this.orgnam1 = orgnam1;
	}
	public String getTrkgrpcod() {
		return trkgrpcod;
	}
	public void setTrkgrpcod(String trkgrpcod) {
		this.trkgrpcod = trkgrpcod;
	}
	public String getTrkgrpnam() {
		return trkgrpnam;
	}
	public void setTrkgrpnam(String trkgrpnam) {
		this.trkgrpnam = trkgrpnam;
	}
	public String getUpdeac() {
		return updeac;
	}
	public void setUpdeac(String updeac) {
		this.updeac = updeac;
	}
	public String getTntcod() {
		return tntcod;
	}
	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}
	public String getOrgcod() {
		return orgcod;
	}
	public void setOrgcod(String orgcod) {
		this.orgcod = orgcod;
	}
	public String getApporgcod() {
		return apporgcod;
	}
	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}
	@Override
	public String toString() {
		return "Lmm119Dto [updeac=" + updeac + ", orgnam1=" + orgnam1 + ", trkgrpcod=" + trkgrpcod + ", trkgrpnam="
				+ trkgrpnam + ", aboflg=" + aboflg + ", tntcod=" + tntcod + ", orgcod=" + orgcod + ", apporgcod="
				+ apporgcod + "]";
	}

}
