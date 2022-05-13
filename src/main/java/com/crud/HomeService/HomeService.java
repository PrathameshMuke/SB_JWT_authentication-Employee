package com.crud.HomeService;

import com.crud.model.EmpOfficialDataInfo;
import com.crud.model.OrganizationInfo;

public interface HomeService {

	EmpOfficialDataInfo saveemp(EmpOfficialDataInfo e);

	EmpOfficialDataInfo findOrg(int eid);

}
