package com.dairy.model.BulkMilkEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class VehicleEntry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String milkType;
	private String vendorFAT;
	private String vehicleNumber;
	private String remark;
	private String date;
	private String collection;
	private String vendorSNF;								//git hub 2.1.4 & tortise Git Download
	private String driverName;
	private String vendorName;
	private String netWeight;
	private String vendorAcidity;
	private String driverMobNo;
	private String vendorDate;
	private String grossWeight;
	private String challanNo;
	@Transient
	private String toDate;
	@Transient
	private String fromDate;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getVendorFAT() {
		return vendorFAT;
	}
	public void setVendorFAT(String vendorFAT) {
		this.vendorFAT = vendorFAT;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getVendorSNF() {
		return vendorSNF;
	}
	public void setVendorSNF(String vendorSNF) {
		this.vendorSNF = vendorSNF;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(String netWeight) {
		this.netWeight = netWeight;
	}
	public String getVendorAcidity() {
		return vendorAcidity;
	}
	public void setVendorAcidity(String vendorAcidity) {
		this.vendorAcidity = vendorAcidity;
	}
	public String getDriverMobNo() {
		return driverMobNo;
	}
	public void setDriverMobNo(String driverMobNo) {
		this.driverMobNo = driverMobNo;
	}
	public String getVendorDate() {
		return vendorDate;
	}
	public void setVendorDate(String vendorDate) {
		this.vendorDate = vendorDate;
	}
	public String getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(String grossWeight) {
		this.grossWeight = grossWeight;
	}
	public String getChallanNo() {
		return challanNo;
	}
	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
}
