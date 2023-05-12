package com.infokalash.HRMS.EmployeeDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.HRMS.EmployeeDetails.Model.EmployeeModel;



@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeModel , Long > {

	List<EmployeeModel> findBylastUpdatedUser(String lastupdateduser);

	List<EmployeeModel> findByfirstName(String firstName);

	List<EmployeeModel> findByempActiveStatus(Boolean empActivestatus);
	
	

}
