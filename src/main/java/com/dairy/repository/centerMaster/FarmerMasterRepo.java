package com.dairy.repository.centerMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.centerMaster.FarmerMaster;

import javax.transaction.Transactional;
@EnableJpaRepositories
@Repository
public interface FarmerMasterRepo extends JpaRepository<FarmerMaster, Integer> {
  
	@Transactional
	int deleteByid(int id);
}