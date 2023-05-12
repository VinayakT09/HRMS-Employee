package com.infokalash.HRMS.EmployeeDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infokalash.HRMS.EmployeeDetails.EmployeeService.EmployeeInterface;
import com.infokalash.HRMS.EmployeeDetails.Model.EmployeeModel;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeInterface service;
	

	@PostMapping("/create")
	public ResponseEntity<EmployeeModel> createemp(@RequestBody EmployeeModel employee) {
		EmployeeModel empcreate  = service.createemp(employee);
		return  new ResponseEntity<>(employee , HttpStatus.CREATED);
	}
	
	@GetMapping("/getbyempactsts/{empActivestatus}")
	public ResponseEntity<List<EmployeeModel>> getByEmpActivestatus(@PathVariable boolean empActivestatus){
		List<EmployeeModel> emp = service.getByempActiveStatus(empActivestatus);
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}
	
	@GetMapping("/getempbyid/{empid}")
	public ResponseEntity<EmployeeModel> getEmp(@PathVariable Long empId) {
		EmployeeModel emp = service.getempbyid(empId);
		return new ResponseEntity<>(emp ,HttpStatus.OK);
		
	}
	
	@GetMapping("/get/{firstName}")
	public ResponseEntity<List<EmployeeModel>> getByfirstname(@PathVariable String firstName){
		List<EmployeeModel> emp= service.getByName(firstName);
		return new ResponseEntity<>(emp,HttpStatus.OK);
	}
	
	@GetMapping("/getallemp")
	public ResponseEntity<List<EmployeeModel>> getemp(){
		List<EmployeeModel> emp= service.getemployees();
		return new ResponseEntity<>(emp,HttpStatus.OK);
	
		
	}
	
	@GetMapping("/getbylastupus/{lastupdateduser}")
	public ResponseEntity<List<EmployeeModel>> getBylastupdateduser(@PathVariable String lastupdateduser ){
		List<EmployeeModel> emp = service.getbylastUpdatedUser(lastupdateduser);
		return new ResponseEntity<>(emp,HttpStatus.OK);
		
	}
	
	
		
    @PutMapping("/update/{empid}")
    public ResponseEntity<EmployeeModel> updateemployee(@PathVariable Long  empId , @RequestBody EmployeeModel emp) {
	EmployeeModel empl = service.updateEmployee(emp, empId);
    	return new ResponseEntity<>(empl , HttpStatus.OK);
    }
    

	@DeleteMapping("/delete/{empid}")
	public void deleteEmployee(@PathVariable Long empId) {
		service.deleteEmployee(empId);
	}
	
	
	@GetMapping("/searchemployee/{empid}")
	public ResponseEntity<EmployeeModel> searchById(@PathVariable Long empId){
			EmployeeModel empl = service.findById(empId);
			if(empl != null) {
				return ResponseEntity.ok(empl);
			}
			else
			return ResponseEntity.notFound().build();
			
		}
	
	
	
	
	
	
	
}
