package com.dairy.repository.otherMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.otherMasters.RouteMaster;

import javax.transaction.Transactional;

@EnableJpaRepositories
@Repository
public interface RouteMasterRepo extends JpaRepository<RouteMaster, Integer> {

	@Transactional
	int deleteByid(int id);

}
