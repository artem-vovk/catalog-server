package com.server.catalog.models;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

// Generated Nov 18, 2023, 1:55:17 PM by Hibernate Tools 6.2.13.Final

/**
 * CityTagsId generated by hbm2java
 */
@Embeddable
public class CityTagId implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3935158349279188797L;
	
	private Long cityTagId;
	private String tagKey;
	private String tagValue;

	public CityTagId() {
	}

	public CityTagId(Long cityTagId, String tagKey, String tagValue) {
		this.cityTagId = cityTagId;
		this.tagKey = tagKey;
		this.tagValue = tagValue;
	}

	public Long getCityTagId() {
		return this.cityTagId;
	}

	public void setCityTagId(long cityTagId) {
		this.cityTagId = cityTagId;
	}

	public String getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
	}

	public String getTagValue() {
		return this.tagValue;
	}

	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CityTagId))
			return false;
		CityTagId castOther = (CityTagId) other;

		return ((this.getCityTagId() == castOther.getCityTagId()) || (this.getCityTagId() != null
				&& castOther.getCityTagId() != null && this.getCityTagId().equals(castOther.getCityTagId())))
				&& ((this.getTagKey() == castOther.getTagKey()) || (this.getTagKey() != null
						&& castOther.getTagKey() != null && this.getTagKey().equals(castOther.getTagKey())))
				&& ((this.getTagValue() == castOther.getTagValue()) || (this.getTagValue() != null
						&& castOther.getTagValue() != null && this.getTagValue().equals(castOther.getTagValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCityTagId() == null ? 0 : this.getCityTagId().hashCode());
		result = 37 * result + (getTagKey() == null ? 0 : this.getTagKey().hashCode());
		result = 37 * result + (getTagValue() == null ? 0 : this.getTagValue().hashCode());
		return result;
	}

}