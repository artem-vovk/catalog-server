package com.server.catalog.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.catalog.models.Company;
import com.server.catalog.models.WorkTime;

@Repository
public interface WorkTimeRepository extends JpaRepository<WorkTime, Long> {

	List<WorkTime> findByCompany(Company company);

	void deleteByCompany(Company company);

}
