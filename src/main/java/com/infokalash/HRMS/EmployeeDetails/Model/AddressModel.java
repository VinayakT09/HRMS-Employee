package com.infokalash.HRMS.EmployeeDetails.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Address_table")
public class AddressModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="addressId")
	private Long addressId;
	
	@Column(name="addressType")
	private String addressType;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="addressLine1")
	private String addressLine1;
	
	@Column(name="addressLine2")
	private String addressLine2;
	
	@Column(name="empId")
	private long empId;
	
	@Column(name="empActiveStatus")
	private boolean empActiveStatus;
	
	@Column(name="lastUpdatedUser")
	private String lastUpdatedUser;
	
	@Column(name="lastTxnId")
	private int lastTxnId;

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public boolean isEmpActiveStatus() {
		return empActiveStatus;
	}

	public void setEmpActiveStatus(boolean empActiveStatus) {
		this.empActiveStatus = empActiveStatus;
	}

	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public int getLastTxnId() {
		return lastTxnId;
	}

	public void setLastTxnId(int lastTxnId) {
		this.lastTxnId = lastTxnId;
	}

	public AddressModel(Long addressId, String addressType, String city, String state, int pincode, String addressLine1,
			String addressLine2, long empId, boolean empActiveStatus, String lastUpdatedUser, int lastTxnId) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.empId = empId;
		this.empActiveStatus = empActiveStatus;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastTxnId = lastTxnId;
	}

	public AddressModel() {
		super();
	}
	
	
	
	

}
