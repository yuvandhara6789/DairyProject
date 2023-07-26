package com.dairy.model.mainMaster;

import org.hibernate.internal.util.StringHelper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String itemName ;
	private String salesUnit ;
	private String invUnit ;
	private String orderSequence ;
	private String hsnPercentage ;
	private String hsnCode ;
	private String conversionFactor ;
	private String specification ;
	private String subCategory ;
	private String grp ;
	private String category ;
	private String alias ;
	private String mainType ;
	private String productType ;
	private String typeofProduct ;
	private String purchaseQC ;
	private String fat ;
	private String maintainStock ;
	private String snf ;
	private String allowNegative ;
	private String purchaseItem ;
	private String salesItem ;
	private String purchaseAccount ;
	private String salesAccount ;
	private String procurementType ;
	private String calculationMethod ;
	private String status ;
	private String salesSGST ;
	private String salesCGST ;
	private String salesIGST ;
	private String salesCess ;
	private String purchaseSGST ;
	private String purchaseCGST ;
	private String purchaseIGST ;
	private String purchaseCess ;
	private String costCenterAllocated ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getSalesUnit() {
		return salesUnit;
	}
	public void setSalesUnit(String salesUnit) {
		this.salesUnit = salesUnit;
	}
	public String getInvUnit() {
		return invUnit;
	}
	public void setInvUnit(String invUnit) {
		this.invUnit = invUnit;
	}
	public String getOrderSequence() {
		return orderSequence;
	}
	public void setOrderSequence(String orderSequence) {
		this.orderSequence = orderSequence;
	}
	public String getHsnPercentage() {
		return hsnPercentage;
	}
	public void setHsnPercentage(String hsnPercentage) {
		this.hsnPercentage = hsnPercentage;
	}
	public String getHsnCode() {
		return hsnCode;
	}
	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}
	public String getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(String conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getMainType() {
		return mainType;
	}
	public void setMainType(String mainType) {
		this.mainType = mainType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTypeofProduct() {
		return typeofProduct;
	}
	public void setTypeofProduct(String typeofProduct) {
		this.typeofProduct = typeofProduct;
	}
	public String getPurchaseQC() {
		return purchaseQC;
	}
	public void setPurchaseQC(String purchaseQC) {
		this.purchaseQC = purchaseQC;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getMaintainStock() {
		return maintainStock;
	}
	public void setMaintainStock(String maintainStock) {
		this.maintainStock = maintainStock;
	}
	public String getSnf() {
		return snf;
	}
	public void setSnf(String snf) {
		this.snf = snf;
	}
	public String getAllowNegative() {
		return allowNegative;
	}
	public void setAllowNegative(String allowNegative) {
		this.allowNegative = allowNegative;
	}
	public String getPurchaseItem() {
		return purchaseItem;
	}
	public void setPurchaseItem(String purchaseItem) {
		this.purchaseItem = purchaseItem;
	}
	public String getSalesItem() {
		return salesItem;
	}
	public void setSalesItem(String salesItem) {
		this.salesItem = salesItem;
	}
	public String getPurchaseAccount() {
		return purchaseAccount;
	}
	public void setPurchaseAccount(String purchaseAccount) {
		this.purchaseAccount = purchaseAccount;
	}
	public String getSalesAccount() {
		return salesAccount;
	}
	public void setSalesAccount(String salesAccount) {
		this.salesAccount = salesAccount;
	}
	public String getProcurementType() {
		return procurementType;
	}
	public void setProcurementType(String procurementType) {
		this.procurementType = procurementType;
	}
	public String getCalculationMethod() {
		return calculationMethod;
	}
	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSalesSGST() {
		return salesSGST;
	}
	public void setSalesSGST(String salesSGST) {
		this.salesSGST = salesSGST;
	}
	public String getSalesCGST() {
		return salesCGST;
	}
	public void setSalesCGST(String salesCGST) {
		this.salesCGST = salesCGST;
	}
	public String getSalesIGST() {
		return salesIGST;
	}
	public void setSalesIGST(String salesIGST) {
		this.salesIGST = salesIGST;
	}
	public String getSalesCess() {
		return salesCess;
	}
	public void setSalesCess(String salesCess) {
		this.salesCess = salesCess;
	}
	public String getPurchaseSGST() {
		return purchaseSGST;
	}
	public void setPurchaseSGST(String purchaseSGST) {
		this.purchaseSGST = purchaseSGST;
	}
	public String getPurchaseCGST() {
		return purchaseCGST;
	}
	public void setPurchaseCGST(String purchaseCGST) {
		this.purchaseCGST = purchaseCGST;
	}
	public String getPurchaseIGST() {
		return purchaseIGST;
	}
	public void setPurchaseIGST(String purchaseIGST) {
		this.purchaseIGST = purchaseIGST;
	}
	public String getPurchaseCess() {
		return purchaseCess;
	}
	public void setPurchaseCess(String purchaseCess) {
		this.purchaseCess = purchaseCess;
	}
	public String getCostCenterAllocated() {
		return costCenterAllocated;
	}
	public void setCostCenterAllocated(String costCenterAllocated) {
		this.costCenterAllocated = costCenterAllocated;
	}
	
 
}
