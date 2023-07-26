package com.dairy.model.otherMasters;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RouteMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	
	private String routeName ;
	private String km ;
	private String seriesID ;
	private String areaName ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getKm() {
		return km;
	}
	public void setKm(String km) {
		this.km = km;
	}
	public String getSeriesID() {
		return seriesID;
	}
	public void setSeriesID(String seriesID) {
		this.seriesID = seriesID;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	

}
