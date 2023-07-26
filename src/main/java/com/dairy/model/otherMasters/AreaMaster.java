package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AreaMaster 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Area;
    private String Taluka;
    private String District;
    private String State;
    private String Region;
    private String Country;
    private String Pincode;
    private String AreaType;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getTaluka() {
		return Taluka;
	}
	public void setTaluka(String taluka) {
		Taluka = taluka;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getAreaType() {
		return AreaType;
	}
	public void setAreaType(String areaType) {
		AreaType = areaType;
	}
	
    
}
