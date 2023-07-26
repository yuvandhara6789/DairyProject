package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class TransportMaster {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
	private int id;
    
	private String transportname;
	private String pan;
	private String status;
	private String gstno;
	private String contactno;
	private String address;
	private String balancetype;
	private String openingbalance;
	private String accounttype;
	private String accountgroup;
	private String transporttype;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransportname() {
		return transportname;
	}

	public void setTransportname(String transportname) {
		this.transportname = transportname;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBalancetype() {
		return balancetype;
	}

	public void setBalancetype(String balancetype) {
		this.balancetype = balancetype;
	}

	public String getOpeningbalance() {
		return openingbalance;
	}

	public void setOpeningbalance(String openingbalance) {
		this.openingbalance = openingbalance;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getAccountgroup() {
		return accountgroup;
	}

	public void setAccountgroup(String accountgroup) {
		this.accountgroup = accountgroup;
	}

	public String getTransporttype() {
		return transporttype;
	}

	public void setTransporttype(String transporttype) {
		this.transporttype = transporttype;
	}
}
