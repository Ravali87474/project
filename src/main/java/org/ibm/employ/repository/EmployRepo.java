package com.org.ibm.employ.repository;

import com.org.ibm.employ.model.EmployModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepo extends JpaRepository<EmployModel,Integer> {
}
