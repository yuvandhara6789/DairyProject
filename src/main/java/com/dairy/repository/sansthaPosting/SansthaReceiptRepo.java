package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.SansthaReceipt;



@Repository
public interface SansthaReceiptRepo extends JpaRepository<SansthaReceipt, Integer>{
    @Transactional
	int deleteByid(int id);
	List<SansthaReceipt> findByDateBetween(String fDate, String tDate);
}
