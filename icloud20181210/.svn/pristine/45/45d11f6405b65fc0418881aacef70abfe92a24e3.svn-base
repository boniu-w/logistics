package org.cloud.model;

import java.util.Date;

/**
 * 
 * @author 作者：GC
 * @createDate 创建时间：2019年6月1日上午9:20:59
 * @version 版本：
 * @Explain 说明：GcLmmmorg Bean
 * @Email 邮箱：
 */
public class GcLmmmorg implements java.io.Serializable {

	//序列化
	private static final long serialVersionUID = 1L;
	//タイムゾーンコード									
	private String tntcod;
	//申請組織コード
	private String apporgcod;
	//处理日
	private Date date;
	//废止标志
	private String  aboflg;

	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:25:58
	 * @version 版本:
	 * @Explain 说明:Set()Get()
	 * @Email 邮箱:
	 */
	public String getTntcod() {
		return tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getApporgcod() {
		return apporgcod;
	}

	public void setApporgcod(String apporgcod) {
		this.apporgcod = apporgcod;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAboflg() {
		return aboflg;
	}

	public void setAboflg(String aboflg) {
		this.aboflg = aboflg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 * @author 作者：GC
	 * @createDate 创建时间：2019年6月1日上午9:27:15
	 * @version 版本：
	 * @Explain 说明：Constructors
	 * @Email 邮箱：
	 */
	public GcLmmmorg(String tntcod, String apporgcod, Date date, String aboflg) {
		super();
		this.tntcod = tntcod;
		this.apporgcod = apporgcod;
		this.date = date;
		this.aboflg = aboflg;
	}

	public GcLmmmorg() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aboflg == null) ? 0 : aboflg.hashCode());
		result = prime * result + ((apporgcod == null) ? 0 : apporgcod.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((tntcod == null) ? 0 : tntcod.hashCode());
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
		GcLmmmorg other = (GcLmmmorg) obj;
		if (aboflg == null) {
			if (other.aboflg != null)
				return false;
		} else if (!aboflg.equals(other.aboflg))
			return false;
		if (apporgcod == null) {
			if (other.apporgcod != null)
				return false;
		} else if (!apporgcod.equals(other.apporgcod))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (tntcod == null) {
			if (other.tntcod != null)
				return false;
		} else if (!tntcod.equals(other.tntcod))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GcLmmmorg [tntcod=" + tntcod + ", apporgcod=" + apporgcod + ", date=" + date + ", aboflg=" + aboflg
				+ "]";
	}

}