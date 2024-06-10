package com.server.catalog.models;
// Generated Mar 6, 2024, 11:20:35 PM by Hibernate Tools 6.2.13.Final

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

/**
 * OfferCharacteristics generated by hbm2java
 */
@Entity
public class OfferCharacteristic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5833323323719783479L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offer_characteristics_seq_generator")
	@SequenceGenerator(name="offer_characteristics_seq_generator", sequenceName = "offer_characteristics_seq", allocationSize=1)
	private Long offerCharId;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "offer_id")
	private Offer offer;
	private String charCategory;
	private String charKey;
	private String charValue;
	private String icon;
	

	public OfferCharacteristic() {
	}

	public OfferCharacteristic(Long offerCharId) {
		this.offerCharId = offerCharId;
	}

	public OfferCharacteristic(Long offerCharId, Offer offer, String charCategory,
			String charKey, String charValue, String icon) {
		this.offerCharId = offerCharId;
		this.offer = offer;
		this.charCategory = charCategory;
		this.charKey = charKey;
		this.charValue = charValue;
		this.icon = icon;
	}

	public Long getOfferCharId() {
		return this.offerCharId;
	}

	public void setOfferCharId(Long offerCharId) {
		this.offerCharId = offerCharId;
	}

	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public String getCharCategory() {
		return this.charCategory;
	}

	public void setCharCategory(String charCategory) {
		this.charCategory = charCategory;
	}

	public String getCharKey() {
		return this.charKey;
	}

	public void setCharKey(String charKey) {
		this.charKey = charKey;
	}

	public String getCharValue() {
		return this.charValue;
	}

	public void setCharValue(String charValue) {
		this.charValue = charValue;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}