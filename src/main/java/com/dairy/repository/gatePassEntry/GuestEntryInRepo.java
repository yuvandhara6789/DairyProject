package com.dairy.repository.gatePassEntry;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.gatePassEntry.GuestInEntryMaster;

@Repository
@EnableJpaRepositories
public interface GuestEntryInRepo extends JpaRepository<GuestInEntryMaster, Integer> {
	@Transactional
	int deleteByid(int id);

}
