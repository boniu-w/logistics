package org.cloud.model;

/**
 * Lmmmtrkarvdpt generated by MyEclipse Persistence Tools
 */

public class Lmmmtrkarvdpt implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String orgcod;
	private String UpdEac_Hdn;
	private String tntcod;
	
	private String plccod;
	
	private LmmmtrkarvdptId id;

	private String mtrsmdkbn;
	
	private String sipplccod;
	
	private String aboflg;
	
	private String fnlplccod;
	
	private String trkgrpcod;

	private String apporgcod;

	private String insymdhms;

	private String insnam;

	private String inskbn;

	private String insmethodkbn;

	private Long updeac;

	private String updymdhms;

	private String updnam;

	private String updkbn;

	private String updmethodkbn;

	// Constructors

	
	/** default constructor */
	public Lmmmtrkarvdpt() {
	}

	public String getUpdEac_Hdn() {
		return UpdEac_Hdn;
	}

	public void setUpdEac_Hdn(String updEac_Hdn) {
		UpdEac_Hdn = updEac_Hdn;
	}

	/** minimal constructor */
	public Lmmmtrkarvdpt(LmmmtrkarvdptId id) {
		this.id = id;
	}

	/** full constructor */
	public Lmmmtrkarvdpt(LmmmtrkarvdptId id, String mtrsmdkbn, String aboflg,
			String trkgrpcod, String apporgcod, String insymdhms,
			String insnam, String inskbn, String insmethodkbn, Long updeac,
			String updymdhms, String updnam, String updkbn, String updmethodkbn) {
		this.id = id;
		this.mtrsmdkbn = mtrsmdkbn;
		this.aboflg = aboflg;
		this.trkgrpcod = trkgrpcod;
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

	
	public LmmmtrkarvdptId getId() {
		return this.id;
	}

	public String getOrgcod() {
		return orgcod;
	}

	public void setOrgcod(String orgcod) {
		this.orgcod = orgcod;
	}

	public void setId(LmmmtrkarvdptId id) {
		this.id = id;
	}

	public String getMtrsmdkbn() {
		return this.mtrsmdkbn;
	}

	public void setMtrsmdkbn(String mtrsmdkbn) {
		this.mtrsmdkbn = mtrsmdkbn;
	}

	public String getAboflg() {
		return this.aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getTrkgrpcod() {
		return this.trkgrpcod;
	}

	public void setTrkgrpcod(String trkgrpcod) {
		this.trkgrpcod = trkgrpcod;
	}

	public String getApporgcod() {
		return this.apporgcod;
	}

	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}

	public String getInsymdhms() {
		return this.insymdhms;
	}

	public void setInsymdhms(String insymdhms) {
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

	public String getUpdymdhms() {
		return this.updymdhms;
	}

	public void setUpdymdhms(String updymdhms) {
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

	public String getSipplccod() {
		return sipplccod;
	}

	public void setSipplccod(String sipplccod) {
		this.sipplccod = sipplccod;
	}

	public String getFnlplccod() {
		return fnlplccod;
	}

	public void setFnlplccod(String fnlplccod) {
		this.fnlplccod = fnlplccod;
	}

	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getPlccod() {
		return plccod;
	}

	public void setPlccod(String plccod) {
		this.plccod = plccod;
	}
	
	

}