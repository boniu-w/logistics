package org.cloud.model;


/**
 * 
* @author 作者：GC
* @createDate 创建时间：2019年5月22日下午12:40:53
* @version 版本：
* @Explain 说明：GcLmmmco Bean
* @Email 邮箱：
 */
@SuppressWarnings("serial")
public class GcLmmmco implements java.io.Serializable {

	// 国コード１
	private String coalpha3;
	// 国コード２
	private String coalpha2;
	// 国コード３
	private String conum;
	// 国名称
	private String conam;

	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:26:27
	 * @version 版本:
	 * @Explain 说明:Set()Get()
	 * @Email 邮箱:
	 */
	public String getCoalpha3() {
		return this.coalpha3;
	}

	public void setCoalpha3(String coalpha3) {
		this.coalpha3 = coalpha3;
	}

	public String getCoalpha2() {
		return this.coalpha2;
	}

	public void setCoalpha2(String coalpha2) {
		this.coalpha2 = coalpha2;
	}

	public String getConum() {
		return this.conum;
	}

	public void setConum(String conum) {
		this.conum = conum;
	}

	public String getConam() {
		return this.conam;
	}

	public void setConam(String conam) {
		this.conam = conam;
	}


	/** default constructor */
	public GcLmmmco() {
	}

	/**
	 * 
	 * @author 作者：GC
	 * @createDate 创建时间：2019年6月1日上午9:17:28
	 * @version 版本：
	 * @Explain 说明：Constructors
	 * @Email 邮箱：
	 */
	public GcLmmmco(String coalpha2, String conum, String conam) {
		this.coalpha2 = coalpha2;
		this.conum = conum;
		this.conam = conam;
	}


	public GcLmmmco(String coalpha3, String coalpha2, String conum, String conam) {
		super();
		this.coalpha3 = coalpha3;
		this.coalpha2 = coalpha2;
		this.conum = conum;
		this.conam = conam;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coalpha2 == null) ? 0 : coalpha2.hashCode());
		result = prime * result + ((coalpha3 == null) ? 0 : coalpha3.hashCode());
		result = prime * result + ((conam == null) ? 0 : conam.hashCode());
		result = prime * result + ((conum == null) ? 0 : conum.hashCode());
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
		GcLmmmco other = (GcLmmmco) obj;
		if (coalpha2 == null) {
			if (other.coalpha2 != null)
				return false;
		} else if (!coalpha2.equals(other.coalpha2))
			return false;
		if (coalpha3 == null) {
			if (other.coalpha3 != null)
				return false;
		} else if (!coalpha3.equals(other.coalpha3))
			return false;
		if (conam == null) {
			if (other.conam != null)
				return false;
		} else if (!conam.equals(other.conam))
			return false;
		if (conum == null) {
			if (other.conum != null)
				return false;
		} else if (!conum.equals(other.conum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GcLmmmco [coalpha3=" + coalpha3 + ", coalpha2=" + coalpha2 + ", conum=" + conum + ", conam=" + conam
				+ "]";
	}
	
	

 }