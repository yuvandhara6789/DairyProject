package com.dairy.repository.milkCollection;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.milkCollection.SansthRateReduce;



@EnableJpaRepositories
@Repository
public interface SansthRateReduceRepo extends JpaRepository<SansthRateReduce, Integer> 
{
	 @Transactional
     int deleteByid(int id);

	
}
