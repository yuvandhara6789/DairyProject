package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SansthaSaleReturn 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String date;
	private String invoiceId;
	private String santha;
	private String typeofSale;
	private String billAmt;
	private String pendingAmt;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSantha() {
		return santha;
	}
	public void setSantha(String santha) {
		this.santha = santha;
	}
	public String getTypeofSale() {
		return typeofSale;
	}
	public void setTypeofSale(String typeofSale) {
		this.typeofSale = typeofSale;
	}
	public String getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(String billAmt) {
		this.billAmt = billAmt;
	}
	public String getPendingAmt() {
		return pendingAmt;
	}
	public void setPendingAmt(String pendingAmt) {
		this.pendingAmt = pendingAmt;
	}
	
	

	private String returnId;
	private String santha1;
	private String saleReturnAccount;
	private String employee;
	private String remark;
	private String returnNo;
	private String address;
	private String invoiceId1;
	private String warehouse;
	private String subLedger;
	private String returnDate;
	private String mobileNo;
	private String rateType;
	private String warehouseState;
	private String salePendingAmount;
	private String customerState;
	private String taxType;
	private String ratePeriod;
	
	
	
	//Other Amount
	
	public String getInvoiceId1() {
		return invoiceId;
	}
	public void setInvoiceId1(String invoiceId1) {
		this.invoiceId1 = invoiceId1;
	}
	public String getReturnId() {
		return returnId;
	}
	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}
	public String getSantha1() {
		return santha1;
	}
	public void setSantha1(String santha1) {
		this.santha1 = santha1;
	}
	public String getSaleReturnAccount() {
		return saleReturnAccount;
	}
	public void setSaleReturnAccount(String saleReturnAccount) {
		this.saleReturnAccount = saleReturnAccount;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getReturnNo() {
		return returnNo;
	}
	public void setReturnNo(String returnNo) {
		this.returnNo = returnNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getSubLedger() {
		return subLedger;
	}
	public void setSubLedger(String subLedger) {
		this.subLedger = subLedger;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getRateType() {
		return rateType;
	}
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	public String getWarehouseState() {
		return warehouseState;
	}
	public void setWarehouseState(String warehouseState) {
		this.warehouseState = warehouseState;
	}
	public String getSalePendingAmount() {
		return salePendingAmount;
	}
	public void setSalePendingAmount(String salePendingAmount) {
		this.salePendingAmount = salePendingAmount;
	}
	public String getCustomerState() {
		return customerState;
	}
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getRatePeriod() {
		return ratePeriod;
	}
	public void setRatePeriod(String ratePeriod) {
		this.ratePeriod = ratePeriod;
	}
	

	private String sgstAmt;
	private String cgstAmt;
	private String igstAmt;
	private String cessAmt;
	private String netAmt;
	private String discountAmt;
	private String otherAmt;
	private String taxAmt;
	private String totalAmt;
	
	
	public String getSgstAmt() {
		return sgstAmt;
	}
	public void setSgstAmt(String sgstAmt) {
		this.sgstAmt = sgstAmt;
	}
	public String getCgstAmt() {
		return cgstAmt;
	}
	public void setCgstAmt(String cgstAmt) {
		this.cgstAmt = cgstAmt;
	}
	public String getIgstAmt() {
		return igstAmt;
	}
	public void setIgstAmt(String igstAmt) {
		this.igstAmt = igstAmt;
	}
	public String getCessAmt() {
		return cessAmt;
	}
	public void setCessAmt(String cessAmt) {
		this.cessAmt = cessAmt;
	}
	public String getNetAmt() {
		return netAmt;
	}
	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}
	public String getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}
	public String getOtherAmt() {
		return otherAmt;
	}
	public void setOtherAmt(String otherAmt) {
		this.otherAmt = otherAmt;
	}
	public String getTaxAmt() {
		return taxAmt;
	}
	public void setTaxAmt(String taxAmt) {
		this.taxAmt = taxAmt;
	}
	public String getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	private String FromDate;
	private String Todate;
	
	public String getFromDate() {
		return FromDate;
	}
	public void setFromDate(String fromDate) {
		FromDate = fromDate;
	}
	public String getTodate() {
		return Todate;
	}
	public void setTodate(String todate) {
		Todate = todate;
	}
	

}



































