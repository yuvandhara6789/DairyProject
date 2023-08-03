package com.dairy.repository.processManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dairy.model.processManagement.ByProductProcessJournal;


@Repository
@ResponseBody
public interface ByProductProcessJournalRepo extends JpaRepository<ByProductProcessJournal, Integer> {

	@Transactional
	 int deleteByid(int id);
	
	List<ByProductProcessJournal> findByDateBetween(String fDate, String tDate);
}
