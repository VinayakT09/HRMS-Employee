package com.infokalash.HRMS.EmployeeDetails.Model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "Employee_Table")
public class EmployeeModel {

	@Id
	@GeneratedValue ( strategy = GenerationType.SEQUENCE,generator="empid_sequence" )
	@SequenceGenerator(name="empId_sequence", initialValue=10001,allocationSize=1 )
	 private long empId;
	
	@Column (name = "firstName")
	 private String firstName;
	
	@Column (name = "middleName")
	private String middleName;
	
	@Column (name = "lastName")
    private String lastName;
	
	@Column (name = "age")
	private int age;
	
	@Column (name = "gender")
	private String gender;
	
	@Column (name = "emailid")
	private String emailid;
	
	@Column (name = "dateOfBirth")
	private Date  dateOfBirth;
	
	@Column (name = "dateOfJoining")
	private Date dateOfJoining;
	
	@Column (name = "phone")
	private long phone;
	
	@Column (name = "bloodGroup")
	private String bloodGroup;
	
	@Column (name = "empActiveStatus")
	private boolean empActiveStatus;
	
	@Column (name = "lastUpdatedUser")
	private String lastUpdatedUser;
	
	@Column (name = "lastTxnId")
	private int lastTxnId;
	
	@OneToMany(cascade = CascadeType.ALL)
	Set<AddressModel> address = new HashSet<>();

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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

	public EmployeeModel(long empId, String firstName, String middleName, String lastName, int age, String gender,
			String emailid, Date dateOfBirth, Date dateOfJoining, long phone, String bloodGroup,
			boolean empActiveStatus, String lastUpdatedUser, int lastTxnId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.emailid = emailid;
		this.dateOfBirth = dateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.phone = phone;
		this.bloodGroup = bloodGroup;
		this.empActiveStatus = empActiveStatus;
		this.lastUpdatedUser = lastUpdatedUser;
		this.lastTxnId = lastTxnId;
	}

	public Set<AddressModel> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressModel> address) {
		this.address = address;
	}

	public EmployeeModel(Set<AddressModel> address) {
		super();
		this.address = address;
	}

	public EmployeeModel() {
		super();
	}

	
	
}
