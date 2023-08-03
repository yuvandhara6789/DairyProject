package com.dairy.repository.processManagement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.dairy.model.processManagement.RptProcessCreamReport;


@Repository
@EnableJpaRepositories
public interface RptProcessCreamReportRepo extends JpaRepository<RptProcessCreamReport, Integer>
{
      @Transactional
      int deleteByid(int id);

  	List<RptProcessCreamReport>findByDateBetween(String getfDate,String gettDate);

      
}
