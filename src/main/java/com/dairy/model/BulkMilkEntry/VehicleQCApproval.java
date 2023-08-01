package com.dairy.model.BulkMilkEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class VehicleQCApproval {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String venderName;
	private String vehicleDate;
	private String remark;
	private String date;
	private String vehicleNo;
	private String rateReduction;
	private String milkType;
	
	@Transient
	private String fDate;
	
	@Transient
	private String tDate;

	public String getfDate() {
		return fDate;
	}

	public void setfDate(String fDate) {
		this.fDate = fDate;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVenderName() {
		return venderName;
	}

	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}

	public String getVehicleDate() {
		return vehicleDate;
	}

	public void setVehicleDate(String vehicleDate) {
		this.vehicleDate = vehicleDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getRateReduction() {
		return rateReduction;
	}

	public void setRateReduction(String rateReduction) {
		this.rateReduction = rateReduction;
	}

	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
}
