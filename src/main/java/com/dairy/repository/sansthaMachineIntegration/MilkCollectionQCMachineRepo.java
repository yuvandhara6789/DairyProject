package com.dairy.repository.sansthaMachineIntegration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.sansthaMachineIntegration.MilkCollectionQCMachine;

@Repository
@EnableJpaRepositories
public interface MilkCollectionQCMachineRepo extends JpaRepository<MilkCollectionQCMachine, Integer>{

}
