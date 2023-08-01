package com.dairy.repository.BulkMilkEntry;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.BulkMilkEntry.VehicleQCApproval;


@Repository
@EnableJpaRepositories
public interface VehicleQCApprovalRepo extends JpaRepository<VehicleQCApproval, Integer>{

	@Transactional
	int deleteByid(int id);
	List<VehicleQCApproval> findByDateBetween(String fDate, String tDate);
}
