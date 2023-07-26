package com.dairy.repository.otherMaster;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.TransportMaster;



@Repository
@EnableJpaRepositories
public interface TransportMasterRepo extends JpaRepository<TransportMaster, Integer> {
     
	@Transactional
	int deleteByid(int id);

}
