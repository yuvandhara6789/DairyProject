package com.dairy.model.gatePassEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntryInMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String date;
	private String employeeId;
	private String employeeeGroup;
	private String type;
	private String employeeName;
	private String selectEmployee;
	private String department;
	private String onlineOffline;
	private String inTime;
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
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeeGroup() {
		return employeeeGroup;
	}
	public void setEmployeeeGroup(String employeeeGroup) {
		this.employeeeGroup = employeeeGroup;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getSelectEmployee() {
		return selectEmployee;
	}
	public void setSelectEmployee(String selectEmployee) {
		this.selectEmployee = selectEmployee;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getOnlineOffline() {
		return onlineOffline;
	}
	public void setOnlineOffline(String onlineOffline) {
		this.onlineOffline = onlineOffline;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	
	
}
