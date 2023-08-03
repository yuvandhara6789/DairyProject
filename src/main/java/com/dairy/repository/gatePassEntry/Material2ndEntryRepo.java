package com.dairy.repository.gatePassEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.Material2ndEntryMaster;

import javax.transaction.Transactional;

@Repository
@EnableJpaRepositories
public interface Material2ndEntryRepo extends JpaRepository<Material2ndEntryMaster, Integer>{

	@Transactional
	int deleteByid(int id);
}
