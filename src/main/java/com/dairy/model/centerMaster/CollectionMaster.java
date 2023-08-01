package com.dairy.model.centerMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollectionMaster {

	
//CollectionCenterMaster
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String dipositCm;
	private String centerGroup;
	private String selectType;
	private String mblnourName;
	private String depositBm;
	private String registrationDate;
	private String appPassword;
	private String contractParson;
	private String isMachine;
	private String chillingCenter;
	private String email;
	private String isMobNotification;
	private String selectRoute;
	private String address;
	private String rateBy;
	private String area;
	private String desktopUser;
	private String taluka;
	private String employee;
	private String district;
	private String state;
	private String pincode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDipositCm() {
		return dipositCm;
	}
	public void setDipositCm(String dipositCm) {
		this.dipositCm = dipositCm;
	}
	public String getCenterGroup() {
		return centerGroup;
	}
	public void setCenterGroup(String centerGroup) {
		this.centerGroup = centerGroup;
	}
	public String getSelectType() {
		return selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}
	public String getMblnourName() {
		return mblnourName;
	}
	public void setMblnourName(String mblnourName) {
		this.mblnourName = mblnourName;
	}
	public String getDepositBm() {
		return depositBm;
	}
	public void setDepositBm(String depositBm) {
		this.depositBm = depositBm;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getAppPassword() {
		return appPassword;
	}
	public void setAppPassword(String appPassword) {
		this.appPassword = appPassword;
	}
	public String getContractParson() {
		return contractParson;
	}
	public void setContractParson(String contractParson) {
		this.contractParson = contractParson;
	}
	public String getIsMachine() {
		return isMachine;
	}
	public void setIsMachine(String isMachine) {
		this.isMachine = isMachine;
	}
	public String getChillingCenter() {
		return chillingCenter;
	}
	public void setChillingCenter(String chillingCenter) {
		this.chillingCenter = chillingCenter;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIsMobNotification() {
		return isMobNotification;
	}
	public void setIsMobNotification(String isMobNotification) {
		this.isMobNotification = isMobNotification;
	}
	public String getSelectRoute() {
		return selectRoute;
	}
	public void setSelectRoute(String selectRoute) {
		this.selectRoute = selectRoute;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRateBy() {
		return rateBy;
	}
	public void setRateBy(String rateBy) {
		this.rateBy = rateBy;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDesktopUser() {
		return desktopUser;
	}
	public void setDesktopUser(String desktopUser) {
		this.desktopUser = desktopUser;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
//SettingSerialPort
	
	
	private String machineType;
	private String comPort;
	private String baudRate;
	private String parity;
	private String dataBits;
	private String stopBits;
	private String handShake;
	private String machineWtPrefix;


	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}
	public String getComPort() {
		return comPort;
	}
	public void setComPort(String comPort) {
		this.comPort = comPort;
	}
	public String getBaudRate() {
		return baudRate;
	}
	public void setBaudRate(String baudRate) {
		this.baudRate = baudRate;
	}
	public String getParity() {
		return parity;
	}
	public void setParity(String parity) {
		this.parity = parity;
	}
	public String getDataBits() {
		return dataBits;
	}
	public void setDataBits(String dataBits) {
		this.dataBits = dataBits;
	}
	public String getStopBits() {
		return stopBits;
	}
	public void setStopBits(String stopBits) {
		this.stopBits = stopBits;
	}
	public String getHandShake() {
		return handShake;
	}
	public void setHandShake(String handShake) {
		this.handShake = handShake;
	}
	public String getMachineWtPrefix() {
		return machineWtPrefix;
	}
	public void setMachineWtPrefix(String machineWtPrefix) {
		this.machineWtPrefix = machineWtPrefix;
	}
		

	
//farmerSalesInvoiceSetting
	
	private String rateEditable;
	private String milkRate;
	private String byProductRate;
	private String iceCreamRate;
	private String otherRate;

	public String getRateEditable() {
		return rateEditable;
	}
	public void setRateEditable(String rateEditable) {
		this.rateEditable = rateEditable;
	}
	public String getMilkRate() {
		return milkRate;
	}
	public void setMilkRate(String milkRate) {
		this.milkRate = milkRate;
	}
	public String getByProductRate() {
		return byProductRate;
	}
	public void setByProductRate(String byProductRate) {
		this.byProductRate = byProductRate;
	}
	public String getIceCreamRate() {
		return iceCreamRate;
	}
	public void setIceCreamRate(String iceCreamRate) {
		this.iceCreamRate = iceCreamRate;
	}
	public String getOtherRate() {
		return otherRate;
	}
	public void setOtherRate(String otherRate) {
		this.otherRate = otherRate;
	}
}
	
	
	
	