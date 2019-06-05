package org.cloud.model;

/**
 * LvbtodritmId generated by MyEclipse Persistence Tools
 */

public class LvbtodritmId implements java.io.Serializable {

	// Fields

	private String tntcod;

	private String odrmgtnum;

	private String odritmmgtnum;

	// Constructors

	/** default constructor */
	public LvbtodritmId() {
	}

	/** full constructor */
	public LvbtodritmId(String tntcod, String odrmgtnum, String odritmmgtnum) {
		this.tntcod = tntcod;
		this.odrmgtnum = odrmgtnum;
		this.odritmmgtnum = odritmmgtnum;
	}

	// Property accessors

	public String getTntcod() {
		return this.tntcod;
	}

	public void setTntcod(String tntcod) {
		this.tntcod = tntcod;
	}

	public String getOdrmgtnum() {
		return this.odrmgtnum;
	}

	public void setOdrmgtnum(String odrmgtnum) {
		this.odrmgtnum = odrmgtnum;
	}

	public String getOdritmmgtnum() {
		return this.odritmmgtnum;
	}

	public void setOdritmmgtnum(String odritmmgtnum) {
		this.odritmmgtnum = odritmmgtnum;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LvbtodritmId))
			return false;
		LvbtodritmId castOther = (LvbtodritmId) other;

		return ((this.getTntcod() == castOther.getTntcod()) || (this
				.getTntcod() != null
				&& castOther.getTntcod() != null && this.getTntcod().equals(
				castOther.getTntcod())))
				&& ((this.getOdrmgtnum() == castOther.getOdrmgtnum()) || (this
						.getOdrmgtnum() != null
						&& castOther.getOdrmgtnum() != null && this
						.getOdrmgtnum().equals(castOther.getOdrmgtnum())))
				&& ((this.getOdritmmgtnum() == castOther.getOdritmmgtnum()) || (this
						.getOdritmmgtnum() != null
						&& castOther.getOdritmmgtnum() != null && this
						.getOdritmmgtnum().equals(castOther.getOdritmmgtnum())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTntcod() == null ? 0 : this.getTntcod().hashCode());
		result = 37 * result
				+ (getOdrmgtnum() == null ? 0 : this.getOdrmgtnum().hashCode());
		result = 37
				* result
				+ (getOdritmmgtnum() == null ? 0 : this.getOdritmmgtnum()
						.hashCode());
		return result;
	}

}