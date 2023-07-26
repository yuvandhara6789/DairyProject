package com.dairy.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.mainMaster.CustomerMaster;
import com.dairy.model.mainMaster.ItemMaster;
import com.dairy.repository.mainMaster.AccountMasterRepo;
import com.dairy.repository.mainMaster.CustomerMasterRepo;
import com.dairy.repository.mainMaster.EmployeeMasterRepo;
import com.dairy.repository.mainMaster.ItemMasterRepo;
import com.dairy.repository.mainMaster.SupplierMasterRepo;

import lombok.experimental.PackagePrivate;

@Service
public class MasterListImportsService {
	
	

	@Autowired 
	private CustomerMasterRepo customerMasterRepo ;
	
	@Autowired
	private SupplierMasterRepo supplierMasterRepo ;
	
	@Autowired
	private EmployeeMasterRepo employeeMasterRepo ;
	
	@Autowired
	private AccountMasterRepo accountMasterRepo ;
	
	@Autowired
	private ItemMasterRepo itemMasterRepo ;

	public Collection<? extends Object> getAllCustomerMaster() {
		// TODO Auto-generated method stub
		return customerMasterRepo.findAll();
	}

	public Collection<? extends Object> getAllSupplierMaster() {
		// TODO Auto-generated method stub
		return supplierMasterRepo.findAll();
	}

	public Collection<? extends Object> getAllEmployeeMaster() {
		// TODO Auto-generated method stub
		return employeeMasterRepo.findAll();
	}

	public Collection<? extends Object> getAllItemMaster() {
		// TODO Auto-generated method stub
		return itemMasterRepo.findAll();
	}

	public Collection<? extends Object> getAllAccountMaster() {
		// TODO Auto-generated method stub
		return accountMasterRepo.findAll();
	}

	
	
	
	

}
