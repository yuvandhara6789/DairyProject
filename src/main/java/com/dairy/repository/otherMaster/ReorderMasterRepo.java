package com.dairy.repository.otherMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.ReorderMaster;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
public interface ReorderMasterRepo extends JpaRepository<ReorderMaster, Integer>{

	@Transactional
	int deleteByid(int id);

}
