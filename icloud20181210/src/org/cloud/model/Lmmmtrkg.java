package org.cloud.model;

/**
 * Lmmmtrkg generated by MyEclipse Persistence Tools
 */

public class Lmmmtrkg implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LmmmtrkgId id;

	private String tntcod;
	
	private String aboflg;

	private String trkgrpnam;

	private String partrkgrpcod;

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
	public Lmmmtrkg() {
	}

	/** minimal constructor */
	public Lmmmtrkg(LmmmtrkgId id) {
		this.id = id;
	}

	/** full constructor */
	public Lmmmtrkg(LmmmtrkgId id, String aboflg, String trkgrpnam,
			String partrkgrpcod, String apporgcod, String insymdhms,
			String insnam, String inskbn, String insmethodkbn, Long updeac,
			String updymdhms, String updnam, String updkbn, String updmethodkbn) {
		this.id = id;
		this.aboflg = aboflg;
		this.trkgrpnam = trkgrpnam;
		this.partrkgrpcod = partrkgrpcod;
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

	public LmmmtrkgId getId() {
		return this.id;
	}

	public void setId(LmmmtrkgId id) {
		this.id = id;
	}
	
	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getAboflg() {
		return this.aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getTrkgrpnam() {
		return this.trkgrpnam;
	}

	public void setTrkgrpnam(String trkgrpnam) {
		this.trkgrpnam = trkgrpnam;
	}

	public String getPartrkgrpcod() {
		return this.partrkgrpcod;
	}

	public void setPartrkgrpcod(String partrkgrpcod) {
		this.partrkgrpcod = partrkgrpcod;
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

}