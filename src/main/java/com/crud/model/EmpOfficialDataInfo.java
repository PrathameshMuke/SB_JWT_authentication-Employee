package com.crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class EmpOfficialDataInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String name;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	private EmployeeInfo empOffData;
	@OneToOne(cascade = CascadeType.ALL)
	private OrganizationInfo orgInfo;
	
		public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public EmployeeInfo getEmpOffData() {
		return empOffData;
	}
	public void setEmpOffData(EmployeeInfo empOffData) {
		this.empOffData = empOffData;
	}
	public OrganizationInfo getOrgInfo() {
		return orgInfo;
	}
	public void setOrgInfo(OrganizationInfo orgInfo) {
		this.orgInfo = orgInfo;
	}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}

}
