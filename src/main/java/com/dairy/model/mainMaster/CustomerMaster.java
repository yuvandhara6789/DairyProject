package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id ;
	private String customerName ;
	private String salesPerson ;
	private String emailID ;
	private String openingBalance ;
	private String selectRouteName ;
	private String taxType ;
	private String accountGroup ;
	private String category ;
	private String grp ;
	private String debitCredit ;
	private String mainLedger ;
	private String gstState ;
	private String typeOfGst ;
	private String gstNo ;
	private String status ;
	private String alias ;
	private String anniveryDate ;
	private String milkRateContract ;
	private String byProductRate ;
	private String iceCreamRate ;
	private String otherRate ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSalesPerson() {
		return salesPerson;
	}
	public void setSalesPerson(String salesPerson) {
		this.salesPerson = salesPerson;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getSelectRouteName() {
		return selectRouteName;
	}
	public void setSelectRouteName(String selectRouteName) {
		this.selectRouteName = selectRouteName;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}
	public String getMainLedger() {
		return mainLedger;
	}
	public void setMainLedger(String mainLedger) {
		this.mainLedger = mainLedger;
	}
	public String getGstState() {
		return gstState;
	}
	public void setGstState(String gstState) {
		this.gstState = gstState;
	}
	public String getTypeOfGst() {
		return typeOfGst;
	}
	public void setTypeOfGst(String typeOfGst) {
		this.typeOfGst = typeOfGst;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getAnniveryDate() {
		return anniveryDate;
	}
	public void setAnniveryDate(String anniveryDate) {
		this.anniveryDate = anniveryDate;
	}
	public String getMilkRateContract() {
		return milkRateContract;
	}
	public void setMilkRateContract(String milkRateContract) {
		this.milkRateContract = milkRateContract;
	}
	public String getByProductRate() {
		return byProductRate;
	}
	public void setByProductRate(String byProductRate) {
		this.byProductRate = byProductRate;
	}
	public String getIceCreamRate() {
		return iceCreamRate;
	}
	public void setIceCreamRate(String iceCreamRate) {
		this.iceCreamRate = iceCreamRate;
	}
	public String getOtherRate() {
		return otherRate;
	}
	public void setOtherRate(String otherRate) {
		this.otherRate = otherRate;
	}
	
	
	/* Address Details*/
	private String address ;
	private String area ;
	private String taluka ;
	private String district ;
	private String city ;
	private String pinCode ;
	private String state ;
	private String phoneNo ;
	private String mobileNo ;
	private String transitDays ;
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
	public String getTransitDays() {
		return transitDays;
	}
	public void setTransitDays(String transitDays) {
		this.transitDays = transitDays;
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
	
	//ACCOUNT details
	private String panNo ;
	private String creditDays ;
	private String interestCalculation ;
	private String customerType ;
	private String fssaiNo ;
	private String creditLimit ;
	private String securityCheck ;
	private String fssaiED ;
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getCreditDays() {
		return creditDays;
	}
	public void setCreditDays(String creditDays) {
		this.creditDays = creditDays;
	}
	public String getInterestCalculation() {
		return interestCalculation;
	}
	public void setInterestCalculation(String interestCalculation) {
		this.interestCalculation = interestCalculation;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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
	public String getSecurityCheck() {
		return securityCheck;
	}
	public void setSecurityCheck(String securityCheck) {
		this.securityCheck = securityCheck;
	}
	public String getFssaiED() {
		return fssaiED;
	}
	public void setFssaiED(String fssaiED) {
		this.fssaiED = fssaiED;
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
	private String amid ;
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
	public String getAmid() {
		return amid;
	}
	public void setAmid(String amid) {
		this.amid = amid;
	}
	

	
	
 
}
