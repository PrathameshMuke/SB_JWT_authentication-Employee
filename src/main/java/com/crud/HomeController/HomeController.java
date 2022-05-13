package com.crud.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.HomeService.HomeService;
import com.crud.model.EmpOfficialDataInfo;
import com.crud.model.EmployeeInfo;
import com.crud.model.OrganizationInfo;

@RestController
public class HomeController
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/saveData")
	public EmpOfficialDataInfo saveEmployeeInfo(@RequestBody EmpOfficialDataInfo e)
	{
		EmpOfficialDataInfo emp=hs.saveemp(e);
		return emp;
	}
		
	@GetMapping("/getOrgInfoByEmp/{eid}")
	public OrganizationInfo getOrg(@PathVariable("eid") int eid)
	{
		EmpOfficialDataInfo e= hs.findOrg(eid);
		
		OrganizationInfo or=e.getOrgInfo();
		return or;
	}
	
	@GetMapping("/getEmpInfoByEmp/{eid}")
	public EmployeeInfo getemp(@PathVariable("eid") int eid)
	{
		EmpOfficialDataInfo e= hs.findOrg(eid);
		
		EmployeeInfo emp=e.getEmpOffData();
		return emp;
	}
}
