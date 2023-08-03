package com.dairy.service;

import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.processManagement.ByProductProcessJournal;
import com.dairy.model.processManagement.CreamJournal;
import com.dairy.model.processManagement.ProcessJournalMilk;
import com.dairy.model.processManagement.RPTProcessMilkJournalReportMaster;
import com.dairy.repository.processManagement.ByProductProcessJournalRepo;
import com.dairy.repository.processManagement.CreamJournalRepo;
import com.dairy.repository.processManagement.ProcessJournalMilkRepo;
import com.dairy.repository.processManagement.RPTProcessMilkJournalReportRepo;

@Service
public class ProcessManagementService {
	
		@Autowired 
		private CreamJournalRepo creamJournalRepo;
		
		@Autowired
		private ProcessJournalMilkRepo processJournalMilkRepo ;
		
		@Autowired
		private ByProductProcessJournalRepo byProductProcessJournalRepo ;
		
		@Autowired
		private RPTProcessMilkJournalReportRepo rRPTProcessMilkJournalReportRepo ;
		
		public CreamJournal saveCreamJournal(CreamJournal creamJournal) 
		{
			return creamJournalRepo.save(creamJournal);
		}

		public List<CreamJournal> getAllCreamJournalData() {
			return creamJournalRepo.findAll();
		}
		public List<CreamJournal> findBydateBetween3(String fromDate, String toDate) {
			return creamJournalRepo.findBydateBetween(fromDate,toDate);
		}

		
		//Milk Journal Process
		public ProcessJournalMilk saveProcessjournalMilk(ProcessJournalMilk processJournalMilk) {
			return processJournalMilkRepo.save(processJournalMilk);
		}

		public List<ProcessJournalMilk> getProcessJournalMilkDetails() {
			return processJournalMilkRepo.findAll();
		}

		public List<ProcessJournalMilk> findByDateBetween(String fromDate, String toDate) {
			return processJournalMilkRepo.findByDateBetween(fromDate, toDate);
		}
		
		//By Product process Journal
		public ByProductProcessJournal saveByProductProcessJournal(ByProductProcessJournal byProductProcessJournal) {
			return  byProductProcessJournalRepo.save(byProductProcessJournal);
		}

		public List<ByProductProcessJournal> findALLByProductProcessJournal() {
			return byProductProcessJournalRepo.findAll();
		}


	    public List<ByProductProcessJournal> findByDateBetween1(String getfDate, String gettDate) {
			return byProductProcessJournalRepo.findByDateBetween(getfDate, gettDate);
		}
	    
	   
}
