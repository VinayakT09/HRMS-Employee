package com.infokalash.HRMS.EmployeeDetails.EmployeeService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infokalash.HRMS.EmployeeDetails.Model.EmployeeModel;


@Service
public interface EmployeeInterface  {

	//Interface  for creating or inserting Employee details
	public EmployeeModel createemp(EmployeeModel emp);
	
	
	//Interface for getting an employeedetails by empactivestatus
	public List<EmployeeModel> getByempActiveStatus(Boolean empActivestatus);
	
	//Interface for getting an employeedetails by lastupdateduser
	public List<EmployeeModel> getbylastUpdatedUser(String lastupdateduser);
	
	//Intrface for getting an employeedetails  by id
	public EmployeeModel getempbyid(Long empid);

	//Interface for getting an employeedetails  by name
	 public List<EmployeeModel> getByName(String firstName);
 
	//Interface for getting all employeedetails
	public List<EmployeeModel> getemployees();
	
	
	//Interface for updating an employeedetails by id
	public EmployeeModel updateEmployee(EmployeeModel emp , Long empid);
	

	
	//Interface for deleting an employeedetails by id
	public void deleteEmployee(Long empid);


	//Interface for  searching an employee by empid
	public EmployeeModel findById(Long empid);


   
	
}
