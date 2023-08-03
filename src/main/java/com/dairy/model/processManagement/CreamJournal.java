package com.dairy.model.processManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreamJournal 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//Cream Journal
	
	private String actualOutput;
	private String totalCreamExpected;
	private String date;
	private String skimmedMilkCream;
	private String totalMilk;
	private String outWarehouse;
	private String systemLoss;
	private String creamInLtr;
	private String actualLoss;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getActualOutput() {
		return actualOutput;
	}
	public void setActualOutput(String actualOutput) {
		this.actualOutput = actualOutput;
	}
	public String getTotalCreamExpected() {
		return totalCreamExpected;
	}
	public void setTotalCreamExpected(String totalCreamExpected) {
		this.totalCreamExpected = totalCreamExpected;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSkimmedMilkCream() {
		return skimmedMilkCream;
	}
	public void setSkimmedMilkCream(String skimmedMilkCream) {
		this.skimmedMilkCream = skimmedMilkCream;
	}
	public String getTotalMilk() {
		return totalMilk;
	}
	public void setTotalMilk(String totalMilk) {
		this.totalMilk = totalMilk;
	}
	public String getOutWarehouse() {
		return outWarehouse;
	}
	public void setOutWarehouse(String outWarehouse) {
		this.outWarehouse = outWarehouse;
	}
	public String getSystemLoss() {
		return systemLoss;
	}
	public void setSystemLoss(String systemLoss) {
		this.systemLoss = systemLoss;
	}
	public String getCreamInLtr() {
		return creamInLtr;
	}
	public void setCreamInLtr(String creamInLtr) {
		this.creamInLtr = creamInLtr;
	}
	public String getActualLoss() {
		return actualLoss;
	}
	public void setActualLoss(String actualLoss) {
		this.actualLoss = actualLoss;
	}
	
	
//Out Item Details
	private String item;
	private String fat;
	private String unit;
	private String snf;
	private String batch;
	private String remark;
	private String quantity;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSnf() {
		return snf;
	}
	public void setSnf(String snf) {
		this.snf = snf;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
//Cream Details
	
	private String inWarehouse;
	private String cditem;
	private String cdfat;
	private String cdunit;
	private String cdsnf;
	private String cdbatch;
	private String cdremark;
	private String cdquantity;
	public String getInWarehouse() {
		return inWarehouse;
	}
	public void setInWarehouse(String inWarehouse) {
		this.inWarehouse = inWarehouse;
	}
	public String getCditem() {
		return cditem;
	}
	public void setCditem(String cditem) {
		this.cditem = cditem;
	}
	public String getCdfat() {
		return cdfat;
	}
	public void setCdfat(String cdfat) {
		this.cdfat = cdfat;
	}
	public String getCdunit() {
		return cdunit;
	}
	public void setCdunit(String cdunit) {
		this.cdunit = cdunit;
	}
	public String getCdsnf() {
		return cdsnf;
	}
	public void setCdsnf(String cdsnf) {
		this.cdsnf = cdsnf;
	}
	public String getCdbatch() {
		return cdbatch;
	}
	public void setCdbatch(String cdbatch) {
		this.cdbatch = cdbatch;
	}
	public String getCdremark() {
		return cdremark;
	}
	public void setCdremark(String cdremark) {
		this.cdremark = cdremark;
	}
	public String getCdquantity() {
		return cdquantity;
	}
	public void setCdquantity(String cdquantity) {
		this.cdquantity = cdquantity;
	}


//Skimmed Milk Item
	private String warehouse;
	private String qty;
	private String expectedSkimmedMilk;
	private String skmitem;
	private String skmfat;
	private String skmunit;
	private String skmsnf;
	private String skmbatch;
	private String skimmedMilkLoss;
	
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getExpectedSkimmedMilk() {
		return expectedSkimmedMilk;
	}
	public void setExpectedSkimmedMilk(String expectedSkimmedMilk) {
		this.expectedSkimmedMilk = expectedSkimmedMilk;
	}
	public String getSkmitem() {
		return skmitem;
	}
	public void setSkmitem(String skmitem) {
		this.skmitem = skmitem;
	}
	public String getSkmfat() {
		return skmfat;
	}
	public void setSkmfat(String skmfat) {
		this.skmfat = skmfat;
	}
	public String getSkmunit() {
		return skmunit;
	}
	public void setSkmunit(String skmunit) {
		this.skmunit = skmunit;
	}
	public String getSkmsnf() {
		return skmsnf;
	}
	public void setSkmsnf(String skmsnf) {
		this.skmsnf = skmsnf;
	}
	public String getSkmbatch() {
		return skmbatch;
	}
	public void setSkmbatch(String skmbatch) {
		this.skmbatch = skmbatch;
	}
	public String getSkimmedMilkLoss() {
		return skimmedMilkLoss;
	}
	public void setSkimmedMilkLoss(String skimmedMilkLoss) {
		this.skimmedMilkLoss = skimmedMilkLoss;
	}

	private String fromDate;
	private String toDate;
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	
	

}
