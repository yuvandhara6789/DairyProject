package com.dairy.repository.gatePassEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.MilkVehicleOutMaster;

import javax.transaction.Transactional;

@Repository
@EnableJpaRepositories
public interface MilkVehicleOutRepo extends JpaRepository<MilkVehicleOutMaster, Integer>{

	@Transactional
	int deleteByid(int id);
}
