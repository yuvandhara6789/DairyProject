package com.dairy.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.BulkMilkEntry.MilkGRN;
import com.dairy.model.BulkMilkEntry.MilkGrnToPurchase;
import com.dairy.model.BulkMilkEntry.VehicleEntry;
import com.dairy.model.BulkMilkEntry.VehicleQCApproval;
import com.dairy.model.BulkMilkEntry.VehicleQcEntry;
import com.dairy.repository.BulkMilkEntry.MilkGRNRepo;
import com.dairy.repository.BulkMilkEntry.MilkGrnToPurchaseRepo;
import com.dairy.repository.BulkMilkEntry.VehicleEntryRepo;
import com.dairy.repository.BulkMilkEntry.VehicleQCApprovalRepo;
import com.dairy.repository.BulkMilkEntry.VehicleQcEntryRepo;

@Service
public class BulkMilkEntryService {

	@Autowired
	private VehicleEntryRepo vehicleEntryRepo;

	@Autowired
	private VehicleQCApprovalRepo vehicleQCApprovalRepo;

	@Autowired
	private VehicleQcEntryRepo vehicleQcEntryRepo;

	@Autowired
	private MilkGrnToPurchaseRepo milkGrnToPurchaseRepo;
	
	@Autowired
	private MilkGRNRepo milkGRNRepo ;

	// Vehicle Entry
	public VehicleEntry saveVehicleEntry(VehicleEntry vehicleEntry) {
		return vehicleEntryRepo.save(vehicleEntry);
	}

	public List<VehicleEntry> getAllVehicleEntry() {
		return vehicleEntryRepo.findAll();
	}

	public List<VehicleEntry> findBydateBetween(String fromDate, String toDate) {
		return vehicleEntryRepo.findBydateBetween(fromDate, toDate);
	}

	// VehicleQCApproval
	public VehicleQCApproval saveBulkMilkEntry(VehicleQCApproval vehicleQCApproval) {
		return vehicleQCApprovalRepo.save(vehicleQCApproval);
	}

	public List<VehicleQCApproval> getAllVehicleQCApprovalDetails() {
		return vehicleQCApprovalRepo.findAll();
	}

	public List<VehicleQCApproval> getVehicleQCApprovalByDate(String getfDate, String gettDate) {
		return vehicleQCApprovalRepo.findByDateBetween(getfDate, gettDate);
	}

	// vehicle QC entry

	public VehicleQcEntry saveVehicleQcEntry(VehicleQcEntry vehicleQcEntry) {
		return vehicleQcEntryRepo.save(vehicleQcEntry);
	}

	public List<VehicleQcEntry> findALLVehicleQcEntryData() {
		return vehicleQcEntryRepo.findAll();
	}

	public List<VehicleQcEntry> findByDateBetween1(String getfDate, String gettDate) {
		return vehicleQcEntryRepo.findByDateBetween(getfDate, gettDate);
	}

	public void generateVehicleQcEntryExcelSheet(HttpServletResponse resp) throws IOException {
		List<VehicleQcEntry> vehiclleqcentry = vehicleQcEntryRepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Milk Collection Kg");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Date");
		row.createCell(2).setCellValue("Vendor Name");
		row.createCell(3).setCellValue("Vehicle No");
		row.createCell(4).setCellValue("Milk Type");
		row.createCell(5).setCellValue("FAT");
		row.createCell(6).setCellValue("SNF");
		row.createCell(7).setCellValue("Acidity");
		row.createCell(8).setCellValue("Our Fat");
		row.createCell(9).setCellValue("Our SNF");
		row.createCell(10).setCellValue("Our Acidity");
		row.createCell(11).setCellValue("Degree");
		row.createCell(12).setCellValue("Temperature");
		row.createCell(13).setCellValue("MBRT");
		row.createCell(14).setCellValue("Sampler Name");
		row.createCell(15).setCellValue("Chemist Name");
		row.createCell(16).setCellValue("Status");
		row.createCell(17).setCellValue("QC Aprroved Id");
		row.createCell(18).setCellValue("Milk GRN");
		row.createCell(19).setCellValue("Remark");
		row.createCell(20).setCellValue("Entry By");
		row.createCell(21).setCellValue("Date of Entry");

		int dataRowIndex = 1;

		for (VehicleQcEntry veh : vehiclleqcentry) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);

			dataRow.createCell(0).setCellValue(veh.getId());
			dataRow.createCell(1).setCellValue(veh.getDate());
			dataRow.createCell(2).setCellValue(veh.getVendorName());
			dataRow.createCell(3).setCellValue(veh.getVehicleNo());
			dataRow.createCell(4).setCellValue(veh.getMilkType());
			dataRow.createCell(5).setCellValue(veh.getVendorFat());
			dataRow.createCell(6).setCellValue(veh.getVendorSnf());
			dataRow.createCell(7).setCellValue(veh.getVendorAcidity());
			dataRow.createCell(8).setCellValue(veh.getOurFat());
			dataRow.createCell(9).setCellValue(veh.getOurSnf());
			dataRow.createCell(10).setCellValue(veh.getOurAcidity());
			dataRow.createCell(11).setCellValue(veh.getDegree());
			dataRow.createCell(12).setCellValue(veh.getTemperature());
			dataRow.createCell(13).setCellValue(veh.getMbrt());
			dataRow.createCell(14).setCellValue(veh.getSamplerName());
			dataRow.createCell(15).setCellValue(veh.getChemistName());
			dataRow.createCell(16).setCellValue(veh.getStatus());
			dataRow.createCell(17).setCellValue(veh.getQcApprovedId());
			dataRow.createCell(18).setCellValue(veh.getMilkGrn());
			dataRow.createCell(19).setCellValue(veh.getRemark());
			dataRow.createCell(20).setCellValue(veh.getEntryBy());
			dataRow.createCell(21).setCellValue(veh.getDate());

			dataRowIndex++;

		}
		ServletOutputStream ops = resp.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}

	// Milk Grn To Purchase

	public MilkGrnToPurchase saveMilkGrnToPurchase(MilkGrnToPurchase milkGrnToPurchase) {
		return milkGrnToPurchaseRepo.save(milkGrnToPurchase);
	}

	public List<MilkGrnToPurchase> findAllMilkGrnData() {
		return milkGrnToPurchaseRepo.findAll();
	}

	public List<MilkGrnToPurchase> findByDateBetween(String getfDate, String gettDate) {
		return milkGrnToPurchaseRepo.findByDateBetween(getfDate, gettDate);
	}

	public void generateMilkGRnTopurchaseExcel(HttpServletResponse res) throws IOException {
		List<MilkGrnToPurchase> mktp1 = milkGrnToPurchaseRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("Milk Grp To Purchase Info");

		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Date");

		row.createCell(2).setCellValue("Supplier");
		row.createCell(3).setCellValue("Vehicle Number");

		row.createCell(4).setCellValue("Batch No");
		row.createCell(5).setCellValue("WareHouse");

		row.createCell(6).setCellValue("ItemName ");
		row.createCell(7).setCellValue("Fat");
		row.createCell(8).setCellValue("Snf");
		row.createCell(9).setCellValue("Net Quantity");
		row.createCell(10).setCellValue("Final Rate");
		row.createCell(11).setCellValue("Transport Rate");
		row.createCell(12).setCellValue("Total Amount");
		row.createCell(12).setCellValue("Entry By");

		int dataRowIndex = 1;

		for (MilkGrnToPurchase aa : mktp1) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getDate());

			dataRow.createCell(2).setCellValue(aa.getSupplier());
			dataRow.createCell(3).setCellValue(aa.getVehicleNo());

			dataRow.createCell(4).setCellValue(aa.getBatchNo());
			dataRow.createCell(5).setCellValue(aa.getWarehouse());

			dataRow.createCell(6).setCellValue(aa.getItem());
			dataRow.createCell(7).setCellValue(aa.getFat());
			dataRow.createCell(8).setCellValue(aa.getSnf());
			dataRow.createCell(9).setCellValue(aa.getNetQty());
			dataRow.createCell(10).setCellValue(aa.getFinalRate());
			dataRow.createCell(11).setCellValue(aa.getTransportRate());
			dataRow.createCell(12).setCellValue(aa.getTotalAmount());
			dataRow.createCell(13).setCellValue(aa.getEntryBy());

			dataRowIndex++;
		}
		ServletOutputStream ops = res.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}
	
	public MilkGRN save(MilkGRN milkGRN) {
		// TODO Auto-generated method stub
		return milkGRNRepo.save(milkGRN);
	}

	public List<MilkGRN> findAllMilkGRN() {
		// TODO Auto-generated method stub
		return milkGRNRepo.findAll();
	}

	public List<MilkGRN> findByDateBetween2(String getfDate, String gettDate) {
		// TODO Auto-generated method stub
		return milkGRNRepo.findByDateBetween(getfDate,gettDate);
	}
	
	public void generateExcel(HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		List<MilkGRN> milkGRN2=milkGRNRepo.findAll();
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("Milk GRN");
		HSSFRow row=sheet.createRow(0);
		
		
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Date");
		row.createCell(2).setCellValue("Vendor Name");
		row.createCell(3).setCellValue("Item");
		row.createCell(4).setCellValue("Unit");
		row.createCell(5).setCellValue("Vendor Gross Weight");
		row.createCell(6).setCellValue("Vendor Net Weight");
		row.createCell(7).setCellValue("Vehicle Empty Weight");
		row.createCell(8).setCellValue("Warehouse");
		row.createCell(9).setCellValue("Rate");
		row.createCell(10).setCellValue("Rate Reduction");
		row.createCell(11).setCellValue("Final Rate");
		row.createCell(12).setCellValue("Total Amount");
		
		
		
		int dataRowIndex=1;
		
		for(MilkGRN aa:milkGRN2) {
			HSSFRow dataRow=sheet.createRow(dataRowIndex);
			
			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getDate());
			dataRow.createCell(2).setCellValue(aa.getVendorName());
			dataRow.createCell(3).setCellValue(aa.getItem());
			dataRow.createCell(4).setCellValue(aa.getUnit());
			dataRow.createCell(5).setCellValue(aa.getVenderGrossWeight());
			dataRow.createCell(6).setCellValue(aa.getVendorNetWeight());
			dataRow.createCell(7).setCellValue(aa.getEmptyVehicleWeight());
			dataRow.createCell(8).setCellValue(aa.getWarehouse());
			dataRow.createCell(9).setCellValue(aa.getRate());
			dataRow.createCell(10).setCellValue(aa.getRateReduction());
			dataRow.createCell(11).setCellValue(aa.getFinalRate());
			dataRow.createCell(12).setCellValue(aa.getTotalAmount());
			
			dataRowIndex ++;
		}
		ServletOutputStream ops=res.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

}
