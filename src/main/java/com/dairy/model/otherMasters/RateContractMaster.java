package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RateContractMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String groupName ;
	private String date ;
	private String rateName;
	private String selectDate;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getRateName() {
		return rateName;
	}
	public void setRateName(String rateName) {
		this.rateName = rateName;
	}
	public String getSelectDate() {
		return selectDate;
	}
	public void setSelectDate(String selectDate) {
		this.selectDate = selectDate;
	}

}
