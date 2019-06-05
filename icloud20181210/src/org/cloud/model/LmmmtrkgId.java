package org.cloud.model;

/**
 * LmmmtrkgId generated by MyEclipse Persistence Tools
 */

public class LmmmtrkgId implements java.io.Serializable {

	// Fields

	private String tntcod;

	private String trkgrpcod;

	// Constructors

	/** default constructor */
	public LmmmtrkgId() {
	}

	/** full constructor */
	public LmmmtrkgId(String tntcod, String trkgrpcod) {
		this.tntcod = tntcod;
		this.trkgrpcod = trkgrpcod;
	}

	// Property accessors

	public String getTntcod() {
		return this.tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getTrkgrpcod() {
		return this.trkgrpcod;
	}

	public void setTrkgrpcod(String trkgrpcod) {
		this.trkgrpcod = trkgrpcod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LmmmtrkgId))
			return false;
		LmmmtrkgId castOther = (LmmmtrkgId) other;

		return ((this.getTntcod() == castOther.getTntcod()) || (this
				.getTntcod() != null
				&& castOther.getTntcod() != null && this.getTntcod().equals(
				castOther.getTntcod())))
				&& ((this.getTrkgrpcod() == castOther.getTrkgrpcod()) || (this
						.getTrkgrpcod() != null
						&& castOther.getTrkgrpcod() != null && this
						.getTrkgrpcod().equals(castOther.getTrkgrpcod())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTntcod() == null ? 0 : this.getTntcod().hashCode());
		result = 37 * result
				+ (getTrkgrpcod() == null ? 0 : this.getTrkgrpcod().hashCode());
		return result;
	}

}