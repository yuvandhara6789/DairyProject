package com.dairy.repository.otherMaster;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import com.dairy.model.otherMasters.PurchasePaymentTermsandCondition;

@EnableJpaRepositories
@Repository
public interface PurchasePaymentRepo extends JpaRepository<PurchasePaymentTermsandCondition, Integer>{

	@Transactional
	int deleteByid(int id);

	

}
