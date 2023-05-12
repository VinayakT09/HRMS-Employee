package com.infokalash.HRMS.EmployeeDetails.AddressService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infokalash.HRMS.EmployeeDetails.Model.AddressModel;

@Service
public interface AddressInterface {


	//Interface for creating or inserting address of an Employee
	public AddressModel createaddress(AddressModel address);
	
	//Interface for getting an employeedetails by addressid
	public AddressModel getbyadd_id(Long addId);
	
	//Interface for getting all address of an employeebasic
	public List<AddressModel> getalladdress();
	
	//Interface for getting addresstype of an employeebasic by addresstype
	public List<AddressModel> getbyaddresstype(String addressType);
	

	//Interface for updating an addressdetails of employee
	public AddressModel updateAddress(AddressModel address , Long addId);
	
	//Interface for deleting an addressdetails  of an employeebasic by add_id
	public void deleteaddress(Long addId);
	
	//Interface for getting an addressdetails of an employeebasic by lastupdateduser
	public List<AddressModel> getByLastUpdatedUser(String lastUpdatedUser);

	//Interface for searching an addressdetails by addressid
	public AddressModel findById(Long addId);

	
	
}
