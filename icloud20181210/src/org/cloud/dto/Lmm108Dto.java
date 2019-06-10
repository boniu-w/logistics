package org.cloud.dto;

public class Lmm108Dto {
	
	//イベント集計コード
	private String evtmrgcod;
	
	//イベント集計名
	private String evtmrgnam;
	
	//表示順
	private String dispnum;
	
	//申請組織コード
	private String apporgcod;
	
	//廃止フラグ
	private String aboflg;
	
	//更新者
	private String updnam;
	
	//更新年月日時分秒
	private String updymdhms;
	/**
	 * @date: 2019-05-22 13:36:07
	 * @return:String
	 */
	public String getEvtmrgcod() {
		return evtmrgcod;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @return:String
	 */
	public String getEvtmrgnam() {
		return evtmrgnam;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @return:String
	 */
	public String getDispnum() {
		return dispnum;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @return:String
	 */
	public String getApporgcod() {
		return apporgcod;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @param: evtmrgcod the evtmrgcod to set
	 */
	public void setEvtmrgcod(String evtmrgcod) {
		this.evtmrgcod = evtmrgcod;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @param: evtmrgnam the evtmrgnam to set
	 */
	public void setEvtmrgnam(String evtmrgnam) {
		this.evtmrgnam = evtmrgnam;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @param: dispnum the dispnum to set
	 */
	public void setDispnum(String dispnum) {
		this.dispnum = dispnum;
	}
	/**
	 * @date: 2019-05-22 13:36:07
	 * @param: apporgcod the apporgcod to set
	 */
	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}
	/**
	 * @date: 2019-05-22 13:55:12
	 * @return:int
	 */
	public String getAboflg() {
		return aboflg;
	}
	/**
	 * @date: 2019-05-22 13:55:12
	 * @param: aboflg the aboflg to set
	 */
	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}
	/**
	 * @date: 2019-05-22 14:34:47
	 * @return:String
	 */
	public String getUpdnam() {
		return updnam;
	}
	/**
	 * @date: 2019-05-22 14:34:47
	 * @return:String
	 */
	public String getUpdymdhms() {
		return updymdhms;
	}
	/**
	 * @date: 2019-05-22 14:34:47
	 * @param: updnam the updnam to set
	 */
	public void setUpdnam(String updnam) {
		this.updnam = updnam;
	}
	/**
	 * @date: 2019-05-22 14:34:47
	 * @param: updymdhms the updymdhms to set
	 */
	public void setUpdymdhms(String updymdhms) {
		this.updymdhms = updymdhms;
	}
	/* <p>Title:toString</p>
	 * <p>Description:TODO</p>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Lmm108Dto [evtmrgcod=" + evtmrgcod + ", evtmrgnam=" + evtmrgnam + ", dispnum=" + dispnum
				+ ", apporgcod=" + apporgcod + ", aboflg=" + aboflg + ", updnam=" + updnam + ", updymdhms=" + updymdhms
				+ "]";
	}
	
}
