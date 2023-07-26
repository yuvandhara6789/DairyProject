package com.dairy.repository.milkCollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.milkCollection.MilkCollection;
import com.dairy.model.milkCollection.MilkCollectionQC;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;
@EnableJpaRepositories
@Repository
public interface MilkCollectionRepo extends JpaRepository<MilkCollection, Integer> {


	@Transactional
	int deleteByid(int id);

	List<MilkCollection> findByinwardDateBetween(String getfDate, String gettDate);


}
