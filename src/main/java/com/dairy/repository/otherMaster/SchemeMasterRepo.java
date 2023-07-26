package com.dairy.repository.otherMaster;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.SchemeMaster;

@EnableJpaRepositories
@Repository("SchemeMasterRepo")
public interface SchemeMasterRepo extends JpaRepository<SchemeMaster,Integer>{
	@Transactional
	int deleteByid(int id);
	

	List<SchemeMaster> findBydateBetween(String fDate, String tDate);


}
