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

import com.dairy.model.gatePassEntry.EmployeeEntryInMaster;
import com.dairy.model.gatePassEntry.EmployeeOutEntryMaster;
import com.dairy.model.gatePassEntry.GuestInEntryMaster;
import com.dairy.model.gatePassEntry.GuestOutEntryMaster;
import com.dairy.model.gatePassEntry.Material1stEntryMaster;
import com.dairy.model.gatePassEntry.Material2ndEntryMaster;
import com.dairy.model.gatePassEntry.MilkVehicleInMaster;
import com.dairy.model.gatePassEntry.MilkVehicleOutMaster;
import com.dairy.model.gatePassEntry.OtherVehicleInMaster;
import com.dairy.model.gatePassEntry.OtherVehicleOutMaster;
import com.dairy.repository.gatePassEntry.EmployeeEntryInRepo;
import com.dairy.repository.gatePassEntry.EmployeeOutEntryRepo;
import com.dairy.repository.gatePassEntry.GuestEntryInRepo;
import com.dairy.repository.gatePassEntry.GuestOutEntryRepo;
import com.dairy.repository.gatePassEntry.Material1stEntryRepo;
import com.dairy.repository.gatePassEntry.Material2ndEntryRepo;
import com.dairy.repository.gatePassEntry.MilkVehicleInRepo;
import com.dairy.repository.gatePassEntry.MilkVehicleOutRepo;
import com.dairy.repository.gatePassEntry.OtherVehicleInRepo;
import com.dairy.repository.gatePassEntry.OtherVehicleOutRepo;



@Service
public class GatePassEntryService {
	
	@Autowired
	private EmployeeEntryInRepo employeeEntryInRepo;
	
	@Autowired
	private EmployeeOutEntryRepo  employeeOutEntryRepo;
	
	@Autowired
	private GuestEntryInRepo guestEntryInRepo; 
	
	@Autowired
	private GuestOutEntryRepo guestOutEntryRepo;
	
	@Autowired
	private OtherVehicleInRepo otherVehicleInRepo;
	
	@Autowired
	private OtherVehicleOutRepo otherVehicleOutRepo;
	
	@Autowired
	private MilkVehicleInRepo milkVehicleInRepo;
	
	@Autowired
	private MilkVehicleOutRepo milkVehicleOutRepo;
	
	@Autowired
	private Material1stEntryRepo  material1stEntryRepo;
	
	@Autowired
	private Material2ndEntryRepo material2ndEntryRepo;

	// Employee Entry In
	public EmployeeEntryInMaster saveEmployeeEntryIn(EmployeeEntryInMaster employeeEntryInMaster) {
		return employeeEntryInRepo.save(employeeEntryInMaster);
	}

	public List<EmployeeEntryInMaster> findALLEmployeeEntryInData() {
		return employeeEntryInRepo.findAll();
	}
	
	//Employee Out Entry

	public EmployeeOutEntryMaster saveEmployeeOutEntry(EmployeeOutEntryMaster employeeOutEntryMaster) {
		return employeeOutEntryRepo.save(employeeOutEntryMaster);
	}

	public List<EmployeeOutEntryMaster> findAllEmployeeOutEntry() {
		return employeeOutEntryRepo.findAll();
	}

	// Guest In Entry
	
	public GuestInEntryMaster saveGuestEntryIn(GuestInEntryMaster guestInEntryMaster) {
		return guestEntryInRepo.save(guestInEntryMaster);
	}

	public List<GuestInEntryMaster> findALLGuestEntryInData() {
		return guestEntryInRepo.findAll();
	}

	// Guest Out Entry
	
	public GuestOutEntryMaster saveGuestOutEntry(GuestOutEntryMaster guestOutEntryMaster) {
		return guestOutEntryRepo.save(guestOutEntryMaster);
	}

	public List<GuestOutEntryMaster> findALLGuestOutEntryData() {
		return guestOutEntryRepo.findAll();
	}

	// Other Vehicle In
	
	public OtherVehicleInMaster saveotherVehicleIn(OtherVehicleInMaster otherVehicleInMaster) {
		return otherVehicleInRepo.save(otherVehicleInMaster);
	}

	public List<OtherVehicleInMaster> findAllOtherVehicleInData() {
		return otherVehicleInRepo.findAll();
	}

	public void genrateOtherVehicleInDataexcelsheet(HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		List<OtherVehicleInMaster> otherVehicleInMaster = otherVehicleInRepo.findAll();
		 HSSFWorkbook workbook = new HSSFWorkbook();
		 HSSFSheet sheet = workbook.createSheet("Other Vehicle In");
		 HSSFRow row = sheet.createRow(0);
		
		 row.createCell(0).setCellValue("ID");
		 row.createCell(1).setCellValue("Date");
		 row.createCell(2).setCellValue("Vehicle No");
		 row.createCell(3).setCellValue("Supplier");
		 row.createCell(4).setCellValue("Item");
		 row.createCell(5).setCellValue("In Time");
		 row.createCell(6).setCellValue("Quantity");
		 row.createCell(7).setCellValue("Gross Weight");
		 row.createCell(8).setCellValue("Online/Offline");
		 
		  int dataRowIndex = 1;
		  
		  for(OtherVehicleInMaster ovinm: otherVehicleInMaster) {
			  HSSFRow dataRow = sheet.createRow(dataRowIndex);
			  
			  dataRow.createCell(0).setCellValue(ovinm.getId());
			  dataRow.createCell(1).setCellValue(ovinm.getDate());
			  dataRow.createCell(2).setCellValue(ovinm.getVehicleNo());
			  dataRow.createCell(3).setCellValue(ovinm.getSupplierName());
			  dataRow.createCell(4).setCellValue(ovinm.getItemName());
			  dataRow.createCell(5).setCellValue(ovinm.getInTime());
			  dataRow.createCell(6).setCellValue(ovinm.getQuantity());
			  dataRow.createCell(7).setCellValue(ovinm.getGrossWeight());
			  dataRow.createCell(8).setCellValue(ovinm.getOnlineOffline());
			  dataRow.createCell(9).setCellValue(ovinm.getOnlineOffline());
			 
			  dataRowIndex ++;
		  }
		  ServletOutputStream ops = resp.getOutputStream();
		    workbook.write(ops);
		    workbook.close();
		    ops.close();
		  
	}
	
	// Other Vehicle Out

	public OtherVehicleOutMaster saveOtherVehicleOut(OtherVehicleOutMaster otherVehicleOutMaster) {
		return otherVehicleOutRepo.save(otherVehicleOutMaster);
	}

	public List<OtherVehicleOutMaster> findAllOtherVehicleOutData() {
		return otherVehicleOutRepo.findAll();
	}

	// Milk Vehicle In
	
	public MilkVehicleInMaster saveMilkVehicleInData(MilkVehicleInMaster milkVehicleInMaster) {
		return milkVehicleInRepo.save(milkVehicleInMaster);
	}

	public List<MilkVehicleInMaster> findAllMilkVehicleInData() {
		return milkVehicleInRepo.findAll();
	}

	// Milk Vehicle OUt
	public MilkVehicleOutMaster saveMilkVehicleOutData(MilkVehicleOutMaster milkVehicleOutMaster) {
		return milkVehicleOutRepo.save(milkVehicleOutMaster);
	}

	public List<MilkVehicleOutMaster> findAllMilkVehicleOutData() {
		// TODO Auto-generated method stub
		return milkVehicleOutRepo.findAll();
	}

	// Material 1st Entry
	public Material1stEntryMaster saveMaterial1stEntry(Material1stEntryMaster material1stEntryMaster) {
		return material1stEntryRepo.save(material1stEntryMaster);
	}

	public List<Material1stEntryMaster> findAllMaterial1stEntry() {
		// TODO Auto-generated method stub
		return material1stEntryRepo.findAll();
	}

	// Material 2nd Entry
	public Material2ndEntryMaster saveMaterial2ndEntry(Material2ndEntryMaster material2ndEntryMaster) {
		return material2ndEntryRepo.save(material2ndEntryMaster);
	}

	public List<Material2ndEntryMaster> findAllMaterial2ndEntry() {
		return material2ndEntryRepo.findAll();
	}

	
	

}
