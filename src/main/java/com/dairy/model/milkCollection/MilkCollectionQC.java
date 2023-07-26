package com.dairy.model.milkCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

@Entity
public class MilkCollectionQC {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String shift ;
	private String rateType ;
	private String adulteration ;
	private String temperature ;
	private String alcohalTest ;
	@NotBlank(message ="Enter FAT")
	private String fat ;
	private String degree ;
	private String snf ;
	private String date ;
	private String selectDock ;
	private String acidity ;
	private String vendorCode ;
	private String rate ;
	private String purInwardId ;
	private String organolepticTest ;
	private String cobTest ;
	private String rateChart ;
	private String purchaseQcId ;
	private String remark ;
	private String selectType ;
	@Transient
	private String fDate ;
	@Transient
	private String tDate ;
	 
	private double calculationResult;
	public int getId() {
		return id;
	}
	public double getCalculationResult() {
		return calculationResult;
	}
	public void setCalculationResult(double calculationResult) {
		this.calculationResult = calculationResult;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getAdulteration() {
		return adulteration;
	}
	public void setAdulteration(String adulteration) {
		this.adulteration = adulteration;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getAlcohalTest() {
		return alcohalTest;
	}
	public void setAlcohalTest(String alcohalTest) {
		this.alcohalTest = alcohalTest;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSnf() {
		return snf;
	}
	public void setSnf(String snf) {
		this.snf = snf;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSelectDock() {
		return selectDock;
	}
	public void setSelectDock(String selectDock) {
		this.selectDock = selectDock;
	}
	public String getAcidity() {
		return acidity;
	}
	public void setAcidity(String acidity) {
		this.acidity = acidity;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getPurInwardId() {
		return purInwardId;
	}
	public void setPurInwardId(String purInwardId) {
		this.purInwardId = purInwardId;
	}
	public String getOrganolepticTest() {
		return organolepticTest;
	}
	public void setOrganolepticTest(String organolepticTest) {
		this.organolepticTest = organolepticTest;
	}
	public String getCobTest() {
		return cobTest;
	}
	public void setCobTest(String cobTest) {
		this.cobTest = cobTest;
	}
	public String getRateChart() {
		return rateChart;
	}
	public void setRateChart(String rateChart) {
		this.rateChart = rateChart;
	}
	public String getPurchaseQcId() {
		return purchaseQcId;
	}
	public void setPurchaseQcId(String purchaseQcId) {
		this.purchaseQcId = purchaseQcId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSelectType() {
		return selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
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
