package com.dairy.model.milkCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CombinationColletionWithQc 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String inwardId;
	private String inwardDate;
	private String collectionType;
	private String rateType;
	private String dock;
	private String sampleNo;
	private String santhaCode;
	private String weignt;
	private String fat;
	private String santhaName;
	private String mobileno;
	private String address;
	private String rate;
	private String snf;
	private String rateChart;
	private String degree;
	private String type;
	private String acidity;
	private String temperature;
	private String sourCanQty;
	private String sourWeight;
	private String reduceRate;
	private String alcoholTest;
	private String cobTest;
	private String adulteration;
	private String organolepticTest;
	private String total;
	private String milkType;
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
	public String getInwardId() {
		return inwardId;
	}
	public void setInwardId(String inwardId) {
		this.inwardId = inwardId;
	}
	public String getInwardDate() {
		return inwardDate;
	}
	public void setInwardDate(String inwardDate) {
		this.inwardDate = inwardDate;
	}
	public String getCollectionType() {
		return collectionType;
	}
	public void setCollectionType(String collectionType) {
		this.collectionType = collectionType;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getDock() {
		return dock;
	}
	public void setDock(String dock) {
		this.dock = dock;
	}
	public String getSampleNo() {
		return sampleNo;
	}
	public void setSampleNo(String sampleNo) {
		this.sampleNo = sampleNo;
	}
	public String getSanthaCode() {
		return santhaCode;
	}
	public void setSanthaCode(String santhaCode) {
		this.santhaCode = santhaCode;
	}
	public String getWeignt() {
		return weignt;
	}
	public void setWeignt(String weignt) {
		this.weignt = weignt;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getSanthaName() {
		return santhaName;
	}
	public void setSanthaName(String santhaName) {
		this.santhaName = santhaName;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getSnf() {
		return snf;
	}
	public void setSnf(String snf) {
		this.snf = snf;
	}
	public String getRateChart() {
		return rateChart;
	}
	public void setRateChart(String rateChart) {
		this.rateChart = rateChart;
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
	
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAcidity() {
		return acidity;
	}
	public void setAcidity(String acidity) {
		this.acidity = acidity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
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
	public String getReduceRate() {
		return reduceRate;
	}
	public void setReduceRate(String reduceRate) {
		this.reduceRate = reduceRate;
	}
	public String getAlcoholTest() {
		return alcoholTest;
	}
	public void setAlcoholTest(String alcoholTest) {
		this.alcoholTest = alcoholTest;
	}
	public String getCobTest() {
		return cobTest;
	}
	public void setCobTest(String cobTest) {
		this.cobTest = cobTest;
	}
	public String getAdulteration() {
		return adulteration;
	}
	public void setAdulteration(String adulteration) {
		this.adulteration = adulteration;
	}
	public String getOrganolepticTest() {
		return organolepticTest;
	}
	public void setOrganolepticTest(String organolepticTest) {
		this.organolepticTest = organolepticTest;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	
}
