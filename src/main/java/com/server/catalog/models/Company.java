package com.server.catalog.models;
// Generated Mar 6, 2024, 11:20:35 PM by Hibernate Tools 6.2.13.Final

import java.util.HashSet;
import java.util.Set;

import org.locationtech.jts.geom.Point;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 * Companies generated by hbm2java
 */
@Entity
@Table(name = "company")
public class Company implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5383329878331213653L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq_generator")
	@SequenceGenerator(name="company_seq_generator", sequenceName = "companies_seq", allocationSize=1)
	private long companyId;
	private String title;
	private String description;
	private String phone;
	private String email;
	private String street;
	private String house;
	private String city;
	private String land;
	private String postCode;
	private Double latitude;
	private Double longitude;
	
	@Column(columnDefinition = "Geography(Point,4326)")
	private Point location;
	
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<Review> reviews = new HashSet<Review>(0);
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<Price> prices = new HashSet<Price>(0);
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<Photo> photos = new HashSet<Photo>(0);
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<WorkTime> workTimes = new HashSet<WorkTime>(0);
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<Offer> offers = new HashSet<Offer>(0);
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private Set<CompanyCharacteristic> companyCharacteristics = new HashSet<CompanyCharacteristic>(0);

	public Company() {
	}

	public Company(Long companyId) {
		this.companyId = companyId;
	}

	public Company(Long companyId, String title, String description, String phone, String email, String street,
			String house, String city, String land, String postCode, Double latitude, Double longitude,
			Point location, Set<Review> reviews, Set<Price> prices, Set<Photo> photos, Set<WorkTime> workTimes, 
			Set<Offer> offers, Set<CompanyCharacteristic> companyCharacteristics) {
		this.companyId = companyId;
		this.title = title;
		this.description = description;
		this.phone = phone;
		this.email = email;
		this.street = street;
		this.house = house;
		this.city = city;
		this.land = land;
		this.postCode = postCode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.location = location;
		this.reviews = reviews;
		this.prices = prices;
		this.photos = photos;
		this.workTimes = workTimes;
		this.offers = offers;
		this.companyCharacteristics = companyCharacteristics;
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouse() {
		return this.house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLand() {
		return this.land;
	}

	public void setLand(String land) {
		this.land = land;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public Set<Review> getreviews() {
		return this.reviews;
	}

	public void setreviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public Set<Price> getprices() {
		return this.prices;
	}

	public void setprices(Set<Price> prices) {
		this.prices = prices;
	}

	public Set<Photo> getphotos() {
		return this.photos;
	}

	public void setphotos(Set<Photo> photos) {
		this.photos = photos;
	}

	public Set<WorkTime> getworkTimes() {
		return this.workTimes;
	}

	public void setworkTimes(Set<WorkTime> workTimes) {
		this.workTimes = workTimes;
	}

	public Set<Offer> getoffers() {
		return this.offers;
	}

	public void setoffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public Set<CompanyCharacteristic> getCompanyCharacteristics() {
		return this.companyCharacteristics;
	}

	public void setCompanyCharacteristics(Set<CompanyCharacteristic> companyCharacteristics) {
		this.companyCharacteristics = companyCharacteristics;
	}

}
