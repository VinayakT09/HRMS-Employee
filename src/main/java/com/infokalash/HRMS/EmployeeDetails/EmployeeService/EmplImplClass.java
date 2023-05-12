package com.infokalash.HRMS.EmployeeDetails.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.HRMS.EmployeeDetails.Model.EmployeeModel;
import com.infokalash.HRMS.EmployeeDetails.Repository.EmployeeRepository;


@Service
public class EmplImplClass implements EmployeeInterface {

	@Autowired 
	EmployeeRepository  repository;

	
	// method  for creating or inserting Employee details
	@Override
	public EmployeeModel createemp(EmployeeModel emp) {
		return repository.save(emp);
	}

	//method for getting an employeedetails by  empactivestatus
	@Override
	public List<EmployeeModel> getByempActiveStatus(Boolean empActivestatus) {
		return repository.findByempActiveStatus(empActivestatus);
	}

	
	//method for getting an employeedetails by lastupdateduser
	@Override
	public List<EmployeeModel> getbylastUpdatedUser(String lastupdateduser) {
		return repository.findBylastUpdatedUser(lastupdateduser);
	}

	
    //method for getting an employeedetails by empid
	//@Override
	public EmployeeModel getempbyid(Long empid) {
		return repository.findById(empid).orElse(null);
	}

	
	//method  for getting an employeedetials by firstname
	@Override
	public List<EmployeeModel> getByName(String firstName) {
		return repository.findByfirstName(firstName);
		
	}

	//method for getting all employeedetails
	@Override
	public List<EmployeeModel> getemployees() {
		return repository.findAll();
	}

	
	//method for updating an employeedetails by empid
	@Override
	public EmployeeModel updateEmployee(EmployeeModel emp, Long empid) {
		EmployeeModel oldemp = repository.findById(empid).orElse(null);
		oldemp.setFirstName(emp.getFirstName());
		oldemp.setMiddleName(emp.getLastName());
		oldemp.setLastName(emp.getLastName());
		oldemp.setAge(emp.getAge());
		repository.save(oldemp);
		return oldemp;
	}


	//method for deleting an employeedetails by empid
	@Override
	public void deleteEmployee(Long empid) {
		repository.deleteById(empid);
		
	}

	//method for searching an employee by empid
	@Override
	public EmployeeModel findById(Long empid) {
	Optional<EmployeeModel> employeeOptional =repository.findById(empid);
		return employeeOptional.orElse(null);
	}

}
