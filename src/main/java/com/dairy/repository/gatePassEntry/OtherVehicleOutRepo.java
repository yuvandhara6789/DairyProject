package com.dairy.repository.gatePassEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.OtherVehicleOutMaster;

import javax.transaction.Transactional;

@Repository
public interface OtherVehicleOutRepo extends JpaRepository<OtherVehicleOutMaster, Integer> {

	@Transactional
	int deleteByid(int id);
}
