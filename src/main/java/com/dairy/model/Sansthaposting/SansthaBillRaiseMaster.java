package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SansthaBillRaiseMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String chhillingCenter;
	private String date;
	private String cfDate;
	private String ctDate;
	private String totalQuantity;
	private String totalRate;
	private String totalAmount;
	private String totalAdvance;
	private String totalTransport;
	private String totalmanagment;
	private String totalDeposit;
	private String totalCattleFeed;
	private String totalStore;
	private String totalBiProduct;
	private String totalNetPayable;
	private String fDate;
	private String tDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChhillingCenter() {
		return chhillingCenter;
	}
	public void setChhillingCenter(String chhillingCenter) {
		this.chhillingCenter = chhillingCenter;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCfDate() {
		return cfDate;
	}
	public void setCfDate(String cfDate) {
		this.cfDate = cfDate;
	}
	public String getCtDate() {
		return ctDate;
	}
	public void setCtDate(String ctDate) {
		this.ctDate = ctDate;
	}
	public String getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public String getTotalRate() {
		return totalRate;
	}
	public void setTotalRate(String totalRate) {
		this.totalRate = totalRate;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAdvance() {
		return totalAdvance;
	}
	public void setTotalAdvance(String totalAdvance) {
		this.totalAdvance = totalAdvance;
	}
	public String getTotalTransport() {
		return totalTransport;
	}
	public void setTotalTransport(String totalTransport) {
		this.totalTransport = totalTransport;
	}
	public String getTotalmanagment() {
		return totalmanagment;
	}
	public void setTotalmanagment(String totalmanagment) {
		this.totalmanagment = totalmanagment;
	}
	public String getTotalDeposit() {
		return totalDeposit;
	}
	public void setTotalDeposit(String totalDeposit) {
		this.totalDeposit = totalDeposit;
	}
	public String getTotalCattleFeed() {
		return totalCattleFeed;
	}
	public void setTotalCattleFeed(String totalCattleFeed) {
		this.totalCattleFeed = totalCattleFeed;
	}
	public String getTotalStore() {
		return totalStore;
	}
	public void setTotalStore(String totalStore) {
		this.totalStore = totalStore;
	}
	public String getTotalBiProduct() {
		return totalBiProduct;
	}
	public void setTotalBiProduct(String totalBiProduct) {
		this.totalBiProduct = totalBiProduct;
	}
	public String getTotalNetPayable() {
		return totalNetPayable;
	}
	public void setTotalNetPayable(String totalNetPayable) {
		this.totalNetPayable = totalNetPayable;
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
