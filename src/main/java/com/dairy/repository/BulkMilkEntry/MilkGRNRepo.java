package com.dairy.repository.BulkMilkEntry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.BulkMilkEntry.MilkGRN;



@Repository("MilkGRNRepo")
public interface MilkGRNRepo extends JpaRepository<MilkGRN, Integer> {
	@Transactional
	int deleteByid(int id);

	List<MilkGRN> findByDateBetween(String getfDate, String gettDate);

}
