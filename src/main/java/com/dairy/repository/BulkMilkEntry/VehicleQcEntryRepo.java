package com.dairy.repository.BulkMilkEntry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.BulkMilkEntry.VehicleQcEntry;


@Repository
@EnableJpaRepositories

public interface VehicleQcEntryRepo extends JpaRepository<VehicleQcEntry, Integer> {

	@Transactional
	 int deleteByid(int id);

	List<VehicleQcEntry> findByDateBetween(String getfDate, String gettDate);
	
	
}
