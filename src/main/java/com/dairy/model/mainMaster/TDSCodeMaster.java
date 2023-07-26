package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TDSCodeMaster {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String postingAccount ;
	private String tdsHead ;
	private String paymentDuration ;
	private String sectionCode ;
	private String applicationDate ;
	private String limitFrom ;
	private String limitTo ;
	private String tds ;
	private String cess ;
	private String oneTimeBill ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostingAccount() {
		return postingAccount;
	}
	public void setPostingAccount(String postingAccount) {
		this.postingAccount = postingAccount;
	}
	public String getTdsHead() {
		return tdsHead;
	}
	public void setTdsHead(String tdsHead) {
		this.tdsHead = tdsHead;
	}
	public String getPaymentDuration() {
		return paymentDuration;
	}
	public void setPaymentDuration(String paymentDuration) {
		this.paymentDuration = paymentDuration;
	}
	public String getSectionCode() {
		return sectionCode;
	}
	public void setSectionCode(String sectionCode) {
		this.sectionCode = sectionCode;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getLimitFrom() {
		return limitFrom;
	}
	public void setLimitFrom(String limitFrom) {
		this.limitFrom = limitFrom;
	}
	public String getLimitTo() {
		return limitTo;
	}
	public void setLimitTo(String limitTo) {
		this.limitTo = limitTo;
	}
	public String getTds() {
		return tds;
	}
	public void setTds(String tds) {
		this.tds = tds;
	}
	public String getCess() {
		return cess;
	}
	public void setCess(String cess) {
		this.cess = cess;
	}
	public String getOneTimeBill() {
		return oneTimeBill;
	}
	public void setOneTimeBill(String oneTimeBill) {
		this.oneTimeBill = oneTimeBill;
	}
	
	
}
