package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.TDSCodeMaster;

import javax.transaction.Transactional;
@EnableJpaRepositories
@Repository
public interface TDSCodeMasterRepo extends JpaRepository<TDSCodeMaster, Integer>{

	@Transactional
	int deleteByid(int id);

}
