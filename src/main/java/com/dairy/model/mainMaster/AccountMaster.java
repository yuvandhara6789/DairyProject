package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class AccountMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String accountName ;
	private String openingBalance ;
	private String panCardNo ;
	private String accountType ;
	private String accountGroup ;
	private String openingType ;
	private String aadharcardNo ;
	private String status ;
	private String gstNo;
	private String mainLegger ;
	private String isCostCenterAllocated;
	
	private boolean enabled ;
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(String openingBalance) {
		this.openingBalance = openingBalance;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}
	public String getOpeningType() {
		return openingType;
	}
	public void setOpeningType(String openingType) {
		this.openingType = openingType;
	}
	public String getAadharcardNo() {
		return aadharcardNo;
	}
	public void setAadharcardNo(String aadharcardNo) {
		this.aadharcardNo = aadharcardNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getMainLegger() {
		return mainLegger;
	}
	public void setMainLegger(String mainLegger) {
		this.mainLegger = mainLegger;
	}
	public String getIsCostCenterAllocated() {
		return isCostCenterAllocated;
	}
	public void setIsCostCenterAllocated(String isCostCenterAllocated) {
		this.isCostCenterAllocated = isCostCenterAllocated;
	}
	
	
 }
