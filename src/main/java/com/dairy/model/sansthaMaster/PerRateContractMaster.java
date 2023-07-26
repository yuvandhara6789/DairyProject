package com.dairy.model.sansthaMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PerRateContractMaster 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String MilkType;
	private String RateChartName;
	private String StandardFat;
	private String StandardSNF;
	private String Rate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMilkType() {
		return MilkType;
	}
	public void setMilkType(String milkType) {
		MilkType = milkType;
	}
	public String getRateChartName() {
		return RateChartName;
	}
	public void setRateChartName(String rateChartName) {
		RateChartName = rateChartName;
	}
	public String getStandardFat() {
		return StandardFat;
	}
	public void setStandardFat(String standardFat) {
		StandardFat = standardFat;
	}
	public String getStandardSNF() {
		return StandardSNF;
	}
	public void setStandardSNF(String standardSNF) {
		StandardSNF = standardSNF;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	
	
	
	
}
