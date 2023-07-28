package com.dairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.sansthaMachineIntegration.MilkCollectionKg;
import com.dairy.repository.sansthaMachineIntegration.MilkCollectionKgRepo;

@Service
public class SansthaMachineIntegrationService {
	
	@Autowired
	private MilkCollectionKgRepo milkCollectionKgRepo ;

	//Save Milk Collection Kg
	public MilkCollectionKg saveMilkCollectionKg(MilkCollectionKg milkCollectionKg) {
		return milkCollectionKgRepo.save(milkCollectionKg);
	}

	public List<MilkCollectionKg> findAllMilkCollectionData() {
		return  milkCollectionKgRepo.findAll();
	}

	public List<MilkCollectionKg> findByDateBetween(String getfDate, String gettDate) {
		return milkCollectionKgRepo.findByDateBetween(getfDate,gettDate);
	}

}
