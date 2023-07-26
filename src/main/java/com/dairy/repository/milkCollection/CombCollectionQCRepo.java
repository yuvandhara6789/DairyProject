package com.dairy.repository.milkCollection;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dairy.model.milkCollection.CombinationColletionWithQc;

@Repository
@EnableJpaRepositories
public interface CombCollectionQCRepo extends JpaRepository<CombinationColletionWithQc, Integer> 
{

	@Transactional
	int deleteByid(int id);

	List<CombinationColletionWithQc> findByinwardDateBetween(String getfDate, String gettDate);

	

	

	
	
	
}
