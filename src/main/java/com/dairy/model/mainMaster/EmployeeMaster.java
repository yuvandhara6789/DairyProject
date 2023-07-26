package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id ;
	
	private String employeeName ;
	private String status ;
	private String gender ;
	private String accountGroup ;
	private String type ;
	private String category ;
	private String grp ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAccountGroup() {
		return accountGroup;
	}
	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	//Joining Details 
		private String dateOfBirth ;
		private String retirementDate ;
		private String jobProfile ;
		private String noticeDays ;
		private String joiningDate ;
		private String salary ;
		private String department ;
		private String companyEmail ;
		private String contractEndDate ;
		private String salaryMode ;
		private String designation ;
		private String attendanceID ;
		private String enterCast ;
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getRetirementDate() {
			return retirementDate;
		}
		public void setRetirementDate(String retirementDate) {
			this.retirementDate = retirementDate;
		}
		public String getJobProfile() {
			return jobProfile;
		}
		public void setJobProfile(String jobProfile) {
			this.jobProfile = jobProfile;
		}
		public String getNoticeDays() {
			return noticeDays;
		}
		public void setNoticeDays(String noticeDays) {
			this.noticeDays = noticeDays;
		}
		public String getJoiningDate() {
			return joiningDate;
		}
		public void setJoiningDate(String joiningDate) {
			this.joiningDate = joiningDate;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public String getCompanyEmail() {
			return companyEmail;
		}
		public void setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
		}
		public String getContractEndDate() {
			return contractEndDate;
		}
		public void setContractEndDate(String contractEndDate) {
			this.contractEndDate = contractEndDate;
		}
		public String getSalaryMode() {
			return salaryMode;
		}
		public void setSalaryMode(String salaryMode) {
			this.salaryMode = salaryMode;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getAttendanceID() {
			return attendanceID;
		}
		public void setAttendanceID(String attendanceID) {
			this.attendanceID = attendanceID;
		}
		public String getEnterCast() {
			return enterCast;
		}
		public void setEnterCast(String enterCast) {
			this.enterCast = enterCast;
		}
		
		//Contact Details 
		private String address ;
		private String mobile ;
		private String eMail ;
		private String city ;
		private String district ;
		private String pinCode ;
		private String state ;
		private String country ;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
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
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		
		//Account Details
		
		private String openingBalance ;
		private String uanNo ;
		private String debitCredit ;
		private String epfNo ;
		private String panNo ;
		private String esiNo ;
		private String accountNo ;
		private String bankName ;
		private String branch ;
		private String ifscCode ;
		private String micrNo ;
		private String bankAddress ;
		public String getOpeningBalance() {
			return openingBalance;
		}
		public void setOpeningBalance(String openingBalance) {
			this.openingBalance = openingBalance;
		}
		public String getUanNo() {
			return uanNo;
		}
		public void setUanNo(String uanNo) {
			this.uanNo = uanNo;
		}
		public String getDebitCredit() {
			return debitCredit;
		}
		public void setDebitCredit(String debitCredit) {
			this.debitCredit = debitCredit;
		}
		public String getEpfNo() {
			return epfNo;
		}
		public void setEpfNo(String epfNo) {
			this.epfNo = epfNo;
		}
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public String getEsiNo() {
			return esiNo;
		}
		public void setEsiNo(String esiNo) {
			this.esiNo = esiNo;
		}
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
		public String getIfscCode() {
			return ifscCode;
		}
		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}
		public String getMicrNo() {
			return micrNo;
		}
		public void setMicrNo(String micrNo) {
			this.micrNo = micrNo;
		}
		public String getBankAddress() {
			return bankAddress;
		}
		public void setBankAddress(String bankAddress) {
			this.bankAddress = bankAddress;
		}
		
		//Other Details 
		
		private String bloodGroup ;
		private String aadharCardNo ;
		private String education ;
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public String getAadharCardNo() {
			return aadharCardNo;
		}
		public void setAadharCardNo(String aadharCardNo) {
			this.aadharCardNo = aadharCardNo;
		}
		public String getEducation() {
			return education;
		}
		public void setEducation(String education) {
			this.education = education;
		}
		
		private String managers ;
		private String isCostCenterAllocated ;
		private String subLedgerName ;
		private String grp1 ;
		public String getManagers() {
			return managers;
		}
		public void setManagers(String managers) {
			this.managers = managers;
		}
		public String getIsCostCenterAllocated() {
			return isCostCenterAllocated;
		}
		public void setIsCostCenterAllocated(String isCostCenterAllocated) {
			this.isCostCenterAllocated = isCostCenterAllocated;
		}
		public String getSubLedgerName() {
			return subLedgerName;
		}
		public void setSubLedgerName(String subLedgerName) {
			this.subLedgerName = subLedgerName;
		}
		public String getGrp1() {
			return grp1;
		}
		public void setGrp1(String grp1) {
			this.grp1 = grp1;
		}
		
		
		
		
}
