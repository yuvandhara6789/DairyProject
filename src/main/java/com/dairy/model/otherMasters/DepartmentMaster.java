package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DepartmentMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id ;
	private String departmentName ;
	private String expenseAccount ;
	private String payableAccount ;
	private String designation ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getExpenseAccount() {
		return expenseAccount;
	}
	public void setExpenseAccount(String expenseAccount) {
		this.expenseAccount = expenseAccount;
	}
	public String getPayableAccount() {
		return payableAccount;
	}
	public void setPayableAccount(String payableAccount) {
		this.payableAccount = payableAccount;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	

}
