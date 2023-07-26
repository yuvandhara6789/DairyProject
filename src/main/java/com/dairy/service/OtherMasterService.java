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

import com.dairy.model.otherMasters.AccountGroup;
import com.dairy.model.otherMasters.AreaMaster;
import com.dairy.model.otherMasters.DepartmentMaster;
import com.dairy.model.otherMasters.PurchasePaymentTermsandCondition;
import com.dairy.model.otherMasters.RateContractMaster;
import com.dairy.model.otherMasters.ReorderMaster;
import com.dairy.model.otherMasters.RouteMaster;
import com.dairy.model.otherMasters.SchemeMaster;
import com.dairy.model.otherMasters.TransportMaster;
import com.dairy.model.otherMasters.UnitMaster;
import com.dairy.model.otherMasters.VehicleMaster;
import com.dairy.model.otherMasters.WarehouseMaster;
import com.dairy.repository.otherMaster.AccountGroupRepo;
import com.dairy.repository.otherMaster.AreaMasterRepo;
import com.dairy.repository.otherMaster.DepartmentMasterRepo;
import com.dairy.repository.otherMaster.PurchasePaymentRepo;
import com.dairy.repository.otherMaster.RateContractMasterRepo;
import com.dairy.repository.otherMaster.ReorderMasterRepo;
import com.dairy.repository.otherMaster.RouteMasterRepo;
import com.dairy.repository.otherMaster.SchemeMasterRepo;
import com.dairy.repository.otherMaster.TransportMasterRepo;
import com.dairy.repository.otherMaster.UnitMasterRepo;
import com.dairy.repository.otherMaster.VehicleMasterRepo;
import com.dairy.repository.otherMaster.WarehouseMasterRepo;

@Service
public class OtherMasterService {

	@Autowired
	private AccountGroupRepo accountGroupRepo;

	@Autowired
	private DepartmentMasterRepo departmentMasterRepo;

	@Autowired
	private RouteMasterRepo routeMasterRepo;

	@Autowired
	private UnitMasterRepo unitMasterRepo;

	@Autowired
	private ReorderMasterRepo reorderMasterRepo;

	@Autowired
	private PurchasePaymentRepo purchasePaymentRepo;

	@Autowired
	private SchemeMasterRepo schemeMasterRepo;

	@Autowired
	private AreaMasterRepo areamasterrepo;

	@Autowired
	private WarehouseMasterRepo warehouseMasterRepo;

	@Autowired
	private VehicleMasterRepo vehiclemasterrepo;
	
	@Autowired
	private RateContractMasterRepo rateContractMasterRepo ;
	
	@Autowired
	private TransportMasterRepo transportmasterrepo ;

//Account Group
	public AccountGroup saveAccountGroup(AccountGroup accountGroup) {
		// TODO Auto-generated method stub
		return accountGroupRepo.save(accountGroup);
	}

	public List<AccountGroup> findAllAccountGroup() {
		// TODO Auto-generated method stub
		return accountGroupRepo.findAll();
	}

	// Scheme Master
	// save
	public SchemeMaster saveSchemeMaster(SchemeMaster schemeMaster) {
		// TODO Auto-generated method stub
		return schemeMasterRepo.save(schemeMaster);
	}

	// get all
	public List<SchemeMaster> findAllSchemeMaster() {
		// TODO Auto-generated method stub
		return schemeMasterRepo.findAll();
	}

	// find by date
	public List<SchemeMaster> findBydateBetween(String getfDate, String gettDate) {
		// TODO Auto-generated method stub
		return schemeMasterRepo.findBydateBetween(getfDate, gettDate);
	}

	public void generateExcel(HttpServletResponse res) throws IOException {
		// TODO Auto-generated method stub
		List<SchemeMaster> schemeMasters1 = schemeMasterRepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Scheme Master");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Status");
		row.createCell(2).setCellValue("Scheme Name");
		row.createCell(3).setCellValue("Applicable Type");
		row.createCell(4).setCellValue("Route/Customer");
		row.createCell(5).setCellValue("Validity Start");
		row.createCell(6).setCellValue("Validity End");
		row.createCell(7).setCellValue("Type Of Scheme");
		row.createCell(8).setCellValue("Group/Item");
		row.createCell(9).setCellValue("Group/Item List");
		row.createCell(10).setCellValue("Minimum Qty(KG/Litre)");
		row.createCell(11).setCellValue("Item");
		row.createCell(12).setCellValue("Item Unit");
		row.createCell(13).setCellValue("Invested Amount");
		row.createCell(14).setCellValue("Discount Type");
		row.createCell(15).setCellValue("Percentage");
		row.createCell(16).setCellValue("Amount");

		int dataRowIndex = 1;

		for (SchemeMaster aa : schemeMasters1) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);

			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getStatus());
			dataRow.createCell(2).setCellValue(aa.getSchemeName());
			dataRow.createCell(3).setCellValue(aa.getApplicableType());
			dataRow.createCell(4).setCellValue(aa.getRouteCustomer());
			dataRow.createCell(5).setCellValue(aa.getfDate());
			dataRow.createCell(6).setCellValue(aa.gettDate());
			dataRow.createCell(7).setCellValue(aa.getSchemeType());
			dataRow.createCell(8).setCellValue(aa.getGroupItem());
			dataRow.createCell(9).setCellValue(aa.getGroupItemList());
			dataRow.createCell(10).setCellValue(aa.getMinQty());
			dataRow.createCell(11).setCellValue(aa.getItem());
			dataRow.createCell(12).setCellValue(aa.getItemUnit());
			dataRow.createCell(13).setCellValue(aa.getInAmount());
			dataRow.createCell(14).setCellValue(aa.getDiscountType());
			dataRow.createCell(15).setCellValue(aa.getPercentage());
			dataRow.createCell(16).setCellValue(aa.getAmount());

			dataRowIndex++;
		}
		ServletOutputStream ops = res.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

//Department Master	
	public DepartmentMaster saveDepartmentMaster(DepartmentMaster departmentMaster) {
		// TODO Auto-generated method stub
		return departmentMasterRepo.save(departmentMaster);
	}

	public List<DepartmentMaster> findAllDepartmentMaster() {
		// TODO Auto-generated method stub
		return departmentMasterRepo.findAll();
	}

//Area master	
	public AreaMaster saveareaMaster(AreaMaster areamaster) {
		// TODO Auto-generated method stub
		return areamasterrepo.save(areamaster);
	}

	public List<AreaMaster> findAllData() {
		// TODO Auto-generated method stub
		return areamasterrepo.findAll();
	}

	public void generateExcelFile(HttpServletResponse res1) throws IOException {
		// TODO Auto-generated method stub
		List<AreaMaster> areamaster = areamasterrepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("AreaMaster Info");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Id");
		row.createCell(1).setCellValue("Area");
		row.createCell(2).setCellValue("Taluka");
		row.createCell(3).setCellValue("District");
		row.createCell(4).setCellValue("State");
		row.createCell(5).setCellValue("Region");
		row.createCell(6).setCellValue("Country");
		row.createCell(7).setCellValue("PinCode");

		int dataRowIndex = 1;
		for (AreaMaster am : areamaster) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(am.getId());
			dataRow.createCell(1).setCellValue(am.getArea());
			dataRow.createCell(2).setCellValue(am.getTaluka());
			dataRow.createCell(3).setCellValue(am.getDistrict());
			dataRow.createCell(4).setCellValue(am.getState());
			dataRow.createCell(5).setCellValue(am.getRegion());
			dataRow.createCell(6).setCellValue(am.getCountry());
			dataRow.createCell(7).setCellValue(am.getPincode());

			dataRowIndex++;

		}
		ServletOutputStream ops1 = res1.getOutputStream();
		workbook.write(ops1);
		workbook.close();
		ops1.close();
	}

//Route Master
	public RouteMaster saveRouteMaster(RouteMaster routeMaster) {
		// TODO Auto-generated method stub
		return routeMasterRepo.save(routeMaster);
	}

	public List<RouteMaster> findAllRouteMaster() {
		// TODO Auto-generated method stub
		return routeMasterRepo.findAll();
	}

//Unit Master
	public UnitMaster saveUnitMaster(UnitMaster unitMaster) {
		// TODO Auto-generated method stub
		return unitMasterRepo.save(unitMaster);
	}

	public List<UnitMaster> findAllUnitMaster() {
		// TODO Auto-generated method stub
		return unitMasterRepo.findAll();
	}

	// Warehouse Master
	public List<WarehouseMaster> findAllWarehouseMasterDetails() {
		// TODO Auto-generated method stub
		return warehouseMasterRepo.findAll();
	}

	public WarehouseMaster saveWarehouseMaster(WarehouseMaster warehousemaster) {
		// TODO Auto-generated method stub
		return warehouseMasterRepo.save(warehousemaster);
	}

	public void generateExcelWarehouse(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List<WarehouseMaster> warehouse = warehouseMasterRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("WarehouseMaster Info");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("WarehouseName");
		row.createCell(2).setCellValue("WarehouseType");
		row.createCell(3).setCellValue("WarehouseStatus");
		row.createCell(4).setCellValue("Incharge");
		row.createCell(5).setCellValue("Remark");
		row.createCell(6).setCellValue("Address");
		row.createCell(7).setCellValue("GSTState");
		row.createCell(8).setCellValue("ConvFactor");
		row.createCell(9).setCellValue("District");
		row.createCell(10).setCellValue("Number");

		int dataRowIndex = 1;

		for (WarehouseMaster warehouse1 : warehouse) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(warehouse1.getId());
			dataRow.createCell(1).setCellValue(warehouse1.getWarehousename());
			dataRow.createCell(2).setCellValue(warehouse1.getWarehousetype());
			dataRow.createCell(3).setCellValue(warehouse1.getWarehousestatus());
			dataRow.createCell(4).setCellValue(warehouse1.getIncharge());
			dataRow.createCell(5).setCellValue(warehouse1.getRemark());
			dataRow.createCell(6).setCellValue(warehouse1.getAddress());
			dataRow.createCell(7).setCellValue(warehouse1.getGststate());
			dataRow.createCell(8).setCellValue(warehouse1.getConvfactor());
			dataRow.createCell(9).setCellValue(warehouse1.getDistrict());
			dataRow.createCell(10).setCellValue(warehouse1.getNumber());
			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

	public ReorderMaster saveReorderMaster(ReorderMaster reorderMaster) {
		// TODO Auto-generated method stub
		return reorderMasterRepo.save(reorderMaster);
	}

	public List<ReorderMaster> findAllReorderMaster() {
		// TODO Auto-generated method stub
		return reorderMasterRepo.findAll();
	}

	// Purchase Payment Terms and Condition
	public PurchasePaymentTermsandCondition savePurchasePayment(
			PurchasePaymentTermsandCondition purchasePaymentTermsandCondition) {
		// TODO Auto-generated method stub
		return purchasePaymentRepo.save(purchasePaymentTermsandCondition);
	}

	public List<PurchasePaymentTermsandCondition> findAllPurchasePayment() {
		// TODO Auto-generated method stub
		return purchasePaymentRepo.findAll();
	}

	
//Vahicle Master	
	public VehicleMaster saveVehicleMaster(VehicleMaster vehiclemaster) {
		// TODO Auto-generated method stub
		return vehiclemasterrepo.save(vehiclemaster);

	}

	public List<VehicleMaster> getAllVehicledata() {
		// TODO Auto-generated method stub
		return vehiclemasterrepo.findAll();

	}

	public void vehicleMasterGetExcelFile(HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		List<VehicleMaster> listVehicleMaster = vehiclemasterrepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Vehicel Master");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Vehicle No");
		row.createCell(2).setCellValue("Transport");
		row.createCell(3).setCellValue("Rout");
		row.createCell(4).setCellValue("Driver");
		row.createCell(5).setCellValue("Driver Mobile No.");
		row.createCell(6).setCellValue("Status");
		row.createCell(7).setCellValue("Name of Vehicle");
		row.createCell(8).setCellValue("Vehicle Type");
		row.createCell(9).setCellValue("Vehicle Capacity(In Ton)");
		row.createCell(10).setCellValue("Rate");
		row.createCell(11).setCellValue("For");
		row.createCell(12).setCellValue("Rent Type");
		row.createCell(13).setCellValue("Billing days");

		int dataRowIndex = 1;
		for (VehicleMaster vehicleMaster : listVehicleMaster) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(vehicleMaster.getId());
			dataRow.createCell(1).setCellValue(vehicleMaster.getVehicleno());
			dataRow.createCell(2).setCellValue(vehicleMaster.gettransporter());
			dataRow.createCell(3).setCellValue(vehicleMaster.getRoute());
			dataRow.createCell(4).setCellValue(vehicleMaster.getDriver());
			dataRow.createCell(5).setCellValue(vehicleMaster.getMobileno());
			dataRow.createCell(6).setCellValue(vehicleMaster.getStatus());
			dataRow.createCell(7).setCellValue(vehicleMaster.getvehiclename());
			dataRow.createCell(8).setCellValue(vehicleMaster.getvehicletype());
			dataRow.createCell(9).setCellValue(vehicleMaster.getVehiclecapacity());
			dataRow.createCell(10).setCellValue(vehicleMaster.getRate());
			dataRow.createCell(11).setCellValue(vehicleMaster.getRenttype());
			dataRow.createCell(12).setCellValue(vehicleMaster.getRenttype());
			dataRow.createCell(13).setCellValue(vehicleMaster.getBillingdays());
			dataRowIndex++;

		}
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();

	}

	public void updateVehicleMaster(VehicleMaster vehicleMaster, int id) {
		// TODO Auto-generated method stub
		vehiclemasterrepo.save(vehicleMaster);
	}

// Rate Contract Master
	public RateContractMaster saveRateContractMaster(RateContractMaster rateContractMaster) {
		// TODO Auto-generated method stub
		return rateContractMasterRepo.save(rateContractMaster);
	}

	public List<RateContractMaster> findAllRateContract() {
		// TODO Auto-generated method stub
		return rateContractMasterRepo.findAll();
	}

//Transport Master
		public TransportMaster saveTransportMaster(TransportMaster transportmaster) {
			// TODO Auto-generated method stub
			return transportmasterrepo.save(transportmaster);
		}

		

		public List<TransportMaster> getAllTransportMasterData1() {
			// TODO Auto-generated method stub
			return transportmasterrepo.findAll();
		}

		public void generateExcelTransport(HttpServletResponse response) throws Exception{
			// TODO Auto-generated method stub
			List<TransportMaster> transportmaster=transportmasterrepo.findAll();
			
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TransportMaster Info");
			HSSFRow row = sheet.createRow(0);
			
			row.createCell(0).setCellValue("ID");
			row.createCell(1).setCellValue("Transporter");
			row.createCell(2).setCellValue("Contact");
			row.createCell(3).setCellValue("TransporterType");
			row.createCell(4).setCellValue("Status");
			
			
			int dataRowIndex=1;
			
			for(TransportMaster transport1:transportmaster) {
				 HSSFRow dataRow=sheet.createRow(dataRowIndex);
				 dataRow.createCell(0).setCellValue(transport1.getId());
				 dataRow.createCell(1).setCellValue(transport1.getTransportname());
				 dataRow.createCell(2).setCellValue(transport1.getContactno());
				 dataRow.createCell(3).setCellValue(transport1.getTransporttype());
				 dataRow.createCell(4).setCellValue(transport1.getStatus());
				
				 dataRowIndex ++;
			}
			ServletOutputStream ops=response.getOutputStream();
			workbook.write(ops);
			workbook.close();
			ops.close();
		}

		
}

