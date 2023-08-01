package com.dairy.model.BulkMilkEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MilkGRN {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	private String manualNo;
	private String date;
	private String employee;
	private String vendorName;
	private String vehicleNo;
	private String ourGrossWeight;
	private String vendorNetWeight;
	private String emptyVehicleWeight;
	private String venderGrossWeight;
	private String remark;
	private String ourNetWeight;
	private String finalWeightLTR;
	private String rate;
	private String rateReduction;
	private String finalRate;
	private String totalAmount;
	private String warehouse;
	private String item;
	private String unit;
	private String batch;
	@Transient
	private String fDate;
	@Transient
	private String tDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManualNo() {
		return manualNo;
	}
	public void setManualNo(String manualNo) {
		this.manualNo = manualNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getOurGrossWeight() {
		return ourGrossWeight;
	}
	public void setOurGrossWeight(String ourGrossWeight) {
		this.ourGrossWeight = ourGrossWeight;
	}
	public String getVendorNetWeight() {
		return vendorNetWeight;
	}
	public void setVendorNetWeight(String vendorNetWeight) {
		this.vendorNetWeight = vendorNetWeight;
	}
	public String getEmptyVehicleWeight() {
		return emptyVehicleWeight;
	}
	public void setEmptyVehicleWeight(String emptyVehicleWeight) {
		this.emptyVehicleWeight = emptyVehicleWeight;
	}
	public String getVenderGrossWeight() {
		return venderGrossWeight;
	}
	public void setVenderGrossWeight(String venderGrossWeight) {
		this.venderGrossWeight = venderGrossWeight;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOurNetWeight() {
		return ourNetWeight;
	}
	public void setOurNetWeight(String ourNetWeight) {
		this.ourNetWeight = ourNetWeight;
	}
	public String getFinalWeightLTR() {
		return finalWeightLTR;
	}
	public void setFinalWeightLTR(String finalWeightLTR) {
		this.finalWeightLTR = finalWeightLTR;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRateReduction() {
		return rateReduction;
	}
	public void setRateReduction(String rateReduction) {
		this.rateReduction = rateReduction;
	}
	public String getFinalRate() {
		return finalRate;
	}
	public void setFinalRate(String finalRate) {
		this.finalRate = finalRate;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
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
	
	
}
