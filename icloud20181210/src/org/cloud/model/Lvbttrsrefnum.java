package org.cloud.model;
// default package



/**
 * Lvbttrsrefnum generated by MyEclipse Persistence Tools
 */

public class Lvbttrsrefnum  implements java.io.Serializable {


    // Fields    

     private LvbttrsrefnumId id;
     private String refnum;
     private String refnumkbn;
     private String refnumsta;
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
    public Lvbttrsrefnum() {
    }

	/** minimal constructor */
    public Lvbttrsrefnum(LvbttrsrefnumId id) {
        this.id = id;
    }
    
    /** full constructor */
    public Lvbttrsrefnum(LvbttrsrefnumId id, String refnum, String refnumkbn, String refnumsta, String insymdhms, String insnam, String inskbn, String insmethodkbn, Long updeac, String updymdhms, String updnam, String updkbn, String updmethodkbn) {
        this.id = id;
        this.refnum = refnum;
        this.refnumkbn = refnumkbn;
        this.refnumsta = refnumsta;
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

    public LvbttrsrefnumId getId() {
        return this.id;
    }
    
    public void setId(LvbttrsrefnumId id) {
        this.id = id;
    }

    public String getRefnum() {
        return this.refnum;
    }
    
    public void setRefnum(String refnum) {
        this.refnum = refnum;
    }

    public String getRefnumkbn() {
        return this.refnumkbn;
    }
    
    public void setRefnumkbn(String refnumkbn) {
        this.refnumkbn = refnumkbn;
    }

    public String getRefnumsta() {
        return this.refnumsta;
    }
    
    public void setRefnumsta(String refnumsta) {
        this.refnumsta = refnumsta;
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