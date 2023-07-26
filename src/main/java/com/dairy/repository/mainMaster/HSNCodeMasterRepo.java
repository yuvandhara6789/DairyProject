package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.HSNCodeMaster;

import javax.transaction.Transactional;

@Repository
public interface HSNCodeMasterRepo extends JpaRepository<HSNCodeMaster, Integer>{

	@Transactional
	int deleteByid(int i);

}
