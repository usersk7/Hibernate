package com.cdac.hibernate.oto.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_OTO")
public class Address {

	@Id
	private Integer addressId;
	
	@Column(name="street")
	private String street;

	@Column(name="city")
	private String city;

	@Column(name="state")
	private String state;

	@Column(name="country")
	private String country;

	@OneToOne
	@JoinColumn(name="trainee_id")
	private Trainee trainee;
	
	
	
	public Address() {
		// TODO Auto-generated constructor stub
	}



	public Address(Integer addressId, String street, String city, String state, String country) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	
	}



	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}



	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}



	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}



	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}



	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}



	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}



	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}



	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}



	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}



	/**
	 * @return the trainee
	 */
	public Trainee getTrainee() {
		return trainee;
	}



	/**
	 * @param trainee the trainee to set
	 */
	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
	
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	

}
