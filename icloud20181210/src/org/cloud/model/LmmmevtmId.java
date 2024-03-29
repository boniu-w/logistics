package org.cloud.model;

/**
 * LmmmevtmId generated by MyEclipse Persistence Tools
 */

public class LmmmevtmId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tntcod;

	private String evtmrgcod;

	// Constructors

	/** default constructor */
	public LmmmevtmId() {
	}

	/** full constructor */
	public LmmmevtmId(String tntcod, String evtmrgcod) {
		this.tntcod = tntcod;
		this.evtmrgcod = evtmrgcod;
	}

	// Property accessors

	public String getTntcod() {
		return this.tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getEvtmrgcod() {
		return this.evtmrgcod;
	}

	public void setEvtmrgcod(String evtmrgcod) {
		this.evtmrgcod = evtmrgcod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LmmmevtmId))
			return false;
		LmmmevtmId castOther = (LmmmevtmId) other;

		return ((this.getTntcod() == castOther.getTntcod()) || (this
				.getTntcod() != null
				&& castOther.getTntcod() != null && this.getTntcod().equals(
				castOther.getTntcod())))
				&& ((this.getEvtmrgcod() == castOther.getEvtmrgcod()) || (this
						.getEvtmrgcod() != null
						&& castOther.getEvtmrgcod() != null && this
						.getEvtmrgcod().equals(castOther.getEvtmrgcod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTntcod() == null ? 0 : this.getTntcod().hashCode());
		result = 37 * result
				+ (getEvtmrgcod() == null ? 0 : this.getEvtmrgcod().hashCode());
		return result;
	}

}