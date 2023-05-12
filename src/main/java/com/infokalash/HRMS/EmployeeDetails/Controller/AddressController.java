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

import com.infokalash.HRMS.EmployeeDetails.AddressService.AddressInterface;
import com.infokalash.HRMS.EmployeeDetails.Model.AddressModel;



@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	AddressInterface addservice;
	
	@PostMapping("/create")
	public ResponseEntity<AddressModel> createaddress(@RequestBody AddressModel address){
			AddressModel addressmodel = addservice.createaddress(address);
			return  new ResponseEntity<>(address , HttpStatus.CREATED);
		}
	
	@GetMapping("/getempbyaddid/{addId}")
	public ResponseEntity<AddressModel> getEmp(@PathVariable Long add_id) {
		AddressModel addressmodel = addservice.getbyadd_id(add_id);
		return new ResponseEntity<>(addressmodel , HttpStatus.OK);
		
	}
	
	@GetMapping("/getalladdid")
	public ResponseEntity<List<AddressModel>> getaddress(){
		List<AddressModel> addressmodel = addservice.getalladdress();
		return new ResponseEntity<>(addressmodel, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getaddres/{addressType}")
		public ResponseEntity<List<AddressModel>> getaddtype(@PathVariable String addressType){
			List<AddressModel> addressmodel = addservice.getbyaddresstype(addressType);
			return new ResponseEntity<>(addressmodel, HttpStatus.OK);
	}
	
   @PutMapping("/update/{addId}")
		  public ResponseEntity<AddressModel> updateemployee(@PathVariable Long  addId , @RequestBody AddressModel addressmodel) {
				AddressModel address = addservice.updateAddress(addressmodel, addId);
			    	return new ResponseEntity<>(address , HttpStatus.OK);
			    }
			

   @DeleteMapping("/delete/{addId}")  
   public void deleteAddress(@PathVariable Long addId) {
	   addservice.deleteaddress(addId);
	}
   
   @GetMapping("/getbylastupdateduser/{lastUpdatedUser}")
   public ResponseEntity<List<AddressModel>> getBylastupdateduser(@PathVariable String lastUpdatedUser){
	   List<AddressModel> addr=addservice.getByLastUpdatedUser(lastUpdatedUser);
	   return new ResponseEntity(addr,HttpStatus.OK);
   }
   
   @GetMapping("/searchaddress/{addId}")
   public ResponseEntity<AddressModel> searchById(@PathVariable Long addId){
	   AddressModel addr = addservice.findById(addId);
		if(addr != null) {
			return ResponseEntity.ok(addr);
		}
		else
		return ResponseEntity.notFound().build();
   }
   

}
