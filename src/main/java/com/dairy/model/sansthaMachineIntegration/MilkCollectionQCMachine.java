package com.dairy.model.sansthaMachineIntegration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class MilkCollectionQCMachine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id ;
	private String sampleNo ;
	private String collection ;
	private String rateType ;
	private String adulteration ;
	private String temperature ;
	private String alcoholTest ;
	private String fat ;
	private String snf ;
	private String date ;
	private String selectDock ;
	private String acidity ;
	private String venderCode ;
	private String rate ;
	private String degree ;
	private int purInwardId ;
	private String organolepticTest ;
	private String cobTest ;
	private String rateChart ;
	private int purchaseQCID ;
	private String remark ;
	private String selectType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSampleNo() {
		return sampleNo;
	}
	public void setSampleNo(String sampleNo) {
		this.sampleNo = sampleNo;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
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
	public String getAlcoholTest() {
		return alcoholTest;
	}
	public void setAlcoholTest(String alcoholTest) {
		this.alcoholTest = alcoholTest;
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
	public String getVenderCode() {
		return venderCode;
	}
	public void setVenderCode(String venderCode) {
		this.venderCode = venderCode;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public int getPurInwardId() {
		return purInwardId;
	}
	public void setPurInwardId(int purInwardId) {
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
	public int getPurchaseQCID() {
		return purchaseQCID;
	}
	public void setPurchaseQCID(int purchaseQCID) {
		this.purchaseQCID = purchaseQCID;
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
	
  }
