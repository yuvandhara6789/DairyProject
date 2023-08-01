package com.dairy.repository.centerMaster;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.centerMaster.ApplyRateChartToAll;


@EnableJpaRepositories
@Repository
public interface ApplyRateChartToAllRepo extends JpaRepository<ApplyRateChartToAll, Integer>{
	
    @Transactional
    int deleteByid(int id);
}
