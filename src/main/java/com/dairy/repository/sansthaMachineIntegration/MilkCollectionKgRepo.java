package com.dairy.repository.sansthaMachineIntegration;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dairy.model.sansthaMachineIntegration.MilkCollectionKg;

@Repository

public interface MilkCollectionKgRepo extends JpaRepository<MilkCollectionKg, Integer> {

	@Transactional
	int deleteByid(int id);

	List<MilkCollectionKg> findByDateBetween(String fDate, String tDate);
}
