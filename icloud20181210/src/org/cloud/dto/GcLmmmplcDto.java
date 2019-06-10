package org.cloud.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
* @author 作者：GC
* @createDate 创建时间：2019年5月22日下午12:14:41
* @version 版本：
* @Explain 说明：GcLmmmplcDto 共通情报Bean
* @Email 邮箱：
 */
public class GcLmmmplcDto {

	//共通情報的字段名称
	private Date insymdhms;
	//登録年月日時分秒
	private String insnam;
	//登録者
	private String inskbn;
	//登録者区分
	private String insmethodkbn;
	//更新回数
	private Long updeac;
	//更新年月日時分秒
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date updymdhms;
	//更新者
	private String updnam;
	//更新者区分
	private String updkbn;
	//更新方法区分
	private String updmethodkbn;
	
	private String updymdhmsu;
		
	/**
	 * 
	 * @author 作者:
	 * @createDate 创建时间：2019年6月1日上午9:26:43
	 * @version 版本:
	 * @Explain 说明:Set()Get()
	 * @Email 邮箱:
	 */
	public Date getInsymdhms() {
		
		return insymdhms;
	}

	public void setInsymdhms(Date insymdhms) {
		this.insymdhms = insymdhms;
	}

	public String getInsnam() {
		return insnam;
	}

	public void setInsnam(String insnam) {
		this.insnam = insnam;
	}

	public String getInskbn() {
		return inskbn;
	}

	public void setInskbn(String inskbn) {
		this.inskbn = inskbn;
	}

	public String getInsmethodkbn() {
		return insmethodkbn;
	}

	public void setInsmethodkbn(String insmethodkbn) {
		this.insmethodkbn = insmethodkbn;
	}

	public Long getUpdeac() {
		return updeac;
	}

	public void setUpdeac(Long updeac) {
		this.updeac = updeac;
	}

	public Date getUpdymdhms() {
		return updymdhms;
	}

	public void setUpdymdhms(Date updymdhms) {
		this.updymdhms = updymdhms;
	}

	public String getUpdnam() {
		return updnam;
	}

	public void setUpdnam(String updnam) {
		this.updnam = updnam;
	}

	public String getUpdkbn() {
		return updkbn;
	}

	public void setUpdkbn(String updkbn) {
		this.updkbn = updkbn;
	}

	public String getUpdmethodkbn() {
		return updmethodkbn;
	}

	public void setUpdmethodkbn(String updmethodkbn) {
		this.updmethodkbn = updmethodkbn;
	}
	
	public String getUpdymdhmsu() {
		return updymdhmsu;
	}

	public void setUpdymdhmsu(String updymdhmsu) {
		this.updymdhmsu = updymdhmsu;
	}

	/**
	 * 
	 * @author 作者：GC
	 * @createDate 创建时间：2019年6月1日上午9:12:21
	 * @version 版本：
	 * @Explain 说明：Constructors
	 * @Email 邮箱：
	 */
	public GcLmmmplcDto(Date insymdhms, String insnam, String inskbn, String insmethodkbn, Long updeac, Date updymdhms,
			String updnam, String updkbn, String updmethodkbn) {
		super();
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

	public GcLmmmplcDto() {
		super();
		
	}

	@Override
	public String toString() {
		return "GcLmmmplcDto [insymdhms=" + insymdhms + ", insnam=" + insnam + ", inskbn=" + inskbn + ", insmethodkbn="
				+ insmethodkbn + ", updeac=" + updeac + ", updymdhms=" + updymdhms + ", updnam=" + updnam + ", updkbn="
				+ updkbn + ", updmethodkbn=" + updmethodkbn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inskbn == null) ? 0 : inskbn.hashCode());
		result = prime * result + ((insmethodkbn == null) ? 0 : insmethodkbn.hashCode());
		result = prime * result + ((insnam == null) ? 0 : insnam.hashCode());
		result = prime * result + ((insymdhms == null) ? 0 : insymdhms.hashCode());
		result = prime * result + ((updeac == null) ? 0 : updeac.hashCode());
		result = prime * result + ((updkbn == null) ? 0 : updkbn.hashCode());
		result = prime * result + ((updmethodkbn == null) ? 0 : updmethodkbn.hashCode());
		result = prime * result + ((updnam == null) ? 0 : updnam.hashCode());
		result = prime * result + ((updymdhms == null) ? 0 : updymdhms.hashCode());
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
		GcLmmmplcDto other = (GcLmmmplcDto) obj;
		if (inskbn == null) {
			if (other.inskbn != null)
				return false;
		} else if (!inskbn.equals(other.inskbn))
			return false;
		if (insmethodkbn == null) {
			if (other.insmethodkbn != null)
				return false;
		} else if (!insmethodkbn.equals(other.insmethodkbn))
			return false;
		if (insnam == null) {
			if (other.insnam != null)
				return false;
		} else if (!insnam.equals(other.insnam))
			return false;
		if (insymdhms == null) {
			if (other.insymdhms != null)
				return false;
		} else if (!insymdhms.equals(other.insymdhms))
			return false;
		if (updeac == null) {
			if (other.updeac != null)
				return false;
		} else if (!updeac.equals(other.updeac))
			return false;
		if (updkbn == null) {
			if (other.updkbn != null)
				return false;
		} else if (!updkbn.equals(other.updkbn))
			return false;
		if (updmethodkbn == null) {
			if (other.updmethodkbn != null)
				return false;
		} else if (!updmethodkbn.equals(other.updmethodkbn))
			return false;
		if (updnam == null) {
			if (other.updnam != null)
				return false;
		} else if (!updnam.equals(other.updnam))
			return false;
		if (updymdhms == null) {
			if (other.updymdhms != null)
				return false;
		} else if (!updymdhms.equals(other.updymdhms))
			return false;
		return true;
	}
	
	
}
