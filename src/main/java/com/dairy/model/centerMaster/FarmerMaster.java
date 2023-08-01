package com.dairy.model.centerMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FarmerMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String sansthacenter;
	private String status;
	private String typeofgst;
	private String farmername;
	private String gstno;
	private String description;
	private String debetcredit;
	private String mobileno;
	private String category;
	private String accountgroup;
	private String openingbalance;
	private String grp;
	private String alias;
	private String cmchart;
	private String bmchart;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCmchart() {
		return cmchart;
	}

	public void setCmchart(String cmchart) {
		this.cmchart = cmchart;
	}

	public String getBmchart() {
		return bmchart;
	}

	public void setBmchart(String bmchart) {
		this.bmchart = bmchart;
	}
	
	public String getSansthacenter() {
		return sansthacenter;
	}

	public void setSansthacenter(String sansthacenter) {
		this.sansthacenter = sansthacenter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTypeofgst() {
		return typeofgst;
	}

	public void setTypeofgst(String typeofgst) {
		this.typeofgst = typeofgst;
	}

	public String getFarmername() {
		return farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDebetcredit() {
		return debetcredit;
	}

	public void setDebetcredit(String debetcredit) {
		this.debetcredit = debetcredit;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAccountgroup() {
		return accountgroup;
	}

	public void setAccountgroup(String accountgroup) {
		this.accountgroup = accountgroup;
	}

	public String getOpeningbalance() {
		return openingbalance;
	}

	public void setOpeningbalance(String openingbalance) {
		this.openingbalance = openingbalance;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	

	// Address Details
	private String address;
	private String area;
	private String taluka;
	private String district;
	private String city;
	private String pincode;
	private String state;
	private String phoneno;

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// Contact Details
	private String contactperson;
	private String number;
	private String designation;
	private String email;
	private String dateofbirth;

	
	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Account Details
	private String fassino;
	private String panno;
	private String farmertype;
	private String creditdays;
	private String creditlimit;
	private String interestcalculation;

	public String getFassino() {
		return fassino;
	}

	public void setFassino(String fassino) {
		this.fassino = fassino;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getFarmertype() {
		return farmertype;
	}

	public void setFarmertype(String farmertype) {
		this.farmertype = farmertype;
	}

	public String getCreditdays() {
		return creditdays;
	}

	public void setCreditdays(String creditdays) {
		this.creditdays = creditdays;
	}

	public String getCreditlimit() {
		return creditlimit;
	}

	public void setCreditlimit(String creditlimit) {
		this.creditlimit = creditlimit;
	}

	public String getInterestcalculation() {
		return interestcalculation;
	}

	public void setInterestcalculation(String interestcalculation) {
		this.interestcalculation = interestcalculation;
	}

	// Bank Details
	private String accountno;
	private String bankname;
	private String branch;
	private String ifscno;
	private String micrno;
	private String bankadd;

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getIfscno() {
		return ifscno;
	}

	public void setIfscno(String ifscno) {
		this.ifscno = ifscno;
	}

	public String getMicrno() {
		return micrno;
	}

	public void setMicrno(String micrno) {
		this.micrno = micrno;
	}

	public String getBankadd() {
		return bankadd;
	}

	public void setBankadd(String bankadd) {
		this.bankadd = bankadd;
	}

}
