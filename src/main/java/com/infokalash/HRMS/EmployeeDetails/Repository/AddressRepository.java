package com.infokalash.HRMS.EmployeeDetails.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.HRMS.EmployeeDetails.Model.AddressModel;

@Repository
public interface AddressRepository  extends JpaRepository <AddressModel , Long> {

	List<AddressModel> findByaddressType(String addressType);

	List<AddressModel> findBylastUpdatedUser(String lastUpdatedUser);

	


}
