package org.cloud.model;


/**
 * 
* @author 作者：GC
* @createDate 创建时间：2019年5月22日下午12:41:29
* @version 版本：
* @Explain 说明：GcLmmmtmz Bean
* @Email 邮箱：
 */
public class GcLmmmtmz implements java.io.Serializable {

	
	//序列化
	private static final long serialVersionUID = -8349355521692747298L;
	// タイムゾーンコード
	private String tmeznecod;
	//タイムゾーン名称
	private String tmeznenam;
	//時差
	private Long tmediff;
	//廃止フラグ
	private String aboflg;


	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:30:43
	 * @version 版本:
	 * @Explain 说明:Set()Get()
	 * @Email 邮箱:
	 */
	public String getTmeznecod() {
		return this.tmeznecod;
	}

	public void setTmeznecod(String tmeznecod) {
		this.tmeznecod = tmeznecod;
	}

	public String getTmeznenam() {
		return this.tmeznenam;
	}

	public void setTmeznenam(String tmeznenam) {
		this.tmeznenam = tmeznenam;
	}

	public Long getTmediff() {
		return this.tmediff;
	}

	public void setTmediff(Long tmediff) {
		this.tmediff = tmediff;
	}

	public String getAboflg() {
		return this.aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}
	

	// Constructors

	/** default constructor */
	public GcLmmmtmz() {
	}

	/** minimal constructor */
	public GcLmmmtmz(String tmeznecod) {
		this.tmeznecod = tmeznecod;
	}

	/**
	 * 
	 * @author 作者：GC
	 * @createDate 创建时间：2019年6月1日上午9:31:20
	 * @version 版本：
	 * @Explain 说明：Constructors
	 * @Email 邮箱：
	 */
	public GcLmmmtmz(String tmeznecod, String tmeznenam, Long tmediff,
			String aboflg) {
		this.tmeznecod = tmeznecod;
		this.tmeznenam = tmeznenam;
		this.tmediff = tmediff;
		this.aboflg = aboflg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aboflg == null) ? 0 : aboflg.hashCode());
		result = prime * result + ((tmediff == null) ? 0 : tmediff.hashCode());
		result = prime * result + ((tmeznecod == null) ? 0 : tmeznecod.hashCode());
		result = prime * result + ((tmeznenam == null) ? 0 : tmeznenam.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GcLmmmtmz other = (GcLmmmtmz) obj;
		if (aboflg == null) {
			if (other.aboflg != null)
				return false;
		} else if (!aboflg.equals(other.aboflg))
			return false;
		if (tmediff == null) {
			if (other.tmediff != null)
				return false;
		} else if (!tmediff.equals(other.tmediff))
			return false;
		if (tmeznecod == null) {
			if (other.tmeznecod != null)
				return false;
		} else if (!tmeznecod.equals(other.tmeznecod))
			return false;
		if (tmeznenam == null) {
			if (other.tmeznenam != null)
				return false;
		} else if (!tmeznenam.equals(other.tmeznenam))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GcLmmmtmz [tmeznecod=" + tmeznecod + ", tmeznenam=" + tmeznenam + ", tmediff=" + tmediff + ", aboflg="
				+ aboflg + "]";
	}


}