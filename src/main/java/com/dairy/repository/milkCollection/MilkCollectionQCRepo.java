package com.dairy.repository.milkCollection;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.milkCollection.MilkCollectionQC;

@Repository
public interface MilkCollectionQCRepo extends JpaRepository<MilkCollectionQC, Integer>{

	List<MilkCollectionQC> findBydateBetween(String getfDate, String gettDate);

	@Transactional
	int deleteByid(int id);

}
