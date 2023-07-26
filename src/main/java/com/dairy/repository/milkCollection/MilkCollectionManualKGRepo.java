package com.dairy.repository.milkCollection;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.milkCollection.MilkCollectionManualKG;




@Repository
@EnableJpaRepositories
public interface MilkCollectionManualKGRepo extends JpaRepository<MilkCollectionManualKG, Integer> {
	
	@Transactional
	public int deleteByid(int id);

	List<MilkCollectionManualKG> findBycollectionDateBetween(String fdate, String tdate);
	
	
}
