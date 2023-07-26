package com.dairy.repository.otherMaster;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.VehicleMaster;

@EnableJpaRepositories
@Repository
public interface VehicleMasterRepo extends JpaRepository<VehicleMaster, Integer> 
{

	@Transactional
	public int deleteByid(int id);
	
	

}
