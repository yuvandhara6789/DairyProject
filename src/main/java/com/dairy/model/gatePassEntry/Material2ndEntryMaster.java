package com.dairy.model.gatePassEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Material2ndEntryMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	private String time;
	private String transactionId;
	private String vehicleNo;
	private String isOutpassGenrated;
	private String outpassNo;
	private String remark;
	private String department;
	private String employee;
	private String warehouse;
	private String transMaterialType;
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getIsOutpassGenrated() {
		return isOutpassGenrated;
	}
	public void setIsOutpassGenrated(String isOutpassGenrated) {
		this.isOutpassGenrated = isOutpassGenrated;
	}
	public String getOutpassNo() {
		return outpassNo;
	}
	public void setOutpassNo(String outpassNo) {
		this.outpassNo = outpassNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getTransMaterialType() {
		return transMaterialType;
	}
	public void setTransMaterialType(String transMaterialType) {
		this.transMaterialType = transMaterialType;
	}
	
}
