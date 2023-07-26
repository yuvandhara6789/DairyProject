package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReorderMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String milkType ;
	private String type ;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
