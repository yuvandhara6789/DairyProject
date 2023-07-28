package com.dairy.model.sansthaMachineIntegration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MilkCollectionKg {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	private int    inwardId;
	private String selectDock;
	private String milkType;
	private String collectionType;
	private String sansthaName;
	private String mobileNo;
	private String routeName;
	private String rateType;
	private String address;
	private String sampleNo;
	private String weightKg;
	private String weightLtr;
	private String sansthaCode;
	private String canQty;
	private String machineWeight;
	private String sourCanQty;
	private String sourWeight;
	
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
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getInwardId() {
		return inwardId;
	}
	public void setInwardId(int inwardId) {
		this.inwardId = inwardId;
	}
	public String getSelectDock() {
		return selectDock;
	}
	public void setSelectDock(String selectDock) {
		this.selectDock = selectDock;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}
	public String getSansthaName() {
		return sansthaName;
	}
	public void setSansthaName(String sansthaName) {
		this.sansthaName = sansthaName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSampleNo() {
		return sampleNo;
	}
	public void setSampleNo(String sampleNo) {
		this.sampleNo = sampleNo;
	}
	public String getWeightKg() {
		return weightKg;
	}
	public void setWeightKg(String weightKg) {
		this.weightKg = weightKg;
	}
	public String getWeightLtr() {
		return weightLtr;
	}
	public void setWeightLtr(String weightLtr) {
		this.weightLtr = weightLtr;
	}
	public String getSansthaCode() {
		return sansthaCode;
	}
	public void setSansthaCode(String sansthaCode) {
		this.sansthaCode = sansthaCode;
	}
	public String getCanQty() {
		return canQty;
	}
	public void setCanQty(String canQty) {
		this.canQty = canQty;
	}
	public String getMachineWeight() {
		return machineWeight;
	}
	public void setMachineWeight(String machineWeight) {
		this.machineWeight = machineWeight;
	}
	public String getSourCanQty() {
		return sourCanQty;
	}
	public void setSourCanQty(String sourCanQty) {
		this.sourCanQty = sourCanQty;
	}
	public String getSourWeight() {
		return sourWeight;
	}
	public void setSourWeight(String sourWeight) {
		this.sourWeight = sourWeight;
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
