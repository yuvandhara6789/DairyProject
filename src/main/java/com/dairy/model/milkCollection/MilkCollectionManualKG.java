package com.dairy.model.milkCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MilkCollectionManualKG {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String collectionDate;
	private String dock;
	private String milkType;
	private String collectionType;
	private String sansthaName;
	private String routeName;
	private String rateType;
	private String address;
	private String sampleNo;
	private String sansthaCode;
	private String canQty;
	private String weightKg;
	private String weightLtr;
	private String sourcanQty;
	private String sourWeight;
	private String mobileNo;
	private String fdate;
	private String tdate;
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollectiondate() {
		return collectionDate;
	}
	public void setCollectiondate(String collectiondate) {
		this.collectionDate = collectiondate;
	}
	public String getDock() {
		return dock;
	}
	public void setDock(String dock) {
		this.dock = dock;
	}
	public String getMilktype() {
		return milkType;
	}
	public void setMilktype(String milktype) {
		this.milkType = milktype;
	}
	public String getCollectiontype() {
		return collectionType;
	}
	public void setCollectiontype(String collectiontype) {
		this.collectionType = collectiontype;
	}
	public String getSansthaname() {
		return sansthaName;
	}
	public void setSansthaname(String sansthaname) {
		this.sansthaName = sansthaname;
	}
	public String getRoutename() {
		return routeName;
	}
	public void setRoutename(String routename) {
		this.routeName = routename;
	}
	public String getRatetype() {
		return rateType;
	}
	public void setRatetype(String ratetype) {
		this.rateType = ratetype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSampleno() {
		return sampleNo;
	}
	public void setSampleno(String sampleno) {
		this.sampleNo = sampleno;
	}
	public String getSansthacode() {
		return sansthaCode;
	}
	public void setSansthacode(String sansthacode) {
		this.sansthaCode = sansthacode;
	}
	public String getCanqty() {
		return canQty;
	}
	public void setCanqty(String canqty) {
		this.canQty = canqty;
	}
	public String getWeightkg() {
		return weightKg;
	}
	public void setWeightkg(String weightkg) {
		this.weightKg = weightkg;
	}
	public String getWeightltr() {
		return weightLtr;
	}
	public void setWeightltr(String weightltr) {
		this.weightLtr = weightltr;
	}
	public String getSourcanqty() {
		return sourcanQty;
	}
	public void setSourcanqty(String sourcanqty) {
		this.sourcanQty = sourcanqty;
	}
	public String getSourweight() {
		return sourWeight;
	}
	public void setSourweight(String sourweight) {
		this.sourWeight = sourweight;
	}
	public String getMobileno() {
		return mobileNo;
	}
	public void setMobileno(String mobileno) {
		this.mobileNo = mobileno;
	}
	
}
