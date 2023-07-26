package com.dairy.repository.mainMaster;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dairy.model.mainMaster.ItemMaster;

import javax.transaction.Transactional;

@Repository
public interface ItemMasterRepo  extends JpaRepository< ItemMaster, Integer>{

	@Transactional
	int deleteByid(int id);
	

}
