package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SupplierMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	//SupplierMaster Details
	private int id ;
	private String supplierName ;
	private String grp ;
	private String openingBalance ; 
	private String alias ;
	private String gstNo ;
	private String category ;
	private String debitCredit ;
	private String status ;
	private String description ;
	private String accountgrp ;
	private String taxType ;
	private String typeOfGst ;
	private String emailID ;
	private String mainLedger ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAccountgrp() {
		return accountgrp;
	}
	public void setAccountgrp(String accountgrp) {
		this.accountgrp = accountgrp;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getTypeOfGst() {
		return typeOfGst;
	}
	public void setTypeOfGst(String typeOfGst) {
		this.typeOfGst = typeOfGst;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getMainLedger() {
		return mainLedger;
	}
	public void setMainLedger(String mainLedger) {
		this.mainLedger = mainLedger;
	}
	
	
//Address Details
	
	private String address ;
	private String area ;
	private String taluka ;
	private String district ;
	private String city ;
	private String pinCode ;
	private String state ;
	private String phoneNo ;
	private String mobileNo ;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	//Contact Details
		private String contactPerson ;
		private String mobile ;
		private String designation ;
		private String eMail ;
		private String dateofBirth ;
		public String getContactPerson() {
			return contactPerson;
		}
		public void setContactPerson(String contactPerson) {
			this.contactPerson = contactPerson;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public String getDateofBirth() {
			return dateofBirth;
		}
		public void setDateofBirth(String dateofBirth) {
			this.dateofBirth = dateofBirth;
		}
		
		
		//Account Details
		private String buyerName ;
		private String creditDays ;
		private String fssaiNo ;
		private String creditLimit ;
		private String panNo ;
		private String interestCalculation ;
		public String getBuyerName() {
			return buyerName;
		}
		public void setBuyerName(String buyerName) {
			this.buyerName = buyerName;
		}
		public String getCreditDays() {
			return creditDays;
		}
		public void setCreditDays(String creditDays) {
			this.creditDays = creditDays;
		}
		public String getFssaiNo() {
			return fssaiNo;
		}
		public void setFssaiNo(String fssaiNo) {
			this.fssaiNo = fssaiNo;
		}
		public String getCreditLimit() {
			return creditLimit;
		}
		public void setCreditLimit(String creditLimit) {
			this.creditLimit = creditLimit;
		}
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public String getInterestCalculation() {
			return interestCalculation;
		}
		public void setInterestCalculation(String interestCalculation) {
			this.interestCalculation = interestCalculation;
		}
		
		
		//Bank Details
		private String accountNo ;
		private String bankName ;
		private String branch ;
		private String ifscNo ;
		private String micrNo ;
		private String address1;
		public String getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
		public String getIfscNo() {
			return ifscNo;
		}
		public void setIfscNo(String ifscNo) {
			this.ifscNo = ifscNo;
		}
		public String getMicrNo() {
			return micrNo;
		}
		public void setMicrNo(String micrNo) {
			this.micrNo = micrNo;
		}
		public String getAddress1() {
			return address1;
		}
		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		
		//Create Ledger
		private String subLedgerName ;
		private String group1 ;
		public String getSubLedgerName() {
			return subLedgerName;
		}
		public void setSubLedgerName(String subLedgerName) {
			this.subLedgerName = subLedgerName;
		}
		public String getGroup1() {
			return group1;
		}
		public void setGroup1(String group1) {
			this.group1 = group1;
		}
		
	

}
