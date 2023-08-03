package com.dairy.model.processManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class ProcessJournalMilk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    
	private int id;
	private String date;
	private String typeOfProcess;
	private String outWarehouse;
	private String inBatch;
	
	@Transient
	private String fromDate;
	
	@Transient
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
	public String getInBatch() {
		return inBatch;
	}
	public void setInBatch(String inBatch) {
		this.inBatch = inBatch;
	}
	

	// Consume Item details
	private String consumeItem;
	private String consumeUnit;
	private String consumeBatch;
	private String consumeQuentity;
	private String consumeFAT;
	private String consumeSNF;
	private String consumeRate;
	private String consumeTotal;
	private String consumeRemark;

	public String getConsumeItem() {
		return consumeItem;
	}
	public void setConsumeItem(String consumeItem) {
		this.consumeItem = consumeItem;
	}
	public String getConsumeUnit() {
		return consumeUnit;
	}
	public void setConsumeUnit(String consumeUnit) {
		this.consumeUnit = consumeUnit;
	}
	public String getConsumeBatch() {
		return consumeBatch;
	}
	public void setConsumeBatch(String consumeBatch) {
		this.consumeBatch = consumeBatch;
	}
	public String getConsumeQuentity() {
		return consumeQuentity;
	}
	public void setConsumeQuentity(String consumeQuentity) {
		this.consumeQuentity = consumeQuentity;
	}
	public String getConsumeFAT() {
		return consumeFAT;
	}
	public void setConsumeFAT(String consumeFAT) {
		this.consumeFAT = consumeFAT;
	}
	public String getConsumeSNF() {
		return consumeSNF;
	}
	public void setConsumeSNF(String consumeSNF) {
		this.consumeSNF = consumeSNF;
	}
	public String getConsumeRate() {
		return consumeRate;
	}
	public void setConsumeRate(String consumeRate) {
		this.consumeRate = consumeRate;
	}
	public String getConsumeTotal() {
		return consumeTotal;
	}
	public void setConsumeTotal(String consumeTotal) {
		this.consumeTotal = consumeTotal;
	}
	public String getConsumeRemark() {
		return consumeRemark;
	}
	public void setConsumeRemark(String consumeRemark) {
		this.consumeRemark = consumeRemark;
	}
	
	// Produce Item Details
	private String produceInWarehouse;
	private String produceItem;
	private String produceQuentity;
	private String produceRate;
	private String produceUnit;
	private String produceFAT;
	private String produceSNF;
	private String produceRemark;
	private String produceStock;
	
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
	public String getProduceQuentity() {
		return produceQuentity;
	}
	public void setProduceQuentity(String produceQuentity) {
		this.produceQuentity = produceQuentity;
	}
	public String getProduceRate() {
		return produceRate;
	}
	public void setProduceRate(String produceRate) {
		this.produceRate = produceRate;
	}
	public String getProduceUnit() {
		return produceUnit;
	}
	public void setProduceUnit(String produceUnit) {
		this.produceUnit = produceUnit;
	}
	public String getProduceFAT() {
		return produceFAT;
	}
	public void setProduceFAT(String produceFAT) {
		this.produceFAT = produceFAT;
	}
	public String getProduceSNF() {
		return produceSNF;
	}
	public void setProduceSNF(String produceSNF) {
		this.produceSNF = produceSNF;
	}
	public String getProduceRemark() {
		return produceRemark;
	}
	public void setProduceRemark(String produceRemark) {
		this.produceRemark = produceRemark;
	}
	public String getProduceStock() {
		return produceStock;
	}
	public void setProduceStock(String produceStock) {
		this.produceStock = produceStock;
	}

	//SMP Details
	private String smpSelect;
	private String smpUnit;
	private String smpStock;
	private String smpWarehouse;
	private String smpQty;
	private String smpSNF;
	private String smpItemName;
	private String smpFAT;
	private String smpBatch;
	
	public String getSmpSelect() {
		return smpSelect;
	}
	public void setSmpSelect(String smpSelect) {
		this.smpSelect = smpSelect;
	}
	public String getSmpUnit() {
		return smpUnit;
	}
	public void setSmpUnit(String smpUnit) {
		this.smpUnit = smpUnit;
	}
	public String getSmpStock() {
		return smpStock;
	}
	public void setSmpStock(String smpStock) {
		this.smpStock = smpStock;
	}
	public String getSmpWarehouse() {
		return smpWarehouse;
	}
	public void setSmpWarehouse(String smpWarehouse) {
		this.smpWarehouse = smpWarehouse;
	}
	public String getSmpQty() {
		return smpQty;
	}
	public void setSmpQty(String smpQty) {
		this.smpQty = smpQty;
	}
	public String getSmpSNF() {
		return smpSNF;
	}
	public void setSmpSNF(String smpSNF) {
		this.smpSNF = smpSNF;
	}
	public String getSmpItemName() {
		return smpItemName;
	}
	public void setSmpItemName(String smpItemName) {
		this.smpItemName = smpItemName;
	}
	public String getSmpFAT() {
		return smpFAT;
	}
	public void setSmpFAT(String smpFAT) {
		this.smpFAT = smpFAT;
	}
	public String getSmpBatch() {
		return smpBatch;
	}
	public void setSmpBatch(String smpBatch) {
		this.smpBatch = smpBatch;
	}

//Cream Details
	private String creamSelect;
	private String creamUnit;
	private String creamStock;
	private String creamWarehouse;
	private String creamQty;
	private String creamLoss;
	private String creamItemName;
	private String creamFAT;
	private String creamSNF;
	private String creamBatch;
	
	public String getCreamSelect() {
		return creamSelect;
	}
	public void setCreamSelect(String creamSelect) {
		this.creamSelect = creamSelect;
	}
	public String getCreamUnit() {
		return creamUnit;
	}
	public void setCreamUnit(String creamUnit) {
		this.creamUnit = creamUnit;
	}
	public String getCreamStock() {
		return creamStock;
	}
	public void setCreamStock(String creamStock) {
		this.creamStock = creamStock;
	}
	public String getCreamWarehouse() {
		return creamWarehouse;
	}
	public void setCreamWarehouse(String creamWarehouse) {
		this.creamWarehouse = creamWarehouse;
	}
	public String getCreamQty() {
		return creamQty;
	}
	public void setCreamQty(String creamQty) {
		this.creamQty = creamQty;
	}
	public String getCreamLoss() {
		return creamLoss;
	}
	public void setCreamLoss(String creamLoss) {
		this.creamLoss = creamLoss;
	}
	public String getCreamItemName() {
		return creamItemName;
	}
	public void setCreamItemName(String creamItemName) {
		this.creamItemName = creamItemName;
	}
	public String getCreamFAT() {
		return creamFAT;
	}
	public void setCreamFAT(String creamFAT) {
		this.creamFAT = creamFAT;
	}
	public String getCreamSNF() {
		return creamSNF;
	}
	public void setCreamSNF(String creamSNF) {
		this.creamSNF = creamSNF;
	}
	public String getCreamBatch() {
		return creamBatch;
	}
	public void setCreamBatch(String creamBatch) {
		this.creamBatch = creamBatch;
	}

  //Process Loss Quentity
	private String milkLoss;
	private String milkAddition;
	
	public String getMilkLoss() {
		return milkLoss;
	}
	public void setMilkLoss(String milkLoss) {
		this.milkLoss = milkLoss;
	}
	public String getMilkAddition() {
		return milkAddition;
	}
	public void setMilkAddition(String milkAddition) {
		this.milkAddition = milkAddition;
	}
	
	//Skimmed Milk
	private String skimmedSelect;
	private String skimmedUnit;
	private String skimmedStock;
	private String skimmedWarehouse;
	private String skimmedQty;
	private String skimmedItemName;
	private String skimmedFAT;
	private String skimmedSNF;
	private String skimmedBatch;
		
	public String getSkimmedSelect() {
		return skimmedSelect;
	}
	public void setSkimmedSelect(String skimmedSelect) {
		this.skimmedSelect = skimmedSelect;
	}
	public String getSkimmedUnit() {
		return skimmedUnit;
	}
	public void setSkimmedUnit(String skimmedUnit) {
		this.skimmedUnit = skimmedUnit;
	}
	public String getSkimmedStock() {
		return skimmedStock;
	}
	public void setSkimmedStock(String skimmedStock) {
		this.skimmedStock = skimmedStock;
	}
	public String getSkimmedWarehouse() {
		return skimmedWarehouse;
	}
	public void setSkimmedWarehouse(String skimmedWarehouse) {
		this.skimmedWarehouse = skimmedWarehouse;
	}
	public String getSkimmedQty() {
		return skimmedQty;
	}
	public void setSkimmedQty(String skimmedQty) {
		this.skimmedQty = skimmedQty;
	}
	public String getSkimmedItemName() {
		return skimmedItemName;
	}
	public void setSkimmedItemName(String skimmedItemName) {
		this.skimmedItemName = skimmedItemName;
	}
	public String getSkimmedFAT() {
		return skimmedFAT;
	}
	public void setSkimmedFAT(String skimmedFAT) {
		this.skimmedFAT = skimmedFAT;
	}
	public String getSkimmedSNF() {
		return skimmedSNF;
	}
	public void setSkimmedSNF(String skimmedSNF) {
		this.skimmedSNF = skimmedSNF;
	}
	public String getSkimmedBatch() {
		return skimmedBatch;
	}
	public void setSkimmedBatch(String skimmedBatch) {
		this.skimmedBatch = skimmedBatch;
	}

//Condense Milk
	private String condenseSelect;
	private String condenseUnit;
	private String condenseStock;
	private String condenseWarehouse;
	private String condenseQty;
	private String condenseItemName;
	private String condenseFAT;
	private String condenseSNF;
	private String condenseBatch;
	
	public String getCondenseSelect() {
		return condenseSelect;
	}
	public void setCondenseSelect(String condenseSelect) {
		this.condenseSelect = condenseSelect;
	}
	public String getCondenseUnit() {
		return condenseUnit;
	}
	public void setCondenseUnit(String condenseUnit) {
		this.condenseUnit = condenseUnit;
	}
	public String getCondenseStock() {
		return condenseStock;
	}
	public void setCondenseStock(String condenseStock) {
		this.condenseStock = condenseStock;
	}
	public String getCondenseWarehouse() {
		return condenseWarehouse;
	}
	public void setCondenseWarehouse(String condenseWarehouse) {
		this.condenseWarehouse = condenseWarehouse;
	}
	public String getCondenseQty() {
		return condenseQty;
	}
	public void setCondenseQty(String condenseQty) {
		this.condenseQty = condenseQty;
	}
	public String getCondenseItemName() {
		return condenseItemName;
	}
	public void setCondenseItemName(String condenseItemName) {
		this.condenseItemName = condenseItemName;
	}
	public String getCondenseFAT() {
		return condenseFAT;
	}
	public void setCondenseFAT(String condenseFAT) {
		this.condenseFAT = condenseFAT;
	}
	public String getCondenseSNF() {
		return condenseSNF;
	}
	public void setCondenseSNF(String condenseSNF) {
		this.condenseSNF = condenseSNF;
	}
	public String getCondenseBatch() {
		return condenseBatch;
	}
	public void setCondenseBatch(String condenseBatch) {
		this.condenseBatch = condenseBatch;
	}	
}
