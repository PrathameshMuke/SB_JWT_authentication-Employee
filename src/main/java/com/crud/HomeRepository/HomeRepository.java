package com.crud.HomeRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.EmpOfficialDataInfo;
import com.crud.model.EmployeeInfo;
import com.crud.model.OrganizationInfo;

@Repository
public interface HomeRepository extends CrudRepository<EmpOfficialDataInfo, Integer>
{

	EmpOfficialDataInfo findByEid(int eid);

}
