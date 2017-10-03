package com.ey.insurancealerts.models;

public class WeatherConfig extends BaseEntity {

	private String userName;
	private String password;
	private String countryCode;
	
	
	public WeatherConfig() {
		super();
		super.set_id("WeatherCompany");
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	
}
