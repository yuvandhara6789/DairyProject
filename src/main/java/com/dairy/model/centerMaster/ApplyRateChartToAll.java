package com.dairy.model.centerMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApplyRateChartToAll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String centerName;
	private String milkType;
	private String date;
	private String rateChartName;
	private String stdFat;
	private String stdSnf;
	private String rate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRateChartName() {
		return rateChartName;
	}
	public void setRateChartName(String rateChartName) {
		this.rateChartName = rateChartName;
	}
	public String getStdFat() {
		return stdFat;
	}
	public void setStdFat(String stdFat) {
		this.stdFat = stdFat;
	}
	public String getStdSnf() {
		return stdSnf;
	}
	public void setStdSnf(String stdSnf) {
		this.stdSnf = stdSnf;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
}
