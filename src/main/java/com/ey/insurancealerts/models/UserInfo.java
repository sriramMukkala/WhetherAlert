package com.ey.insurancealerts.models;

/**
 * 
 * @author Larsen.Raja
 *
 */
public class UserInfo extends BaseEntity {

	private String policyNumber;
	private String name;
	private String city;
	private String contactNumber;
	
	public UserInfo() {}
	
	/*
	 * This is essential for ID based look-up.
	 */
	public UserInfo(String policyNumber) {
		super(policyNumber);
	}
	
	public UserInfo(String policyNumber, String name, String city, String contactNumber) {
		super(policyNumber);
		this.policyNumber = policyNumber;
		this.name = name;
		this.city = city;
		this.contactNumber = contactNumber;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
}
