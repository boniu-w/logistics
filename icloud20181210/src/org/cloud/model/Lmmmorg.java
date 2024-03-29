package org.cloud.model;

import java.util.Date;

/**
 * Lmmmorg generated by MyEclipse Persistence Tools
 */

public class Lmmmorg implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	private String orgKbn_Rdo;
	
	private LmmmorgId id;

	private String tntcod;

	private String orgcod;

	private Date appstaymdhms;
	
	private String aboflg;

	private String orgnam1;

	private String orgnam2;

	private String orgnam3;

	private String orgnam4;

	private String orgnam5;

	private String ctgcod;

	private String ctgnam;

	private String chgnam;

	private String telcod;

	private String faxtelcod;

	private String malnam;

	private String orgkbn01;

	private String orgkbn02;

	private String orgkbn03;

	private String orgkbn04;

	private String orgkbn05;

	private String orgkbn06;

	private String orgkbn07;

	private String orgkbn08;

	private String orgkbn09;

	private String orgkbn10;

	private String orgkbn11;

	private String orgkbn12;

	private String orgkbn13;

	private String orgkbn14;

	private String orgkbn15;

	private String orgkbn16;

	private String orgkbn17;

	private String orgkbn18;

	private String orgkbn19;

	private String orgkbn20;

	private String apporgcod;

	private Date appendymdhms;

	private Date insymdhms;

	private String insnam;

	private String inskbn;

	private String insmethodkbn;

	private Long updeac;
	
	private Long updeacafter;

	private Date updymdhms;

	private String updnam;

	private String updkbn;

	private String updmethodkbn;
    
	
	// Constructors

	/**
	 * @return the orgKbn_Rdo
	 */
	public String getOrgKbn_Rdo() {
		return orgKbn_Rdo;
	}

	/**
	 * @param orgKbn_Rdo the orgKbn_Rdo to set
	 */
	public void setOrgKbn_Rdo(String orgKbn_Rdo) {
		this.orgKbn_Rdo = orgKbn_Rdo;
	}

	/** default constructor */
	public Lmmmorg() {
	}

	/** minimal constructor */
	public Lmmmorg(LmmmorgId id) {
		this.id = id;
	}

	/** full constructor */
	public Lmmmorg(LmmmorgId id, String aboflg, String orgnam1, String orgnam2,
			String orgnam3, String orgnam4, String orgnam5, String ctgcod,
			String ctgnam, String chgnam, String telcod, String faxtelcod,
			String malnam, String orgkbn01, String orgkbn02, String orgkbn03,
			String orgkbn04, String orgkbn05, String orgkbn06, String orgkbn07,
			String orgkbn08, String orgkbn09, String orgkbn10, String orgkbn11,
			String orgkbn12, String orgkbn13, String orgkbn14, String orgkbn15,
			String orgkbn16, String orgkbn17, String orgkbn18, String orgkbn19,
			String orgkbn20, String apporgcod, Date appendymdhms,
			Date insymdhms, String insnam, String inskbn,
			String insmethodkbn, Long updeac, Date updymdhms, String updnam,
			String updkbn, String updmethodkbn) {
		this.id = id;
		this.aboflg = aboflg;
		this.orgnam1 = orgnam1;
		this.orgnam2 = orgnam2;
		this.orgnam3 = orgnam3;
		this.orgnam4 = orgnam4;
		this.orgnam5 = orgnam5;
		this.ctgcod = ctgcod;
		this.ctgnam = ctgnam;
		this.chgnam = chgnam;
		this.telcod = telcod;
		this.faxtelcod = faxtelcod;
		this.malnam = malnam;
		this.orgkbn01 = orgkbn01;
		this.orgkbn02 = orgkbn02;
		this.orgkbn03 = orgkbn03;
		this.orgkbn04 = orgkbn04;
		this.orgkbn05 = orgkbn05;
		this.orgkbn06 = orgkbn06;
		this.orgkbn07 = orgkbn07;
		this.orgkbn08 = orgkbn08;
		this.orgkbn09 = orgkbn09;
		this.orgkbn10 = orgkbn10;
		this.orgkbn11 = orgkbn11;
		this.orgkbn12 = orgkbn12;
		this.orgkbn13 = orgkbn13;
		this.orgkbn14 = orgkbn14;
		this.orgkbn15 = orgkbn15;
		this.orgkbn16 = orgkbn16;
		this.orgkbn17 = orgkbn17;
		this.orgkbn18 = orgkbn18;
		this.orgkbn19 = orgkbn19;
		this.orgkbn20 = orgkbn20;
		this.apporgcod = apporgcod;
		this.appendymdhms = appendymdhms;
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

	public LmmmorgId getId() {
		return this.id;
	}

	public void setId(LmmmorgId id) {
		this.id = id;
	}

	


	public String getAboflg() {
		return aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getOrgnam1() {
		return this.orgnam1;
	}

	public void setOrgnam1(String orgnam1) {
		this.orgnam1 = orgnam1;
	}

	public String getOrgnam2() {
		return this.orgnam2;
	}

	public void setOrgnam2(String orgnam2) {
		this.orgnam2 = orgnam2;
	}

	public String getOrgnam3() {
		return this.orgnam3;
	}

	public void setOrgnam3(String orgnam3) {
		this.orgnam3 = orgnam3;
	}

	public String getOrgnam4() {
		return this.orgnam4;
	}

	public void setOrgnam4(String orgnam4) {
		this.orgnam4 = orgnam4;
	}

	public String getOrgnam5() {
		return this.orgnam5;
	}

	public void setOrgnam5(String orgnam5) {
		this.orgnam5 = orgnam5;
	}

	public String getCtgcod() {
		return this.ctgcod;
	}

	public void setCtgcod(String ctgcod) {
		this.ctgcod = ctgcod;
	}

	public String getCtgnam() {
		return this.ctgnam;
	}

	public void setCtgnam(String ctgnam) {
		this.ctgnam = ctgnam;
	}

	public String getChgnam() {
		return this.chgnam;
	}

	public void setChgnam(String chgnam) {
		this.chgnam = chgnam;
	}

	public String getTelcod() {
		return this.telcod;
	}

	public void setTelcod(String telcod) {
		this.telcod = telcod;
	}

	public String getFaxtelcod() {
		return this.faxtelcod;
	}

	public void setFaxtelcod(String faxtelcod) {
		this.faxtelcod = faxtelcod;
	}

	public String getMalnam() {
		return this.malnam;
	}

	public void setMalnam(String malnam) {
		this.malnam = malnam;
	}

	public String getOrgkbn01() {
		return this.orgkbn01;
	}

	public void setOrgkbn01(String orgkbn01) {
		this.orgkbn01 = orgkbn01;
	}

	public String getOrgkbn02() {
		return this.orgkbn02;
	}

	public void setOrgkbn02(String orgkbn02) {
		this.orgkbn02 = orgkbn02;
	}

	public String getOrgkbn03() {
		return this.orgkbn03;
	}

	public void setOrgkbn03(String orgkbn03) {
		this.orgkbn03 = orgkbn03;
	}

	public String getOrgkbn04() {
		return this.orgkbn04;
	}

	public void setOrgkbn04(String orgkbn04) {
		this.orgkbn04 = orgkbn04;
	}

	public String getOrgkbn05() {
		return this.orgkbn05;
	}

	public void setOrgkbn05(String orgkbn05) {
		this.orgkbn05 = orgkbn05;
	}

	public String getOrgkbn06() {
		return this.orgkbn06;
	}

	public void setOrgkbn06(String orgkbn06) {
		this.orgkbn06 = orgkbn06;
	}

	public String getOrgkbn07() {
		return this.orgkbn07;
	}

	public void setOrgkbn07(String orgkbn07) {
		this.orgkbn07 = orgkbn07;
	}

	public String getOrgkbn08() {
		return this.orgkbn08;
	}

	public void setOrgkbn08(String orgkbn08) {
		this.orgkbn08 = orgkbn08;
	}

	public String getOrgkbn09() {
		return this.orgkbn09;
	}

	public void setOrgkbn09(String orgkbn09) {
		this.orgkbn09 = orgkbn09;
	}

	public String getOrgkbn10() {
		return this.orgkbn10;
	}

	public void setOrgkbn10(String orgkbn10) {
		this.orgkbn10 = orgkbn10;
	}

	public String getOrgkbn11() {
		return this.orgkbn11;
	}

	public void setOrgkbn11(String orgkbn11) {
		this.orgkbn11 = orgkbn11;
	}

	public String getOrgkbn12() {
		return this.orgkbn12;
	}

	public void setOrgkbn12(String orgkbn12) {
		this.orgkbn12 = orgkbn12;
	}

	public String getOrgkbn13() {
		return this.orgkbn13;
	}

	public void setOrgkbn13(String orgkbn13) {
		this.orgkbn13 = orgkbn13;
	}

	public String getOrgkbn14() {
		return this.orgkbn14;
	}

	public void setOrgkbn14(String orgkbn14) {
		this.orgkbn14 = orgkbn14;
	}

	public String getOrgkbn15() {
		return this.orgkbn15;
	}

	public void setOrgkbn15(String orgkbn15) {
		this.orgkbn15 = orgkbn15;
	}

	public String getOrgkbn16() {
		return this.orgkbn16;
	}

	public void setOrgkbn16(String orgkbn16) {
		this.orgkbn16 = orgkbn16;
	}

	public String getOrgkbn17() {
		return this.orgkbn17;
	}

	public void setOrgkbn17(String orgkbn17) {
		this.orgkbn17 = orgkbn17;
	}

	public String getOrgkbn18() {
		return this.orgkbn18;
	}

	public void setOrgkbn18(String orgkbn18) {
		this.orgkbn18 = orgkbn18;
	}

	public String getOrgkbn19() {
		return this.orgkbn19;
	}

	public void setOrgkbn19(String orgkbn19) {
		this.orgkbn19 = orgkbn19;
	}

	public String getOrgkbn20() {
		return this.orgkbn20;
	}

	public void setOrgkbn20(String orgkbn20) {
		this.orgkbn20 = orgkbn20;
	}

	public String getApporgcod() {
		return this.apporgcod;
	}

	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}

	public Date getAppendymdhms() {
		return this.appendymdhms;
	}

	public void setAppendymdhms(Date appendymdhms) {
		this.appendymdhms = appendymdhms;
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

	/**
	 * @return the tntcod
	 */
	public String getTntcod() {
		return tntcod;
	}

	/**
	 * @param tntcod the tntcod to set
	 */
	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	/**
	 * @return the orgcod
	 */
	public String getOrgcod() {
		return orgcod;
	}

	/**
	 * @param orgcod the orgcod to set
	 */
	public void setOrgcod(String orgcod) {
		this.orgcod = orgcod;
	}

	/**
	 * @return the appstaymdhms
	 */
	public Date getAppstaymdhms() {
		return appstaymdhms;
	}

	/**
	 * @param appstaymdhms the appstaymdhms to set
	 */
	public void setAppstaymdhms(Date appstaymdhms) {
		this.appstaymdhms = appstaymdhms;
	}

	public Long getUpdeacafter() {
		return updeacafter;
	}

	public void setUpdeacafter(Long updeacafter) {
		this.updeacafter = updeacafter;
	}


	


}