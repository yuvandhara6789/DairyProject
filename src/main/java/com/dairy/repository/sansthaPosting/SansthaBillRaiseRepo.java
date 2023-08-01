package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.SansthaBillRaiseMaster;


@Repository
@EnableJpaRepositories("SansthaBillRaiseRepo")
public interface SansthaBillRaiseRepo extends JpaRepository<SansthaBillRaiseMaster,Integer>{
	@Transactional
	int deleteByid(int id);

	List<SansthaBillRaiseMaster> findBydateBetween(String getfDate, String gettDate);

}
