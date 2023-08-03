package com.dairy.model.gatePassEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class EmployeeOutEntryMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String date;
    private String employeeName;
	private String type;
	private String employeeGroup;
	private String onlineOffline;
	private String inOnlineOffline;
	private String department;
	private String outTime;
	private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmployeeGroup() {
		return employeeGroup;
	}
	public void setEmployeeGroup(String employeeGroup) {
		this.employeeGroup = employeeGroup;
	}
	public String getOnlineOffline() {
		return onlineOffline;
	}
	public void setOnlineOffline(String onlineOffline) {
		this.onlineOffline = onlineOffline;
	}
	public String getInOnlineOffline() {
		return inOnlineOffline;
	}
	public void setInOnlineOffline(String inOnlineOffline) {
		this.inOnlineOffline = inOnlineOffline;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
