package com.dairy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.dairy.model.mainMaster.AccountMaster;
import com.dairy.model.mainMaster.CustomerMaster;
import com.dairy.model.mainMaster.EmployeeMaster;
import com.dairy.model.mainMaster.HSNCodeMaster;
import com.dairy.model.mainMaster.ItemMaster;
import com.dairy.model.mainMaster.OpeningStock;
import com.dairy.model.mainMaster.SupplierMaster;
import com.dairy.model.mainMaster.TCSCodeMaster;
import com.dairy.model.mainMaster.TDSCodeMaster;
import com.dairy.repository.mainMaster.AccountMasterRepo;
import com.dairy.repository.mainMaster.CustomerMasterRepo;
import com.dairy.repository.mainMaster.EmployeeMasterRepo;
import com.dairy.repository.mainMaster.HSNCodeMasterRepo;
import com.dairy.repository.mainMaster.ItemMasterRepo;
import com.dairy.repository.mainMaster.OpeningStockRepo;
import com.dairy.repository.mainMaster.SupplierMasterRepo;
import com.dairy.repository.mainMaster.TCSCodeMasterRepo;
import com.dairy.repository.mainMaster.TDSCodeMasterRepo;



@Service
@Transactional
public class MainMastersService {

	@Autowired
	private  AccountMasterRepo accountMasterRepo ;
	
	@Autowired
	private CustomerMasterRepo customerMasterRepo ;
	
	@Autowired
	private SupplierMasterRepo supplierMasterRepo ;
	
	@Autowired
	private EmployeeMasterRepo employeeMasterRepo ;
	
	@Autowired
	private ItemMasterRepo itemMasterRepo ;
	
	@Autowired
	private OpeningStockRepo openingStockRepo ;
	
	@Autowired
	private HSNCodeMasterRepo hsnCodeMasterRepo ;
	
	@Autowired
	private TDSCodeMasterRepo tdsCodeMasterRepo ;
	
	@Autowired 
	private  TCSCodeMasterRepo tcsCodeMasterRepo ;
	
	//AccountMaster 
	public AccountMaster saveAccountMaster(AccountMaster accountMaster) {
		return accountMasterRepo.save(accountMaster);
	}

	public List<AccountMaster> findAllAccountMaster() {
		return accountMasterRepo.findAll();
	}
	
	public List<AccountMaster> listAll() {
		// TODO Auto-generated method stub
		return accountMasterRepo.findAll(Sort.by("id").ascending());
	}
	
	public List<AccountMaster> fetchData() {
		// TODO Auto-generated method stub
		return accountMasterRepo.findAll();
	}

	//Customer Master
	public CustomerMaster saveCustomerMaster(CustomerMaster customerMaster) {
		// TODO Auto-generated method stub
		return customerMasterRepo.save(customerMaster);
	}
	
	public List<CustomerMaster> findAllCustomerMaster() {
		// TODO Auto-generated method stub
		return customerMasterRepo.findAll();
	}

	//SupplierMaster
	public SupplierMaster saveSupplierMaster(SupplierMaster supplierMaster) {
		// TODO Auto-generated method stub
		return supplierMasterRepo.save(supplierMaster);
	}

	public List<SupplierMaster> findAllSupplierMaster() {
		// TODO Auto-generated method stub
		return supplierMasterRepo.findAll();
	}
	
	//EmployeeMaster
	public EmployeeMaster saveEmployeeMaster(EmployeeMaster employeeMaster) {
		// TODO Auto-generated method stub
		return employeeMasterRepo.save(employeeMaster);
	}

	public List<EmployeeMaster> findAllEmployeeMaster() {
		// TODO Auto-generated method stub
		return employeeMasterRepo.findAll();
	}

	//ItemMaster
	public ItemMaster saveItemMaster(ItemMaster itemMaster) {
		// TODO Auto-generated method stub
		return itemMasterRepo.save(itemMaster);
	}

	public List<ItemMaster> findAllItemMaster() {
		// TODO Auto-generated method stub
		return itemMasterRepo.findAll();
	}

	//OpeningStock
	public OpeningStock saveOpeningStock(OpeningStock openingStock) {
		// TODO Auto-generated method stub
		return openingStockRepo.save(openingStock);
	}

	public List<OpeningStock> findAllOpeningStock() {
		// TODO Auto-generated method stub
		return openingStockRepo.findAll();
	}

	//HSNCodeMaster
	public HSNCodeMaster saveHSNCodeMaster(HSNCodeMaster hsnCodeMaster) {
		// TODO Auto-generated method stub
		return hsnCodeMasterRepo.save(hsnCodeMaster);
	}

	public List<HSNCodeMaster> findAllHSN() {
		// TODO Auto-generated method stub
		return hsnCodeMasterRepo.findAll();
	}

	//TDSCodeMaster
	public TDSCodeMaster saveTDSCodeMaster(TDSCodeMaster tdsCodeMaster) {
		// TODO Auto-generated method stub
		return tdsCodeMasterRepo.save(tdsCodeMaster);
	}

	public List<TDSCodeMaster> findAllTDS() {
		// TODO Auto-generated method stub
		return tdsCodeMasterRepo.findAll();
	}

	//TCSCodeMaster
	public TCSCodeMaster saveTCSCodeMaster(TCSCodeMaster tcsCodeMaster) {
		// TODO Auto-generated method stub
		return tcsCodeMasterRepo.save(tcsCodeMaster);
	}

	public List<TCSCodeMaster> findAllTCS() {
		// TODO Auto-generated method stub
		return tcsCodeMasterRepo.findAll();
	}

	

	

	


	
}