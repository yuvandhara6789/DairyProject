package com.dairy.model.Sansthaposting;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class SansthaReceipt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String sansthaName;
	private String selectSanstha;
	private String invoiceNo;
	private String totalInstallment;
	private String partialAmount;
	private String date;
	private String cashBankJV;
	private String narration;
	private String invoiceDate;
	private String paidInstallment;
	private String receiptAmount;
	private String manualNo;
	private String selectAccount;
	private String byHand;
	private String InvoiceAmount;
	private String balanceAmount;
	private String pendingAmount;
	private String voucherType;
	private String subLedgerName;
	private String installmentAmount;

	@Transient
	private String fDate;
	
	@Transient
	private String tDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfDate() {
		return fDate;
	}

	public void setfDate(String fDate) {
		this.fDate = fDate;
	}

	public String gettDate() {
		return tDate;
	}

	public void settDate(String tDate) {
		this.tDate = tDate;
	}

	public String getSansthaName() {
		return sansthaName;
	}

	public void setSansthaName(String sansthaName) {
		this.sansthaName = sansthaName;
	}

	public String getSelectSanstha() {
		return selectSanstha;
	}

	public void setSelectSanstha(String selectSanstha) {
		this.selectSanstha = selectSanstha;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getTotalInstallment() {
		return totalInstallment;
	}

	public void setTotalInstallment(String totalInstallment) {
		this.totalInstallment = totalInstallment;
	}

	public String getPartialAmount() {
		return partialAmount;
	}

	public void setPartialAmount(String partialAmount) {
		this.partialAmount = partialAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCashBankJV() {
		return cashBankJV;
	}

	public void setCashBankJV(String cashBankJV) {
		this.cashBankJV = cashBankJV;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getPaidInstallment() {
		return paidInstallment;
	}

	public void setPaidInstallment(String paidInstallment) {
		this.paidInstallment = paidInstallment;
	}

	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getManualNo() {
		return manualNo;
	}

	public void setManualNo(String manualNo) {
		this.manualNo = manualNo;
	}

	public String getSelectAccount() {
		return selectAccount;
	}

	public void setSelectAccount(String selectAccount) {
		this.selectAccount = selectAccount;
	}

	public String getByHand() {
		return byHand;
	}

	public void setByHand(String byHand) {
		this.byHand = byHand;
	}

	public String getInvoiceAmount() {
		return InvoiceAmount;
	}

	public void setInvoiceAmount(String invoiceAmount) {
		InvoiceAmount = invoiceAmount;
	}

	public String getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(String balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getPendingAmount() {
		return pendingAmount;
	}

	public void setPendingAmount(String pendingAmount) {
		this.pendingAmount = pendingAmount;
	}

	public String getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getSubLedgerName() {
		return subLedgerName;
	}

	public void setSubLedgerName(String subLedgerName) {
		this.subLedgerName = subLedgerName;
	}

	public String getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(String installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	
}
