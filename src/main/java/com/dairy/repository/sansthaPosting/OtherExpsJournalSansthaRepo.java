package com.dairy.repository.sansthaPosting;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.Sansthaposting.OtherExpsJournalSanstha;



@Repository("OtherExpsJournalSansthaRepo")
public interface OtherExpsJournalSansthaRepo extends JpaRepository<OtherExpsJournalSanstha,Integer> {
	@Transactional
	int deleteByid(int id);
	
	List<OtherExpsJournalSanstha>findBydateBetween(String fDate,String tDate);
}
