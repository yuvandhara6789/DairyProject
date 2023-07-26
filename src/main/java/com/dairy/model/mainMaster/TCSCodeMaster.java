package com.dairy.model.mainMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TCSCodeMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String reflectingAccount ;
	private String tcsHead ;
	private String deductionType ;
	private String paymentDuration ;
	private String applicationDate ;
	private String turnOverLimit ;
	private String salesLimit ;
	private String tcs ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReflectingAccount() {
		return reflectingAccount;
	}
	public void setReflectingAccount(String reflectingAccount) {
		this.reflectingAccount = reflectingAccount;
	}
	public String getTcsHead() {
		return tcsHead;
	}
	public void setTcsHead(String tcsHead) {
		this.tcsHead = tcsHead;
	}
	public String getDeductionType() {
		return deductionType;
	}
	public void setDeductionType(String deductionType) {
		this.deductionType = deductionType;
	}
	public String getPaymentDuration() {
		return paymentDuration;
	}
	public void setPaymentDuration(String paymentDuration) {
		this.paymentDuration = paymentDuration;
	}
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public String getTurnOverLimit() {
		return turnOverLimit;
	}
	public void setTurnOverLimit(String turnOverLimit) {
		this.turnOverLimit = turnOverLimit;
	}
	public String getSalesLimit() {
		return salesLimit;
	}
	public void setSalesLimit(String salesLimit) {
		this.salesLimit = salesLimit;
	}
	public String getTcs() {
		return tcs;
	}
	public void setTcs(String tcs) {
		this.tcs = tcs;
	}
	
 }
