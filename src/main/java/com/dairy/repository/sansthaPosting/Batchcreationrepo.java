package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.BatchCreationmaster;



@Repository
public interface Batchcreationrepo extends JpaRepository<BatchCreationmaster, Integer>{
	
	int deleteByid (int id);

	List<BatchCreationmaster> findByDateBetween(String getfDate, String gettDate);

	


	
}
