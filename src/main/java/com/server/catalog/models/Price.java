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
 * Prices generated by hbm2java
 */
@Entity
public class Price implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6763413976330994556L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "price_seq_generator")
    @SequenceGenerator(name="price_seq_generator", sequenceName = "price_seq", allocationSize = 1)
	private Long priceId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id")
	private Company company;
	private String name;
	private double price;
	private String unit;
	private String info;

	public Price() {
	}

	public Price(Long priceId) {
		this.priceId = priceId;
	}

	public Price(Long priceId, Company company, String name, double price, String unit, String info) {
		this.priceId = priceId;
		this.company = company;
		this.name = name;
		this.price = price;
		this.unit = unit;
		this.info = info;
	}

	public Long getPriceId() {
		return this.priceId;
	}

	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}