package org.cloud.dto;

import java.util.Date;

/**
* @author 作者：张世尧
* @createDate 创建时间：2019年5月28日下午8:58:54
* @version 版本：
* @Explain 说明：
* @tel 电话：
*/
public class Lmm107DtoPlc {
	// 1.テナントコード
    private String tntcod;
    
    //2.廃止フラグ
    private  String aboflg;
    
    //3.表示顺
    private String dispnum;
    
    //4.イベント集計コード
    private String evtmrgcod;
    
    //5.イベント集計名
    private String evtmrgnam;
    
    //6.申請組織コード
    private String apporgcod;

	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getAboflg() {
		return aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getDispnum() {
		return dispnum;
	}

	public void setDispnum(String dispnum) {
		this.dispnum = dispnum;
	}

	public String getEvtmrgcod() {
		return evtmrgcod;
	}

	public void setEvtmrgcod(String evtmrgcod) {
		this.evtmrgcod = evtmrgcod;
	}

	public String getEvtmrgnam() {
		return evtmrgnam;
	}

	public void setEvtmrgnam(String evtmrgnam) {
		this.evtmrgnam = evtmrgnam;
	}

	public String getApporgcod() {
		return apporgcod;
	}

	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}

	public Integer getSearchScope_Rdo() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}
