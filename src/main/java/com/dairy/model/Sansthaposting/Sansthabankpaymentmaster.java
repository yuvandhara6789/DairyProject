package com.dairy.model.Sansthaposting;



	
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Sansthabankpaymentmaster {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		  private int id; 
	      private String wareHouse;
	      private String selectAcount;
	      private String date;
	      private String selectAll;
	      private String totalQuantity;
	      private String totalAdvance;
	      private String totalDeposit;
	      private String totalByproduct;
	      private String averageTotalrate;
	      private String totalTransport;
	      private String totalcattleFeed;
	      private String totalnetPayment;
	      private String totalAmount;
	      private String totalManangement;
	      private String totalStore;
	      private String fDate;
	      private String tDate;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getWareHouse() {
			return wareHouse;
		}
		public void setWareHouse(String wareHouse) {
			this.wareHouse = wareHouse;
		}
		public String getSelectAcount() {
			return selectAcount;
		}
		public void setSelectAcount(String selectAcount) {
			this.selectAcount = selectAcount;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getSelectAll() {
			return selectAll;
		}
		public void setSelectAll(String selectAll) {
			this.selectAll = selectAll;
		}
		public String getTotalQuantity() {
			return totalQuantity;
		}
		public void setTotalQuantity(String totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
		public String getTotalAdvance() {
			return totalAdvance;
		}
		public void setTotalAdvance(String totalAdvance) {
			this.totalAdvance = totalAdvance;
		}
		public String getTotalDeposit() {
			return totalDeposit;
		}
		public void setTotalDeposit(String totalDeposit) {
			this.totalDeposit = totalDeposit;
		}
		public String getTotalByproduct() {
			return totalByproduct;
		}
		public void setTotalByproduct(String totalByproduct) {
			this.totalByproduct = totalByproduct;
		}
		public String getAverageTotalrate() {
			return averageTotalrate;
		}
		public void setAverageTotalrate(String averageTotalrate) {
			this.averageTotalrate = averageTotalrate;
		}
		public String getTotalTransport() {
			return totalTransport;
		}
		public void setTotalTransport(String totalTransport) {
			this.totalTransport = totalTransport;
		}
		public String getTotalcattleFeed() {
			return totalcattleFeed;
		}
		public void setTotalcattleFeed(String totalcattleFeed) {
			this.totalcattleFeed = totalcattleFeed;
		}
		public String getTotalnetPayment() {
			return totalnetPayment;
		}
		public void setTotalnetPayment(String totalnetPayment) {
			this.totalnetPayment = totalnetPayment;
		}
		public String getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getTotalManangement() {
			return totalManangement;
		}
		public void setTotalManangement(String totalManangement) {
			this.totalManangement = totalManangement;
		}
		public String getTotalStore() {
			return totalStore;
		}
		public void setTotalStore(String totalStore) {
			this.totalStore = totalStore;
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
		
}
