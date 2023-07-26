package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.OpeningStock;

import javax.transaction.Transactional;

@Repository
public interface OpeningStockRepo extends JpaRepository<OpeningStock, Integer>{
	
	@Transactional
	int deleteByid(int id);
	
	

}
