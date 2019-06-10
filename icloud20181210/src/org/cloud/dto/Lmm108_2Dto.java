package org.cloud.dto;

public class Lmm108_2Dto {
	private String evtmrgcod;	//イベント集計コード
	private String aboflg;			//廃止フラグ
	private String evtmrgnam;	//イベント集計名
	private String dispnum;		//表示順
	private String apporgcod;	//申請組織コード
	private String updnam;		//更新者
	private String updymdhms;	//更新年月日時分秒
	public String getEvtmrgcod() {
		return evtmrgcod;
	}
	public void setEvtmrgcod(String evtmrgcod) {
		this.evtmrgcod = evtmrgcod;
	}
	public String getAboflg() {
		return aboflg;
	}
	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}
	public String getEvtmrgnam() {
		return evtmrgnam;
	}
	public void setEvtmrgnam(String evtmrgnam) {
		this.evtmrgnam = evtmrgnam;
	}
	public String getDispnum() {
		return dispnum;
	}
	public void setDispnum(String dispnum) {
		this.dispnum = dispnum;
	}
	public String getApporgcod() {
		return apporgcod;
	}
	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}
	public String getUpdnam() {
		return updnam;
	}
	public void setUpdnam(String updnam) {
		this.updnam = updnam;
	}
	public String getUpdymdhms() {
		return updymdhms;
	}
	public void setUpdymdhms(String updymdhms) {
		this.updymdhms = updymdhms;
	}
	public Lmm108_2Dto(String evtmrgcod, String aboflg, String evtmrgnam, String dispnum, String apporgcod, String updnam,
			String updymdhms) {
		super();
		this.evtmrgcod = evtmrgcod;
		this.aboflg = aboflg;
		this.evtmrgnam = evtmrgnam;
		this.dispnum = dispnum;
		this.apporgcod = apporgcod;
		this.updnam = updnam;
		this.updymdhms = updymdhms;
	}
	public Lmm108_2Dto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lmm108_2Dto [evtmrgcod=" + evtmrgcod + ", aboflg=" + aboflg + ", evtmrgnam=" + evtmrgnam + ", dispnum="
				+ dispnum + ", apporgcod=" + apporgcod + ", updnam=" + updnam + ", updymdhms=" + updymdhms + "]";
	}
	
	
}
