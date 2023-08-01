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

import com.dairy.model.Sansthaposting.BatchCreationCompanyModel;
import com.dairy.model.Sansthaposting.BatchCreationmaster;
import com.dairy.model.Sansthaposting.OtherExpsJournalSanstha;
import com.dairy.model.Sansthaposting.SansthaBillRaiseMaster;
import com.dairy.model.Sansthaposting.SansthaReceipt;
import com.dairy.model.Sansthaposting.SansthaSaleReturn;
import com.dairy.model.Sansthaposting.Sansthabankpaymentmaster;
import com.dairy.repository.SansthaSalesReturnRepo;
import com.dairy.repository.sansthaPosting.BatchCreationCompanyRepo;
import com.dairy.repository.sansthaPosting.Batchcreationrepo;
import com.dairy.repository.sansthaPosting.OtherExpsJournalSansthaRepo;
import com.dairy.repository.sansthaPosting.SansthaBillRaiseRepo;
import com.dairy.repository.sansthaPosting.SansthaReceiptRepo;
import com.dairy.repository.sansthaPosting.Sansthabankpaymentrepo;

@Service
public class SansthaPostingService {

	@Autowired
	private OtherExpsJournalSansthaRepo otherExpsJournalSansthaRepo;

	@Autowired
	private BatchCreationCompanyRepo batchCreationCompanyRepo;

	@Autowired
	private SansthaReceiptRepo sansthaReceiptRepo;

	@Autowired
	private SansthaBillRaiseRepo sansthaBillRaiseRepo;
	
	@Autowired
	private SansthaSalesReturnRepo sansthaSaleReturnRepo;
	
	@Autowired
	private Batchcreationrepo batchcreationrepo;
	
	@Autowired
	private Sansthabankpaymentrepo sansthabankpaymentrepo;


	// OtherExpsJournalSanstha
	public OtherExpsJournalSanstha saveOtherExpsJournalSanstha(OtherExpsJournalSanstha otherExpsJournalSanstha) {
		// TODO Auto-generated method stub
		return otherExpsJournalSansthaRepo.save(otherExpsJournalSanstha);
	}

	public List<OtherExpsJournalSanstha> findAllOtherExpsJournalSanstha() {
		return otherExpsJournalSansthaRepo.findAll();
	}

	public List<OtherExpsJournalSanstha> findBydateBetween(String getfDate, String gettDate) {
		return otherExpsJournalSansthaRepo.findBydateBetween(getfDate, gettDate);
	}

	public void generateExcel(HttpServletResponse res) throws IOException {
		List<OtherExpsJournalSanstha> otherExpsJournalSanstha1 = otherExpsJournalSansthaRepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Other Exps Journal Sanstha");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Date");
		row.createCell(2).setCellValue("Sanstha Code");
		row.createCell(3).setCellValue("Sanstha Name");
		row.createCell(4).setCellValue("Address");
		row.createCell(5).setCellValue("Mobile");
		row.createCell(6).setCellValue("Types Of Exps");
		row.createCell(7).setCellValue("Amount");
		row.createCell(8).setCellValue("Remark");

		int dataRowIndex = 1;

		for (OtherExpsJournalSanstha aa : otherExpsJournalSanstha1) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);

			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getDate());
			dataRow.createCell(2).setCellValue(aa.getSansthaId());
			dataRow.createCell(3).setCellValue(aa.getSansthaName());
			dataRow.createCell(4).setCellValue(aa.getAddress());
			dataRow.createCell(5).setCellValue(aa.getMobile());
			dataRow.createCell(6).setCellValue(aa.getTypeOfExps());
			dataRow.createCell(7).setCellValue(aa.getAmount());
			dataRow.createCell(8).setCellValue(aa.getRemark());

			dataRowIndex++;
		}
		ServletOutputStream ops = res.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

	// SansthaBillRaise
	public SansthaBillRaiseMaster saveSansthaBillRaise(SansthaBillRaiseMaster sansthaBillRaiseMaster) {
		return sansthaBillRaiseRepo.save(sansthaBillRaiseMaster);
	}

	public List<SansthaBillRaiseMaster> getAllSansthaBillRaise() {
		return sansthaBillRaiseRepo.findAll();
	}

	public List<SansthaBillRaiseMaster> findByDateBetween1(String getfDate, String gettDate) {
		return sansthaBillRaiseRepo.findBydateBetween(getfDate, gettDate);
	}

	public List<SansthaBillRaiseMaster> findByDateBetweenChillingCenter(String cfDate, String ctDate) {
		return sansthaBillRaiseRepo.findBydateBetween(cfDate, ctDate);
	}

	public void generateBillExcel(HttpServletResponse res) throws IOException {
		List<SansthaBillRaiseMaster> sansthaBillRaiseMaster1 = sansthaBillRaiseRepo.findAll();
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Sanstha Bill Raise");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("Date");
		row.createCell(2).setCellValue("Chilling Center");
		row.createCell(3).setCellValue("Total Qty");
		row.createCell(4).setCellValue("Total Rate");
		row.createCell(5).setCellValue("Total Advance");
		row.createCell(6).setCellValue("Total Deposit");
		row.createCell(7).setCellValue("Total Transport");
		row.createCell(8).setCellValue("Total Management");
		row.createCell(9).setCellValue("Total Cattel Feed");
		row.createCell(10).setCellValue("Total Store");
		row.createCell(11).setCellValue("Total By-Product");
		row.createCell(12).setCellValue("Total Net Pay");
		row.createCell(13).setCellValue("Total Amount");

		int dataRowIndex = 1;

		for (SansthaBillRaiseMaster aa : sansthaBillRaiseMaster1) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);

			dataRow.createCell(0).setCellValue(aa.getId());
			dataRow.createCell(1).setCellValue(aa.getDate());
			dataRow.createCell(2).setCellValue(aa.getChhillingCenter());
			dataRow.createCell(3).setCellValue(aa.getTotalQuantity());
			dataRow.createCell(4).setCellValue(aa.getTotalRate());
			dataRow.createCell(5).setCellValue(aa.getTotalAdvance());
			dataRow.createCell(6).setCellValue(aa.getTotalDeposit());
			dataRow.createCell(7).setCellValue(aa.getTotalTransport());
			dataRow.createCell(8).setCellValue(aa.getTotalmanagment());
			dataRow.createCell(9).setCellValue(aa.getTotalCattleFeed());
			dataRow.createCell(10).setCellValue(aa.getTotalStore());
			dataRow.createCell(11).setCellValue(aa.getTotalBiProduct());
			dataRow.createCell(12).setCellValue(aa.getTotalNetPayable());
			dataRow.createCell(13).setCellValue(aa.getTotalAmount());

			dataRowIndex++;
		}
		ServletOutputStream ops = res.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();
	}

	//Sanstha Sale return

		public SansthaSaleReturn saveSansthaSaleReturn(SansthaSaleReturn santhaSaleReturn) {
			return sansthaSaleReturnRepo.save(santhaSaleReturn);
		}

		public List getAllSansthaSaleReturnService() {
			return sansthaSaleReturnRepo.findAll();
		}

		public void generateExcle(HttpServletResponse response) throws IOException {

			List<SansthaSaleReturn> santhaSaleReturns = sansthaSaleReturnRepo.findAll();
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sanstha Sale Return");
			HSSFRow row = sheet.createRow(0);

			row.createCell(0).setCellValue("Return Id");
			row.createCell(1).setCellValue("Return Date");
			row.createCell(2).setCellValue("Customer");
			row.createCell(3).setCellValue("Net Amount");
			row.createCell(4).setCellValue("Total Discount");
			row.createCell(5).setCellValue("Total Other Amount");
			row.createCell(6).setCellValue("Total Tax");
			row.createCell(7).setCellValue("Total Amount");
			row.createCell(8).setCellValue("Invoice Id");
			row.createCell(9).setCellValue("Manual Number");
			row.createCell(10).setCellValue("Warehouse");
			row.createCell(11).setCellValue("Remark");
			row.createCell(12).setCellValue("Entry By");
			row.createCell(13).setCellValue("Date Of Entry");

			int dataRowIndex = 1;
			for (SansthaSaleReturn santhReturn : santhaSaleReturns) {
				HSSFRow dataRow = sheet.createRow(dataRowIndex);
				dataRow.createCell(0).setCellValue(santhReturn.getReturnId());
				dataRow.createCell(1).setCellValue(santhReturn.getReturnDate());
				dataRow.createCell(2).setCellValue(santhReturn.getCustomerState());
				dataRow.createCell(3).setCellValue(santhReturn.getNetAmt());
				dataRow.createCell(4).setCellValue("total Discount");
				dataRow.createCell(5).setCellValue(santhReturn.getOtherAmt());
				dataRow.createCell(6).setCellValue(santhReturn.getTaxAmt());
				dataRow.createCell(7).setCellValue(santhReturn.getTotalAmt());
				dataRow.createCell(8).setCellValue(santhReturn.getInvoiceId1());
				dataRow.createCell(9).setCellValue("Manual No");
				dataRow.createCell(10).setCellValue(santhReturn.getWarehouse());
				dataRow.createCell(11).setCellValue(santhReturn.getRemark());
				dataRow.createCell(12).setCellValue("Entry By");
				dataRow.createCell(13).setCellValue(santhReturn.getDate());

				dataRowIndex++;
			}
			ServletOutputStream outputStream = response.getOutputStream();
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();

		}

	// Batch Creation Company Model
	// save
	public BatchCreationCompanyModel saveBatchCreationCompany(BatchCreationCompanyModel batchCreationCompanyModel) {
		return batchCreationCompanyRepo.save(batchCreationCompanyModel);
	}

	// find all
	public List<BatchCreationCompanyModel> findAllBatchCreationCompanyData() {
		return batchCreationCompanyRepo.findAll();
	}

	// find by date
	public List<BatchCreationCompanyModel> finBydateBetween(String getfDate, String gettDate) {
		return batchCreationCompanyRepo.findByDateBetween(getfDate, gettDate);
	}

	// Sanstha Receipt
	// save
	public SansthaReceipt saveSansthaReceipt(SansthaReceipt sansthareceipt) {
		return sansthaReceiptRepo.save(sansthareceipt);
	}

	// find all
	public List<SansthaReceipt> getAllSansthaReceiptData() {
		return sansthaReceiptRepo.findAll();
	}

	// find by date
	public List<SansthaReceipt> findByDateBetween(String getfDate, String gettDate) {
		return sansthaReceiptRepo.findByDateBetween(getfDate, gettDate);
	}

	public void generateSansthaReceiptExcel(HttpServletResponse response) throws Exception {
		List<SansthaReceipt> sansthareceipt = sansthaReceiptRepo.findAll();

		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("SansthaReceipt Info");
		HSSFRow row = sheet.createRow(0);

		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("InvoiceAmount");
		row.createCell(2).setCellValue("BalanceAmount");
		row.createCell(3).setCellValue("ByHand");
		row.createCell(4).setCellValue("CashBankJV");
		row.createCell(5).setCellValue("Date");
		row.createCell(6).setCellValue("InstallmentAmount");
		row.createCell(7).setCellValue("InvoiceDate");
		row.createCell(8).setCellValue("InvoiceNo");
		row.createCell(9).setCellValue("ManualNo");
		row.createCell(10).setCellValue("Narration");
		row.createCell(11).setCellValue("PaidInstallment");
		row.createCell(12).setCellValue("PartialAmount");
		row.createCell(13).setCellValue("PendingAmount");
		row.createCell(14).setCellValue("ReceiptAmount");
		row.createCell(15).setCellValue("SansthaName");
		row.createCell(16).setCellValue("SelectAccount");
		row.createCell(17).setCellValue("SelectSanstha");
		row.createCell(18).setCellValue("SubLedgerName");
		row.createCell(19).setCellValue("Totalinstallment");
		row.createCell(20).setCellValue("VoucharType");

		int dataRowIndex = 1;

		for (SansthaReceipt sanstha1 : sansthareceipt) {
			HSSFRow dataRow = sheet.createRow(dataRowIndex);
			dataRow.createCell(0).setCellValue(sanstha1.getId());
			dataRow.createCell(1).setCellValue(sanstha1.getInvoiceAmount());
			dataRow.createCell(2).setCellValue(sanstha1.getBalanceAmount());
			dataRow.createCell(3).setCellValue(sanstha1.getByHand());
			dataRow.createCell(4).setCellValue(sanstha1.getCashBankJV());
			dataRow.createCell(5).setCellValue(sanstha1.getDate());
			dataRow.createCell(6).setCellValue(sanstha1.getInstallmentAmount());
			dataRow.createCell(7).setCellValue(sanstha1.getInvoiceDate());
			dataRow.createCell(8).setCellValue(sanstha1.getInvoiceNo());
			dataRow.createCell(9).setCellValue(sanstha1.getManualNo());
			dataRow.createCell(10).setCellValue(sanstha1.getNarration());
			dataRow.createCell(11).setCellValue(sanstha1.getPaidInstallment());
			dataRow.createCell(12).setCellValue(sanstha1.getPartialAmount());
			dataRow.createCell(13).setCellValue(sanstha1.getPendingAmount());
			dataRow.createCell(14).setCellValue(sanstha1.getReceiptAmount());
			dataRow.createCell(15).setCellValue(sanstha1.getSansthaName());
			dataRow.createCell(16).setCellValue(sanstha1.getSelectAccount());
			dataRow.createCell(17).setCellValue(sanstha1.getSelectSanstha());
			dataRow.createCell(18).setCellValue(sanstha1.getSubLedgerName());
			dataRow.createCell(19).setCellValue(sanstha1.getTotalInstallment());
			dataRow.createCell(20).setCellValue(sanstha1.getVoucherType());

			dataRowIndex++;
		}
		ServletOutputStream ops = response.getOutputStream();
		workbook.write(ops);
		workbook.close();
		ops.close();

	}
	

//Batch Creation 
		public BatchCreationmaster savebatchCreation(BatchCreationmaster batchCreationMaster) {
			return batchcreationrepo.save(batchCreationMaster);
		}

		public List<BatchCreationmaster> findallbatchcreation() {
			return batchcreationrepo.findAll();
		}

		public List<BatchCreationmaster> findByDateBetween2(String getfDate, String gettDate) {
			return batchcreationrepo.findByDateBetween( getfDate,  gettDate);
		}
//Sanstha Bank Payment
		public Sansthabankpaymentmaster savesansthabankpayment(Sansthabankpaymentmaster santhabankpaymentmaster) {
			// TODO Auto-generated method stub
			return sansthabankpaymentrepo.save(santhabankpaymentmaster);
		}

		public List<Sansthabankpaymentmaster> findallsansthabankpayment() {
			// TODO Auto-generated method stub
			return sansthabankpaymentrepo.findAll();
		}

		public List<Sansthabankpaymentmaster> findPaymentByDateBetween3(String getfDate, String gettDate) {
			// TODO Auto-generated method stub
			return sansthabankpaymentrepo.findPaymentByDateBetween(getfDate, gettDate);
		}


	public void generateExcel1(HttpServletResponse res) throws IOException {
			
			// TODO Auto-generated method stub
			List<Sansthabankpaymentmaster> sansthamaster = sansthabankpaymentrepo.findAll();

			HSSFWorkbook workbook =new HSSFWorkbook();
		

			HSSFSheet sheet = workbook.createSheet("Cream ReportInfo");

			HSSFRow row = sheet.createRow(0);

			row.createCell(0).setCellValue("id" );
			row.createCell(1).setCellValue("fDate");
			
			row.createCell(2).setCellValue("tDate" );
			row.createCell(3).setCellValue("totalQuantity" );
			
			row.createCell(4).setCellValue("totalAmount" );
			row.createCell(5).setCellValue("totalAdvance" );
			
			row.createCell(6).setCellValue("totalDeposit");
			row.createCell(7).setCellValue("totalTransport" );
			
			row.createCell(8).setCellValue("totalManangement" );
			row.createCell(9).setCellValue("totalcattleFeed" );
			
			row.createCell(10).setCellValue("totalStore" );
			row.createCell(11).setCellValue("totalByproduct" );
			
					int dataRowIndex = 1;

					for(Sansthabankpaymentmaster aa :sansthamaster) {
					HSSFRow dataRow = sheet.createRow(dataRowIndex) ;
					dataRow.createCell(0).setCellValue(aa.getId());
					dataRow.createCell(1).setCellValue(aa.getfDate());
					
					dataRow.createCell(2).setCellValue(aa.gettDate());
					dataRow.createCell(3).setCellValue(aa.getTotalQuantity());
					
					dataRow.createCell(4).setCellValue(aa.getTotalAmount());
					dataRow.createCell(5).setCellValue(aa.getTotalAdvance());
					
					dataRow.createCell(6).setCellValue(aa.getTotalDeposit());
					dataRow.createCell(7).setCellValue(aa.getTotalTransport());
					
					dataRow.createCell(8).setCellValue(aa.getTotalManangement());
					dataRow.createCell(9).setCellValue(aa.getTotalcattleFeed());
					
					dataRow.createCell(10).setCellValue(aa.getTotalStore());
					dataRow.createCell(11).setCellValue(aa.getTotalByproduct());
				 
					dataRowIndex ++;
					}
	            ServletOutputStream ops=res.getOutputStream();
	            workbook.write(ops);
	            workbook.close();
	            ops.close();
		
		
		}
		
		
		
	

}
