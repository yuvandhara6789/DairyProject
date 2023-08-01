package com.dairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairy.model.Sansthaposting.SansthaSaleReturn;



@Repository
public interface SansthaSalesReturnRepo extends JpaRepository<SansthaSaleReturn, Integer> {

	@Transactional
	int deleteCreamJournalById(int id);

}
