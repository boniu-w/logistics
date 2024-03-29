package org.cloud.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Lmmmitm generated by MyEclipse Persistence Tools
 */

public class Lmmmitm implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LmmmitmId id;
	private String tntcod; 

	private String itmcod;

	private Date appstaymdhms;
	
	private String orgnam1;
	
	
	
	public String getOrgnam1() {
		return orgnam1;
	}

	public void setOrgnam1(String orgnam1) {
		this.orgnam1 = orgnam1;
	}

	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getItmcod() {
		return itmcod;
	}

	public void setItmcod(String itmcod) {
		this.itmcod = itmcod;
	}

	public Date getAppstaymdhms() {
		return appstaymdhms;
	}

	public void setAppstaymdhms(Date appstaymdhms) {
		this.appstaymdhms = appstaymdhms;
	}

	private List<Lmmmorg> lmmmorg = new ArrayList<Lmmmorg>();
    private String searchScope_Rdo;
	private String aboflg;

	private String itmnam1;

	private String itmnam2;

	private String itmnam3;

	private String itmnam4;

	private String itmnam5;

	private String nbrunicod;

	private String hscod;

	private String attdmngcod1;

	private String frekndclacod;

	private String comopecod;

	private String cnttmptypcod;

	private String cnttmpunicod;

	private String cnttmpval;

	private String itmtmptypcod;

	private String itmtmpunicod;

	private String itmtmpval;

	private String trsmrkitmnam;

	private String puritmnam;

	private String stggdskbn;

	private String mopcod;

	private String mopnam1;

	private String mopnam2;

	private String indcapunicod;

	private String indwgtunicod;

	private String indcntunicod;

	private Double cnvwgtcnt;

	private String cnvunicod;

	private Double dpswgtcnt;

	private Double dpscapcnt;

	private String dpsprcunicod;

	private String dpsunimnycnt;

	private String frefirinspsccod;

	private String lughndtrmnam1;

	private String lughndtrmnam2;

	private String dtlrmknam1;

	private String dtlrmknam2;

	private String dtlrmknam3;

	private String dtlrmknam4;

	private String rcvitmclscod;

	private String itmclscod;

	private String rcvbssspcnam;

	private String rcvaddspcnam;

	private String itmadrnam;

	private String stdcod;

	private String jancod;

	private String itfcod;

	private String gdsstgfil;

	private String setgdsadrnam;

	private String lotregpsccod;

	private String inoutfretypcod;

	private String oneunicod;

	private Double cnvcofcnt;

	private String ctnamtunicod;

	private Double wrpinscnt;

	private String sizunicod;

	private Double itmlngsizcnt;

	private Double itmbldsizcnt;

	private Double itmhgtsizcnt;

	private String grdnam;

	private Double slsuniprcamn;

	private String slsuniprcamncnt;

	private Double bscuniamn;

	private String bscuniamncnt;

	private String srgtmptypcod;

	private String grdcod;

	private String clrcod;

	private String clrnam;

	private String sizcod;

	private String inseamcod;

	private Double itmwgtcnt;

	private Double gsmnum;

	private String itmkbn1;

	private String itmkbn2;

	private String itmkbn3;

	private String itmkbn4;

	private String itmkbn5;

	private String itmmgtnum1;

	private String itmmgtnumtyp1;

	private String itmmgtnum2;

	private String itmmgtnumtyp2;

	private String itmmgtnum3;

	private String itmmgtnumtyp3;

	private String itmmgtnum4;

	private String itmmgtnumtyp4;

	private String itmmgtnum5;

	private String itmmgtnumtyp5;

	private String apporgcod;

	private Date appendymdhms;

	private Date insymdhms;

	private String insnam;

	private String inskbn;

	private String insmethodkbn;

	private int updeac;

	private Date updymdhms;

	private String updnam;

	private String updkbn;

	private String updmethodkbn;

	// Constructors

	/** default constructor */
	public Lmmmitm() {
	}

	/** minimal constructor */
	public Lmmmitm(LmmmitmId id) {
		this.id = id;
	}

	/** full constructor */
	public Lmmmitm(LmmmitmId id, String aboflg, String itmnam1, String itmnam2,
			String itmnam3, String itmnam4, String itmnam5, String nbrunicod,
			String hscod, String attdmngcod1, String frekndclacod,
			String comopecod, String cnttmptypcod, String cnttmpunicod,
			String cnttmpval, String itmtmptypcod, String itmtmpunicod,
			String itmtmpval, String trsmrkitmnam, String puritmnam,
			String stggdskbn, String mopcod, String mopnam1, String mopnam2,
			String indcapunicod, String indwgtunicod, String indcntunicod,
			Double cnvwgtcnt, String cnvunicod, Double dpswgtcnt,
			Double dpscapcnt, String dpsprcunicod, String dpsunimnycnt,
			String frefirinspsccod, String lughndtrmnam1, String lughndtrmnam2,
			String dtlrmknam1, String dtlrmknam2, String dtlrmknam3,
			String dtlrmknam4, String rcvitmclscod, String itmclscod,
			String rcvbssspcnam, String rcvaddspcnam, String itmadrnam,
			String stdcod, String jancod, String itfcod, String gdsstgfil,
			String setgdsadrnam, String lotregpsccod, String inoutfretypcod,
			String oneunicod, Double cnvcofcnt, String ctnamtunicod,
			Double wrpinscnt, String sizunicod, Double itmlngsizcnt,
			Double itmbldsizcnt, Double itmhgtsizcnt, String grdnam,
			Double slsuniprcamn, String slsuniprcamncnt, Double bscuniamn,
			String bscuniamncnt, String srgtmptypcod, String grdcod,
			String clrcod, String clrnam, String sizcod, String inseamcod,
			Double itmwgtcnt, Double gsmnum, String itmkbn1, String itmkbn2,
			String itmkbn3, String itmkbn4, String itmkbn5, String itmmgtnum1,
			String itmmgtnumtyp1, String itmmgtnum2, String itmmgtnumtyp2,
			String itmmgtnum3, String itmmgtnumtyp3, String itmmgtnum4,
			String itmmgtnumtyp4, String itmmgtnum5, String itmmgtnumtyp5,
			String apporgcod, Date appendymdhms, Date insymdhms,
			String insnam, String inskbn, String insmethodkbn, int updeac,
			Date updymdhms, String updnam, String updkbn, String updmethodkbn) {
		this.id = id;
		this.aboflg = aboflg;
		this.itmnam1 = itmnam1;
		this.itmnam2 = itmnam2;
		this.itmnam3 = itmnam3;
		this.itmnam4 = itmnam4;
		this.itmnam5 = itmnam5;
		this.nbrunicod = nbrunicod;
		this.hscod = hscod;
		this.attdmngcod1 = attdmngcod1;
		this.frekndclacod = frekndclacod;
		this.comopecod = comopecod;
		this.cnttmptypcod = cnttmptypcod;
		this.cnttmpunicod = cnttmpunicod;
		this.cnttmpval = cnttmpval;
		this.itmtmptypcod = itmtmptypcod;
		this.itmtmpunicod = itmtmpunicod;
		this.itmtmpval = itmtmpval;
		this.trsmrkitmnam = trsmrkitmnam;
		this.puritmnam = puritmnam;
		this.stggdskbn = stggdskbn;
		this.mopcod = mopcod;
		this.mopnam1 = mopnam1;
		this.mopnam2 = mopnam2;
		this.indcapunicod = indcapunicod;
		this.indwgtunicod = indwgtunicod;
		this.indcntunicod = indcntunicod;
		this.cnvwgtcnt = cnvwgtcnt;
		this.cnvunicod = cnvunicod;
		this.dpswgtcnt = dpswgtcnt;
		this.dpscapcnt = dpscapcnt;
		this.dpsprcunicod = dpsprcunicod;
		this.dpsunimnycnt = dpsunimnycnt;
		this.frefirinspsccod = frefirinspsccod;
		this.lughndtrmnam1 = lughndtrmnam1;
		this.lughndtrmnam2 = lughndtrmnam2;
		this.dtlrmknam1 = dtlrmknam1;
		this.dtlrmknam2 = dtlrmknam2;
		this.dtlrmknam3 = dtlrmknam3;
		this.dtlrmknam4 = dtlrmknam4;
		this.rcvitmclscod = rcvitmclscod;
		this.itmclscod = itmclscod;
		this.rcvbssspcnam = rcvbssspcnam;
		this.rcvaddspcnam = rcvaddspcnam;
		this.itmadrnam = itmadrnam;
		this.stdcod = stdcod;
		this.jancod = jancod;
		this.itfcod = itfcod;
		this.gdsstgfil = gdsstgfil;
		this.setgdsadrnam = setgdsadrnam;
		this.lotregpsccod = lotregpsccod;
		this.inoutfretypcod = inoutfretypcod;
		this.oneunicod = oneunicod;
		this.cnvcofcnt = cnvcofcnt;
		this.ctnamtunicod = ctnamtunicod;
		this.wrpinscnt = wrpinscnt;
		this.sizunicod = sizunicod;
		this.itmlngsizcnt = itmlngsizcnt;
		this.itmbldsizcnt = itmbldsizcnt;
		this.itmhgtsizcnt = itmhgtsizcnt;
		this.grdnam = grdnam;
		this.slsuniprcamn = slsuniprcamn;
		this.slsuniprcamncnt = slsuniprcamncnt;
		this.bscuniamn = bscuniamn;
		this.bscuniamncnt = bscuniamncnt;
		this.srgtmptypcod = srgtmptypcod;
		this.grdcod = grdcod;
		this.clrcod = clrcod;
		this.clrnam = clrnam;
		this.sizcod = sizcod;
		this.inseamcod = inseamcod;
		this.itmwgtcnt = itmwgtcnt;
		this.gsmnum = gsmnum;
		this.itmkbn1 = itmkbn1;
		this.itmkbn2 = itmkbn2;
		this.itmkbn3 = itmkbn3;
		this.itmkbn4 = itmkbn4;
		this.itmkbn5 = itmkbn5;
		this.itmmgtnum1 = itmmgtnum1;
		this.itmmgtnumtyp1 = itmmgtnumtyp1;
		this.itmmgtnum2 = itmmgtnum2;
		this.itmmgtnumtyp2 = itmmgtnumtyp2;
		this.itmmgtnum3 = itmmgtnum3;
		this.itmmgtnumtyp3 = itmmgtnumtyp3;
		this.itmmgtnum4 = itmmgtnum4;
		this.itmmgtnumtyp4 = itmmgtnumtyp4;
		this.itmmgtnum5 = itmmgtnum5;
		this.itmmgtnumtyp5 = itmmgtnumtyp5;
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

	public LmmmitmId getId() {
		return this.id;
	}

	public void setId(LmmmitmId id) {
		this.id = id;
	}

	public String getAboflg() {
		return this.aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public String getItmnam1() {
		return this.itmnam1;
	}

	public void setItmnam1(String itmnam1) {
		this.itmnam1 = itmnam1;
	}

	public String getItmnam2() {
		return this.itmnam2;
	}

	public void setItmnam2(String itmnam2) {
		this.itmnam2 = itmnam2;
	}

	public String getItmnam3() {
		return this.itmnam3;
	}

	public void setItmnam3(String itmnam3) {
		this.itmnam3 = itmnam3;
	}

	public String getItmnam4() {
		return this.itmnam4;
	}

	public void setItmnam4(String itmnam4) {
		this.itmnam4 = itmnam4;
	}

	public String getItmnam5() {
		return this.itmnam5;
	}

	public void setItmnam5(String itmnam5) {
		this.itmnam5 = itmnam5;
	}

	public String getNbrunicod() {
		return this.nbrunicod;
	}

	public void setNbrunicod(String nbrunicod) {
		this.nbrunicod = nbrunicod;
	}

	public String getHscod() {
		return this.hscod;
	}

	public void setHscod(String hscod) {
		this.hscod = hscod;
	}

	public String getAttdmngcod1() {
		return this.attdmngcod1;
	}

	public void setAttdmngcod1(String attdmngcod1) {
		this.attdmngcod1 = attdmngcod1;
	}

	public String getFrekndclacod() {
		return this.frekndclacod;
	}

	public void setFrekndclacod(String frekndclacod) {
		this.frekndclacod = frekndclacod;
	}

	public String getComopecod() {
		return this.comopecod;
	}

	public void setComopecod(String comopecod) {
		this.comopecod = comopecod;
	}

	public String getCnttmptypcod() {
		return this.cnttmptypcod;
	}

	public void setCnttmptypcod(String cnttmptypcod) {
		this.cnttmptypcod = cnttmptypcod;
	}

	public String getCnttmpunicod() {
		return this.cnttmpunicod;
	}

	public void setCnttmpunicod(String cnttmpunicod) {
		this.cnttmpunicod = cnttmpunicod;
	}

	public String getCnttmpval() {
		return this.cnttmpval;
	}

	public void setCnttmpval(String cnttmpval) {
		this.cnttmpval = cnttmpval;
	}

	public String getItmtmptypcod() {
		return this.itmtmptypcod;
	}

	public void setItmtmptypcod(String itmtmptypcod) {
		this.itmtmptypcod = itmtmptypcod;
	}

	public String getItmtmpunicod() {
		return this.itmtmpunicod;
	}

	public void setItmtmpunicod(String itmtmpunicod) {
		this.itmtmpunicod = itmtmpunicod;
	}

	public String getItmtmpval() {
		return this.itmtmpval;
	}

	public void setItmtmpval(String itmtmpval) {
		this.itmtmpval = itmtmpval;
	}

	public String getTrsmrkitmnam() {
		return this.trsmrkitmnam;
	}

	public void setTrsmrkitmnam(String trsmrkitmnam) {
		this.trsmrkitmnam = trsmrkitmnam;
	}

	public String getPuritmnam() {
		return this.puritmnam;
	}

	public void setPuritmnam(String puritmnam) {
		this.puritmnam = puritmnam;
	}

	public String getStggdskbn() {
		return this.stggdskbn;
	}

	public void setStggdskbn(String stggdskbn) {
		this.stggdskbn = stggdskbn;
	}

	public String getMopcod() {
		return this.mopcod;
	}

	public void setMopcod(String mopcod) {
		this.mopcod = mopcod;
	}

	public String getMopnam1() {
		return this.mopnam1;
	}

	public void setMopnam1(String mopnam1) {
		this.mopnam1 = mopnam1;
	}

	public String getMopnam2() {
		return this.mopnam2;
	}

	public void setMopnam2(String mopnam2) {
		this.mopnam2 = mopnam2;
	}

	public String getIndcapunicod() {
		return this.indcapunicod;
	}

	public void setIndcapunicod(String indcapunicod) {
		this.indcapunicod = indcapunicod;
	}

	public String getIndwgtunicod() {
		return this.indwgtunicod;
	}

	public void setIndwgtunicod(String indwgtunicod) {
		this.indwgtunicod = indwgtunicod;
	}

	public String getIndcntunicod() {
		return this.indcntunicod;
	}

	public void setIndcntunicod(String indcntunicod) {
		this.indcntunicod = indcntunicod;
	}

	public Double getCnvwgtcnt() {
		return this.cnvwgtcnt;
	}

	public void setCnvwgtcnt(Double cnvwgtcnt) {
		this.cnvwgtcnt = cnvwgtcnt;
	}

	public String getCnvunicod() {
		return this.cnvunicod;
	}

	public void setCnvunicod(String cnvunicod) {
		this.cnvunicod = cnvunicod;
	}

	public Double getDpswgtcnt() {
		return this.dpswgtcnt;
	}

	public void setDpswgtcnt(Double dpswgtcnt) {
		this.dpswgtcnt = dpswgtcnt;
	}

	public Double getDpscapcnt() {
		return this.dpscapcnt;
	}

	public void setDpscapcnt(Double dpscapcnt) {
		this.dpscapcnt = dpscapcnt;
	}

	public String getDpsprcunicod() {
		return this.dpsprcunicod;
	}

	public void setDpsprcunicod(String dpsprcunicod) {
		this.dpsprcunicod = dpsprcunicod;
	}

	public String getDpsunimnycnt() {
		return this.dpsunimnycnt;
	}

	public void setDpsunimnycnt(String dpsunimnycnt) {
		this.dpsunimnycnt = dpsunimnycnt;
	}

	public String getFrefirinspsccod() {
		return this.frefirinspsccod;
	}

	public void setFrefirinspsccod(String frefirinspsccod) {
		this.frefirinspsccod = frefirinspsccod;
	}

	public String getLughndtrmnam1() {
		return this.lughndtrmnam1;
	}

	public void setLughndtrmnam1(String lughndtrmnam1) {
		this.lughndtrmnam1 = lughndtrmnam1;
	}

	public String getLughndtrmnam2() {
		return this.lughndtrmnam2;
	}

	public void setLughndtrmnam2(String lughndtrmnam2) {
		this.lughndtrmnam2 = lughndtrmnam2;
	}

	public String getDtlrmknam1() {
		return this.dtlrmknam1;
	}

	public void setDtlrmknam1(String dtlrmknam1) {
		this.dtlrmknam1 = dtlrmknam1;
	}

	public String getDtlrmknam2() {
		return this.dtlrmknam2;
	}

	public void setDtlrmknam2(String dtlrmknam2) {
		this.dtlrmknam2 = dtlrmknam2;
	}

	public String getDtlrmknam3() {
		return this.dtlrmknam3;
	}

	public void setDtlrmknam3(String dtlrmknam3) {
		this.dtlrmknam3 = dtlrmknam3;
	}

	public String getDtlrmknam4() {
		return this.dtlrmknam4;
	}

	public void setDtlrmknam4(String dtlrmknam4) {
		this.dtlrmknam4 = dtlrmknam4;
	}

	public String getRcvitmclscod() {
		return this.rcvitmclscod;
	}

	public void setRcvitmclscod(String rcvitmclscod) {
		this.rcvitmclscod = rcvitmclscod;
	}

	public String getItmclscod() {
		return this.itmclscod;
	}

	public void setItmclscod(String itmclscod) {
		this.itmclscod = itmclscod;
	}

	public String getRcvbssspcnam() {
		return this.rcvbssspcnam;
	}

	public void setRcvbssspcnam(String rcvbssspcnam) {
		this.rcvbssspcnam = rcvbssspcnam;
	}

	public String getRcvaddspcnam() {
		return this.rcvaddspcnam;
	}

	public void setRcvaddspcnam(String rcvaddspcnam) {
		this.rcvaddspcnam = rcvaddspcnam;
	}

	public String getItmadrnam() {
		return this.itmadrnam;
	}

	public void setItmadrnam(String itmadrnam) {
		this.itmadrnam = itmadrnam;
	}

	public String getStdcod() {
		return this.stdcod;
	}

	public void setStdcod(String stdcod) {
		this.stdcod = stdcod;
	}

	public String getJancod() {
		return this.jancod;
	}

	public void setJancod(String jancod) {
		this.jancod = jancod;
	}

	public String getItfcod() {
		return this.itfcod;
	}

	public void setItfcod(String itfcod) {
		this.itfcod = itfcod;
	}

	public String getGdsstgfil() {
		return this.gdsstgfil;
	}

	public void setGdsstgfil(String gdsstgfil) {
		this.gdsstgfil = gdsstgfil;
	}

	public String getSetgdsadrnam() {
		return this.setgdsadrnam;
	}

	public void setSetgdsadrnam(String setgdsadrnam) {
		this.setgdsadrnam = setgdsadrnam;
	}

	public String getLotregpsccod() {
		return this.lotregpsccod;
	}

	public void setLotregpsccod(String lotregpsccod) {
		this.lotregpsccod = lotregpsccod;
	}

	public String getInoutfretypcod() {
		return this.inoutfretypcod;
	}

	public void setInoutfretypcod(String inoutfretypcod) {
		this.inoutfretypcod = inoutfretypcod;
	}

	public String getOneunicod() {
		return this.oneunicod;
	}

	public void setOneunicod(String oneunicod) {
		this.oneunicod = oneunicod;
	}

	public Double getCnvcofcnt() {
		return this.cnvcofcnt;
	}

	public void setCnvcofcnt(Double cnvcofcnt) {
		this.cnvcofcnt = cnvcofcnt;
	}

	public String getCtnamtunicod() {
		return this.ctnamtunicod;
	}

	public void setCtnamtunicod(String ctnamtunicod) {
		this.ctnamtunicod = ctnamtunicod;
	}

	public Double getWrpinscnt() {
		return this.wrpinscnt;
	}

	public void setWrpinscnt(Double wrpinscnt) {
		this.wrpinscnt = wrpinscnt;
	}

	public String getSizunicod() {
		return this.sizunicod;
	}

	public void setSizunicod(String sizunicod) {
		this.sizunicod = sizunicod;
	}

	public Double getItmlngsizcnt() {
		return this.itmlngsizcnt;
	}

	public void setItmlngsizcnt(Double itmlngsizcnt) {
		this.itmlngsizcnt = itmlngsizcnt;
	}

	public Double getItmbldsizcnt() {
		return this.itmbldsizcnt;
	}

	public void setItmbldsizcnt(Double itmbldsizcnt) {
		this.itmbldsizcnt = itmbldsizcnt;
	}

	public Double getItmhgtsizcnt() {
		return this.itmhgtsizcnt;
	}

	public void setItmhgtsizcnt(Double itmhgtsizcnt) {
		this.itmhgtsizcnt = itmhgtsizcnt;
	}

	public String getGrdnam() {
		return this.grdnam;
	}

	public void setGrdnam(String grdnam) {
		this.grdnam = grdnam;
	}

	public Double getSlsuniprcamn() {
		return this.slsuniprcamn;
	}

	public void setSlsuniprcamn(Double slsuniprcamn) {
		this.slsuniprcamn = slsuniprcamn;
	}

	public String getSlsuniprcamncnt() {
		return this.slsuniprcamncnt;
	}

	public void setSlsuniprcamncnt(String slsuniprcamncnt) {
		this.slsuniprcamncnt = slsuniprcamncnt;
	}

	public Double getBscuniamn() {
		return this.bscuniamn;
	}

	public void setBscuniamn(Double bscuniamn) {
		this.bscuniamn = bscuniamn;
	}

	public String getBscuniamncnt() {
		return this.bscuniamncnt;
	}

	public void setBscuniamncnt(String bscuniamncnt) {
		this.bscuniamncnt = bscuniamncnt;
	}

	public String getSrgtmptypcod() {
		return this.srgtmptypcod;
	}

	public void setSrgtmptypcod(String srgtmptypcod) {
		this.srgtmptypcod = srgtmptypcod;
	}

	public String getGrdcod() {
		return this.grdcod;
	}

	public void setGrdcod(String grdcod) {
		this.grdcod = grdcod;
	}

	public String getClrcod() {
		return this.clrcod;
	}

	public void setClrcod(String clrcod) {
		this.clrcod = clrcod;
	}

	public String getClrnam() {
		return this.clrnam;
	}

	public void setClrnam(String clrnam) {
		this.clrnam = clrnam;
	}

	public String getSizcod() {
		return this.sizcod;
	}

	public void setSizcod(String sizcod) {
		this.sizcod = sizcod;
	}

	public String getInseamcod() {
		return this.inseamcod;
	}

	public void setInseamcod(String inseamcod) {
		this.inseamcod = inseamcod;
	}

	public Double getItmwgtcnt() {
		return this.itmwgtcnt;
	}

	public void setItmwgtcnt(Double itmwgtcnt) {
		this.itmwgtcnt = itmwgtcnt;
	}

	public Double getGsmnum() {
		return this.gsmnum;
	}

	public void setGsmnum(Double gsmnum) {
		this.gsmnum = gsmnum;
	}

	public String getItmkbn1() {
		return this.itmkbn1;
	}

	public void setItmkbn1(String itmkbn1) {
		this.itmkbn1 = itmkbn1;
	}

	public String getItmkbn2() {
		return this.itmkbn2;
	}

	public void setItmkbn2(String itmkbn2) {
		this.itmkbn2 = itmkbn2;
	}

	public String getItmkbn3() {
		return this.itmkbn3;
	}

	public void setItmkbn3(String itmkbn3) {
		this.itmkbn3 = itmkbn3;
	}

	public String getItmkbn4() {
		return this.itmkbn4;
	}

	public void setItmkbn4(String itmkbn4) {
		this.itmkbn4 = itmkbn4;
	}

	public String getItmkbn5() {
		return this.itmkbn5;
	}

	public void setItmkbn5(String itmkbn5) {
		this.itmkbn5 = itmkbn5;
	}

	public String getItmmgtnum1() {
		return this.itmmgtnum1;
	}

	public void setItmmgtnum1(String itmmgtnum1) {
		this.itmmgtnum1 = itmmgtnum1;
	}

	public String getItmmgtnumtyp1() {
		return this.itmmgtnumtyp1;
	}

	public void setItmmgtnumtyp1(String itmmgtnumtyp1) {
		this.itmmgtnumtyp1 = itmmgtnumtyp1;
	}

	public String getItmmgtnum2() {
		return this.itmmgtnum2;
	}

	public void setItmmgtnum2(String itmmgtnum2) {
		this.itmmgtnum2 = itmmgtnum2;
	}

	public String getItmmgtnumtyp2() {
		return this.itmmgtnumtyp2;
	}

	public void setItmmgtnumtyp2(String itmmgtnumtyp2) {
		this.itmmgtnumtyp2 = itmmgtnumtyp2;
	}

	public String getItmmgtnum3() {
		return this.itmmgtnum3;
	}

	public void setItmmgtnum3(String itmmgtnum3) {
		this.itmmgtnum3 = itmmgtnum3;
	}

	public String getItmmgtnumtyp3() {
		return this.itmmgtnumtyp3;
	}

	public void setItmmgtnumtyp3(String itmmgtnumtyp3) {
		this.itmmgtnumtyp3 = itmmgtnumtyp3;
	}

	public String getItmmgtnum4() {
		return this.itmmgtnum4;
	}

	public void setItmmgtnum4(String itmmgtnum4) {
		this.itmmgtnum4 = itmmgtnum4;
	}

	public String getItmmgtnumtyp4() {
		return this.itmmgtnumtyp4;
	}

	public void setItmmgtnumtyp4(String itmmgtnumtyp4) {
		this.itmmgtnumtyp4 = itmmgtnumtyp4;
	}

	public String getItmmgtnum5() {
		return this.itmmgtnum5;
	}

	public void setItmmgtnum5(String itmmgtnum5) {
		this.itmmgtnum5 = itmmgtnum5;
	}

	public String getItmmgtnumtyp5() {
		return this.itmmgtnumtyp5;
	}

	public void setItmmgtnumtyp5(String itmmgtnumtyp5) {
		this.itmmgtnumtyp5 = itmmgtnumtyp5;
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

	public int getUpdeac() {
		return this.updeac;
	}

	public void setUpdeac(int updeac) {
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

	public List<Lmmmorg> getLmmmorg() {
		return lmmmorg;
	}

	public void setLmmmorg(List<Lmmmorg> lmmmorg) {
		this.lmmmorg = lmmmorg;
	}

	public String getSearchScope_Rdo() {
		return searchScope_Rdo;
	}

	public void setSearchScope_Rdo(String searchScope_Rdo) {
		this.searchScope_Rdo = searchScope_Rdo;
	}



}