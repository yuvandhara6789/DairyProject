package com.dairy.model.sansthaMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.web.multipart.MultipartFile;



@Entity
public class PurRateExcleImport 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String milkType;
	private String rateChartName;
	private String standerdFat;
	private String standerdSnf;
	private String rate;
	 
	private byte[] filename;
	
	
	public byte[] getFilename() {
		return filename;
	}
	public void setFilename( byte[] filename) {
		this.filename = filename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getRateChartName() {
		return rateChartName;
	}
	public void setRateChartName(String rateChartName) {
		this.rateChartName = rateChartName;
	}
	public String getStanderdFat() {
		return standerdFat;
	}
	public void setStanderdFat(String standerdFat) {
		this.standerdFat = standerdFat;
	}
	public String getStanderdSnf() {
		return standerdSnf;
	}
	public void setStanderdSnf(String standerdSnf) {
		this.standerdSnf = standerdSnf;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	 
	
	

}
