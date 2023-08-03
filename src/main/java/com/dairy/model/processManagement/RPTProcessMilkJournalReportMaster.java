package com.dairy.model.processManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class RPTProcessMilkJournalReportMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String date;
	@Transient
	private String fDate;
	@Transient
	private String tDate;
	private String typeOfProcess;
	private String outWarehouse;
	private String milkItemName;
	private String productItemWarehouse;
	private String productItemName;
	private String smpItemWarehouse;
	private String itemName1;
	private String skimmedItemWarehouse;
	private String itemName2;
	
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
	public String getTypeOfProcess() {
		return typeOfProcess;
	}
	public void setTypeOfProcess(String typeOfProcess) {
		this.typeOfProcess = typeOfProcess;
	}
	public String getOutWarehouse() {
		return outWarehouse;
	}
	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}
	public String getMilkItemName() {
		return milkItemName;
	}
	public void setMilkItemName(String milkItemName) {
		this.milkItemName = milkItemName;
	}
	public String getProductItemWarehouse() {
		return productItemWarehouse;
	}
	public void setProductItemWarehouse(String productItemWarehouse) {
		this.productItemWarehouse = productItemWarehouse;
	}
	public String getProductItemName() {
		return productItemName;
	}
	public void setProductItemName(String productItemName) {
		this.productItemName = productItemName;
	}
	public String getSmpItemWarehouse() {
		return smpItemWarehouse;
	}
	public void setSmpItemWarehouse(String smpItemWarehouse) {
		this.smpItemWarehouse = smpItemWarehouse;
	}
	public String getItemName1() {
		return itemName1;
	}
	public void setItemName1(String itemName1) {
		this.itemName1 = itemName1;
	}
	public String getSkimmedItemWarehouse() {
		return skimmedItemWarehouse;
	}
	public void setSkimmedItemWarehouse(String skimmedItemWarehouse) {
		this.skimmedItemWarehouse = skimmedItemWarehouse;
	}
	public String getItemName2() {
		return itemName2;
	}
	public void setItemName2(String itemName2) {
		this.itemName2 = itemName2;
	}

}
