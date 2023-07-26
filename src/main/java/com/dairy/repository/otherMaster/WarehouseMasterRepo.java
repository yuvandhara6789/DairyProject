package com.dairy.repository.otherMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairy.model.otherMasters.WarehouseMaster;
@EnableJpaRepositories
@Repository
public interface WarehouseMasterRepo extends JpaRepository<WarehouseMaster, Integer> {
	
	@Transactional
	int deleteByid(int id);
      
}
