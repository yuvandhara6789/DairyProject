package com.dairy.repository.processManagement;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairy.model.processManagement.CreamJournal;



@Repository
public interface CreamJournalRepo extends JpaRepository<CreamJournal, Integer> {

	@Transactional
	int deleteCreamJournalById(int id);

	List<CreamJournal> findBydateBetween(String fromDate, String toDate);

	

	
	

}
