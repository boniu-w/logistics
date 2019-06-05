package org.cloud.model;

import java.util.Date;

/**
 * Lmmmevtm generated by MyEclipse Persistence Tools
 */

public class Lmmmevtm implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LmmmevtmId id;
	
	private String tntcod;
	
	private String evtmrgcod;

	private String aboflg;

	private String evtmrgnam;

	private String dispnum;

	private String apporgcod;

	private Date insymdhms;

	private String insnam;

	private String inskbn;

	private String insmethodkbn;

	private Long updeac;

	private Date updymdhms;

	private String updnam;

	private String updkbn;

	private String updmethodkbn;

	// Constructors

	/** default constructor */
	public Lmmmevtm() {
	}

	/** minimal constructor */
	public Lmmmevtm(LmmmevtmId id) {
		this.id = id;
	}

	/** full constructor */
	public Lmmmevtm(LmmmevtmId id, String aboflg, String evtmrgnam,
			String dispnum, String apporgcod, Date insymdhms, String insnam,
			String inskbn, String insmethodkbn, Long updeac, Date updymdhms,
			String updnam, String updkbn, String updmethodkbn) {
		this.id = id;
		this.aboflg = aboflg;
		this.evtmrgnam = evtmrgnam;
		this.dispnum = dispnum;
		this.apporgcod = apporgcod;
		this.insymdhms = insymdhms;
		this.insnam = insnam;
		this.inskbn = inskbn;
		this.insmethodkbn = insmethodkbn;
		this.updeac = updeac;
		this.updymdhms = updymdhms;
		this.updnam = updnam;
		this.updkbn = updkbn;
		this.updmethodkbn = updmethodkbn;
	}

	// Property accessors

	public LmmmevtmId getId() {
		return this.id;
	}

	public void setId(LmmmevtmId id) {
		this.id = id;
	}

	public String getAboflg() {
		return this.aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getEvtmrgnam() {
		return this.evtmrgnam;
	}

	public void setEvtmrgnam(String evtmrgnam) {
		this.evtmrgnam = evtmrgnam;
	}

	public String getDispnum() {
		return this.dispnum;
	}

	public void setDispnum(String dispnum) {
		this.dispnum = dispnum;
	}

	public String getApporgcod() {
		return this.apporgcod;
	}

	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}

	public Date getInsymdhms() {
		return this.insymdhms;
	}

	public void setInsymdhms(Date insymdhms) {
		this.insymdhms = insymdhms;
	}

	public String getInsnam() {
		return this.insnam;
	}

	public void setInsnam(String insnam) {
		this.insnam = insnam;
	}

	public String getInskbn() {
		return this.inskbn;
	}

	public void setInskbn(String inskbn) {
		this.inskbn = inskbn;
	}

	public String getInsmethodkbn() {
		return this.insmethodkbn;
	}

	public void setInsmethodkbn(String insmethodkbn) {
		this.insmethodkbn = insmethodkbn;
	}

	public Long getUpdeac() {
		return this.updeac;
	}

	public void setUpdeac(Long updeac) {
		this.updeac = updeac;
	}

	public Date getUpdymdhms() {
		return this.updymdhms;
	}

	public void setUpdymdhms(Date updymdhms) {
		this.updymdhms = updymdhms;
	}

	public String getUpdnam() {
		return this.updnam;
	}

	public void setUpdnam(String updnam) {
		this.updnam = updnam;
	}

	public String getUpdkbn() {
		return this.updkbn;
	}

	public void setUpdkbn(String updkbn) {
		this.updkbn = updkbn;
	}

	public String getUpdmethodkbn() {
		return this.updmethodkbn;
	}

	public void setUpdmethodkbn(String updmethodkbn) {
		this.updmethodkbn = updmethodkbn;
	}

	public String getEvtmrgcod() {
		return evtmrgcod;
	}

	public void setEvtmrgcod(String evtmrgcod) {
		this.evtmrgcod = evtmrgcod;
	}

	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}
	
	

}