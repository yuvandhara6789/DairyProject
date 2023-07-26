package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HSNCodeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id ;
	
	private String hsnPercentage ;
	private String saleSGST_AC ;
	private String saleCGST_AC ;
	private String saleIGST_AC ;
	private String saleCESS_AC ;
	private String saleSGST ;
	private String saleCGST ;
	private String saleIGST ;
	private String saleCESS ;
	private String purchaseSGST_AC ;
	private String purchaseCGST_AC ;
	private String purchaseIGST_AC ;
	private String purchaseCESS_AC ;
	private String purchaseSGST ;
	private String purchaseCGST ;
	private String purchaseIGST ;
	private String purchaseCESS ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHsnPercentage() {
		return hsnPercentage;
	}
	public void setHsnPercentage(String hsnPercentage) {
		this.hsnPercentage = hsnPercentage;
	}
	public String getSaleSGST_AC() {
		return saleSGST_AC;
	}
	public void setSaleSGST_AC(String saleSGST_AC) {
		this.saleSGST_AC = saleSGST_AC;
	}
	public String getSaleCGST_AC() {
		return saleCGST_AC;
	}
	public void setSaleCGST_AC(String saleCGST_AC) {
		this.saleCGST_AC = saleCGST_AC;
	}
	public String getSaleIGST_AC() {
		return saleIGST_AC;
	}
	public void setSaleIGST_AC(String saleIGST_AC) {
		this.saleIGST_AC = saleIGST_AC;
	}
	public String getSaleCESS_AC() {
		return saleCESS_AC;
	}
	public void setSaleCESS_AC(String saleCESS_AC) {
		this.saleCESS_AC = saleCESS_AC;
	}
	public String getSaleSGST() {
		return saleSGST;
	}
	public void setSaleSGST(String saleSGST) {
		this.saleSGST = saleSGST;
	}
	public String getSaleCGST() {
		return saleCGST;
	}
	public void setSaleCGST(String saleCGST) {
		this.saleCGST = saleCGST;
	}
	public String getSaleIGST() {
		return saleIGST;
	}
	public void setSaleIGST(String saleIGST) {
		this.saleIGST = saleIGST;
	}
	public String getSaleCESS() {
		return saleCESS;
	}
	public void setSaleCESS(String saleCESS) {
		this.saleCESS = saleCESS;
	}
	public String getPurchaseSGST_AC() {
		return purchaseSGST_AC;
	}
	public void setPurchaseSGST_AC(String purchaseSGST_AC) {
		this.purchaseSGST_AC = purchaseSGST_AC;
	}
	public String getPurchaseCGST_AC() {
		return purchaseCGST_AC;
	}
	public void setPurchaseCGST_AC(String purchaseCGST_AC) {
		this.purchaseCGST_AC = purchaseCGST_AC;
	}
	public String getPurchaseIGST_AC() {
		return purchaseIGST_AC;
	}
	public void setPurchaseIGST_AC(String purchaseIGST_AC) {
		this.purchaseIGST_AC = purchaseIGST_AC;
	}
	public String getPurchaseCESS_AC() {
		return purchaseCESS_AC;
	}
	public void setPurchaseCESS_AC(String purchaseCESS_AC) {
		this.purchaseCESS_AC = purchaseCESS_AC;
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
	public String getPurchaseCESS() {
		return purchaseCESS;
	}
	public void setPurchaseCESS(String purchaseCESS) {
		this.purchaseCESS = purchaseCESS;
	}
	

}
