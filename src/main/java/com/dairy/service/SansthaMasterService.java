package com.dairy.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

import com.dairy.Exception.FileStorageException;
import com.dairy.model.sansthaMaster.PerRateContractMaster;
import com.dairy.model.sansthaMaster.PurRateExcleImport;

import com.dairy.model.sansthaMaster.SansthaMaster;
import com.dairy.property.FileStorageProperties;

import com.dairy.repository.sansthaMaster.PerRateContractMasterRepo;
import com.dairy.repository.sansthaMaster.PurRateExcelImportRepo;

import com.dairy.repository.sansthaMaster.SansthaMasterRepo;

@Service
public class SansthaMasterService {

	@Autowired
	private SansthaMasterRepo sansthaMasterrepo;

	@Autowired
	private PerRateContractMasterRepo contractMasterRepo;

	@Autowired
	private PurRateExcelImportRepo purRateExcelImportRepo ;

//Sanstha Master
	public SansthaMaster saveSansthaMasterNew(SansthaMaster sansthamaster) {
		// TODO Auto-generated method stub
		return sansthaMasterrepo.save(sansthamaster);
	}

	public List<SansthaMaster> findAllData() {
		// TODO Auto-generated method stub
		return sansthaMasterrepo.findAll();
	}

	public void generateExcel1(HttpServletResponse response) throws IOException {
		List<SansthaMaster> sansthamaster1 = sansthaMasterrepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("Courses Info");

		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Contactperson ");

		row.createCell(2).setCellValue("Santhaname");
		row.createCell(3).setCellValue("Contactno");

		row.createCell(4).setCellValue("Address");
		row.createCell(5).setCellValue("Area");

		row.createCell(6).setCellValue("Chillingcentre ");
		row.createCell(7).setCellValue("Openingbalanc");
		row.createCell(8).setCellValue("Debitorcredit");
		row.createCell(9).setCellValue("Sansthagroup");
		row.createCell(10).setCellValue("Selectroute");
		row.createCell(11).setCellValue("Gstno");
		row.createCell(12).setCellValue("State");

		int dataRowIndex = 1;

		for (SansthaMaster aa : sansthamaster1) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getContactperson());

			dataRow.createCell(2).setCellValue(aa.getSanthaname());
			dataRow.createCell(3).setCellValue(aa.getContactno());

			dataRow.createCell(4).setCellValue(aa.getAddress());
			dataRow.createCell(5).setCellValue(aa.getArea());

			dataRow.createCell(6).setCellValue(aa.getChillingcentre());
			dataRow.createCell(7).setCellValue(aa.getOpeningbalance());
			dataRow.createCell(8).setCellValue(aa.getDebitorcredit());
			dataRow.createCell(9).setCellValue(aa.getSansthagroup());
			dataRow.createCell(10).setCellValue(aa.getSelectroute());
			dataRow.createCell(11).setCellValue(aa.getGstno());
			dataRow.createCell(12).setCellValue(aa.getState());

			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}

	// PerRateContractMasterx
	public PerRateContractMaster savePerRateContractMaster(PerRateContractMaster perRateContractMaster) {
		// TODO Auto-generated method stub
		return contractMasterRepo.save(perRateContractMaster);
	}

	public List<PerRateContractMaster> findAlldata() {
		// TODO Auto-generated method stub
		return contractMasterRepo.findAll();
	}

	public void generateExcel(HttpServletResponse response) throws IOException {
		List<PerRateContractMaster> perratecontractmaster = contractMasterRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("Courses Info");

		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MilkType");
		row.createCell(2).setCellValue("RateChartName");
		row.createCell(3).setCellValue("StandardFat");
		row.createCell(4).setCellValue("StandardSnf");
		row.createCell(5).setCellValue("Ratee");

		int dataRowIndex = 1;

		for (PerRateContractMaster aa : perratecontractmaster) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getMilkType());
			dataRow.createCell(2).setCellValue(aa.getRateChartName());
			dataRow.createCell(3).setCellValue(aa.getStandardFat());
			dataRow.createCell(4).setCellValue(aa.getStandardSNF());
			dataRow.createCell(5).setCellValue(aa.getRate());

			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}

	public PerRateContractMaster saveperratecontractMaster(PerRateContractMaster perratecontractmaster) {
		// TODO Auto-generated method stub
		return contractMasterRepo.save(perratecontractmaster);

	}
//Pur Rate Excel Import Retrieve
	public List<PurRateExcleImport> getallpurRatedata() {
		// TODO Auto-generated method stub
		return purRateExcelImportRepo.findAll();
	}

}
