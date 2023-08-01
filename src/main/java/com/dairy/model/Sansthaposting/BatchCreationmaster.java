package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BatchCreationmaster {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	private String date;
	private String center;
	private String wareHouse;
	private String collectionType;
	private String milkType;
	private String remark;
	private String totalFat;
	private String totalQuantity;
	private String manualFat;
	private String manualQuantity;
	private String totalSnf;
	private String totalAmount;
	private String manualDegree;
	private String manualSnf;
	private String averageRate;
	private String totalsourQuantity;
	private String vehicleName;
	private String vehicleNumber;
	private String driverName;
	private String driverMobile;
	private String fDate;
	private String tDate;
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
	public String getCenter() {
		return center;
	}
	public void setCenter(String center) {
		this.center = center;
	}
	public String getWareHouse() {
		return wareHouse;
	}
	public void setWareHouse(String wareHouse) {
		this.wareHouse = wareHouse;
	}
	public String getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTotalFat() {
		return totalFat;
	}
	public void setTotalFat(String totalFat) {
		this.totalFat = totalFat;
	}
	public String getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public String getManualFat() {
		return manualFat;
	}
	public void setManualFat(String manualFat) {
		this.manualFat = manualFat;
	}
	public String getManualQuantity() {
		return manualQuantity;
	}
	public void setManualQuantity(String manualQuantity) {
		this.manualQuantity = manualQuantity;
	}
	public String getTotalSnf() {
		return totalSnf;
	}
	public void setTotalSnf(String totalSnf) {
		this.totalSnf = totalSnf;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getManualDegree() {
		return manualDegree;
	}
	public void setManualDegree(String manualDegree) {
		this.manualDegree = manualDegree;
	}
	public String getManualSnf() {
		return manualSnf;
	}
	public void setManualSnf(String manualSnf) {
		this.manualSnf = manualSnf;
	}
	public String getAverageRate() {
		return averageRate;
	}
	public void setAverageRate(String averageRate) {
		this.averageRate = averageRate;
	}
	public String getTotalsourQuantity() {
		return totalsourQuantity;
	}
	public void setTotalsourQuantity(String totalsourQuantity) {
		this.totalsourQuantity = totalsourQuantity;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverMobile() {
		return driverMobile;
	}
	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
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
