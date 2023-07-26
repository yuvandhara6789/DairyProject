package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleMaster 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String vehicleno;
	private String transporter;
	private String route;
	private String driver;
	private String mobileno;
	private String status;
	private String vehiclename;
	private String vehicletype;
	private String vehiclecapacity;
	private String rate;
	private String renttype;
	private String billingdays;
	private String fortype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setvehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String gettransporter() {
		return transporter;
	}
	public void settransporter(String transporter) {
		this.transporter = transporter;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getvehiclename() {
		return vehiclename;
	}
	public void setvehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public String getvehicletype() {
		return vehicletype;
	}
	public void setVehicaltype(String vehicletype) {
		this.vehicletype = vehicletype;
	}
	public String getVehiclecapacity() {
		return vehiclecapacity;
	}
	public void setVehiclecapacity(String vehiclecapacity) {
		this.vehiclecapacity = vehiclecapacity;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRenttype() {
		return renttype;
	}
	public void setRenttype(String renttype) {
		this.renttype = renttype;
	}
	public String getBillingdays() {
		return billingdays;
	}
	public void setBillingdays(String billingdays) {
		this.billingdays = billingdays;
	}
	public String getFortype() {
		return fortype;
	}
	public void setFortype(String fortype) {
		this.fortype = fortype;
	} 

	
}
