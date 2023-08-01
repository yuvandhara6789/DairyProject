package com.dairy.model.BulkMilkEntry;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class VehicleQcEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	 private String vehicleNo;
	 private String vendorFat;
	 private String vendorName;
	 private String milkType;
	 private String qcApprovedId;
	 private String milkGrn;
	 private String entryBy;
	 private String ourFat;
	 private String degree;
	 private String cob;
	 private String alcohol;
	 private String glucose;
	 private String hypoChloride;
	 private String channaTest;
	 private String samplerName;
	 private String date;
	 private String vendorDate;
	 private String vendorSnf;
	 private String ourSnf;
	 private String temperature;
	 private String taste;
	 private String sugar;
	 private String urea;
	 private String sodiumPpm;
	 private String btTest;
	 private String chemistName;
	 private String mType;
	 private String vendorAcidity;
	 private String ourAcidity;
	 private String mbrt;
	 private String salt;
	 private String malfose;
	 private String soda;
	 private String proteinIn;
	 private String status;
	 private String remark;
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
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVendorFat() {
		return vendorFat;
	}
	public void setVendorFat(String vendorFat) {
		this.vendorFat = vendorFat;
	}
	
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getQcApprovedId() {
		return qcApprovedId;
	}
	public void setQcApprovedId(String qcApprovedId) {
		this.qcApprovedId = qcApprovedId;
	}
	public String getMilkGrn() {
		return milkGrn;
	}
	public void setMilkGrn(String milkGrn) {
		this.milkGrn = milkGrn;
	}
	public String getEntryBy() {
		return entryBy;
	}
	public void setEntryBy(String entryBy) {
		this.entryBy = entryBy;
	}
	public String getOurFat() {
		return ourFat;
	}
	public void setOurFat(String ourFat) {
		this.ourFat = ourFat;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCob() {
		return cob;
	}
	public void setCob(String cob) {
		this.cob = cob;
	}
	public String getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol = alcohol;
	}
	public String getGlucose() {
		return glucose;
	}
	public void setGlucose(String glucose) {
		this.glucose = glucose;
	}
	public String getHypoChloride() {
		return hypoChloride;
	}
	public void setHypoChloride(String hypoChloride) {
		this.hypoChloride = hypoChloride;
	}
	public String getChannaTest() {
		return channaTest;
	}
	public void setChannaTest(String channaTest) {
		this.channaTest = channaTest;
	}
	public String getSamplerName() {
		return samplerName;
	}
	public void setSamplerName(String samplerName) {
		this.samplerName = samplerName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVendorDate() {
		return vendorDate;
	}
	public void setVendorDate(String vendorDate) {
		this.vendorDate = vendorDate;
	}
	public String getVendorSnf() {
		return vendorSnf;
	}
	public void setVendorSnf(String vendorSnf) {
		this.vendorSnf = vendorSnf;
	}
	public String getOurSnf() {
		return ourSnf;
	}
	public void setOurSnf(String ourSnf) {
		this.ourSnf = ourSnf;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String getUrea() {
		return urea;
	}
	public void setUrea(String urea) {
		this.urea = urea;
	}
	public String getSodiumPpm() {
		return sodiumPpm;
	}
	public void setSodiumPpm(String sodiumPpm) {
		this.sodiumPpm = sodiumPpm;
	}
	public String getBtTest() {
		return btTest;
	}
	public void setBtTest(String btTest) {
		this.btTest = btTest;
	}
	public String getChemistName() {
		return chemistName;
	}
	public void setChemistName(String chemistName) {
		this.chemistName = chemistName;
	}
	public String getmType() {
		return mType;
	}
	public void setmType(String mType) {
		this.mType = mType;
	}
	public String getVendorAcidity() {
		return vendorAcidity;
	}
	public void setVendorAcidity(String vendorAcidity) {
		this.vendorAcidity = vendorAcidity;
	}
	public String getOurAcidity() {
		return ourAcidity;
	}
	public void setOurAcidity(String ourAcidity) {
		this.ourAcidity = ourAcidity;
	}
	public String getMbrt() {
		return mbrt;
	}
	public void setMbrt(String mbrt) {
		this.mbrt = mbrt;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getMalfose() {
		return malfose;
	}
	public void setMalfose(String malfose) {
		this.malfose = malfose;
	}
	public String getSoda() {
		return soda;
	}
	public void setSoda(String soda) {
		this.soda = soda;
	}
	public String getProteinIn() {
		return proteinIn;
	}
	public void setProteinIn(String proteinIn) {
		this.proteinIn = proteinIn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
