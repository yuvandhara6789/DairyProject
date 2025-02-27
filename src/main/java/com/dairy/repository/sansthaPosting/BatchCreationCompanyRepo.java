package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.BatchCreationCompanyModel;

@Repository
@EnableJpaRepositories
public interface BatchCreationCompanyRepo extends JpaRepository<BatchCreationCompanyModel, Integer>{
	@Transactional
	 
	 int deleteByid(int id);
	List<BatchCreationCompanyModel> findByDateBetween(String fDate, String tDate);

}
