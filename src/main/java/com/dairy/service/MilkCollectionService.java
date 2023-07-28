package com.dairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dairy.model.milkCollection.CombinationColletionWithQc;
import com.dairy.model.milkCollection.MilkCollection;
import com.dairy.model.milkCollection.MilkCollectionManualKG;
import com.dairy.model.milkCollection.MilkCollectionQC;
import com.dairy.model.milkCollection.SansthRateReduce;
import com.dairy.repository.milkCollection.CombCollectionQCRepo;
import com.dairy.repository.milkCollection.MilkCollectionManualKGRepo;
import com.dairy.repository.milkCollection.MilkCollectionQCRepo;
import com.dairy.repository.milkCollection.MilkCollectionRepo;
import com.dairy.repository.milkCollection.SansthRateReduceRepo;

@Service
public class MilkCollectionService {

	@Autowired
	private MilkCollectionRepo milkCollectionRepo;

	@Autowired
	private MilkCollectionQCRepo milkCollectionQCRepo;

	@Autowired
	private CombCollectionQCRepo combCollectionQCRepo;

	@Autowired
	private SansthRateReduceRepo sanstharateReducerepo;
	
	@Autowired
	private MilkCollectionManualKGRepo milkCollectionManualKGRepo ;

	// Milk Collection
	public List<MilkCollection> findAll() {
		return milkCollectionRepo.findAll();
	}

	public MilkCollection saveMilkCollection(MilkCollection milkCollection) {
		return milkCollectionRepo.save(milkCollection);
	}

	public List<MilkCollection> findByinwardDateBetween(String getfDate, String gettDate) {
		return milkCollectionRepo.findByinwardDateBetween(getfDate, gettDate);
	}

	// Milk Collection QC
	public MilkCollectionQC saveMilkCollection(MilkCollectionQC milkcollectionQC) {
		return milkCollectionQCRepo.save(milkcollectionQC);
	}

	public List<MilkCollectionQC> findBydateBetween(String getfDate, String gettDate) {
		return milkCollectionQCRepo.findBydateBetween(getfDate, gettDate);
	}

	public List<MilkCollectionQC> findAllmilkQC() {
		return milkCollectionQCRepo.findAll();
	}

	// Combination Colletion With Qc
	public CombinationColletionWithQc saveCombCollectionQc(CombinationColletionWithQc combcollectionQC) {
		return combCollectionQCRepo.save(combcollectionQC);
	}

	public List<CombinationColletionWithQc> getalldataCombCollectionQC() {
		return combCollectionQCRepo.findAll();
	}

	public List<CombinationColletionWithQc> findByinwardDateBetween1(String getfDate, String gettDate) {
		return combCollectionQCRepo.findByinwardDateBetween(getfDate, gettDate);
	}

	// Save Sanstha Rate Reduce Data
	public SansthRateReduce savereduceRate(SansthRateReduce sanstharateReduce) {
		return sanstharateReducerepo.save(sanstharateReduce);
	}

	// Find Sanstha Rate Reduce
	public List<SansthRateReduce> findallSansthaRate() {
		return sanstharateReducerepo.findAll();
	}

	//Milk Collection Manual KG
	public MilkCollectionManualKG saveMilkCollectionManualKG(MilkCollectionManualKG milkcollectionmanualKG) {
		return milkCollectionManualKGRepo.save(milkcollectionmanualKG);
	}
	
	public List<MilkCollectionManualKG> getAllMilkCollectionManualKGData() {
		return milkCollectionManualKGRepo.findAll();
	}

	public List<MilkCollectionManualKG> findBycollectionDateBetween(String fdate, String tdate) {
		// TODO Auto-generated method stub
		return milkCollectionManualKGRepo.findBycollectionDateBetween(fdate,tdate);
	}

	

	

	
}
