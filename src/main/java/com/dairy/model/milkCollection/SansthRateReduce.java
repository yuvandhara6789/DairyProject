package com.dairy.model.milkCollection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SansthRateReduce 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
   private int id;
   private String Date;
   private String Dock;
   private String SansthaType;
   private String MilkType;
   private String FatReduce;
   private String SnfReduce;
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public String getDock() {
	return Dock;
}
public void setDock(String dock) {
	Dock = dock;
}
public String getSansthaType() {
	return SansthaType;
}
public void setSansthaType(String sansthaType) {
	SansthaType = sansthaType;
}
public String getMilkType() {
	return MilkType;
}
public void setMilkType(String milkType) {
	MilkType = milkType;
}
public String getFatReduce() {
	return FatReduce;
}
public void setFatReduce(String fatReduce) {
	FatReduce = fatReduce;
}
public String getSnfReduce() {
	return SnfReduce;
}
public void setSnfReduce(String snfReduce) {
	SnfReduce = snfReduce;
}
   
}
