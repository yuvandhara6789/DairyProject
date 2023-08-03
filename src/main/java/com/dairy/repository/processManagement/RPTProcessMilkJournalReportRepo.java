package com.dairy.repository.processManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dairy.model.processManagement.RPTProcessMilkJournalReportMaster;

public interface RPTProcessMilkJournalReportRepo extends JpaRepository<RPTProcessMilkJournalReportMaster, Integer>{
	@Transactional
	int deleteByid(int id);

	List<RPTProcessMilkJournalReportMaster> findByDateBetween(String getfDate, String gettDate);

}
