package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WarehouseMaster {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
  
	private String warehousename;
	private String warehousetype;
	private String warehousestatus;
	private String convfactor;
	private String remark;
	private String gststate;
	private String district;
	private String incharge;
	private String address;
	private String number;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWarehousename() {
		return warehousename;
	}
	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}
	public String getWarehousetype() {
		return warehousetype;
	}
	public void setWarehousetype(String warehousetype) {
		this.warehousetype = warehousetype;
	}
	public String getWarehousestatus() {
		return warehousestatus;
	}
	public void setWarehousestatus(String warehousestatus) {
		this.warehousestatus = warehousestatus;
	}
	public String getConvfactor() {
		return convfactor;
	}
	public void setConvfactor(String convfactor) {
		this.convfactor = convfactor;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGststate() {
		return gststate;
	}
	public void setGststate(String gststate) {
		this.gststate = gststate;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getIncharge() {
		return incharge;
	}
	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
