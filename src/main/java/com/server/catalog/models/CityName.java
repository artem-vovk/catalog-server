package com.server.catalog.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

// Generated Nov 18, 2023, 1:55:17 PM by Hibernate Tools 6.2.13.Final

/**
 * CityName generated by hbm2java
 */
@Entity
@Table(name = "city_name", schema = "constants")
public class CityName implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6374494623084320299L;

	@EmbeddedId
	private CityNameId id;

	@ManyToOne
	@MapsId("cityNameId") //указывает на то поле композитного ключа, которое связано с первичным ключом главной таблицы
	@JoinColumn(name = "city_name_id") // Указывает на столбец внешнего ключа в таблице CityTags
	private City city;

	public CityName() {
	}

	public CityName(CityNameId id) {
		this.id = id;
	}

	public CityName(CityNameId id, City city) {
		this.id = id;
		this.city = city;
	}

	public CityNameId getId() {
		return this.id;
	}

	public void setId(CityNameId id) {
		this.id = id;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}