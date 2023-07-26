package com.dairy.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.milkCollection.CombinationColletionWithQc;
import com.dairy.model.milkCollection.MilkCollection;
import com.dairy.model.milkCollection.MilkCollectionQC;
import com.dairy.repository.milkCollection.CombCollectionQCRepo;
import com.dairy.repository.milkCollection.MilkCollectionQCRepo;
import com.dairy.repository.milkCollection.MilkCollectionRepo;

@Service
public class MilkCollectionService {

	@Autowired
	private MilkCollectionRepo milkCollectionRepo ;
	
	@Autowired
	private MilkCollectionQCRepo milkCollectionQCRepo ;
	
	@Autowired
	private CombCollectionQCRepo combCollectionQCRepo;
	

	//Milk Collection 
	public List<MilkCollection> findAll() {
		// TODO Auto-generated method stub
		return milkCollectionRepo.findAll();
	}

	public MilkCollection saveMilkCollection(MilkCollection milkCollection) {
		// TODO Auto-generated method stub
		return milkCollectionRepo.save(milkCollection);
	}	
	public List<MilkCollection> findByinwardDateBetween(String getfDate, String gettDate) {
		// TODO Auto-generated method stub
		return milkCollectionRepo.findByinwardDateBetween(getfDate, gettDate);
	}
	
	//Milk Collection QC
	public MilkCollectionQC saveMilkCollection(MilkCollectionQC milkcollectionQC) {
		// TODO Auto-generated method stub
		return milkCollectionQCRepo.save(milkcollectionQC);
	}

	public List<MilkCollectionQC> findBydateBetween(String getfDate, String gettDate) {
		// TODO Auto-generated method stub
		return milkCollectionQCRepo.findBydateBetween(getfDate,gettDate);
	}

	public List<MilkCollectionQC> findAllmilkQC() {
		// TODO Auto-generated method stub
		return milkCollectionQCRepo.findAll();
	}

	//Combination Colletion With Qc
	public CombinationColletionWithQc saveCombCollectionQc(CombinationColletionWithQc combcollectionQC) {
		// TODO Auto-generated method stub
		return combCollectionQCRepo.save(combcollectionQC);
	}

	public List<CombinationColletionWithQc> getalldataCombCollectionQC() {
		// TODO Auto-generated method stub
		return combCollectionQCRepo.findAll();
	}
	public List<CombinationColletionWithQc> findByinwardDateBetween1(String getfDate, String gettDate) {
		// TODO Auto-generated method stub
		return combCollectionQCRepo.findByinwardDateBetween(getfDate, gettDate);
	}



	


	
	

}
