package com.ey.insurancealerts.services;

public class UploadPolicyHoldersResponse {

	private int totalRecords;
	private String status;
	private int recordsUploaded;
	private int recordsDiscarded;
	
	public int getRecordsUploaded() {
		return recordsUploaded;
	}
	public void setRecordsUploaded(int recordsUploaded) {
		this.recordsUploaded = recordsUploaded;
	}
	public int getRecordsDiscarded() {
		return recordsDiscarded;
	}
	public void setRecordsDiscarded(int recordsDiscarded) {
		this.recordsDiscarded = recordsDiscarded;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
