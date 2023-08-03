package com.dairy.model.processManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ByProductProcessJournal {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	
	private int id;
    private String processType;
    private String date;
    private String processImpid;
    private String inBatch;
    private String outMaterialQty;;
    private String outFat;
    private String outSnf;
    private String outMaterialTot;
    private String outWareHouse;
    private String item;
    private String unit;
    private String batch;
    private String quantity;
    private String fat;
    private String snf;
    private String rate;
    private String total;
    private String remark;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcessType() {
		return processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProcessImpid() {
		return processImpid;
	}
	public void setProcessImpid(String processImpid) {
		this.processImpid = processImpid;
	}
	public String getInBatch() {
		return inBatch;
	}
	public void setInBatch(String inBatch) {
		this.inBatch = inBatch;
	}
	public String getOutMaterialQty() {
		return outMaterialQty;
	}
	public void setOutMaterialQty(String outMaterialQty) {
		this.outMaterialQty = outMaterialQty;
	}
	public String getOutFat() {
		return outFat;
	}
	public void setOutFat(String outFat) {
		this.outFat = outFat;
	}
	public String getOutSnf() {
		return outSnf;
	}
	public void setOutSnf(String outSnf) {
		this.outSnf = outSnf;
	}
	public String getOutMaterialTot() {
		return outMaterialTot;
	}
	public void setOutMaterialTot(String outMaterialTot) {
		this.outMaterialTot = outMaterialTot;
	}
	public String getOutWareHouse() {
		return outWareHouse;
	}
	public void setOutWareHouse(String outWareHouse) {
		this.outWareHouse = outWareHouse;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
	// Produce item Details
	
	 private String produceInWarehouse;
	 private String produceItem;
	 private String produceUnit;
	 private String produceRecovery;
	 private String produceRemark;
	 private String produceFat;
	 private String produceSnf;
	 private String produceQty;
	 private String produceRate;
	 private String produceTotal;
	public String getProduceInWarehouse() {
		return produceInWarehouse;
	}
	public void setProduceInWarehouse(String produceInWarehouse) {
		this.produceInWarehouse = produceInWarehouse;
	}
	public String getProduceItem() {
		return produceItem;
	}
	public void setProduceItem(String produceItem) {
		this.produceItem = produceItem;
	}
	public String getProduceUnit() {
		return produceUnit;
	}
	public void setProduceUnit(String produceUnit) {
		this.produceUnit = produceUnit;
	}
	public String getProduceRecovery() {
		return produceRecovery;
	}
	public void setProduceRecovery(String produceRecovery) {
		this.produceRecovery = produceRecovery;
	}
	public String getProduceRemark() {
		return produceRemark;
	}
	public void setProduceRemark(String produceRemark) {
		this.produceRemark = produceRemark;
	}
	public String getProduceFat() {
		return produceFat;
	}
	public void setProduceFat(String produceFat) {
		this.produceFat = produceFat;
	}
	public String getProduceSnf() {
		return produceSnf;
	}
	public void setProduceSnf(String produceSnf) {
		this.produceSnf = produceSnf;
	}
	public String getProduceQty() {
		return produceQty;
	}
	public void setProduceQty(String produceQty) {
		this.produceQty = produceQty;
	}
	public String getProduceRate() {
		return produceRate;
	}
	public void setProduceRate(String produceRate) {
		this.produceRate = produceRate;
	}
	public String getProduceTotal() {
		return produceTotal;
	}
	public void setProduceTotal(String produceTotal) {
		this.produceTotal = produceTotal;
	}
	 
	// By Product Material Details
	
	 private String materialInWarehouse;
	 private String materialItem;
	 private String materialUnit;
	 private String materialRecovery;
	 private String materialRemark;
	 private String materialFat;
	 private String materialSnf;
	 private String materialQty;
	 private String materialRate;
	 private String materialTotal;
	public String getMaterialInWarehouse() {
		return materialInWarehouse;
	}
	public void setMaterialInWarehouse(String materialInWarehouse) {
		this.materialInWarehouse = materialInWarehouse;
	}
	public String getMaterialItem() {
		return materialItem;
	}
	public void setMaterialItem(String materialItem) {
		this.materialItem = materialItem;
	}
	public String getMaterialUnit() {
		return materialUnit;
	}
	public void setMaterialUnit(String materialUnit) {
		this.materialUnit = materialUnit;
	}
	public String getMaterialRecovery() {
		return materialRecovery;
	}
	public void setMaterialRecovery(String materialRecovery) {
		this.materialRecovery = materialRecovery;
	}
	public String getMaterialRemark() {
		return materialRemark;
	}
	public void setMaterialRemark(String materialRemark) {
		this.materialRemark = materialRemark;
	}
	public String getMaterialFat() {
		return materialFat;
	}
	public void setMaterialFat(String materialFat) {
		this.materialFat = materialFat;
	}
	public String getMaterialSnf() {
		return materialSnf;
	}
	public void setMaterialSnf(String materialSnf) {
		this.materialSnf = materialSnf;
	}
	public String getMaterialQty() {
		return materialQty;
	}
	public void setMaterialQty(String materialQty) {
		this.materialQty = materialQty;
	}
	public String getMaterialRate() {
		return materialRate;
	}
	public void setMaterialRate(String materialRate) {
		this.materialRate = materialRate;
	}
	public String getMaterialTotal() {
		return materialTotal;
	}
	public void setMaterialTotal(String materialTotal) {
		this.materialTotal = materialTotal;
	}
	 
	 // Other Expenses
	
	private String accountName;
	private String account;
	private String otherExpensesRemark;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getOtherExpensesRemark() {
		return otherExpensesRemark;
	}
	public void setOtherExpensesRemark(String otherExpensesRemark) {
		this.otherExpensesRemark = otherExpensesRemark;
	}
	
	// Shift Details
	
	private String empolyeeName;
	private String work;
	private String shiftDetailRemark;
	public String getEmpolyeeName() {
		return empolyeeName;
	}
	public void setEmpolyeeName(String empolyeeName) {
		this.empolyeeName = empolyeeName;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getShiftDetailRemark() {
		return shiftDetailRemark;
	}
	public void setShiftDetailRemark(String shiftDetailRemark) {
		this.shiftDetailRemark = shiftDetailRemark;
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
