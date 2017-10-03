package com.ey.insurancealerts.models;

public class SMSConfig extends BaseEntity {

	private String provider;
	private String userName;
	private String authToken;
	
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public SMSConfig() {
		super();
		super.set_id("SMSProvider");
	}
	
	
}
