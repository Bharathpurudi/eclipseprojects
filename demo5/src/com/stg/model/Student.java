package com.stg.model;
//one to one relation

public class Student {
	private int stdId;
	private String stdName;
	private Address[] addresses;
	/*
	 * private Address stdAddress; public int getStdId() { return stdId; } public
	 * void setStdId(int stdId) { this.stdId = stdId; } public String getStdName() {
	 * return stdName; } public void setStdName(String stdName) { this.stdName =
	 * stdName; } public Address getStdAddress() { return stdAddress; } public void
	 * setStdAddress(Address stdAddress) { this.stdAddress = stdAddress; }
	 */
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Address[] getAddresses() {
		return addresses;
	}
	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	
}
