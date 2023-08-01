package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class OtherExpsJournalSanstha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	private String date;
	private String typeOfExps;
	private String sansthaId;
	private String sansthaName;
	private String address;
	private String mobile;
	private String amount;
	private String remark;
	private String subLedgerName;
	@Transient
	private String fDate;
	@Transient
	private String tDate;
	
	
	
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
	public String getTypeOfExps() {
		return typeOfExps;
	}
	public void setTypeOfExps(String typeOfExps) {
		this.typeOfExps = typeOfExps;
	}
	public String getSansthaId() {
		return sansthaId;
	}
	public void setSansthaId(String sansthaId) {
		this.sansthaId = sansthaId;
	}
	public String getSansthaName() {
		return sansthaName;
	}
	public void setSansthaName(String sansthaName) {
		this.sansthaName = sansthaName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getSubLedgerName() {
		return subLedgerName;
	}
	public void setSubLedgerName(String subLedgerName) {
		this.subLedgerName = subLedgerName;
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
