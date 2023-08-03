package com.dairy.repository.gatePassEntry;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.EmployeeEntryInMaster;


@Repository
@EnableJpaRepositories
public interface EmployeeEntryInRepo extends JpaRepository<EmployeeEntryInMaster, Integer> {

	@Transactional
	int deleteByid(int id);
}
