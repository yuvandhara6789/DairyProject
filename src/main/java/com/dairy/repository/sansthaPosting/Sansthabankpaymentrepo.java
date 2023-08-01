package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.Sansthabankpaymentmaster;

@Repository
	public interface Sansthabankpaymentrepo extends JpaRepository<Sansthabankpaymentmaster, Integer>{

		@Transactional
		int deleteByid(int id);

		List<Sansthabankpaymentmaster> findPaymentByDateBetween(String getfDate , String gettDate);
		

}
