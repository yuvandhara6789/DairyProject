package com.dairy.service;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.centerMaster.ApplyRateChartToAll;
import com.dairy.model.centerMaster.CollectionMaster;
import com.dairy.model.centerMaster.FarmerMaster;
import com.dairy.repository.centerMaster.ApplyRateChartToAllRepo;
import com.dairy.repository.centerMaster.CollectionMasterRepo;
import com.dairy.repository.centerMaster.FarmerMasterRepo;

@Service
public class CenterMasterService {

	@Autowired
	private CollectionMasterRepo collectionMasterRepo;

	@Autowired
	private FarmerMasterRepo farmerMasterRepo;
	
	@Autowired
	private ApplyRateChartToAllRepo applyRateChartToAllRepo ;

	// CollectionCenterMaster
	// save
	public CollectionMaster saveCollectionMaster(CollectionMaster collectionMaster) {
		return collectionMasterRepo.save(collectionMaster);
	}

	// findAll
	public List<CollectionMaster> findAllCollectionMaster() {
		return collectionMasterRepo.findAll();
	}

	// Farmer Master
	public FarmerMaster savefarmerMaster(FarmerMaster farmermaster) {
		return farmerMasterRepo.save(farmermaster);
	}

	public List<FarmerMaster> getAllFermerMasterDetails() {
		return farmerMasterRepo.findAll();
	}

	public void generateFarmerMasterExcel(HttpServletResponse response) throws Exception {
		List<FarmerMaster> farmermaster = farmerMasterRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("FarmerMaster Info");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("AccountGroup");
		row.createCell(2).setCellValue("AccountNo");
		row.createCell(3).setCellValue("Address");
		row.createCell(4).setCellValue("Alias");
		row.createCell(5).setCellValue("Area");
		row.createCell(6).setCellValue("BankAddress");
		row.createCell(7).setCellValue("BankName");
		row.createCell(8).setCellValue("Branch");
		row.createCell(9).setCellValue("Category");
		row.createCell(10).setCellValue("City");
		row.createCell(11).setCellValue("ContactPerson");
		row.createCell(12).setCellValue("CreditDays");
		row.createCell(13).setCellValue("CreditLimit");
		row.createCell(14).setCellValue("DebetCredit");
		row.createCell(15).setCellValue("Discription");
		row.createCell(16).setCellValue("Designation");
		row.createCell(17).setCellValue("District");
		row.createCell(18).setCellValue("Email");
		row.createCell(19).setCellValue("FarmerName");
		row.createCell(20).setCellValue("FarmerType");
		row.createCell(21).setCellValue("FASSINo");
		row.createCell(22).setCellValue("Group");
		row.createCell(23).setCellValue("GSTNo");
		row.createCell(24).setCellValue("IFSCNo");
		row.createCell(25).setCellValue("InterestCalculation");
		row.createCell(26).setCellValue("MICRNo");
		row.createCell(27).setCellValue("MobileNo");
		row.createCell(28).setCellValue("Number");
		row.createCell(29).setCellValue("OpeningBalance");
		row.createCell(30).setCellValue("PanNo");
		row.createCell(31).setCellValue("PhoneNo");
		row.createCell(32).setCellValue("PinCode");
		row.createCell(33).setCellValue("SansthaCenter");
		row.createCell(34).setCellValue("State");
		row.createCell(35).setCellValue("Status");
		row.createCell(36).setCellValue("Taluka");
		row.createCell(37).setCellValue("TypeOfGST");
		row.createCell(38).setCellValue("BMChart");
		row.createCell(39).setCellValue("CMChart");
		row.createCell(40).setCellValue("DateOfBirth");

		int dataRowIndex = 1;

		for (FarmerMaster farmer1 : farmermaster) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(farmer1.getId());
			dataRow.createCell(1).setCellValue(farmer1.getAccountgroup());
			dataRow.createCell(2).setCellValue(farmer1.getAccountno());
			dataRow.createCell(3).setCellValue(farmer1.getAddress());
			dataRow.createCell(4).setCellValue(farmer1.getAlias());
			dataRow.createCell(5).setCellValue(farmer1.getArea());
			dataRow.createCell(6).setCellValue(farmer1.getBankadd());
			dataRow.createCell(7).setCellValue(farmer1.getBankname());
			dataRow.createCell(8).setCellValue(farmer1.getBranch());
			dataRow.createCell(9).setCellValue(farmer1.getCategory());
			dataRow.createCell(10).setCellValue(farmer1.getCity());
			dataRow.createCell(11).setCellValue(farmer1.getContactperson());
			dataRow.createCell(12).setCellValue(farmer1.getCreditdays());
			dataRow.createCell(13).setCellValue(farmer1.getCreditlimit());
			dataRow.createCell(14).setCellValue(farmer1.getDebetcredit());
			dataRow.createCell(15).setCellValue(farmer1.getDescription());
			dataRow.createCell(16).setCellValue(farmer1.getDesignation());
			dataRow.createCell(17).setCellValue(farmer1.getDistrict());
			dataRow.createCell(18).setCellValue(farmer1.getEmail());
			dataRow.createCell(19).setCellValue(farmer1.getFarmername());
			dataRow.createCell(20).setCellValue(farmer1.getFarmertype());
			dataRow.createCell(21).setCellValue(farmer1.getFassino());
			dataRow.createCell(22).setCellValue(farmer1.getGrp());
			dataRow.createCell(23).setCellValue(farmer1.getGstno());
			dataRow.createCell(24).setCellValue(farmer1.getIfscno());
			dataRow.createCell(25).setCellValue(farmer1.getInterestcalculation());
			dataRow.createCell(26).setCellValue(farmer1.getMicrno());
			dataRow.createCell(27).setCellValue(farmer1.getMobileno());
			dataRow.createCell(28).setCellValue(farmer1.getNumber());
			dataRow.createCell(29).setCellValue(farmer1.getOpeningbalance());
			dataRow.createCell(30).setCellValue(farmer1.getPanno());
			dataRow.createCell(31).setCellValue(farmer1.getPhoneno());
			dataRow.createCell(32).setCellValue(farmer1.getPincode());
			dataRow.createCell(33).setCellValue(farmer1.getSansthacenter());
			dataRow.createCell(34).setCellValue(farmer1.getState());
			dataRow.createCell(35).setCellValue(farmer1.getStatus());
			dataRow.createCell(36).setCellValue(farmer1.getTaluka());
			dataRow.createCell(37).setCellValue(farmer1.getTypeofgst());
			dataRow.createCell(38).setCellValue(farmer1.getBmchart());
			dataRow.createCell(39).setCellValue(farmer1.getCmchart());
			dataRow.createCell(40).setCellValue(farmer1.getDateofbirth());

			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

	// Apply Rate Chart To All Center
	public ApplyRateChartToAll saveApplyRateChartToAllCenter(ApplyRateChartToAll applyRateChartToAll) {
		return applyRateChartToAllRepo.save(applyRateChartToAll);
	}

	public List<ApplyRateChartToAll> getAllApplyRateChartData() {
		return applyRateChartToAllRepo.findAll();
	}

}
