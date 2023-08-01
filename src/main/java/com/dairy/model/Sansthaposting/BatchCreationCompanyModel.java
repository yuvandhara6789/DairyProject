package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class BatchCreationCompanyModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String batchId;
	private String batchNo;
	private String date;
	private String remark;
	private String milkName;
	private String milkType;
	private String wareHouse;
	private String totalFat;
	private String totalSnf;
	private String averageRate;
	private String totalQuantityKg;
	private String sansthaTotQuant;
	private String totalAmount;
	private String acidity;
	private String manualQuantityKg;
	private String manualFat;
	private String manualDegree;
	private String temperature;
	private String manualQuantity;
	private String manualSnf;
	private String totalSourQty;
	private String centerQuantity;
	private String totalQuantity;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getMilkName() {
		return milkName;
	}
	public void setMilkName(String milkName) {
		this.milkName = milkName;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getWareHouse() {
		return wareHouse;
	}
	public void setWareHouse(String wareHouse) {
		this.wareHouse = wareHouse;
	}
	public String getTotalFat() {
		return totalFat;
	}
	public void setTotalFat(String totalFat) {
		this.totalFat = totalFat;
	}
	public String getTotalSnf() {
		return totalSnf;
	}
	public void setTotalSnf(String totalSnf) {
		this.totalSnf = totalSnf;
	}
	public String getAverageRate() {
		return averageRate;
	}
	public void setAverageRate(String averageRate) {
		this.averageRate = averageRate;
	}
	public String getTotalQuantityKg() {
		return totalQuantityKg;
	}
	public void setTotalQuantityKg(String totalQuantityKg) {
		this.totalQuantityKg = totalQuantityKg;
	}
	public String getSansthaTotQuant() {
		return sansthaTotQuant;
	}
	public void setSansthaTotQuant(String sansthaTotQuant) {
		this.sansthaTotQuant = sansthaTotQuant;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getAcidity() {
		return acidity;
	}
	public void setAcidity(String acidity) {
		this.acidity = acidity;
	}
	public String getManualQuantityKg() {
		return manualQuantityKg;
	}
	public void setManualQuantityKg(String manualQuantityKg) {
		this.manualQuantityKg = manualQuantityKg;
	}
	public String getManualFat() {
		return manualFat;
	}
	public void setManualFat(String manualFat) {
		this.manualFat = manualFat;
	}
	public String getManualDegree() {
		return manualDegree;
	}
	public void setManualDegree(String manualDegree) {
		this.manualDegree = manualDegree;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getManualQuantity() {
		return manualQuantity;
	}
	public void setManualQuantity(String manualQuantity) {
		this.manualQuantity = manualQuantity;
	}
	public String getManualSnf() {
		return manualSnf;
	}
	public void setManualSnf(String manualSnf) {
		this.manualSnf = manualSnf;
	}
	public String getTotalSourQty() {
		return totalSourQty;
	}
	public void setTotalSourQty(String totalSourQty) {
		this.totalSourQty = totalSourQty;
	}
	public String getCenterQuantity() {
		return centerQuantity;
	}
	public void setCenterQuantity(String centerQuantity) {
		this.centerQuantity = centerQuantity;
	}
	public String getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	// transport details
	private String vehicleNo;
	private String driverName;
	private String mobileNo;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
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
	
	
	
	
	
	
}
