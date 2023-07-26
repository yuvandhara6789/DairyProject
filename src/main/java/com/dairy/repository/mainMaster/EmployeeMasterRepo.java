package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.EmployeeMaster;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
public interface EmployeeMasterRepo extends JpaRepository<EmployeeMaster, Integer>{
	
	@Transactional
	int deleteByid(int id);

}
