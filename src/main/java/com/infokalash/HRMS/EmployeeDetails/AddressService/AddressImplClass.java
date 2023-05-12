package com.infokalash.HRMS.EmployeeDetails.AddressService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.HRMS.EmployeeDetails.Model.AddressModel;
import com.infokalash.HRMS.EmployeeDetails.Repository.AddressRepository;

@Service
public class AddressImplClass  implements AddressInterface {

	
	@Autowired
	AddressRepository addrepository;
	
	
	//method to create address of an employeedetails
		@Override
		public AddressModel createaddress(AddressModel address) {
			return addrepository.save(address);
		}

		//method to get address of an employeedetails by addid
		@Override
		public AddressModel getbyadd_id(Long addId) {
			return addrepository.findById(addId).orElse(null);
		}

		//method to get address of all employeedetails
		@Override
		public List<AddressModel> getalladdress() {
			return addrepository.findAll();
		}
		


		//method to get addresstype of an employeedetails
		@Override
		public List<AddressModel> getbyaddresstype(String addressType) {
			List<AddressModel> address=addrepository.findByaddressType(addressType);
			return address;
		}
		
		
		
		

		//method to update addressdetails of an employee
		@Override
		public AddressModel updateAddress(AddressModel address, Long addId) {
			AddressModel add = addrepository.findById(addId).orElse(address);
			
			add.setAddressId(address.getAddressId());
			add.setCity(address.getCity());
			add.setState(address.getState());
			add.setPincode(address.getPincode());
			add.setAddressLine1(address.getAddressLine1());
			add.setAddressLine2(address.getAddressLine2());
			add.setAddressType(address.getAddressType());
			addrepository.save(add);
			return add;
			
		}

		//method to delete addressdetails of an employee
		
		@Override
		public void deleteaddress(Long addId) {
			
			addrepository.deleteById(addId);;
		}

		@Override
		public List<AddressModel> getByLastUpdatedUser(String lastUpdatedUser) {
			List<AddressModel> add=addrepository.findBylastUpdatedUser(lastUpdatedUser);
			return add;
		}

		@Override
		public AddressModel findById(Long addId) {
		Optional<AddressModel>  addressoptional = addrepository.findById(addId);
			return addressoptional.orElse(null);
		}
		
	
}
