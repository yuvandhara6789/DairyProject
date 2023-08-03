package com.dairy.repository.gatePassEntry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.Material1stEntryMaster;

import javax.transaction.Transactional;

@Repository
@EnableJpaRepositories
public interface Material1stEntryRepo extends JpaRepository<Material1stEntryMaster, Integer>{

	@Transactional
	int deleteByid(int id);
}
