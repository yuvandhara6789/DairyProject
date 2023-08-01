package com.dairy.model.BulkMilkEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MilkGrnToPurchase {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String batchId;
	private String batchNo;
	private String date;
	@Transient
	private String fDate;
	
	@Transient
	private String tDate;
	private String supplier;
	private String transportRate;
	private String overchange;
	private String remark;
	private String item;
	private String unit;
	private String batch;
	private String warehouse;
	private String vehicleNo;
	private String netQty;
	private String milkType;
	private String fat;
	private String snf;
	private String rate;
	private String rateReduction;
	private String finalRate;
	private String totalAmount;
	private String entryBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getTransportRate() {
		return transportRate;
	}
	public void setTransportRate(String transportRate) {
		this.transportRate = transportRate;
	}
	public String getOverchange() {
		return overchange;
	}
	public void setOverchange(String overchange) {
		this.overchange = overchange;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getNetQty() {
		return netQty;
	}
	public void setNetQty(String netQty) {
		this.netQty = netQty;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getSnf() {
		return snf;
	}
	public void setSnf(String snf) {
		this.snf = snf;
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
	public String getEntryBy() {
		return entryBy;
	}
	public void setEntryBy(String entryBy) {
		this.entryBy = entryBy;
	}
	
}
