package com.dairy.repository.processManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.processManagement.ProcessJournalMilk;



@Repository
@EnableJpaRepositories
public interface ProcessJournalMilkRepo extends JpaRepository<ProcessJournalMilk, Integer>{

	@Transactional
	int deleteByid(int id);
	
	@Transactional
	List<ProcessJournalMilk> findByDateBetween(String fromDate, String toDate);
}
