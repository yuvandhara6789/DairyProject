package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.CustomerMaster;

import javax.transaction.Transactional;


@Repository
public interface CustomerMasterRepo extends JpaRepository<CustomerMaster, Integer>{

	@Transactional
	int deleteByid(int id);

}
