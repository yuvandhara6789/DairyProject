package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SchemeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String date ;
	private String schemeName ;
	private String applicableType ;
	private String status ;
	private String discountType;
	private String routeCustomer;
	private String fDate;
	private String tDate;
	private String schemeType;
	private String groupItem;
	private String groupItemList;
	private String minQty;
	private String item;
	private String itemUnit;
	private String qty;
	private String inAmount;
	private String percentage;
	private String amount;
	
	
	
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
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	
	public String getApplicableType() {
		return applicableType;
	}
	public void setApplicableType(String applicableType) {
		this.applicableType = applicableType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getDiscountType() {
		return discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	public String getRouteCustomer() {
		return routeCustomer;
	}
	public void setRouteCustomer(String routeCustomer) {
		this.routeCustomer = routeCustomer;
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
	public String getSchemeType() {
		return schemeType;
	}
	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}
	public String getGroupItem() {
		return groupItem;
	}
	public void setGroupItem(String groupItem) {
		this.groupItem = groupItem;
	}
	public String getGroupItemList() {
		return groupItemList;
	}
	public void setGroupItemList(String groupItemList) {
		this.groupItemList = groupItemList;
	}
	public String getMinQty() {
		return minQty;
	}
	public void setMinQty(String minQty) {
		this.minQty = minQty;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getInAmount() {
		return inAmount;
	}
	public void setInAmount(String inAmount) {
		this.inAmount = inAmount;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
