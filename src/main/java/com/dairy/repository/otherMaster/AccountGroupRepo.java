package com.dairy.repository.otherMaster;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.AccountGroup;



@EnableJpaRepositories
@Repository
public interface AccountGroupRepo extends JpaRepository<AccountGroup, Integer>{

	@Transactional
	int deleteByid(int id);

	

}
