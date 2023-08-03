package com.dairy.model.processManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class RptProcessCreamReport 
{
        @Id
        @GeneratedValue(strategy =GenerationType.AUTO)
        private int id;
        private String date;
        @Transient
        private String fDate;
        @Transient
        private String tDate;
        private String outmilkWarehouse;
        private String milkitemName;
        private String creamWarehouse;
        private String creamItem;
        private String skimmedWarehouse;
        private String skimmedMilkItem;
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
		public String getOutmilkWarehouse() {
			return outmilkWarehouse;
		}
		public void setOutmilkWarehouse(String outmilkWarehouse) {
			this.outmilkWarehouse = outmilkWarehouse;
		}
		public String getMilkitemName() {
			return milkitemName;
		}
		public void setMilkitemName(String milkitemName) {
			this.milkitemName = milkitemName;
		}
		public String getCreamWarehouse() {
			return creamWarehouse;
		}
		public void setCreamWarehouse(String creamWarehouse) {
			this.creamWarehouse = creamWarehouse;
		}
		public String getCreamItem() {
			return creamItem;
		}
		public void setCreamItem(String creamItem) {
			this.creamItem = creamItem;
		}
		public String getSkimmedWarehouse() {
			return skimmedWarehouse;
		}
		public void setSkimmedWarehouse(String skimmedWarehouse) {
			this.skimmedWarehouse = skimmedWarehouse;
		}
		public String getSkimmedMilkItem() {
			return skimmedMilkItem;
		}
		public void setSkimmedMilkItem(String skimmedMilkItem) {
			this.skimmedMilkItem = skimmedMilkItem;
		}
        
       
}
