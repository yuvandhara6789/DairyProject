package com.dairy.repository.BulkMilkEntry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.BulkMilkEntry.VehicleEntry;

@Repository
@EnableJpaRepositories
public interface VehicleEntryRepo extends JpaRepository<VehicleEntry, Integer>{

	@Transactional
	int deleteVehicleEntryById(int id);

	List<VehicleEntry> findBydateBetween(String fromDate, String toDate);

}
