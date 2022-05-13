package com.crud.HomeServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.HomeRepository.HomeRepository;
import com.crud.HomeService.HomeService;
import com.crud.model.EmpOfficialDataInfo;
import com.crud.model.OrganizationInfo;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public EmpOfficialDataInfo saveemp(EmpOfficialDataInfo e) {
		// TODO Auto-generated method stub
		return hr.save(e);
	}

	@Override
	public EmpOfficialDataInfo findOrg(int eid) {
		// TODO Auto-generated method stub
		return hr.findByEid(eid);
	}

}
