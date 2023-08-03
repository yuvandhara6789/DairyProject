package com.dairy.repository.gatePassEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.OtherVehicleInMaster;

import javax.transaction.Transactional;

@Repository
@EnableJpaRepositories
public interface OtherVehicleInRepo extends JpaRepository<OtherVehicleInMaster, Integer> {

	@Transactional
	int deleteByid(int id);
}
