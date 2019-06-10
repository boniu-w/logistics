package org.cloud.dto;

import java.util.Date;


public class Lmm112Dtor {
    
	//共通部分
	private String orgcod;

	private String orgitmcod;
	
	private Date appstaymdhms;

	private Date appendymdhms;
	
	private String orgitmnam;
	
	private String itmcod;
	
	public String getItmcod() {
		return itmcod;
	}
	public void setItmcod(String itmcod) {
		this.itmcod = itmcod;
	}
	//組織別商品コード
	private String itmnam1;
	
	//適用開始日時.年月日
	private String apporgcod;
	//適用開始日時.時
	private String aboflg;
	//適用開始日時.分
	private Long updeac;
	
	public String getOrgcod() {
		return orgcod;
	}
	public void setOrgcod(String orgcod) {
		this.orgcod = orgcod;
	}
	public String getOrgitmcod() {
		return orgitmcod;
	}
	public void setOrgitmcod(String orgitmcod) {
		this.orgitmcod = orgitmcod;
	}
	public Date getAppstaymdhms() {
		return appstaymdhms;
	}
	public void setAppstaymdhms(Date appstaymdhms) {
		this.appstaymdhms = appstaymdhms;
	}
	public Date getAppendymdhms() {
		return appendymdhms;
	}
	public void setAppendymdhms(Date appendymdhms) {
		this.appendymdhms = appendymdhms;
	}
	public String getOrgitmnam() {
		return orgitmnam;
	}
	public void setOrgitmnam(String orgitmnam) {
		this.orgitmnam = orgitmnam;
	}
	public String getItmnam1() {
		return itmnam1;
	}
	public void setItmnam1(String itmnam1) {
		this.itmnam1 = itmnam1;
	}
	public String getApporgcod() {
		return apporgcod;
	}
	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}
	public String getAboflg() {
		return aboflg;
	}
	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}
	public Long getUpdeac() {
		return updeac;
	}
	public void setUpdeac(Long updeac) {
		this.updeac = updeac;
	}
	public Lmm112Dtor(String orgcod, String orgitmcod, Date appstaymdhms, Date appendymdhms, String orgitmnam,
			String itmcod, String itmnam1, String apporgcod, String aboflg, Long updeac) {
		super();
		this.orgcod = orgcod;
		this.orgitmcod = orgitmcod;
		this.appstaymdhms = appstaymdhms;
		this.appendymdhms = appendymdhms;
		this.orgitmnam = orgitmnam;
		this.itmcod = itmcod;
		this.itmnam1 = itmnam1;
		this.apporgcod = apporgcod;
		this.aboflg = aboflg;
		this.updeac = updeac;
	}
	public Lmm112Dtor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Lmm112Dtor [orgcod=" + orgcod + ", orgitmcod=" + orgitmcod + ", appstaymdhms=" + appstaymdhms
				+ ", appendymdhms=" + appendymdhms + ", orgitmnam=" + orgitmnam + ", itmcod=" + itmcod + ", itmnam1="
				+ itmnam1 + ", apporgcod=" + apporgcod + ", aboflg=" + aboflg + ", updeac=" + updeac + "]";
	}
	
	
	
	
}
