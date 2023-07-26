package com.dairy.model.sansthaMaster;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SansthaMaster
{
    
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	 public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSanthaname() {
		return santhaname;
	}

	public void setSanthaname(String santhaname) {
		this.santhaname = santhaname;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getPaasaino() {
		return paasaino;
	}

	public void setPaasaino(String paasaino) {
		this.paasaino = paasaino;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCinno() {
		return cinno;
	}

	public void setCinno(String cinno) {
		this.cinno = cinno;
	}

	public String getSslno() {
		return sslno;
	}

	public void setSslno(String sslno) {
		this.sslno = sslno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getOtherno() {
		return otherno;
	}

	public void setOtherno(String otherno) {
		this.otherno = otherno;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getChillingcentre() {
		return chillingcentre;
	}

	public void setChillingcentre(String chillingcentre) {
		this.chillingcentre = chillingcentre;
	}

	public String getSecretaryname() {
		return secretaryname;
	}

	public void setSecretaryname(String secretaryname) {
		this.secretaryname = secretaryname;
	}

	public String getRegistrationno() {
		return registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	public String getRegistrationdate() {
		return registrationdate;
	}

	public void setRegistrationdate(String registrationdate) {
		this.registrationdate = registrationdate;
	}

	public String getChairmanname() {
		return chairmanname;
	}

	public void setChairmanname(String chairmanname) {
		this.chairmanname = chairmanname;
	}

	public String getAmountgroup() {
		return amountgroup;
	}

	public void setAmountgroup(String amountgroup) {
		this.amountgroup = amountgroup;
	}

	public String getSansthagroup() {
		return sansthagroup;
	}

	public void setSansthagroup(String sansthagroup) {
		this.sansthagroup = sansthagroup;
	}

	public String getMilktype() {
		return milktype;
	}

	public void setMilktype(String milktype) {
		this.milktype = milktype;
	}

	public String getFactor() {
		return factor;
	}

	public void setFactor(String factor) {
		this.factor = factor;
	}

	public String getOpeningbalance() {
		return openingbalance;
	}

	public void setOpeningbalance(String openingbalance) {
		this.openingbalance = openingbalance;
	}

	public String getDebitorcredit() {
		return debitorcredit;
	}

	public void setDebitorcredit(String debitorcredit) {
		this.debitorcredit = debitorcredit;
	}

	public String getCmchart() {
		return cmchart;
	}

	public void setCmchart(String cmchart) {
		this.cmchart = cmchart;
	}

	public String getBmchart() {
		return bmchart;
	}

	public void setBmchart(String bmchart) {
		this.bmchart = bmchart;
	}

	public String getTaxtype() {
		return taxtype;
	}

	public void setTaxtype(String taxtype) {
		this.taxtype = taxtype;
	}

	private String contactperson;
	    private String email;
	    private String type;
	    private String santhaname;
	    private String contactno;
	    private String gstno;
	    private String paasaino;
	    private String address;
	    private String area;
	    private String taluka;
	    private String district;
	    private String city;
	    private String pincode;
	    private String cinno;
	    private String sslno;
	    private String state;
	    private String category;
	    private String grp;
	    private String employee;
	    private String otherno;
	    private String website;
	    private String chillingcentre;
	    private String secretaryname;
	    private String registrationno;
	    private String registrationdate;
	    private String chairmanname;
	    private String amountgroup;
	    private String sansthagroup;
	    private String milktype;
	    private String factor;
	    private String openingbalance;
	    private String debitorcredit;
	    private String cmchart;
	    private String bmchart;
	    private String taxtype;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

     
	
	//BANK DETAILS
 
        private String bankname;
        public String getBankname() {
			return bankname;
		}

		public void setBankname(String bankname) {
			this.bankname = bankname;
		}

		public String getAccountno() {
			return accountno;
		}

		public void setAccountno(String accountno) {
			this.accountno = accountno;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getIfsccode() {
			return ifsccode;
		}

		public void setIfsccode(String ifsccode) {
			this.ifsccode = ifsccode;
		}

		public String getBankaccountname() {
			return bankaccountname;
		}

		public void setBankaccountname(String bankaccountname) {
			this.bankaccountname = bankaccountname;
		}

		public String getFssairegistrationdate() {
			return fssairegistrationdate;
		}

		public void setFssairegistrationdate(String fssairegistrationdate) {
			this.fssairegistrationdate = fssairegistrationdate;
		}

		public String getFssaiexpirydate() {
			return fssaiexpirydate;
		}

		public void setFssaiexpirydate(String fssaiexpirydate) {
			this.fssaiexpirydate = fssaiexpirydate;
		}

		public String getTransportbm() {
			return transportbm;
		}

		public void setTransportbm(String transportbm) {
			this.transportbm = transportbm;
		}

		public String getTransportcm() {
			return transportcm;
		}

		public void setTransportcm(String transportcm) {
			this.transportcm = transportcm;
		}

		public String getManagementorcommisionbm() {
			return managementorcommisionbm;
		}

		public void setManagementorcommisionbm(String managementorcommisionbm) {
			this.managementorcommisionbm = managementorcommisionbm;
		}

		public String getManagementorcommisioncm() {
			return managementorcommisioncm;
		}

		public void setManagementorcommisioncm(String managementorcommisioncm) {
			this.managementorcommisioncm = managementorcommisioncm;
		}

		public String getDepositebm() {
			return depositebm;
		}

		public void setDepositebm(String depositebm) {
			this.depositebm = depositebm;
		}

		public String getDepositecm() {
			return depositecm;
		}

		public void setDepositecm(String depositecm) {
			this.depositecm = depositecm;
		}

		public String getSelectroute() {
			return selectroute;
		}

		public void setSelectroute(String selectroute) {
			this.selectroute = selectroute;
		}

		private String accountno;
        private String branch;
        private String ifsccode;
        private String bankaccountname;
        private String fssairegistrationdate;
        private String fssaiexpirydate;
        private String transportbm;
        private String transportcm;
        private String managementorcommisionbm;
        private String  managementorcommisioncm;
        private String depositebm;
        private String depositecm;
        
     //routedetails
        private String selectroute;
        
        
        
        //CreateLedger
        
       



    
 
 
    
     
}
